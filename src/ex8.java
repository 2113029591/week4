import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 7.31合并两个有序列表
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer>  list3=new ArrayList<>();
        System.out.print("Enter list1:");
        int i=0;
        int j=0;
        int a=input.nextInt();
        while(a>0){
            list1.add(input.nextInt());
            a-=1;
        }
        System.out.print("Enter list2:");
        a=input.nextInt();
        while(a>0){
            list2.add(input.nextInt());
            a-=1;
        }

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i).intValue()<=list2.get(j).intValue()){
                list3.add(list1.get(i));
                i++;
            }
            else{
                list3.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            list3.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            list3.add(list2.get(j));
            j++;
        }
        for(int k=0;k<list3.size();k++){
            System.out.print(list3.get(k)+" ");
        }

    }
}
