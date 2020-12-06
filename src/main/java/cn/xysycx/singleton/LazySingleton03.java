package cn.xysycx.singleton;

/**
 * @Description TODO  lazyloading 懒汉式单例 加锁实现
 *                      虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *                      可以通过synchroized解决，但也带来了效率下降
 *                      妄图通过减小同步代码块数量的方式提高效率，然后不可行
 * @Author Fedeline
 * @Date 2020/11/22 下午2:34
 */
public class LazySingleton03 {
    private static volatile LazySingleton03 INSTANCE;
    private LazySingleton03(){};

    public static  LazySingleton03 getInstance(){
        //妄图通过减小同步代码块数量的方式提高效率，然后不可行
        if (INSTANCE == null){
            synchronized (LazySingleton03.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new LazySingleton03();
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(LazySingleton03.getInstance().hashCode())
                    ).start();
        }
    }
}
