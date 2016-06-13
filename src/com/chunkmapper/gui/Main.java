/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package com.chunkmapper.gui;

import gov.nasa.worldwind.View;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.layers.Earth.MSVirtualEarthLayer;
import gov.nasa.worldwind.render.BasicShapeAttributes;
import gov.nasa.worldwind.render.Box;
import gov.nasa.worldwind.render.ExtrudedPolygon;
import gov.nasa.worldwind.render.Material;
import gov.nasa.worldwind.render.ShapeAttributes;
import gov.nasa.worldwind.util.BasicDragger;
import gov.nasa.worldwind.util.WWUtil;
import gov.nasa.worldwindx.examples.util.HotSpotController;
import gov.nasa.worldwindx.examples.util.ShapeUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.chunkmapper.admin.BucketInfo;
import com.chunkmapper.admin.GlobalSettings;
import com.chunkmapper.admin.MyLogger;
import com.chunkmapper.admin.PreferenceManager;
import com.chunkmapper.admin.Utila;
import com.chunkmapper.gui.bounds.MyPolygonEditor;
import com.chunkmapper.gui.dialog.UpgradeAvailableDialog;
import com.chunkmapper.gui.layer.MCNotAvailableLayer;
import com.chunkmapper.gui.layer.MainLayer;

/**
 * Example of using {@link gov.nasa.worldwind.util.tree.BasicTree} to display a list of layers.
 *
 * @author pabercrombie
 * @version $Id: LayerTreeUsage.java 1171 2013-02-11 21:45:02Z dcollins $
 */
public class Main extends ApplicationTemplate
{
	public static class AppFrame extends ApplicationTemplate.AppFrame
	{
		//        protected LayerTree layerTree;
		protected RenderableLayer hiddenLayer;
		protected HotSpotController controller;

		public AppFrame() throws IOException
		{
			super(true, false, false); // Don't include the layer panel; we're using the on-screen layer tree.
			//add our own layer
			getWwd().getModel().getLayers().add(new MSVirtualEarthLayer());
			
			//listener to notify that globe has been moved
			final View v = getWwd().getView();
			v.addPropertyChangeListener(new PropertyChangeListener() {
				@Override
				public void propertyChange(PropertyChangeEvent evt) {
					MyLogger.LOGGER.info("Globe Moved");
					v.removePropertyChangeListener(this);
				}});

			Dimension size = new Dimension(1000, 600);
			this.setPreferredSize(size);
			this.pack();
			WWUtil.alignComponent(null, this, AVKey.CENTER);

			File minecraftDir = Utila.MINECRAFT_DIR;
			if (!minecraftDir.exists()) {
				getWwd().getModel().getLayers().add(new MCNotAvailableLayer(this.getWwd(), this, globalSettings));
			} else {
				addMainLayer(this.getWwd(), minecraftDir, this, globalSettings);
			}
//			this.getWwd().addSelectListener(new BasicDragger(this.getWwd()));
			this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Globe.png")).getImage());

		}

		public static void addTestPath(WorldWindow wwd) {
			RenderableLayer l = new RenderableLayer();
			
			ExtrudedPolygon extrudedPolygon = ExtrudedPolygonFactory.createPolygon(wwd);
			extrudedPolygon.setAltitudeMode(WorldWind.RELATIVE_TO_GROUND);
			l.addRenderable(extrudedPolygon);
			MyPolygonEditor editor = new MyPolygonEditor();
			editor.setWorldWindow(wwd);
			editor.setPolygon(extrudedPolygon);
			editor.setArmed(true);
			ApplicationTemplate.insertBeforeCompass(wwd, editor);
			ApplicationTemplate.insertBeforeCompass(wwd, l);
			System.out.println(extrudedPolygon);
		}
	}
	public static void addMainLayer(WorldWindow wwd, File minecraftDir, JFrame appFrame, GlobalSettings globalSettings) throws IOException {
		wwd.getModel().getLayers().add(new MainLayer(wwd, appFrame, minecraftDir, globalSettings));
	}

	/*****************************************************************
	 * Literally checks to see if one of the passed in arguments is
	 * called "-flawed" ? Why? crashbox27 6/11/2016
	 ****************************************************************/
	private static boolean hasFlawed(String[] args) {
		for (String arg : args) {
			if (arg.equals("-flawed"))
				return true;
		}
		return false;
	}
	
//	private static void printUser() {
//		String initLog = PreferenceManager.getInitLog();
//		if (initLog == null) {
//			try {
//				BufferedReader br = new BufferedReader(new InputStreamReader((new URL(BucketInfo.getLogUserUrl())).openStream()));
//				initLog = br.readLine();
//				PreferenceManager.setInitLog(initLog);
//				MyLogger.LOGGER.info(initLog);
//				br.close();
//			} catch (IOException e) {
//				MyLogger.LOGGER.warning(MyLogger.printException(e));
//			}
//		} else {
//			MyLogger.LOGGER.info(initLog);
//		}
//	}

	/**************************************************************************************************************************
	* This method reads a text file from http://chunkmapper.admin.s3-website-us-east-1.amazonaws.com/buckets.txt"
	* and assigns the key/value pairs (mostly s3 URLS and some config options) to the BucketInfo classes static map variable.
	***************************************************************************************************************************/
	private static void getBucket() {
		if (!BucketInfo.initMap()) {
			JOptionPane.showMessageDialog(null, "Chunkmapper could not connect with the internet.  Please check your connection and try again.");
			System.exit(0);
		}
	}
	
