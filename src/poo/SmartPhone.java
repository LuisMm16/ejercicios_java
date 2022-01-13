package poo;

public class SmartPhone extends SmartDevice{
    String red; //3G, 4G, 5G

    public SmartPhone() {
    }

    public SmartPhone(String sistemaOperativo, String marca, double precio,
                      boolean bluetooth, boolean wifi, String red) {
        super(sistemaOperativo, marca, precio, bluetooth, wifi);
        this.red = red;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", red='" + red + '\'' +
                '}';
    }
}
