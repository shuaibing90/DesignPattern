package cn.xysycx.factorymethod;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/12/6 下午8:07
 */
public class CarFactory {
    public Car createCar(){

        System.out.println(" a car created");
        return new Car();

    }

}
