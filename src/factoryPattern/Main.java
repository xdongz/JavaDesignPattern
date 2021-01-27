package factoryPattern;

public class Main {

    public static void main(String[] args) {
        FoodFactory ff = new HamburgerFactory();
        Food food = ff.getFood();
        food.eat();
    }
}

//================================================================
//这是客户端自己新增的类，无需修改原来的代码
class Lp implements Food {

    @Override
    public void eat() {
        System.out.println("吃凉皮");
    }
}
class LpFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new Lp();
    }
}

/**
 * 工厂方法：
 *     优点：
 *     1. 仍然具有简单工厂的优点，服务端修改了具体产品的类名以后，客户端不知道
 *     2. 当客户端需要扩展一个新的产品时，不需要修改原来作者的代码，只需要新增一个工厂而已
 *
 *     杠点：
 *     虽然具体的产品类名改变之后，客户端不知道，但是现在的代码中，客户端仍然依赖于具体的工厂类名。
 *     如果服务端修改了具体工厂的类名，客户端也需要修改。
 *
 *     解释：
 *     工厂的名字，是视为接口的，作者有责任有义务保证工厂的名字是稳定的
 *
 *     缺点：
 *     如果有多个产品等级，类的个数会爆炸式增长
 */
