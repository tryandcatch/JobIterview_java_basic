package practice_decription.code;/**
 *
 */

/**
 * 2017年6月21日收集的题目程序代码
 *
 * @author huangxiutao
 * @create 2017-06-21 17:00
 **/
public class App {
    public int aMethod() {
        static int i=0;
        i++;
        return i;
    }
    public static void main(String args[]) {
        App test = new App();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
