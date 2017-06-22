package _20170621.code.practice3;/**
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


    /**
     *解释：Over 继承 Base ，因为amethod在父类中是priavtede，子类相当于新定义了一个amethod，并不是重写。
     * 重写（覆盖）的规则：
     * 1、重写方法的参数列表必须完全与被重写的方法的相同,否则不能称其为重写而是重载.
     * 2、重写方法的访问修饰符一定要大于被重写方法的访问修饰符（public>protected>default>private）。
     * 3、重写的方法的返回值必须和被重写的方法的返回一致；
     * 4、重写的方法所抛出的异常必须和被重写方法的所抛出的异常一致，或者是其子类；
     * 5、被重写的方法不能为private，否则在其子类中只是新定义了一个方法，并没有对其进行重写。
     * 6、静态方法不能被重写为非静态的方法（会编译出错）。
     */

}
