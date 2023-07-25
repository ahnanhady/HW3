import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.Write a program that prints the numbers from 1 to 100 such that

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }

        }
//2.Write a Java program to reverse a string

        String o, r = "";
        System.out.println("Enter a string to reverse");
        o = scanner.nextLine();
        int l = o.length();
        for (int u = l - 1; u >= 0; u--) {
            r = r + o.charAt(u);
        }
        System.out.println("Reverse of the string: " + r);
        //3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        System.out.println("enter number   ");
        int i = scanner.nextInt();
        if (i > 0) {
            for (int q = 0; q <= 10; q++) {
                System.out.println(i + "*" + q + "==" + (i * q));
            }
 //4.Write a program to find the factorial value of any number entered through the keyboard.

            System.out.println("factorial:  ");
            int n1 = scanner.nextInt();
            int result = 1, r4 = 0;
            while (r4 < n1) {
                result = (n1 - r4) * result;
                r4++;
            }
            System.out.println("factorial value  " + result);
//5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
            System.out.println("enter the base");
            int base = scanner.nextInt();
            System.out.println("enter the power");
            int power = scanner.nextInt();
            int result1 = 1;
            for (int io = 1; io <= power; io++) {
                result1 = base * result1;
            }
            System.out.println(result1);

//6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers
            System.out.println("Enetr a set numbers, maximum 5 numbers :  ");
            int[] nums = new int[5];
            for (int i1 = 0; i1 < nums.length; i1++) {
                System.out.println("Enter a number, or -1 to break: "); // Ask the user for a number.
                int x = scanner.nextInt();
                if (x == -1) break;
                nums[i1] = x; // Read the next int from the console.
            }

            int odd = 0;
            int even = 0;

            for (int i3 = 0; i3 < nums.length; i3++) {
                if (nums[i3] % 2 == 0) {
                    even = even + nums[i3];
                } else {
                    odd = odd + nums[i];
                }
            }
            System.out.println("sum of even numbser =" + even);
            System.out.println("sum of odd numbser = " + odd);


//8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
            System.out.println("Enter how many number you will enetr:");

            int size = scanner.nextInt();
            int[] nums9 = new int[size];
            int countP = 0;
            int countN = 0;
            int countZ = 0;

            for (int i7 = 0; i7 < size; i7++) {
                System.out.println("Enter the number:");
                int x = scanner.nextInt();
                nums[i7] = x;
                if (x == 0) {
                    countZ++;
                } else if (x > 0) {
                    countP++;
                } else {
                    countN++;
                }
            }
            System.out.println("count of positive numbers=" + countP);
            System.out.println("count of negative numbers=" + countN);
            System.out.println("count of zeros numbers=" + countZ);
//9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
            for (int i9 = 1; i9 < 5; i9++) {
                System.out.println("week " + i9);
                for (int j = 1; j < 8; j++) {
                    System.out.println("  day " + j);
                }
            }
        }
//10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left
        String o1, r2 = "";
        System.out.println("Enter a string to reverse:");
        o1 = scanner.nextLine();
        int l1 = o1.length();
        for (int ur = l1 - 1; ur >= 0; ur--) {
            r2 = r2 + o1.charAt(ur);

        }
        if(o1.equals(r2)){
            System.out.println("the word is a palindrome  "+r2);
        }else{
            System.out.println("the word is a not palindrome  "+r2);}



    }
}