package cn.xysycx.singleton;

/**
 * @Description TODO 饿汉式单例
 *
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点： 不管用到与否，类装载时就完成实例化啊
 * Class.forName("")
 * (话说你不用的，装载它何用？)
 *
 *
 * @Author Fedeline
 * @Date 2020/11/22 下午2:21
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getINSTANCE() {
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        EagerSingleton E1 = EagerSingleton.getINSTANCE();
        EagerSingleton E2 = EagerSingleton.getINSTANCE();
        System.out.println(E1 == E2);
    }
}
