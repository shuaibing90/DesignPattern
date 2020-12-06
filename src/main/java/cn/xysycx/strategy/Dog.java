package cn.xysycx.strategy;

/**
 * @Description TODO  在可以对Cat类进行排序的基础上，再实现可以对Dog类进行排序
 * @Author Fedeline
 * @Date 2020/11/23 下午5:01
 */
public class Dog implements Comparable<Dog> {
    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog d) {

        if (this.food < d.food){
            return -1;
        }else if (this.food > d.food){
            return 1;
        }else {
            return 0;
        }


    }
}
