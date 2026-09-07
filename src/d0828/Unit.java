package d0828;

public class Unit {

	private int energy;
	private String tribe;
	
	public Unit(String tribe) {
		this.tribe = tribe;
		energy = 5;
	}
	public String getTribe() {
		return tribe;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void attack(Unit unit) {
		int energy=0;
		if(this.tribe.equals("엘프")) {
			if(unit.getTribe().equals("오크")) {
				energy = unit.getEnergy() - 3;
				unit.setEnergy(energy);
			}
			else if(unit.getTribe().equals("인간")) {
				energy = unit.getEnergy() - 1;
				unit.setEnergy(energy);
			}
			else {
				System.out.println("동족 끼리는 공격 불가");
			}
		}
		if(this.tribe.equals("인간")) {
			if(unit.getTribe().equals("오크")) {
				energy = unit.getEnergy() - 3;
				unit.setEnergy(energy);
			}
			else if(unit.getTribe().equals("엘프")) {
				energy = unit.getEnergy() - 1;
				unit.setEnergy(energy);
			}
			else {
				System.out.println("동족 끼리는 공격 불가");
			}
		}
		if(this.tribe.equals("오크")) {
			if(unit.getTribe().equals("엘프")) {
				energy = unit.getEnergy() - 3;
				unit.setEnergy(energy);
			}
			else if(unit.getTribe().equals("인간")) {
				energy = unit.getEnergy() - 3;
				unit.setEnergy(energy);
			}
			else {
				System.out.println("동족 끼리는 공격 불가");
			}
		}
	}
	
}
