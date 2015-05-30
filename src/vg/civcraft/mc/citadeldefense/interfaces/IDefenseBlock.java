package vg.civcraft.mc.citadeldefense.interfaces;

import java.util.List;

import org.bukkit.Location;

public interface IDefenseBlock {

	// Gets all blocks associated with a structure.
	public List<Location> getLocations();
	
	// Removes a location from the structure.
	public void remove(Location loc);
	
	// Removes all instance of this structure.
	public void destroy();
	
	// Checks the integrity of of this structure.
	public void checkIntegrity();
	
	// Returns if the structure is at full integrity.
	public boolean hasIntegrity();
	
	// Toggles the power of the structure.
	public void togglePower();
	
	// Turns on.
	public void toggleOn();
	
	// Turns off.
	public void toggleOff();
	
	// The action that occurs when thus block is triggered.
	public void action();
}
