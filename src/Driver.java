import java.util.ArrayList;

public class Driver extends Person {
    private boolean licensed;
    private ArrayList<Car>cars; //inventory of cars
    private int numOfTickets;      //number of DUIs
    //tickets

    public Driver (){   //when new
        this.cars = new ArrayList<Car>();
        this.licensed = true;
        this.numOfTickets = 0;
    }

    public boolean isLicensed() {
        return this.licensed;
    }

    public void setLicensed(boolean licensed){
        this.licensed = licensed;
    }

    public void setNumOfTickets(int numOfTickets){
        this.numOfTickets=numOfTickets;
    }

    public int getNumOfTickets(){
        return this.numOfTickets;
    }


    public void addCar(Car car){
        this.cars.add(car);
    }

    public void seeAllCars(){
        System.out.println(this.getName() + "'s cars:");
        for (Car car : this.cars){
            System.out.println(car);
        }
    }

    public void isGettingArrested(){
        System.out.println(this.getName() + " is getting arrested");
    }


}
