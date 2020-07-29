public class main {
 public static void main (String[] args) {
  car car = new car(4, 5, false);
  plane plane = new plane(3, 100, true);

  System.out.println("Car Wheels: " + car.wheels);
  System.out.println("Car Passengers: " + car.passengers);
  System.out.println("Car Gas: " + car.has_gas);
  System.out.println("Plane Wheels: " + plane.wheels);
  System.out.println("Plane Passengers: " + plane.passengers);
  System.out.println("Plane Gas: " + plane.has_gas);
  
 }
}