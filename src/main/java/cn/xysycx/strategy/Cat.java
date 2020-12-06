package cn.xysycx.strategy;

/**
 * @Description TODO 要对Cat类进行排序 自定义比较器
 * @Author Fedeline
 * @Date 2020/11/23 下午4:11
 */
public class Cat implements Comparable<Cat> {
    int weight,height;

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat c) {

        if (this.height < c.weight) {
            return -1;
        } else if (this.weight > c.weight) {
            return 1;
        } else {
            return 0;
        }
    }


}
