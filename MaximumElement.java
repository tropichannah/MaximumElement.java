import java.util.Scanner;
import java.util.ArrayList;
public class MaximumElement {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //create int array 
        Integer[] list = new Integer[10];
        
        //prompt user
        System.out.println("Enter 10 integers:");
        for(int i = 0; i < list.length; ++i){
            list[i] = input.nextInt();
        }
        
        //display output
        System.out.println("The max number is " + max(list));
    }
	//create max method
    public static <E extends Comparable <E>> E max(E[] list) {
     E max = list[0];
     for(int i = 0; i < list.length; i++){
        if(list[i].compareTo(max) > 0){
            max = list[i];
        } 
     }
     return max;
}

}
