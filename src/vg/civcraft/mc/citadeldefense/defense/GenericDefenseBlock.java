package vg.civcraft.mc.citadeldefense.defense;

import java.util.List;

import org.bukkit.Location;

import vg.civcraft.mc.citadel.Citadel;
import vg.civcraft.mc.citadel.ReinforcementManager;
import vg.civcraft.mc.citadel.reinforcement.Reinforcement;
import vg.civcraft.mc.citadeldefense.interfaces.IDamagable;
import vg.civcraft.mc.citadeldefense.interfaces.IDefenseBlock;

public abstract class GenericDefenseBlock implements IDamagable, IDefenseBlock{

	protected ReinforcementManager rm = Citadel.getReinforcementManager();
	private Reinforcement rein;
	// resistance should be a number less than 1.
	private double resistance;
	private List<Location> locs;
	
	public GenericDefenseBlock(List<Location> locs, double resistance){
		this.resistance = resistance;
		this.locs = locs;
		rein = rm.getReinforcement(locs.get(0));
	}
	
	public void damage(int amount){
		int damage = (int) (resistance * amount);
		rein.setDurability(rein.getDurability() - damage);
	}
	
	public double getResistance(){
		return resistance;
	}
	
	/**
	 * Sets the resistance of a structure.  The lower the number this is the more damage it can take.
	 */
	public void setResistance(double resistance){
		this.resistance = resistance;
	}
	
	/**
	 * The amount of damage you want to inflict on a structure while ignoring resistance.
	 */
	public void setDamage(int damage){
		rein.setDurability(rein.getDurability() - damage);
	}
	
	public int getHealth(){
		return rein.getDurability();
	}
	
	public void setHealth(int health){
		rein.setDurability(health);
	}
}
