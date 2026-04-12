/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1.generics;

/**
 *
 * @author yzh34
 */
public class MyArray {
    public static void main(String[]args){
        Integer []arr1={1,2,3,4,5};
        String[]arr2={"Jane","Tom","Bob"};
        Character[]arr3={'a','b','c'};
    Listall(arr1,arr2,arr3);
      
    }
      public static <T,K,P> void Listall(T[]array1,K[]array2,P[]array3){
          for(T item:array1){
            System.out.print(item+" ");
          }
          for(K item:array2){
            System.out.print(item+" ");
          }
          for(P item:array3){
            System.out.print(item+" ");
          }
      }
}
    
    

