public class main {
 public static void main(String[] args) {
  Car car = new Car(4, 5, false);
  Plane plane = new Plane(3, 100, true);
  
  System.out.println("Car Wheels: " + car.wheels);
  System.out.println("Car Passengers: " + car.passengers);
  System.out.println("Car Gas: " + car.gas);
  System.out.println("Plane Wheels: " + plane.wheels);
  System.out.println("Plane Passengers: " + plane.passengers);
  System.out.println("Plane Gas: " + plane.gas);
  
 }
}