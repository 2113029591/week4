import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * 7.19 是否排序好了？
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list:");
        String string = input.next();
        String[] list = string.split(" ");
        int[] intList = new int[100];
        int n = 0;
        for (String data : list
        ) {
            n++;
        }
        int i = 0;
        for (i = 0; i < n; i++) {
            intList[i] = Integer.parseInt(list[i]);
        }
        for(i=0;i<n;i++){
            if(intList[i+1]<intList[i]){
                System.out.println("The list is not sorted");
                break;
            }
            if(i==n-1) {
                System.out.println("The list is already sorted");
            }
        }
    }
}
