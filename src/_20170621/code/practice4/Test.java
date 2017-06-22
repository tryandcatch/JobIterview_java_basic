package _20170621.code.practice4;/**
 *
 */

/**
 * @author huangxiutao
 * @create 2017-06-21 18:45
 **/
public class Test {
    public static void main(String[] args){
        Super s=new Sub();
    }
    /**
     * 解释：
     * 编译不通过，因为如果代码中已经定义了一个构造函数（无论是否有参数），编译程序都不会再去帮我们自动“定义”构造函数。
     * Super中自定义了一个有参的构造函数，但没有定义默认构造函数（ Super()），编译通不过；
     * 帮助理解：
     * 子类的构造函数的第一行代码默认是super()(调用父类的默认构造函数);
     * 在此案例中，就是Sub的默认构造函数里面的第一行代码调用的是Super类中的默认构造函数，
     * 但是在Super中没有定义该构造函数，因此会编译出错
     */
}
