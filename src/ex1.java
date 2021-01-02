import java.util.Scanner;

/**
 * 7.3计算数字的出现次数
 */
public class ex1 {
    public static void main(String[] args) {
        int[] array=new int[101];
        System.out.print("Enter the integers between 1 and 100:");
        Scanner input=new Scanner(System.in);
        while(true){
            int number=input.nextInt();
            if(number==0)
                break;
            else
            {
                array[number]+=1;
            }
        }
        int i=0;
        for (int val:array
             ) {
            if(array[i]!=0)
            System.out.println(i+" occurs "+array[i]+" times");
            i++;
        }

    }
}