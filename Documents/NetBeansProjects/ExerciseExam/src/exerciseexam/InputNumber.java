/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciseexam;

/**
 *
 * @author TUF
 * 
 * 
 */
import java.util.Scanner;
public class InputNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int numElements = cin.nextInt();

        int[] numbers = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = cin.nextInt();
        }

        System.out.println("\nEntered numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
    }
    
}
