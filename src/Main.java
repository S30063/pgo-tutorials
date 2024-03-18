import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Please, type any number ");
        int n = scan.nextInt();
        if (n > 0){
            System.out.println("The number is positive :)");
        } else if (n < 0) {
            System.out.println("The number is negative :(");

        } else{
            System.out.println("The number equals 0 :{");


        }


    }


}