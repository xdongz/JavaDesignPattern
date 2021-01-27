package simpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Food f1 = FoodFactory.getFood(1);
        f1.eat();
    }
}

/**
 * 简单工厂
 *       优点：
 *       1. 把具体产品的类型，从客户端代码中解耦出来
 *       2. 服务端如果修改了具体产品的类名，客户端也不知道
 *       这便符合了面向接口编程。（接口是趋于稳定的）
 *
 *       缺点：
 *       1. 客户端不得不死记硬背具体产品的映射关系
 *       2. 如果产品种类特别多，简单工厂便十分臃肿
 *       3. 最重要是客户端如果想要扩展具体产品种类，势必要修改原来的代码，违反了开闭原则
 */
