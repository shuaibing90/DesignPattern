package cn.xysycx.singleton;

/**
 * @Description TODO Java创始人之一写的完美单例
 *                   不仅可以解决线程同步，还可以防止反序列化
 * @Author Fedeline
 * @Date 2020/11/22 下午3:18
 */
public enum EnumSingleton {
    INSTANCE;
    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(EnumSingleton.INSTANCE.hashCode())
                    ).start();
        }
    }
}
