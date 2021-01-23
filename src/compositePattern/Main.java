package compositePattern;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MenuComponent menu = new Menu("西安小吃", "西安的特色");

        MenuComponent menu1 = new Menu("凉皮菜单", "各种凉皮");
        MenuComponent menu1_1 = new MenuItem("秦镇米皮", "第一种凉皮", true, 5);
        MenuComponent menu1_2 = new MenuItem("汉中热米皮", "第二种凉皮", true, 6);
        MenuComponent menu1_3 = new MenuItem("宝鸡擀面皮", "第三种凉皮", true, 7);

        MenuComponent menu2 = new MenuItem("砂锅", "各种东西一起炖", false, 16);
        MenuComponent menu3 = new MenuItem("泡馍", "羊肉加饼", false, 18);
        MenuComponent menu4 = new MenuItem("胡辣汤", "很辣的汤", true, 9);

        MenuComponent menu5 = new Menu("火锅", "各种口味的火锅");
        MenuComponent menu5_1 = new MenuItem("鸳鸯火锅", "辣和不辣", false, 25);
        MenuComponent menu5_2 = new MenuItem("麻辣火锅", "很辣的火锅", false, 30);
        MenuComponent menu5_3 = new MenuItem("三鲜火锅", "三种食材", false, 35);

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
        menu.add(menu5);

        menu1.add(menu1_1);
        menu1.add(menu1_2);
        menu1.add(menu1_3);

        menu5.add(menu5_1);
        menu5.add(menu5_2);
        menu5.add(menu5_3);

        //menu.print("");
        printV(menu);
    }

    public static void printV(MenuComponent menu) {
        Iterator<MenuComponent> it = menu.getList().iterator();
        while(it.hasNext()) {
            MenuComponent mc = it.next();
            try {
                if (mc.isVegetable()) {
                    mc.print("");
                }
            } catch (Exception e) {
               printV(mc);
            }
        }
    }
    //只打印素食菜单
    //客户端应该只需要知道MenuComponent类的存在就够了，不应该知道Menu类和MenuItem的存在(迪米特法则)
//    public static void printV(MenuComponent menu) {
//        Iterator<MenuComponent> it = menu.getList().iterator();
//        while(it.hasNext()) {
//            MenuComponent mc = it.next();
//            if (mc instanceof MenuItem) {
//                if (((MenuItem) mc).isVegetable()) {
//                    mc.print("");
//                }
//            }
//
//            if (mc instanceof Menu) {
//                printV((Menu) mc);
//            }
//        }
//    }
}
