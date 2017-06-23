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
        /**
         * 解释：
         * 1.switch后的表达式的类型只能为以下几种：byte、short、char、int、enum、Byte、Short、Integer、Character（在Java1.6中是这样），
         * 在java1.7后支持了对String的判断
         * 2.如果switch的case语句后没有break，会继续执行后面的case语句代码和default，直到遇见break或者右花括号。
         */
    }
}
