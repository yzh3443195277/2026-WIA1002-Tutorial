/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

public class Duo <A,B> {
    A first;
    B second;//declare
    Duo(A first,B second){//accept
        this.first=first;
        this.second=second;//assign
    }
    public static void main(String[]args){
        String name="sideshape1";
        Integer area=100;
        Duo<String,Integer> sideShape=new Duo<>(name,area);
        
        Duo<Double,Double> points=new Duo<>(0.1,0.2);//包装类是可以直接接受对应类型的数据的。比如integer类你可以直接传10，不用拿变量过渡
        
    }
}
