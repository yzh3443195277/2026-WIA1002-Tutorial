/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

import java.util.ArrayList;
import java.util.List;
public class AllTransportation {
    public static <T> void allTransportation1(List<?> list1,List<? super T> list2){};
    public static <E> void allTransportation2(List<? extends E> list1,List<?> list2){};
    //这两个method header是一样的。声明参数类型时要看几个参数的数据类型之间有没有关系
    //这里我们要接受的两个list，一个类型sting一个类型object，所以明显是父子类关系
    //那我们声明参数时就得把这层关系带上。
    public static void main(String[]args){
          ArrayList<String> vehicles=new ArrayList<>();
          ArrayList<Object> transportation=new ArrayList<>();
          allTransportation1(vehicles,transportation);
          allTransportation2(vehicles,transportation);
          
    }
    
}
