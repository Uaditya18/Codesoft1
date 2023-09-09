import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {

        int rounds=0,score=500,attempts=5,ch;
        // select a number from the user if the number is same then print it else show status

        Scanner sc = new Scanner(System.in);
        do {
            Random random = new Random();
            System.out.println("the random number is");
            int a = random.nextInt(100);
            System.out.println(a);
            rounds++;
            while (attempts>0) {
                System.out.println("please guess a number between 1 to 100--");
                int number = sc.nextInt();

                if (number == a) {
                    System.out.println("your guess is correct");
                    System.out.println("the random number is " + a);
                    break;
                } else if (number > a) {
                    System.out.println("guess a lower number");
                    score = score -100;
                    attempts--;
                } else {
                    System.out.println("guess a higher number ");
                    score = score -100;
                    attempts--;
                }
            }
            System.out.println("do you want to play again if yes then type 1:  ");
             ch =sc.nextInt();
        }while(ch==1);
        System.out.println("your total  score is "+ score+" in "+rounds+" rounds");
    }
}