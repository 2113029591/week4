import java.util.Scanner;

/**
 * 7.17 对学生排序  P238
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入学生个数：");
        int number=input.nextInt();
        String[] name=new String[number];
        int[] grade=new int[number];
        int i=0;
        System.out.println("输入学生的姓名和成绩");
        while(i<number){
            name[i]=input.next();
            grade[i]=input.nextInt();
        }
        int temp=0;
        String tempName="";
        for(i=number-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(grade[j]>grade[i]){
                    temp=grade[j];
                    grade[j]=grade[i];
                    grade[i]=temp;
                    tempName=name[j];
                    name[j]=name[i];
                    name[i]=tempName;
                }
            }
        }
        for(i=0;i<number;i++){
            System.out.println(name[i]+grade[i]);
        }
    }
}
