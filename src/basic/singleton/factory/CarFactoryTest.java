package basic.singleton.factory;

public class CarFactoryTest {
    public static void main(String[] args) {
        Car k5 = new Car();
        Car k3 = new Car();
        System.out.println(k5.num);
        System.out.println(k3.num);
    }
}
