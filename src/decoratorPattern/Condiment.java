package decoratorPattern;

/**
 * 这里加调料的方式就是用到的装饰器模式。
 * Condiment类继承了原先的Beverage类，但是在类中又聚合了Beverage类。
 * 装饰器模式一般用在原先的类比较稳定，但是要在原有类的继承上增加新的功能的情况下
 */
public abstract class Condiment extends Beverage{

    private Beverage beverage;

    public Condiment(Beverage beverage) {
        super("调料");
        this.beverage = beverage;
    }
}

class Milk extends Condiment {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " 牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}

class Soy extends Condiment {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " 豆浆";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}

class Mocha extends Condiment {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " 摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}

class Bubble extends Condiment {
    private Beverage beverage;

    public Bubble(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " 泡沫";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}

