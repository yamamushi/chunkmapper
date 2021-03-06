package com.chunkmapper.column;

import java.io.IOException;

import com.chunkmapper.chunk.Chunk;
import com.chunkmapper.enumeration.Biome;
import com.chunkmapper.enumeration.Globcover;
import com.chunkmapper.enumeration.LenteTree;
import com.chunkmapper.math.StaticSobol;
import com.chunkmapper.reader.HeightsReader;
import com.chunkmapper.writer.LenteTreeWriter;

public class ClosedNeedleleafEvergreen extends AbstractColumn {
	public static final Globcover TYPE = Globcover.ClosedNeedleleafEvergreen;
	public static final int BROADLEAF_TREE = 0, NEEDLELEAF_TREE = 1;
	public byte biome = Biome.Taiga;

	protected ClosedNeedleleafEvergreen(int absx, int absz,
			HeightsReader heightsReader, int treeSpacing) {
		super(absx, absz, heightsReader);
		super.IS_FOREST = true;
		if (StaticSobol.hasObject(absx, absz, treeSpacing)) {
				lenteTree = LenteTree.randomTree(LenteTree.ClosedNeedleleafEvergreen);
		}
	}
	public ClosedNeedleleafEvergreen(int absx, int absz, HeightsReader heightsReader) {
		this(absx, absz, heightsReader, 4);
	}

	public void addTree(Chunk chunk, HeightsReader heightsReader) throws IOException {
		if (lenteTree != null)
		LenteTreeWriter.placeLenteTree(absx, absz, chunk, heightsReader, lenteTree);
	}

}
