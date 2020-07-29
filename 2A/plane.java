class plane implements Vehicle {
 public int wheels;
 public int passengers;
 public boolean has_gas;
 
  plane(int wheels, int passengers, boolean has_gas) {
   this.wheels = wheels;
   this.passengers = passengers;
   this.has_gas = has_gas;
 }
 
 public int set_num_of_wheels() {
  wheels = 3;
  return wheels;
 }
 public int set_num_of_passengers() {
  passengers = 100;
  return passengers;
 }
 public boolean has_gas() {
  has_gas = true;
  return has_gas;
 }
}