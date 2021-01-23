package observerPattern;

public class Main {
    public static void main(String[] args) {
        Role r = new Role();
        r.setName("Bill");
        r.setHp(100);
        r.setMp(100);

        Panel p = new Panel(r);
        BallPanel bp = new BallPanel(r);
        HeadPanel hp = new HeadPanel(r);

        r.addObserver(p);
        r.addObserver(bp);
        r.addObserver(hp);

        Monster m = new Monster();
        m.attack(r);
        r.notifyObservers();
        m.attack(r);
        r.notifyObservers();
    }

}

class Monster {
    public void attack(Role r) {
        r.setMp(r.getHp() - 10);
        r.setHp(r.getHp() - 10);
    }
}
