package cn.xysycx.abstractfactory;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午8:39
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
