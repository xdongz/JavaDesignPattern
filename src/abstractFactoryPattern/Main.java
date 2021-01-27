package abstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        Factory f = new KFC();
        Food food = f.getFood();
        food.eat();
        Drink drink = f.getDrink();
        drink.drink();
    }
}
