package poo;

public abstract class SmartDevice {
    String sistemaOperativo;
    String marca;
    double precio;
    boolean bluetooth;
    boolean wifi;

    public SmartDevice(){
    }

    public SmartDevice(String sistemaOperativo, String marca, double precio, boolean bluetooth, boolean wifi){
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.precio = precio;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                '}';
    }
}
