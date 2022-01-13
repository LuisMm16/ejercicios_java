package poo;

public class SmartWatch extends SmartDevice{
    String correa;
    boolean resistenciaAgua;
    public SmartWatch(){
    }

    public SmartWatch(String sistemaOperativo, String marca, double precio, boolean bluetooth,
                      boolean wifi, String correa, boolean resistenciaAgua) {
        super(sistemaOperativo, marca, precio, bluetooth, wifi);
        this.correa = correa;
        this.resistenciaAgua = resistenciaAgua;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", correa='" + correa + '\'' +
                ", resistenciaAgua=" + resistenciaAgua +
                '}';
    }
}
