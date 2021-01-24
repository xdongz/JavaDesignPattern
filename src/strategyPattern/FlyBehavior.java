package strategyPattern;

/**
 * 策略模式将同一组类型的算法/业务用一个接口定义，具体的算法单独用一个class去实现这个接口
 * 提高了代码的重用性，不用在每个具体的Duck类中去实现fly或者quack方法了。因为可能不同的Duck的fly火鹤quack方法是一样的。
 */
public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("用翅膀飞。。。");
    }
}

class FlyWithRockets implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("背上绑个火箭飞~~~");
    }
}

class FlyWithKick implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("被人一脚踢飞...");
    }
}

class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}

