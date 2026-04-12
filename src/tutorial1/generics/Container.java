/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

/**
 *
 * @author yzh34
 */
public class Container <T>{
    T item;
    Container(){};
    public void accept(T t){
        this.item=t;
    }
    public T retrieve(){
        return item;
}

public static void main(String[]args){
    Container <Integer> nums=new Container<>();
    Container <String> words=new Container<>();
    
    nums.accept(50);
    words.accept("java");
    
    System.out.println(nums.retrieve());
    System.out.println(words.retrieve());
}
}