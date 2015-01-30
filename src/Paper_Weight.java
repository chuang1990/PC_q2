import java.util.Scanner;
import java.lang.Integer;

/**
 * Created by catherinehuang on 1/23/15.
 */
public class Paper_Weight {

    private int numOfPages;
    private float avgWeight;
    private float totalWeight;

    public void PaperCalc() {
        Scanner scan = new Scanner(System.in);
        String paper, weight;

        //ask for number of paper
        System.out.print("How many sheets of paper?");
        paper = scan.nextLine();

        for(int i = 0 ; i < paper.length() ; i++){
            if(paper.charAt(i) < 48 || paper.charAt(i) > 57 ){
                System.out.println("Must be an interger");
                paper = scan.nextLine();
            }
        }

        numOfPages = Integer.parseInt(paper);

        //ask for average weight
        System.out.print("What's the average weight of one piece of paper?");
        weight = scan.nextLine();

        for(int i = 0 ; i < weight.length() ; i++){
            if(weight.charAt(i) < 46 || weight.charAt(i) > 57 ){
                System.out.println("Must be an real number");
                weight = scan.nextLine();
            }
        }

        avgWeight = Float.parseFloat(weight);

        totalWeight = (numOfPages * avgWeight) / 16;

        System.out.print(totalWeight);

    }

    public static void main(String[] args) {
        Paper_Weight test = new Paper_Weight();
        test.PaperCalc();
    }

}
