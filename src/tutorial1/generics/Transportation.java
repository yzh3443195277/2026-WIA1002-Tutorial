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

    public static void show(List<?> t1,List<?> t2){
        System.out.println(t1+" "+t2);
    };
    public static void main(String[]args){
          ArrayList<Integer> numOfCars=new ArrayList<>();
          ArrayList<Double> milesPerHour=new ArrayList<>();
    show(numOfCars,milesPerHour);//wildcards ignore invariance
}}
