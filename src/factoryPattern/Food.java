package factoryPattern;

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


