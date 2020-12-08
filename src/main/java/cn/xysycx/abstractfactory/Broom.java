package cn.xysycx.abstractfactory;

import cn.xysycx.factorymethod.Moveable;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午8:02
 */
public class Broom extends Vehicle {
    @Override
    public void go() {
        System.out.println("broom flying....");
    }
}
