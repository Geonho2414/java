package ch12;

public class ch12_5_interfaceChild implements ch12_3_interface, ch12_4_interface2 {

    @Override
    public void abc() {
        System.out.println("child of ch12i");
    }

    @Override
    public void bcd() {
        System.out.println("child of ch12i2");
    }
}
