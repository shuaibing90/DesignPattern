package cn.xysycx.strategy;

import java.util.Arrays;

/**
 * @Description TODO
 * @Author Fedeline
 * @Date 2020/11/23 下午4:11
 */
public class Main {
    public static void main(String[] args) {
//        int [] a = {9,2,3,7,1,4};
        Dog[] d = {new Dog(3),new Dog(1),new Dog(5)};
        Cat[] a ={new Cat(3,3),new Cat(5,5)};
        Sorter<Dog> sorter = new Sorter<Dog>();
        sorter.sort(d,new DogComparator());
        System.out.println("对Cat按照身高来进行排序");
        Sorter<Cat> catSorter = new Sorter<>();
        catSorter.sort(a,new CatComparatorHeight());

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));

    }
}