	/***********************************************************************************************
	* This method reads a text file from /chunkmapper/chunkmapperResources/build-no.txt.
	* The current value stored in that file is '42' (6/11/2016)
	* It then reads /chunkmapper/chunkmapperResources/version.txt via the Utilia.VERSION readVersion() method
	* which currently has the value "0.3-SINGLEPLAYER" (6/11/2016)
	************************************************************************************************/
	private static void printBuild() {
		try {
			URL url = Main.class.getResource("/build-no.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			MyLogger.LOGGER.info("build-no: " + br.readLine());
			MyLogger.LOGGER.info("version: " + Utila.VERSION);
			br.close();
		} catch (IOException e) {
			MyLogger.LOGGER.severe(MyLogger.printException(e));
		}
	}

	/***********************************************************************************************
	* First code that runs when chunkmapper is launched from the batch file or shell script...
	************************************************************************************************/
	public static void main(String[] args) {
		
		// Prints the build number, stored in /chunkmapper/chunkmapperResources/build-no.txt
		// Then prints the version stored in /chunkmapper/chunkmapperResources/version.txt 
		printBuild();
		
		// Reads the contents of buckets.txt (a bunch of s3 URLs and some config options) into static BucketInfo.map variable
		getBucket();
		
		// Depends on the setting of 'mu' in buckets.txt. Current value is set to 'no' (mu no) so this should return false.
		// Commenting out for now, since we don't need this functionality. crashbox27 6/11/2016
		/* if (BucketInfo.mustUpgrade()) {
			JOptionPane.showMessageDialog(null, "This version of Chunkmapper is no longer supported.  Visit www.chunkmapper.com to upgrade.");
			System.exit(0);
		}*/
		
		// getIgnoreUpgrade should return false since it's never set in the PreferenceManager.data static hashmap
		// so the first half of the logic below should return true. The second half of this statement should return
		// false because latest-sp in buckets.txt = 0.3-SINGLEPLAYER and version.txt also = 0.3-SINGLEPLAYER.
		// Commenting out for now, since this call isn't doing anything we need. crashbox27 6/11/2016
		/* if (!PreferenceManager.getIgnoreUpgrade() && BucketInfo.spUpgradeAvailable()) {
			(new UpgradeAvailableDialog(null)).setVisible(true);
		}*/
		
		// LicenseManager creates another cached file, license.txt on the Utilia.CACHE. The call below checks to see
		// if the VERSION string "beta" defined in LicenseManager matches the value stored in license.txt, but since
		// I don't see where this is ever set, it's essentially a null == null check for now. Commenting out the code
		// since it isn't really doing anything. crashbox27 6/11/2016
		/* LicenseManager.checkLicense(null);
		*/
		
		// No idea why this is here. If one of your passed in args is "-flawed" then a static File variable
		// on Utilia is set with the name "poo". I'm leaving it in for now, but have no idea why you'd use this.
		// crashbox27 6/11/2016
		if (hasFlawed(args)){
			Utila.MINECRAFT_DIR = new File("poo");
		}
		
		// Checking the number of bytes the JVM is set to use...
		long availableMemory = Runtime.getRuntime().maxMemory();
		if (availableMemory < 1000000000)
			System.err.println("Warning: Xmx set too low: " + availableMemory);
		
		// Not relevant anymore...	
		// String title = MySecurityManager.isOfflineValid() ? "Chunkmapper" : "Chunkmapper - Free Version";
		
		// Sets the title and kicks off the start method of the super class, ApplicationTemplate.
		String title = "Chunkmapper";
		ApplicationTemplate.start(title, AppFrame.class);
	}
	
	protected static class ExtrudedPolygonFactory
    {
        public ExtrudedPolygonFactory()
        {
        }

        public static ExtrudedPolygon createPolygon(WorldWindow wwd)
        {
        	boolean fitShapeToViewport = true;
            ExtrudedPolygon poly = new ExtrudedPolygon();
            poly.setAttributes(getDefaultAttributes());
            poly.setValue(AVKey.DISPLAY_NAME, "poo poo");
            initializePolygon(wwd, poly, fitShapeToViewport);

            return poly;
        }
        protected static final double DEFAULT_SHAPE_SIZE_METERS = 200000.0; // 200 km

        protected static void initializePolygon(WorldWindow wwd, ExtrudedPolygon polygon, boolean fitShapeToViewport)
        {
            // Creates a rectangle in the center of the viewport. Attempts to guess at a reasonable size and height.

            Position position = ShapeUtils.getNewShapePosition(wwd);
            Angle heading = ShapeUtils.getNewShapeHeading(wwd, true);
            double heightInMeters = fitShapeToViewport ?
                ShapeUtils.getViewportScaleFactor(wwd) : DEFAULT_SHAPE_SIZE_METERS;

            java.util.List<Position> locations = ShapeUtils.createPositionSquareInViewport(wwd, position, heading,
                heightInMeters);

            polygon.setOuterBoundary(locations);
            polygon.setHeight(heightInMeters);
            polygon.setAltitudeMode(WorldWind.RELATIVE_TO_GROUND);
        }

        public static ShapeAttributes getDefaultAttributes()
        {
            ShapeAttributes attributes = new BasicShapeAttributes();
            attributes.setInteriorMaterial(new Material(Color.BLACK, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.BLACK, 0.0f));
            attributes.setOutlineMaterial(Material.DARK_GRAY);
            attributes.setDrawOutline(true);
            attributes.setInteriorOpacity(0.95);
            attributes.setOutlineOpacity(.95);
            attributes.setOutlineWidth(2);
            return attributes;
        }
    }
}
