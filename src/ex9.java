import java.util.Scanner;

/**
 * 7.32划分列表
 */
public class ex9 {
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int max = 10000;
        n = input.nextInt()-1;
        int [] a = new int[max];
        m = input.nextInt();
        for(int i = 0;i < n;++ i){
            a[i] = input.nextInt();
        }
        System.out.print("After the partition,the list is ");
        Partition(a);
    }
    public static void Partition(int[] list){
        for(int i = 0;i < n;++i){
            if(list[i] <= m){
                System.out.print(list[i]+" ");
            }
        }
        System.out.print(m+" ");
        for(int i = 0;i < n;++i){
            if(list[i] > m){
                System.out.print(list[i]+" ");
            }
        }
    }

}
