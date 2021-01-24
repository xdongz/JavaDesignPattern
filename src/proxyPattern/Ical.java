package proxyPattern;

public interface Ical {
    public int add(int a, int b);
    public int sub(int a, int b);
    public int mul(int a, int b);
    public int div(int a, int b);
}

/**
 * 如果有个要求，需要对每个方法加一个打印开始结束的功能
 *  要是在每个方法的实现中加入打印开始结束的功能，代码重复性太高，
 *  而且如果要改便打印开始和结束的语句，每个方法都要改，
 *  核心代码和非核心代码糅合在一起
 *  以后如果增加新的方法，还需要添加这些开始结束打印语句。
 *  为了解决这个问题，我们可以使用代理模式
 */
class IcalImpl implements Ical {

    @Override
    public int add(int a, int b) {
        int r = a+b;
        return r;
    }

    @Override
    public int sub(int a, int b) {
        int r = a-b;
        return r;
    }

    @Override
    public int mul(int a, int b) {
        int r = a*b;
        return r;
    }

    @Override
    public int div(int a, int b) {
        int r = a/b;
        return r;
    }
}
