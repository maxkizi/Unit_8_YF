package YF.Box;

public class TimeToShip {
    public static void main(String[] args) {
        Box <Nokia> box1 = new Box<>();
        box1.add(new Nokia());
        box1.add(new Nokia());

        Box <Blackberry> box2 = new Box<>();

        ShippingOrder<String, Box<Nokia>> so1 =
                new ShippingOrder<>("001", box1);

        ShippingOrder<String, Box <Blackberry>> so2 =
                new ShippingOrder<>("001", box2);
    }
}
