/********************   2D Arrays: Fill, Show, Sum, Max   ********************/

import java.util.Random;
import java.util.Scanner;


public class Main {

    static int[][] intArray = new int[4][4];
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;
        do
        {     // Επιλογές εμφάνισης
            System.out.println();
            System.out.println("---> Type 1-5 <---");
            System.out.println("1. Fill Array");
            System.out.println("2. show_array");
            System.out.println("3. sum_of_array_element_rows");
            System.out.println("4. sum_of_array_element_cols");
            System.out.println("5. find_max");
            System.out.println("6. Exit");
            System.out.println();
            choice = keyb.nextInt();
            switch (choice) {    //  Μέθοδοι επιλογής
                case 1:
                    fill_array();
                    break;
                case 2:
                    show_array();
                    break;
                case 3:
                    sum_of_array_element_rows();
                    break;
                case 4:
                    sum_of_array_element_cols();
                    break;
                case 5:
                    find_max();
                case 6:
                    break;
                default:
                    System.out.println("(Wrong number)");   //Για αριθμό εκτός ορίου
                    break;
            }
        } while (choice != 6);     // Περιορισμός!
    }

    // 1. Γέμισμα του πίνακα με τυχαίους αριθμούς από 1 έως 100
    static void fill_array()
    {
        System.out.println();
        Random r1 = new Random();

        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 0; j < intArray[i].length; j++)
                intArray[i][j] = r1.nextInt(100) + 1;
        }
    }

    // 2. Εμφάνιση του πίνακα
    static void show_array()
    {
        System.out.println("The number are: ");
        System.out.println();
        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 0; j < intArray[i].length; j++)
                System.out.print(intArray[i][j] + " ");
            System.out.println();
        }
    }

    // 3. Υπολογισμός και εμφάνιση του αθροίσματος κάθε σειράς
    static void sum_of_array_element_rows()
    {
        System.out.println();
        System.out.println("Sum of every row:");
        int sumrow = 0;
        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 0; j < intArray[i].length; j++)
                sumrow += intArray[i][j];
            System.out.print("row: " + (i + 1) + "sum: " + sumrow);
            System.out.println();
        }
    }

    // 4. Υπολογισμός και εμφάνιση του αθροίσματος κάθε στήλης
    static void sum_of_array_element_cols()
    {
        System.out.println();
        System.out.println("Sum of every column:");
        int sumcol = 0;
        for (int j = 0; j < intArray[0].length; j++)
        {
            for (int i = 0; i < intArray.length; i++)
                sumcol += intArray[i][j];
            System.out.print("column: " + (j + 1) + "sum: " + sumcol);
            System.out.println();
        }
    }

    // 5. Εύρεση του μέγιστου αριθμού στον πίνακα και των συντεταγμένων του
    static void find_max()
    {
        System.out.println();
        System.out.println("Άθροισμα κάθε στήλης:");
        int maxRow = 0, maxCol = 0;
        int max = intArray[0][0];
        for (int i = 0; i < intArray.length; i++)
        {
            for (int j = 0; j < intArray[i].length; j++)
            {
                if (intArray[i][j] > max) {
                    max = intArray[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println();
        System.out.println("Maximum is: " + max + ", in posision: (" + (maxRow+1) + ", " + (maxCol+1) + ")");
    }
}


