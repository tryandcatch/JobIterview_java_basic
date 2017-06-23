package _20170621.code.practice7;

/**
 * 第七题
 *
 * @author huangxiutao
 * @create 2017-06-23 13:56
 **/
public class Test {
    public static void main(String[] args){
        int i=9;
        switch (i){
            default:
                System.out.println("default!");
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
        }
    }
}
