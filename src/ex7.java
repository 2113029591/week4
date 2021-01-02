/**
 * 7.24优惠卷收集人问题
 */
public class ex7 {
    public static void main(String[] args){
        boolean[] assortment = new boolean[4];
        boolean flag = false;
        int count = 0;
        while(flag == false){
            if(assortment[0]&&assortment[1]&&assortment[2]&&assortment[3]) {
                flag = true;
            }
            else{
                switch(choosePai(assortment)){
                    case "Spades":
                        assortment[0] = true;
                        break;
                    case "Hearts":
                        assortment[1] = true;
                        break;
                    case "Diammonds":
                        assortment[2] = true;
                        break;
                    case "Clubs":
                        assortment[3] = true;
                        break;
                }
            }
            count++;
        }
        System.out.println("Number of picks:"+count);
    }

    public static String choosePai(boolean[] assortment){
        int[] deck = new int[52];
        String[] Assortments = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        for(int i = 0;i < deck.length;i++){
            deck[i] = i;
        }

        for(int i = 0;i < deck.length;i++){
            int Index = (int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[Index];
            deck[Index] = temp;
        }

        int i = (int)(Math.random()*deck.length);
        String Assortment = Assortments[deck[i] / 13];
        String rank = ranks[deck[i]%13];
        switch(Assortment){
            case "Spades":
                if(!assortment[0]) {
                    System.out.println(rank+" of "+Assortment);assortment[0] = true;
                }
                break;
            case "Hearts":
                if(!assortment[1]) {
                    System.out.println(rank+" of "+Assortment);assortment[1] = true;
                }
                break;
            case "Diamonds":
                if(!assortment[2]) {
                    System.out.println(rank+" of "+Assortment);assortment[2] = true;
                }
                break;
            case "Clubs":
                if(!assortment[3]) {
                    System.out.println(rank+" of "+Assortment);assortment[3] = true;
                }
                break;
        }
        return Assortment;
    }

}
