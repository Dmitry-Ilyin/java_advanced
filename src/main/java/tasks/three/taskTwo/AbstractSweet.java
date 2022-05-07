package tasks.three.taskTwo;

public abstract class AbstractSweet {
    private String name;
    private double weight;
    private double price;

    public AbstractSweet() {
    }

    public AbstractSweet(String name, double weight, double price) {
        if (name.isEmpty() || weight <= 0 || price <= 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price;
    }
}
