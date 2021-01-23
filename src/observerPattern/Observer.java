package observerPattern;

public interface Observer {
    public void update();
}

/**
 * 每个具体的观察者都要实现观察者接口
 * 如果主题一旦发生改变，所有的观察者都会接收到讯息，并且更新对应的值
 */
class Panel implements Observer {

    private Role r;

    public Panel(Role r) {
        this.r = r;
    }

    @Override
    public void update() {
        System.out.println("在左上角的面板中，更新数据：" + r);
    }
}

class BallPanel implements Observer {

    private Role r;

    public BallPanel(Role r) {
        this.r = r;
    }

    @Override
    public void update() {
        System.out.println("在球形面板中，更新数据：" + r);
    }
}

class HeadPanel implements Observer {

    private Role r;

    public HeadPanel(Role r) {
        this.r = r;
    }

    @Override
    public void update() {
        System.out.println("在头顶面板中，更新数据：" + r);
    }
}
