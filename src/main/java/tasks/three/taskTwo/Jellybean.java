package tasks.three.taskTwo;

public class Jellybean extends AbstractSweet {
    private String filling;

    public Jellybean() {
    }

    public Jellybean(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() + ", filling='" + filling + "'";
    }
}
