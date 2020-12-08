package cn.xysycx.abstractfactory;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午8:30
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
