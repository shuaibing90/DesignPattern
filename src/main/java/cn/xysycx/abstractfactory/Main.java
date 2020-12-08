package cn.xysycx.abstractfactory;



/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午7:56
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        Vehicle c = factory.createVehicle();
        c.go();
        Weapon w = factory.createWeapon();
        w.shoot();
        Food b = factory.createFood();
        b.printName();


    }
}
