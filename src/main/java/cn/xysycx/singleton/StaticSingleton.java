package cn.xysycx.singleton;

/**
 * @Description TODO 静态内部类方式
 *                  JVM保证单例
 *                  加载 外部类时不会加载内部类，这样可以实现懒加载
 *                  完美单例 之一
 * @Author Fedeline
 * @Date 2020/11/22 下午3:07
 */
public class StaticSingleton {
    private StaticSingleton(){}
    private static class StaticSingletonHolder{
        private final static StaticSingleton INSTANCE = new StaticSingleton();
    }
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(StaticSingleton.getInstance().hashCode())
                    ).start();
        }
    }


}
