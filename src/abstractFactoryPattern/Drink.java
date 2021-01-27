package abstractFactoryPattern;

public interface Drink {
    public void drink();
}

class IcePeek implements Drink {

    @Override
    public void drink() {
        System.out.println("冰峰饮料");
    }
}

class Cola implements Drink {

    @Override
    public void drink() {
        System.out.println("可口可乐");
    }
}
