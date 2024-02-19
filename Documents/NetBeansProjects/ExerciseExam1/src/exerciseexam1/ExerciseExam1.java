/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciseexam1;

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class ExerciseExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (input negative number to exit):");
        int[] numbers = new int[100];
        int size = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (size < 100) {
                numbers[size] = num;
                size++;
            }
        }
        System.out.println("Show numbers from input : ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
