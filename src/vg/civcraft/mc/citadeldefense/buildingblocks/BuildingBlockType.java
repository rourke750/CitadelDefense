package vg.civcraft.mc.citadeldefense.buildingblocks;

public enum BuildingBlockType {

	WIRE, // Used to connect WIRE_CONNECTORS TO OTHER WIRE_CONNECTORS.
	STORAGE, // Used to act as inventory space, the more the larger the inventory.
	FURNACE, // Used to generate electricity.
	CONNECTOR, // Used to connect multiple furnaces to one another.
	WIRE_CONNECTORS // Used to connect wires to structures.  Should be apart of a structure.
}
