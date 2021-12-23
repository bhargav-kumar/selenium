package javaBasics;

public class EncapsulationTest {

	private String bank;
	private String vehicle;

	public EncapsulationTest(String bank, String vehicle) {
		this.bank = bank;
		this.vehicle = vehicle;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		System.out.println(bank);
		this.bank = bank;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public static void main(String[] args) {
		
	}

}
