package _20170621.code.practice9;

/**
 * Created by Huangxiutao on 2017/6/26.
 */
public class MyClass {
    public static void main(String arguments[])     {
        amethod(arguments);
    }
    public void amethod(String[] arguments){
        System.out.println(arguments);
        System.out.println(arguments[1]);
    }
    /**
     * 解释：
     * 非静态方法不能被静态方法调用
     */
    
}
