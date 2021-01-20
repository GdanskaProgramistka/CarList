import java.util.ArrayList;
import java.util.List;

    public class Mechanic {

        List<String> partInStockList;
        List<String> partToRepairList;
        List<String> orderList;

        public Mechanic() {
            this.partInStockList = new ArrayList<>();
            this.partToRepairList = new ArrayList<>();
            this.orderList = new ArrayList<>();

            partInStockList = List.of("lefLamp", "rightLamp", "bumper");
        }

        public void acceptCar(Car car) {
            this.partToRepairList.add(car.getPart());
            if (this.partInStockList.contains(car.getPart())) {
                this.partInStockList.remove(car.getPart());
            } else {
                this.orderList.add(car.getPart());
            }
        }
        //when parts come:
        public void acceptPart(String part) {
            this.orderList.remove(part);
            this.partInStockList.add(part);
        }

        public void repairCar(Car car) {
            this.partInStockList.remove(car.getPart());
        }
    }

