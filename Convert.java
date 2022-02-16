package lesson4;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение: ");
        double meters = input.nextDouble();
        double yards = meters * 1.09;
        double miles = meters * 0.0006;
        double feet = meters *3.28;

        System.out.println(meters + "  метров это " + yards + " ярд " + miles + " миль "  + feet + " футов " );

        }

    }
