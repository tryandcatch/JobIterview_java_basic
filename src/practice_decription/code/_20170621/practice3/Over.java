package practice_decription.code._20170621.practice3;/**
 *
 */

/**
 * @author huangxiutao
 * @create 2017-06-21 17:50
 **/
public class Over extends Base {
    public static void main(String args[]){
        Over o=new Over();
        int iBase=0;
        o.amethod(iBase);
    }

    public void amethod(int iOver){
        System.out.println("Over.amethod");
    }
}
