package roguelike.logic.items;

public class Armor extends Item {

	private int defence;
	private int totalDcy;
	private int dcy;
	
	public Armor(String name, String displayName, int defence, int dcy) {
		super(name, displayName, "Ochrona: "+defence+"     Wytrzymałość: "+dcy+"/"+dcy);
		this.defence = defence;
		this.totalDcy = dcy;
		this.dcy = dcy;
	}

	public int getDefence() {
		return defence;
	}
	
	public int getDcy() {
		return dcy;
	}
	
	public int getTotalDcy() {
		return totalDcy;
	}
	
	public void reduceDcy() {
		this.dcy--;
		this.description = "Obrażenia: "+defence+" Wytrzymałość: "+dcy+"/"+totalDcy;
	}
}
