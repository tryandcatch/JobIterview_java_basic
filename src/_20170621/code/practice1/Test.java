package _20170621.code.practice1;/**
 *
 */

/**
 * 第一题
 *
 * @author huangxiutao
 * @create 2017-06-21 17:43
 **/
public class Test {
    public int aMethod() {
        static int i=0;
        i++;
        return i;
    }
    public static void main(String args[]) {
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
    /**
     * static修饰的变量属于“类”级别的
     * 帮助理解：
     *  局部变量（方法内）是有生命周期的，用完后JAVA很快就回收资源了。如果设成静态变量，那JAVA无法自动回收其占用的内存。
     *
     */
}
