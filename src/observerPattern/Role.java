package observerPattern;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

/**
 * 每个具体的主题需要实现主题接口，这些主题一旦发生改变，便会通知所有的观察者。
 */
public class Role implements Subject{
    private String name;
    private int Hp;
    private int Mp;

    private List<Observer> observers = new ArrayList();

    public void addObserver(Observer obj) {
        observers.add(obj);
    }

    public void removeObserver(Observer obj) {
        observers.remove(obj);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMp() {
        return Mp;
    }

    public void setMp(int mp) {
        Mp = mp;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", Hp=" + Hp +
                ", Mp=" + Mp +
                '}';
    }
}
