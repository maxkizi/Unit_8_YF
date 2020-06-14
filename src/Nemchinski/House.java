package Nemchinski;

public class House  implements Comparable<House>{
    int area;
    int price;
    String city;
    boolean hasFurniture;

    public House (int area, int price, String city, boolean hasFurniture){
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

   @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public int compareTo(House anotherHouse) {
        if (this.price == anotherHouse.area)
            return 0;

        else if (this.price < anotherHouse.area)
            return -1;

        else return 1;
    }
}
