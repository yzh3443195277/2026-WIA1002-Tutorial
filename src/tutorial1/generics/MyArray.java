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
      /*public static <T,K,P> void Listall(T[]array1,K[]array2,P[]array3){
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
    这种写法完全没有领悟到generics精髓啊，generics意义就是减少重复代码，deal with different types of data。一个T你可以传integer，可以传string，可以传char，
    这里搞了三个generics分别对应integer，string和char。。。:)))))别逗你Java爹笑了
*/
    public static <T> void Listall(T[]arr1,T[]arr2,T[]arr3){
         for(T item:arr1){
            System.out.print(item+" ");
          }
          for(T item:arr2){
            System.out.print(item+" ");
          }
          for(T item:arr3){
            System.out.print(item+" ");
          }
    }
}
    
    

