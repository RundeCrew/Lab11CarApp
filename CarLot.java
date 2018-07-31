import java.util.ArrayList;

public class CarLot {

	private ArrayList<Car> lotList = new ArrayList<>();
	public String add;
	public String userInput;
	


	public CarLot(ArrayList<Car> lotList) {
		super();
		this.lotList = lotList;
	}
	
	public void printCarList() {
		for (int i = 0 ; i < lotList.size() ; i++) {
			System.out.println((i+1) + ". " + lotList.get(i));
			}
	}
	
	public void carChoice(int userChoice) {
		System.out.println(userChoice +1 + ". " + lotList.get(userChoice));
	}
	
	public ArrayList<Car> getlotList() {
		return lotList;
	}

	public void setLotList(ArrayList<Car> lotList) {
		this.lotList = lotList;
	}
	
	public void addCarToList(Car addedCar) {
		lotList.add(addedCar);
	}
	
	
	
}
