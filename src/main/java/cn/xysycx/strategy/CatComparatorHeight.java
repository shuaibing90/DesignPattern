package cn.xysycx.strategy;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/11/23 下午5:40
 */
public class CatComparatorHeight implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height < o2.height){
            return -1;
        }else if (o1.height > o2.height){
            return 1;
        }else {
            return 0;
        }
    }
}
