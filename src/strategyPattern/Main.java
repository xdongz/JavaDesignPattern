package strategyPattern;

public class Main {

    public static void main(String[] args) {
        Duck rubberDuck =  new RubberDuck();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        //运行时可更改飞行的方法。
        rubberDuck.setFlyBehavior(new FlyWithKick());
        rubberDuck.performFly();

    }
}
