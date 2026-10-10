package hattabi.youness;

import deco.*;

public class Main {
    public static void main(String[] args) {
        Boisson b1 = new Espresso();
        System.out.println(b1.getDescription() + " : " + b1.cout());

        Boisson b2 = new Espresso();
        b2 = new Caramel(b2);
        b2 = new Chocolat(b2);
        System.out.println(b2.getDescription() + " : " + b2.cout());

        Boisson b3 = new Chocolat(new Chocolat(new Deca()));
        System.out.println(b3.getDescription() + " : " + b3.cout());
    }
}