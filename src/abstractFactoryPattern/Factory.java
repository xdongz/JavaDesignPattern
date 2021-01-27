package abstractFactoryPattern;

/**
 * 之前的工厂方法是为每一种产品等级定义一个工厂
 * 抽象工厂方法是只定义一个工厂接口，在这个工厂里可以生产不同的产品等级
 * 比如同时生产food和drink
 */
public interface Factory {
    Food getFood();
    Drink getDrink();
}

class KFC implements Factory {

    @Override
    public Food getFood() {
        return new Hbb();
    }

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}

class SanQin implements Factory {

    @Override
    public Food getFood() {
        return new FrenchFries();
    }

    @Override
    public Drink getDrink() {
        return new IcePeek();
    }
}
