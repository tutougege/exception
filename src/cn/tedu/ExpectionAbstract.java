package cn.tedu;

import com.sun.xml.internal.bind.v2.model.core.LeafInfo;

/**
 * @author liwei
 * @create 2022-03-31-9:04
 **/
/*java的异常处理机制:
*java中所有异常的超类为Throwable,其下派生了两个子类Error Exception
*Exception表示程序级别的错误，大多是由逻辑错误而导致
*
* 异常处理机制中的try-catch
* 语法为
* try{
* 语句块
* }catch(XXXXException e){
*
* }
*
*/
public class ExpectionAbstract {
    public static void main(String[] args) {
        System.out.println("程序开始了..");
        String line = null;
        System.out.println(line.length());//这里出现一个异常程序运行到这会抛出异常
        /*
        JVM执行到这里时发生异常会实例化一个异常实例，并将程序执行过程
        设置进去，然后抛出异常
         */
        /*
        try-catch异常处理机制
         */
    }
}
