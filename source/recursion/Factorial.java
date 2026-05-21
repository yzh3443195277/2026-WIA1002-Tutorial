
public class Factorial {
    public static int factorial(int x){
    //base case:
    if(x==0 || x==1)
        return 1;
    //recursion case
    else 
        return x*factorial(x-1);
}
    public static void main(String[]args){
        System.out.println(factorial(100));
    }
}
