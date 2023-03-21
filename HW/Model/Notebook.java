package Seminar5.HW.Model;

public class Notebook {
    private String brand;
    private int price;
    private int ram;
    private int ssd;
    private String os;

    public Notebook(String brand, int price, int ram, int ssd, String os) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Notebook - | " +
                "brand = " + brand  +
                ", price = " + price +
                ", ram = " + ram + "гб" +
                ", ssd = " + ssd + "гб" +
                ", os = " + os +
                " |";
    }
}
