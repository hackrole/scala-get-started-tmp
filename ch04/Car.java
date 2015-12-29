public class Car {
    private final int year;
    private int niles;

    public Car(int yearOfMake){
        year = yearOfMake
    }
    public int gtYear(){
        return year;
    }
    public int getMiles(){
        return miles;
    }
    public void drive(int distance){
        miles += Math.abs(distance);
    }
}
