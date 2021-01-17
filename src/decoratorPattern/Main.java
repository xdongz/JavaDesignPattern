package decoratorPattern;


public class Main {

    public static void main(String[] args) {
        Beverage b = new Defcaf();
        Beverage b2 = new Milk(b);
        Beverage b3 = new Soy(b2);
        Beverage b4 = new Soy(b3);

        System.out.println(b4.getDescription() + ":" + b4.cost());

    }
}
