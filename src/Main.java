import java.util.List;

public class Main {
     public static void main(String[] args) {

         Mechanic mechanic = new Mechanic();
         Car car1 = new Car("VolvoS80", new Part("V-belt"));
         Car car2 = new Car("RenaultMegane", new Part("leftLamp"));
         Car car3 = new Car("OpelCorsa", new Part("bumper"));


         mechanic.acceptCar(car1);
         mechanic.acceptCar(car2);
         mechanic.acceptCar(car3);

         mechanic.acceptPart(new Part ("v-belt"));

         mechanic.repairCar(car1);

         System.out.println(mechanic);
     }
}