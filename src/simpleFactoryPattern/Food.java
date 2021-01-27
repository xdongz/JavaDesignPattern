package simpleFactoryPattern;

public interface Food {
    public void eat();
}

class RiceNoodle implements Food {

    @Override
    public void eat() {
        System.out.println("吃米线");
    }
}

class Hamburger implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡包");
    }
}

class FoodFactory {
    public static Food getFood(int n) {
        Food food = null;

        switch (n) {
            case 1:
                food = new Hamburger();
                break;
            case 2:
                food = new RiceNoodle();
                break;
        }
        return food;
    }
}
