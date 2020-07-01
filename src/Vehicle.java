public class Vehicle {
    private int numOfWheels;

    public Vehicle(){

    }



    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() {
        return this.numOfWheels;
    }


    public String toString(){
        return "Wheels: " + Integer.toString(numOfWheels);
    }


}
