/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingthreenumbersfromanyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class SummingThreeNumbersFromAnyFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        System.out.print("Which file would you like to read numbers from: ");
        input = keyboard.next();
        System.out.println("Which file would you like to read numbers from: " + input);
        
        Scanner file = new Scanner(new File(input));
        
        int a = file.nextInt();
        int b = file.nextInt();
        int c = file.nextInt();
        int sum = a + b + c;
        
        System.out.println(sum);
        
        
        
        
    }
    
}
