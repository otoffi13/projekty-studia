package roguelike.logic.items;

public class Weapon extends Item {

	private int damage;
	private int totalDcy;
	private int dcy;
	
	public Weapon(String name, String displayName, int damage, int dcy) {
		super(name, displayName, "Obrażenia: "+damage+"     Wytrzymałość: "+dcy+"/"+dcy);
		this.damage = damage;
		this.totalDcy = dcy;
		this.dcy = dcy;
	}

	public int getDamage() {
		return damage;
	}
	
	public int getDcy() {
		return dcy;
	}
	
	public int getTotalDcy() {
		return totalDcy;
	}
	
	public void reduceDcy() {
		this.dcy--;
		this.description = "Obrażenia: "+damage+" Wytrzymałość: "+dcy+"/"+totalDcy;
	}
}
