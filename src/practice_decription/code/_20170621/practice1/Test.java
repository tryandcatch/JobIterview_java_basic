package practice_decription.code._20170621.practice1;/**
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
}
