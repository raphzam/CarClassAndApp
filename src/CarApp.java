import java.util.Scanner;


public class CarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carColor = "";
        String carMake = "";
        String carModel = "";


        Driver userOne = new Driver();
        System.out.println("What is your name?");
        String userName = input.nextLine();
        userOne.setName(userName);

        System.out.println("You are buying your first car.");
        Car firstCar = new Car();

        System.out.println("What color is the car?");
        firstCar.setColor(input.nextLine());

        System.out.println("Who manufacturers the car?");
        firstCar.setMake(input.nextLine());

        System.out.println("What is the model of the car?");
        firstCar.setModel(input.nextLine());
        System.out.println("Congratulations on your " + firstCar.toString());

        userOne.addCar(firstCar);
        userOne.seeAllCars();

        firstCar.isStarting();
        firstCar.isAccelerating();
        firstCar.isAccelerating();
        firstCar.isAccelerating();
        firstCar.isGettingPulledOver();
        firstCar.isStopping();
        userOne.isGettingArrested();
        userOne.setNumOfTickets(1);
        System.out.println(userOne.getNumOfTickets());

        System.out.println("Do you want to buy another car?");

        System.out.println("What color is the car?");
        carColor = input.nextLine();
        System.out.println("Who manufacturers the car?");
        carMake = input.nextLine();
        System.out.println("What is the model of the car?");
        carModel = input.nextLine();

        Car carTwo = new Car(carColor,carMake, carModel);

        userOne.addCar(carTwo);
        userOne.seeAllCars();


        firstCar.isStarting();
        carTwo.isStarting();
        firstCar.isAccelerating();
        carTwo.isAccelerating();
        firstCar.isAccelerating();
        carTwo.isAccelerating();
        firstCar.isGettingPulledOver();
        firstCar.isStopping();
        carTwo.isAccelerating();
        carTwo.isAccelerating();
        carTwo.isAccelerating();



    }


}





























