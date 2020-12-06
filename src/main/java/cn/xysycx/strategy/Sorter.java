package cn.xysycx.strategy;


/**
 * @Description TODO 修改为可以对猫的排序类
 * @Author Fedeline
 * @Date 2020/11/23 下午4:12
 */
public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i < arr.length  - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos])== -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }
//sort(int)
      void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
