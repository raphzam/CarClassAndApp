import java.util.Scanner;

public class Car extends Vehicle {
    private String make;
    private String model;
    private String color;

    public Car(){
        setNumOfWheels(4);


    }

    public Car(String color, String make, String model){    //Blue, VW, Jetta
        this.color = color;
        this.make = make;
        this.model = model;
        setNumOfWheels(4);

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        String retval = "Color: " + this.color + " Make: " + this.make + " Model: " +
                this.model + " " + super.toString();
        return retval;
    }

    public void isAccelerating(){
        System.out.println("The " + this.color + " " + this.make + " " + this.model + " is accelerating");
    }

    public void isStarting(){
        System.out.println("The " + this.color + " " + this.make + " " + this.model + " is starting");
    }


    public void isGettingPulledOver(){
        System.out.println("The " + this.color + " " + this.make + " " + this.model + " is getting pulled over");
    }

    public void isStopping(){
        System.out.println("The " + this.color + " " + this.make + " " + this.model + " is starting");
    }








    public Car createCar(){
        Scanner input = new Scanner(System.in);
        String userAnswer ="";
        Car car = new Car();
        System.out.println("What color is the car");
        car.setColor(input.next());
        System.out.println("Who manufactures the car?");
        car.setMake(input.nextLine());
        System.out.println("What is the model of the car?");
        car.setModel(input.nextLine());
        return car;

    }

}










