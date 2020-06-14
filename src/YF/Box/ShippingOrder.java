package YF.Box;

public class ShippingOrder<K,V> {
    private K key;
    private V value;
    ShippingOrder(K key, V value){
        this.key = key;
        this.value = value;
    }
}
