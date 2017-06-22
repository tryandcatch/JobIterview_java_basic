package _20170621.code.practice5;

/**
 * 第五题
 *
 * @author huangxiutao
 * @create 2017-06-22 10:52
 **/
public class Happy {
    public static void main(String args[]) {
        float [][] f1 = {{1.2f,2.3f},{4.5f,5.6f}} ;
        Object oo = f1 ;
        f1[1] = oo ;
        System.out.println("Best Wishes "+f1[1]);
    }
}
