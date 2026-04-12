/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

public class Duo <A,B> {
    Duo(A first,B second){
    }
    public static void main(String[]args){
        String name="sideshape1";
        Integer area=100;
        
        Double point1=0.1;
        Double point2=0.2;
        Duo<String,Integer> sideShape=new Duo<>(name,area);
        Duo<Double,Double> points=new Duo<>(point1,point2);
        
    }
}
