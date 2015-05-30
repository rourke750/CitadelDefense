package vg.civcraft.mc.citadeldefense.interfaces;

/**
 * This class should be inherited by any block that can take damage via entities as well as block breaks.  
 * Exmaple: Arrows.
 * @author Rourke750
 *
 */
public interface IDamagable {

	public void damage(int amount);
	public int getHealth();
	public void setDamage(int damage);
	public double getResistance();
	public void setResistance(double resistance);
}
