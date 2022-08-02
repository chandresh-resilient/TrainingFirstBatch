
public class Engine {

	private int battaryVoltage = 10;
	int capacityIncc = 1600;

	class Combustion {
		private int airIntakeinmm3 = 1200;

		void combustion() {
			System.err.println(battaryVoltage);
		}
	}

	public void changeCapacity(int capacity) {
		isNewcapcityOkwithBattery(capacity);
		isNewcapcityOkwithHeatResistance(capacity);
		this.capacityIncc = capacity;

	}

	private void isNewcapcityOkwithHeatResistance(int capacity) {
		System.out.println("Engine.isNewcapcityOkwithHeatResistance()");

	}

	private void isNewcapcityOkwithBattery(int capacity) {
		System.out.println("Engine.isNewcapcityOkwithBattery()");

	}

	public void main1() {
		Combustion combustion = new Combustion();
		System.out.println(combustion.airIntakeinmm3);
	}

	public static void main(String[] args) {
		Engine e = new Engine();
		e.main1();
	}
}
