/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

/**
 *
 * @author yzh34
 */
import java.util.ArrayList;
public class RawType {
    /*
    raw type:when u use generics,but u dont clarify the type.
    unsafe:because compiler can't detect the syntax error,that may cause error when run-time
    because there is no genirics before java1.5 when the raw type is allowed,in other words for backwards compatibility
    */
    //raw type example
    public static void main (String[]args){
    ArrayList arr1=new ArrayList();
    arr1.add(123);
    arr1.add("um");
    String s=(String)arr1.get(1);//强制转换成string，因为没指定type parameter，容易出现runtime问题
}
}
