import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        Scanner num = new Scanner(System.in);
        System.out.println("enter a number");
        int n = num.nextInt();
        System.out.println("number:" + n);// output display

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("number is a palindrome number");
        else
            System.out.println("number is not a palindrome number");

    }

}
