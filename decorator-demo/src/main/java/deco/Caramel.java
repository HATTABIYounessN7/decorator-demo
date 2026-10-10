package deco;

public class Caramel extends Decorateur {
    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}