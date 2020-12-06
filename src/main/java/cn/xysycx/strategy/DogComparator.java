package cn.xysycx.strategy;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/11/23 下午5:40
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food){
            return -1;
        }else if (o1.food > o2.food){
            return 1;
        }else {
            return 0;
        }
    }
}
