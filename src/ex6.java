/**
 * 7.23 储物柜难题
 */
public class ex6 {
    public static void main(String[] args) {
        boolean[] boxPosition = new boolean[100];
        for(int i =0;i<100;i++){
            boxPosition[i]=false;
        }
        for(int x =1;x<=100;x++){
            for(int y =x;y<=100;y+=x){
                boxPosition[y-1]=!boxPosition[y-1];
            }
        }
        for(int t =0;t<100;t++){
            if(boxPosition[t]){
                System.out.print(t+1+" ");
            }
        }
    }

}
