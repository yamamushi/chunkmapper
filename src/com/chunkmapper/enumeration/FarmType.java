package com.chunkmapper.enumeration;

public enum FarmType {
	Cows, Chicken, Sheep, Wheat, Potatoes, Carrots, Horses, Pig;
	public static final int COW_DENSITY = 3, SHEEP_DENSITY = 4, CHICKEN_DENSITY = 5, HORSE_DENSITY = 3, PIG_DENSITY = 4;
	public static FarmType[] getFarmTypes() {
		return new FarmType[] {Cows, Chicken, Sheep, Horses, Wheat, Wheat, Wheat, Potatoes, Potatoes, Potatoes, 
				Carrots, Carrots, Carrots, Pig, Pig, Pig};
		}
	public static FarmType[] getVegetarianFarmTypes() {
		return new FarmType[] {Wheat, Potatoes, Carrots};
	}
	public static FarmType[] getLivestockFarmTypes() {
		return new FarmType[] {Cows, Chicken, Sheep, Horses, Pig};
	}

}
