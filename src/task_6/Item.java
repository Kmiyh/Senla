package task_6;

public class Item {

    private String name;
    private double weigth;
    private double price;

    public Item(String name, double weigth, double price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Предмет " + name + " с весом " + weigth + " и стоимостью " + price;
    }
}
