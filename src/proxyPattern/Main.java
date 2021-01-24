package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //目标对象(真实对象)
        Ical c = new IcalImpl();
        //动态代理：运行时产生字节码
        //创建代理对象：

        //第一个参数：ClassLoader
        //我们知道，要实例化一个对象，是需要调用类的构造器的，在程序运行期间第一次调用构造器时，就会引起类的加载。
        //加载类的时候，就是jvm拿着ClassLoader去加载类的字节码，只有字节码被加载到内存中，才能进一步去实例化出类的对象
        //简单来说，就是只要涉及实例化类的对象，就一定要加载类的字节码，而加载字节码就必须使用类的加载器。
        //下面我们使用的是动态代理的api来创建一个类的对象，这是一种不常用的实例化对象的方式，尽管不常用，但毕竟涉及到实例化类的对象
        //那就一定也需要加载类的字节码，也就一定需要类加载器，所以我们手动把类加载器传入
        ClassLoader cl = Main.class.getClassLoader();

        //第二个参数：Class[]
        //我们已经知道，下面的代码，是用来实例化一个对象的，实例化对象，就一定是实例化某一个类的对象，问题是，到底是哪个类？
        //这个类，其实不在硬盘上，而是在内存中，是由动态代理在内存中”动态“生成的
        //这个在内存中直接生成的字节码，会去实现下面方法中的第2个参数中所指定的接口。
        //也就是说下面这个方法的返回值，已经实现了参数2中的接口
        //那么这个代理对象就拥有add sub mul div方法

        //第3个参数： InvocationHandler
        //我们可以通过代理对象调用这些方法.
        //注意：每次对代理对象的任何方法的调用，都不会进入真正的实现方法中，而是统统进入第三个参数的invoke方法中
        Ical proxy = (Ical) Proxy.newProxyInstance(cl, new Class[] {Ical.class}, new MyHandler(c));
        proxy.add(2,3);
        proxy.sub(1,4);
        proxy.mul(5,3);
        proxy.div(6,3);

    }

    static class MyHandler implements InvocationHandler {

        private Object target;

        public MyHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName() + "开始， 参数是：" + Arrays.toString(args));
            Object r = method.invoke(target, args);
            System.out.println(method.getName() + "结束， 结果是" + r);
            return 0;
        }
    }
}
