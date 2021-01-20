import java.util.List;

public class Main {
     public static void main(String[] args) {

         Mechanic partToRepairList = new Mechanic();
         Mechanic partInStockList = new Mechanic();
         Mechanic orderList = new Mechanic();
         Car car1 = new Car("VolvoS80", "v-belt");
         Car car2 = new Car("RenaultMegane", "leftLamp");
         Car car3 = new Car("OpelCorsa", "bumper");


         partToRepairList.acceptCar(car1);
         partToRepairList.acceptCar(car2);
         partToRepairList.acceptCar(car3);

         orderList.acceptPart("v-belt");
         partInStockList.acceptPart("v-belt");


         orderList.repairCar(car1);
     }
}