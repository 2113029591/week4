import java.util.Scanner;

/**
 * 7.5 打印不同的数
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int i=0;
        int tempNumber=0;
        int[] number=new int[10];
        int[] numberDisp=new int[10];
        int total=0;
        while(i<10){
                tempNumber=input.nextInt();
                number[i]=tempNumber;
                if(numberDisp[i]==0){
                    numberDisp[i]=1;
                    total+=1;
            }
                i++;
        }
        System.out.println("The number of distinct number is "+total);
        System.out.print("The distinct numbers are:");
        i=0;
        while(i<10){
            if(numberDisp[i]==1){
            System.out.print(number[i]+" ");
            }
            i++;
        }
    }
}
