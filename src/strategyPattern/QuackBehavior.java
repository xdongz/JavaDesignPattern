package strategyPattern;

public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}

class Mute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("不能叫");
    }
}
