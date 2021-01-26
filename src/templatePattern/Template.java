package templatePattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 模板模式中，一个抽象类公开定义了指定它的方法的方式/模板，它的子类可以按需要重写方法实现。
 * 就是把不变的部分写在模板方法里，变化的部分写在抽象方法里，子类重写抽象方法即可。
 */
public abstract class Template {

    public void template() {
        System.out.println("start...");
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("end...");
    }

    public abstract void code();
}

class A extends Template {

    @Override
    public void code() {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
    }
}

class B extends Template {

    @Override
    public void code() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
    }
}