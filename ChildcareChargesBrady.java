//Kabrina Brady

import java.util.Scanner;

public class ChildcareChargesBrady {
    public static void main(String[] args) {
        int age = 0;
        int days;
        int total;
        Scanner input = new Scanner(System.in);

        int rates[][] = {
                {0, 30, 60, 88, 115, 140},
                {0, 26, 52, 70, 96, 120},
                {0, 24, 46, 67, 89, 110},
                {0, 22, 40, 60, 75, 88},
                {0, 20, 35, 50, 66, 84} };

        while (age != 999){
            System.out.println("How old is your child?");
            age = input.nextInt();

            if (age == 999){
                break;
            }

            System.out.println("How many days per week will your child attend daycare?");
            days = input.nextInt();

            total = rates[age][days];
            System.out.println("Your total is: $"+ total);
        }
    }

    public static double determineChildcareCharges (int age, int days){
        return 0;
    }
}