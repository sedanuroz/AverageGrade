/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagegrade;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class AverageGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your math grade: ");
        int math=sc.nextInt();
        System.out.print("Enter your Turkish grade: ");
        int turkısh=sc.nextInt();
        System.out.print("Enter your physic grade: ");
        int physic=sc.nextInt();
        System.out.print("Enter your chemistry grade: ");
        int chemistry=sc.nextInt();
        System.out.print("Enter your history grade: ");
        int history=sc.nextInt();
        System.out.print("Enter your music grade: ");
        int music=sc.nextInt();
        
        int sumOfGrade=math+turkısh+physic+chemistry+history+music;
        double averageGrade=sumOfGrade/6d;
        
        System.out.println("The average grade is: "+averageGrade);
        
    }
    
}
