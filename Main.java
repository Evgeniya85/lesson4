package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, n = 0, s = 0;
        double avg;
        {

            System.out.println("Input the 3 numbers : ");

        }
        for (i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        avg = s / 3;
        System.out.println("The sum of 3 no is : " + s + "\nThe Average is : " + avg);
        if (avg / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println("Программа выполнена не корректно");
        }
    }
}

