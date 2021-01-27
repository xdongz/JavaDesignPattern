package abstractFactoryPattern;

public interface Food {
    public void eat();
}

class Hbb implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡包");
    }
}

class FrenchFries implements Food {

    @Override
    public void eat() {
        System.out.println("吃薯条");
    }
}