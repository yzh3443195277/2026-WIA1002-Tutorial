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
    private T item;
    Container(){};
    public void accept(T item){
        this.item=item;//this  often be used when the member variable is the same name as temp variable
    }
    public T retrieve(){
        return item;
}

public static void main(String[]args){
    //generics class can create any type of objects(integer/String...)
    //if we not use generics class, we need to do all codes above twice
    Container <Integer> nums=new Container<>();
    Container <String> words=new Container<>();
    
    nums.accept(50);
    words.accept("java");
    
    System.out.println(nums.retrieve());
    System.out.println(words.retrieve());
}
}
