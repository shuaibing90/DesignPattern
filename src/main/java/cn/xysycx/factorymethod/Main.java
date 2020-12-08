package cn.xysycx.factorymethod;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午7:56
 */
public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().createCar();
        m.go();

    }
}
