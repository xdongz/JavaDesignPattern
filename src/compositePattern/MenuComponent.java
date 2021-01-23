package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 掌握组合模式的重点是要理解清楚"部分/整体" 还有“单个对象”与"组合对象"的含义
 *
 * 组合模式一般用在有层级结构的程序里。
 *
 * 通俗点来讲，就是父类里定义出不同子类需要的所有方法，子类根据自身的需要去重写父类的方法
 *
 */
public abstract class MenuComponent {
    private String name;
    private String description;
    private List<MenuComponent> list = new ArrayList<>();
    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //属于菜单的方法：
    public List<MenuComponent> getList() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent mc) {
        throw new UnsupportedOperationException();
    }

    //属于菜单项的方法：
    public boolean isVegetable() {
       throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public abstract void print(String prefix);
}

class Menu extends MenuComponent{

    private List<MenuComponent> list = new ArrayList<>();
    public Menu(String name, String description) {
        super(name, description);

    }

    public List<MenuComponent> getList() {
        return list;
    }

    @Override
    public void add(MenuComponent mc) {
        list.add(mc);
    }

    public void print(String prefix) {
        System.out.println(prefix + "<<" + getName() + ">>" + getDescription());
        Iterator<MenuComponent> it = list.iterator();
        while (it.hasNext()) {
            MenuComponent mc = it.next();
            mc.print("\t" + prefix);
        }
    }
}

class MenuItem extends MenuComponent{

    private boolean isVegetable;
    private double price;

    public MenuItem(String name, String description, boolean isVegetable, double price) {
        super(name, description);
        this.isVegetable = isVegetable;
        this.price = price;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print(String prefix) {
        String str = isVegetable ? "(素食)" : "";
        System.out.println(prefix + getName() + str + ":" + getDescription());
    }
}
