import java.util.ArrayList;
import java.util.List;

    public class OrderList {

        List<PartList> orderList;

        public OrderList() {
            this.orderList = new ArrayList<>();
        }

        public void add(List partList) {
            this.orderList.add(partList);
        }


}
