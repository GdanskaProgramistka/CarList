import java.util.ArrayList;
import java.util.List;

    public class PartList {

        List<Part> partList;

        public PartList() {
            this.partList = new ArrayList<>();
        }

        public void add(Part part) {
            this.partList.add(part);
        }

}
