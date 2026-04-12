/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yzh34
 */
public class Transportation {

    public static void show(List<? extends Number> t1,List<?extends Number> t2){
        //这个参数声明依旧找参数类型规律，integer和double都是number类下面的。
        //这个？我觉得可能是range too big(represent anything),所以会拿super/extends这种缩小range
        System.out.println(t1+" "+t2);
    };
    public static void main(String[]args){
          ArrayList<Integer> numOfCars=new ArrayList<>();
          ArrayList<Double> milesPerHour=new ArrayList<>();
    show(numOfCars,milesPerHour);
/*wildcards 和Object 类到底有什么区别：
    在list的世界，？才是老大。list<object>其实很小。
    出了list的世界，单一个<?>语法是错的，你要想建立一个最大的泛型还得是<Object>
    List<?> ← 最宽泛的（所有List的父类型），什么都能接受
  ↑
  ├─ List<Integer>  
  ├─ List<Double>   
  ├─ List<String>   
  └─ List<Object>   

但 List<Object> 本身只能接受：
  └─ List<Object>   
    
   List<Object> 不是List<Integer> List<Double>...的父类，这种情况叫invariance
    */
}}
