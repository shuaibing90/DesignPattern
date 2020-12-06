package cn.xysycx.singleton;

/**
 * @Description TODO  lazyloading 懒汉式单例 加锁实现
 *                      虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *                      可以通过synchroized解决，但也带来了效率下降
 * @Author Fedeline
 * @Date 2020/11/22 下午2:34
 */
public class LazySingleton02 {
    private static volatile LazySingleton02 INSTANCE;
    private LazySingleton02(){};

    public static synchronized LazySingleton02 getInstance(){
        if (INSTANCE == null){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            INSTANCE = new LazySingleton02();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(LazySingleton02.getInstance().hashCode())
                    ).start();
        }
    }
}
