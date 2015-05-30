package vg.civcraft.mc.citadeldefense.defense;

import java.util.List;

import org.bukkit.block.BlockFace;

import vg.civcraft.mc.citadeldefense.interfaces.IWireBlock;

public abstract class GenericWireBlock implements IWireBlock{

	private List<BlockFace> wires;
	private double integrity;
	
	@Override
	public List<BlockFace> getConnectingWires() {
		return wires;
	}

	@Override
	public void updateConnections(List<BlockFace> wires) {
		this.wires = wires;
	}

	@Override
	public void setIntegrity(double integrity) {
		this.integrity = integrity;
	}

	@Override
	public double getIntegrity() {
		return integrity;
	}

}
