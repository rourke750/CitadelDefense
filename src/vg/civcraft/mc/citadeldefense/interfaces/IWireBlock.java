package vg.civcraft.mc.citadeldefense.interfaces;

import java.util.List;

import org.bukkit.block.BlockFace;

/**
 * This is for any block that acts as wire to connect furnaces to other blocks.
 * @author Rourke750
 *
 */
public interface IWireBlock {

	public List<BlockFace> getConnectingWires();
	
	public void updateConnections(List<BlockFace> face);
	
	// Integrity is how far current can travel before degrading.  Setting it > 1 doesnt make sense......
	public void setIntegrity(double integrity);
	
	public double getIntegrity();
	
}
