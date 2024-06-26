package characters;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ogre implements Energy, Serializable, Warrior, CombatUnit {
	private boolean hungry;
	private int energy;
	
	public Ogre() {
	}
	public Ogre(int energy) {
		this.energy = energy;
	}
	public Ogre(int energy, boolean hungry) {
		this.energy = energy;
		this.hungry = hungry;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public void increaseEnergy(int energy) {
		this.energy += energy;
	}
	public void decreaseEnergy(int energy) {
		this.energy -= energy;
	}
	public int getEnergy() {
		return energy;
	}
	
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	public boolean getHungry() {
		return hungry;
	}

	public void setValues(int energy) {
		this.energy = energy;
	}

	public void setValues(boolean hungry) {
		this.hungry = hungry;
	}
	
	public void setValues(int energy, boolean hungry) {
		this.energy = energy;
		this.hungry = hungry;
	}

	public List<Ogre> getWarriors() {
		List<Ogre> individuals = new ArrayList<>();
		individuals.add(this);
		return individuals;
	}

	public void revenge(Knight knight) {
		if (energy > knight.getEnergy())
			knight.setEnergy((int) (0.9 * knight.getEnergy()));
	}
	public String report(String tab) {
		return "Orge " + energy;
	}

}
