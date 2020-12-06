package cn.xysycx.singleton;

/**
 * @Description TODO  lazyloading 懒汉式单例
 *                      虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *                      如果你执行没有看到hashcode都一样
 *                      可以取消线程休眠注释再执行几次试试
 * @Author Fedeline
 * @Date 2020/11/22 下午2:34
 */
public class LazySingleton {
    private static volatile LazySingleton INSTANCE;
    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if (INSTANCE == null){
//            try{
//                Thread.sleep(1);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(LazySingleton.getInstance().hashCode())
                    ).start();
        }
    }
}
