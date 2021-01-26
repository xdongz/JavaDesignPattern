package prototypePattern;

import java.io.*;
import java.util.Date;

/**
 * 现在有一个需求：每位员工每周都要填写一份周报，需要填写的item一样，
 * 但每个item里面的内容可能会和之前不一样，如果每次都要重新填写所有的内容，
 * 就会做很多重复性的工作。
 *
 * 解决办法：用原型模式。将原先的内容拷贝下来，
 * 1. 必须让目标类实现Cloneable接口，该接口内没有任何抽象方法，这样的接口仅仅是一个标记接口，
 *    作用是，告诉jvm，任何实现了该Cloneable接口的类的对象，可以被克隆
 * 2. 必须重写java.lang.Object中的clone方法，一定要把该方法的访问修饰符重写为public，不然无法调用clone方法
 */
public class WeekReport implements Cloneable, Serializable{

    private int id;
    private String emp;
    private String summary;
    private String plain;
    private String suggestion;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPlain() {
        return plain;
    }

    public void setPlain(String plain) {
        this.plain = plain;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WeekReport{" +
                "id=" + id +
                ", emp='" + emp + '\'' +
                ", summary='" + summary + '\'' +
                ", plain='" + plain + '\'' +
                ", suggestion='" + suggestion + '\'' +
                ", time=" + time +
                '}';
    }

    //重写把原先的protected改成了public
    //clone方法是直接复制内存中的二进制。克隆出的对象和原先的对象内存地址不一致
    //所谓浅拷贝，就是把原来对象的二进制，原样复制，那么如果原来对象中有引用类型的属性，
    //它也只会把引用变量里保存的地址复制到新的对象里。
    //导致如果新的对象改变引用变量所指向的值，原有对象也会相应地修改
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //深拷贝
    //把对象中的引用变量所指向的值也拷贝了一份，使得原对象和新对象中的引用变量不再指向同一个值
    //但是这样的问题是，如果这个对象的层级比较深，就是它所指向的对象又指向一个对象...
    //如果一层一层手动拷贝，代码太复杂。
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        WeekReport clone = (WeekReport) super.clone();
//        Date clone2 = (Date) clone.getTime().clone();
//        clone.setTime(clone2);
//        return clone();
//    }

    //使用序列化来实现层级比较深的深拷贝
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(this); //序列化时，对象的所有属性层级关系会被序列化自动处理。this表示把本对象写进去
            oos.close();

            //从内存中取出数据
            byte[] bb = out.toByteArray();

            InputStream in  = new ByteArrayInputStream(bb);
            ObjectInputStream ois = new ObjectInputStream(in);
            Object clone = ois.readObject(); //把对象clone出来了
            ois.close();

            return clone;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
