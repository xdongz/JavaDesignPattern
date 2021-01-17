package decoratorPattern;

/**
 * 业务场景： 星巴克卖咖啡，一开始只有四种咖啡：
 * Decaf, Espresso, DarkRoast, HouseBlend
 *
 * 因为所有咖啡都有共性，所以开发人员把他们的共性上提到一个父类中：Beverage.
 *
 * 最开始所有的咖啡只有两个属性：description 和 cost。
 * 如果现在需要增加调料的业务，而且调料分为好几种：牛奶，豆浆，摩卡，泡沫
 */
public abstract class Beverage {
    private String description;

    public Beverage(String description) {
        this.description = description;
    }

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Defcaf extends Beverage {
    public Defcaf() {
        super("无咖啡");
    }

    public double cost() {
        return 1;
    }
}

class Espresso extends Beverage {
    public Espresso() {
        super("浓缩咖啡");
    }

    public double cost() {
        return 2;
    }
}

class DarkRoast extends Beverage {
    public DarkRoast() {
        super("焦炒咖啡");
    }

    public double cost() {
        return 1.5;
    }
}

class HouseBlend extends Beverage {
    public HouseBlend() {
        super("混合咖啡");
    }

    public double cost() {
        return 3;
    }
}
