package deco;

public abstract class Boisson {
    protected String description = "Boisson";

    public String getDescription() {
        return description;
    }

    public abstract double cout();
}
