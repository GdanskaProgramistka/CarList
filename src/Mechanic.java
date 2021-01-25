import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic {

    List<Part> partInStockList;
    List<Part> partToRepairList;
    List<Part> orderList;

    public Mechanic() {
        this.partInStockList = new ArrayList<>();
        this.partToRepairList = new ArrayList<>();
        this.orderList = new ArrayList<>();

        partInStockList = new ArrayList<>();
        partInStockList.add(new Part ("lefLamp"));
        partInStockList.add(new Part ("rightLamp"));
        partInStockList.add(new Part ("bumper"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(partInStockList, mechanic.partInStockList) &&
                Objects.equals(partToRepairList, mechanic.partToRepairList) &&
                Objects.equals(orderList, mechanic.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partInStockList, partToRepairList, orderList);
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
    public void acceptPart(Part part) {
        this.orderList.remove(part);
        this.partInStockList.add(part);
    }

    public void repairCar(Car car) {
        this.partInStockList.remove(car.getPart());
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "partInStockList=" + partInStockList +
                ", partToRepairList=" + partToRepairList +
                ", orderList=" + orderList +
                '}';
    }
}

