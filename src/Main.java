public class Main {
    public static void main(String[] args) {

            PartList volvoList = new PartList();
            Part part1 = new Part("left lamp");
            Part part2 = new Part("bumper");
            Part part3 = new Part("V-belt");
            volvoList.add(part1);
            volvoList.add(part2);
            volvoList.add(part3);
            orderList.add(volvoList);

            PartList renaultMeganeList = new PartList();
            Part part4 = new Part("left lamp");
            Part part5 = new Part("bumper");
            Part part6 = new Part("V-belt");
            renaultMeganeList.add(part4);
            renaultMeganeList.add(part5);
            renaultMeganeList.add(part6);
            orderList.add(volvoList);

            Mechanic mechanicAnia = new Mechanic("VolvoS80", "volvoList");
            Mechanic mechanicPrzemek = new Mechanic("Renaut Megane", "renaultMeganeList");

        }
    }
