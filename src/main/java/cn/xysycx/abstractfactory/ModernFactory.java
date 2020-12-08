package cn.xysycx.abstractfactory;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午8:39
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
