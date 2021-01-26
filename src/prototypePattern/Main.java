package prototypePattern;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //第一周周报
        WeekReport wr = new WeekReport();
        wr.setEmp("张珊珊");
        wr.setSummary("讲解完7大原则");
        wr.setPlain("讲解完设计模式");
        wr.setSuggestion("无");
        wr.setTime(new Date());
        System.out.println(wr);

        //第二周周报，内容大部分和第一周一样，所有用clone方法把之前的周报clone过来
        //再修改不一样的内容
        WeekReport wr2 = (WeekReport) wr.clone();
        //System.out.println(wr2);
        wr2.setSuggestion("aaaaaaa");
        wr2.setPlain("bbbbb");
        wr2.getTime().setTime(0);
        System.out.println(wr2);

    }
}
