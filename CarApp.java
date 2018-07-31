import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
	
	Scanner scnr = new Scanner(System.in);
		
	ArrayList<Car> carList = new ArrayList<>();
	carList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
	carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
	carList.add(new Car("Chewie", "Vette", 2017, 44989.95));
	carList.add(new UsedCar("Betsy", "Silverado", 2009, 13003.90, 201602));
	carList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
	carList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
	
	int userChoice;
	String cont = "y";
	
	CarLot gcLot = new CarLot(carList);
	gcLot.printCarList();
	String inputMake;
	String inputModel;
	int inputYear;
	double inputPrice;
	double inputMileage;
	
	
	
	do {
		
		System.out.println(" What would you like to do? \"Add\" , \"Remove\", \"Select\", \"Quit\"");
		String userInput = scnr.next();
		
		if ("quit".equalsIgnoreCase(userInput)) {  // exits program 
		 System.out.println("Sorry to see you go."); 
		}
		else if ("select".equalsIgnoreCase(userInput)) { // promts the user to select car by index then minus one to equal the number.
			System.out.println("Which car would you like to see?");
			userChoice = scnr.nextInt();
			gcLot.carChoice(userChoice - 1);
		
		}
		else if ("add".equalsIgnoreCase(userInput)) {  // will prompt the user to add each variable one by one then adds them to the lot in Car.java or USedCar.java
			System.out.println("Please enter the make:");
			inputMake = scnr.next();
			System.out.println("Please enter the model:");
			inputModel = scnr.next();
			System.out.println("Please enter the year:");
			inputYear = scnr.nextInt();
			System.out.println("Please enter the price:");
			inputPrice = scnr.nextDouble();
			System.out.println("Is this car used?");
			String answer = scnr.next();
				if (answer.trim().toLowerCase().startsWith("y")) { //add mileage if used
					
					System.out.println("Pleae enter the mileage");
					inputMileage = scnr.nextDouble();
					UsedCar addedCar = new UsedCar(inputMake,inputModel,inputYear,inputPrice,inputMileage);
					gcLot.addCarToList(addedCar);
				}
				else {
					Car addedCar = new Car(inputMake,inputModel,inputYear,inputPrice);
					gcLot.addCarToList(addedCar);
				}
			
		}
		
//		else if ("remove".equalsIgnoreCase(userInput)) {
//			//  add in remove command
//			System.out.println("Please enter the number you would like to remove.");
//			int carIndex = scnr.nextInt();
//			
//		}
//		
//		
//		gcLot.printCarList();
//		
//		
		
		System.out.println("Would you like to choose again? y/n");
		cont = scnr.next();
		
		} while (cont.trim().toLowerCase().startsWith("y"));
	
	gcLot.printCarList();
	System.out.println("Thank you for entertaining my list, goodbye.");
	
	}
}
