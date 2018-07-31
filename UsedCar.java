
public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
        return String.format("%-10s %-10s %d\t$%,10.2f %s", super.getMake(), super.getModel(), super.getYear(), super.getPrice(), getMileage());
    }
	
	
	
	
}
