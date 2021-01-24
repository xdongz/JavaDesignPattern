package strategyPattern;

/**
 * 在父类中关联了会用到的所有接口。那么子类继承父类后，只需要在构造函数中去new具体的算法/业务，即可实现对算法/业务的调用
 * 而且子类在运行时还可以更改之前的算法，不像之前在子类中实现的方法的话，是写死的。
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("游泳");
    }

    public abstract void display();

}

class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("外观是绿头鸭");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithRockets();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("外观是红头鸭");
    }
}

class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}