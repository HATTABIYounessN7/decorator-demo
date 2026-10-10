package deco;

public class Chocolat extends Decorateur {
    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.75;
    }
}