package com.thoughtworksProgram;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int gardenRow, gardenColumn, treeNumber;
        System.out.println("Enter number of rows and number of columns respectively:");
        gardenRow=sc.nextInt();
        gardenColumn=sc.nextInt();
        System.out.println("Enter tree number:");
        treeNumber= sc.nextInt();

        if(treeNumber>(gardenColumn*gardenRow)){
            System.out.println("This tree number is not possible");
            return;
        }
        if(treeNumber<gardenColumn || treeNumber%gardenRow==1 ||  treeNumber%gardenRow==0)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
