package cn.xysycx.strategy;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/11/23 下午5:26
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);
}
