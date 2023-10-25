import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0 && i%5==0)  {
                System.out.println("FizzBuzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else System.out.println(i);
        }

        //Q2
        String str = "The quick brown fox";
        for (int i = 0; i <= str.length()-1 ; i++) {
            System.out.print(str.charAt((str.length()-1)-i));
        }

        //Q3

        System.out.println("please enter number");
        int num = s.nextInt();
        int factor = 1;
        for (int i = 1; i <=num ; i++) {
            factor = factor *i;

        }
        System.out.println("tha factorial value: "+factor);

        //Q4
        System.out.println("please enter first number :");
        int num1 = s.nextInt();
        System.out.println("please enter second number");
        int num2 = s.nextInt();
        int power = num2 *num2;
        for (int i = 1; i <num1-1 ; i++) {
            power = power * num2;
        }
        System.out.println(power);

        //Q5

        int odd=0;
        int even=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                even = even+i;

            }else odd = odd+i;

        }
        System.out.println("the sum of odd numbers is: "+odd);
        System.out.println("the sum of even numbers is: "+even);

        //Q6

        System.out.println("please enter a positive number");
        int pos = s.nextInt();
        int check =0;
        if(pos>0) {
            for (int i = 1; i <= pos; i++) {
                if (pos % i == 0) {
                    check++;
                }
            }
            if(check==2){
                System.out.println("prime number");
            }else System.out.println("not prime number");
        }else System.out.println("not positive number");



        //Q7

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Week"+i);
            for (int j = 1; j <=7 ; j++) {
                System.out.println("Day"+j);
            }
        }


        //Q8

        System.out.println("type any word to check if the word palindrome or not:");
        String word = s.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String revers = String.valueOf(sb.reverse());
        int j =0;
        for (int i = 0; i <=word.length()-1 ; i++) {
            if(word.charAt(i) == revers.charAt(i)){
                j++;
            }else System.out.println("not palindrome");
        }if(word.length() == j){
            System.out.println("palindrome");
        }



    }
}