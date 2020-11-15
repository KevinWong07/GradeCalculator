import java.io.*;
import java.util.*;

public class GradeCalc{
    
    static ArrayList<Integer> PracticeProblems = new ArrayList<>();
    static ArrayList<Integer> Labs = new ArrayList<>();
    static ArrayList<Integer> Midterms = new ArrayList<>();
    static ArrayList<Integer> Final = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        System.out.println("This program will calculate your grades. ");

        do {
            System.out.println();
            System.out.println("Please select an option: \n1. Practice Problems\n2. Labs\n3. Midterms\n4. Labs\n5. Total Grade\n6. Exit\n");
            option = sc.nextInt();

            switch (option) {
                case 1: 
                    System.out.println("How many grades are you entering in?");

                    int p = sc.nextInt();
                    int pgrade = 0;
                        
                    for (int i = 0; i < p; i++) {
                        System.out.println("Please enter in your grade.");
                        pgrade = sc.nextInt();
                        PracticeProblems.add(pgrade);
                    }
                    break;
                case 2: 
                    System.out.println("How many grades are you entering in?");

                    int l = sc.nextInt();
                    int lgrade = 0;
                        
                    for (int i = 0; i < l; i++) {
                        System.out.println("Please enter in your grade.");
                        lgrade = sc.nextInt();
                        Labs.add(lgrade);
                    }
                    break;
                case 3: 
                    System.out.println("How many grades are you entering in?");

                    int m = sc.nextInt();
                    int mgrade = 0;
                        
                    for (int i = 0; i < m; i++) {
                        System.out.println("Please enter in your grade.");
                        mgrade = sc.nextInt();
                        Midterms.add(mgrade);
                    }
                    break;
                case 4: 
                    System.out.println("How many grades are you entering in?");

                    int f = sc.nextInt();
                    int fgrade = 0;
                        
                    for (int i = 0; i < f; i++) {
                        System.out.println("Please enter in your grade.");
                        fgrade = sc.nextInt();
                        Final.add(fgrade);
                    }
                    break;
                case 5:
                    int psum = PracticeProblems.stream().mapToInt(Integer::intValue).sum();
                    int lsum = Labs.stream().mapToInt(Integer::intValue).sum();
                    int msum = Midterms.stream().mapToInt(Integer::intValue).sum();
                    int fsum = Final.stream().mapToInt(Integer::intValue).sum();

                    int total = psum + lsum + msum + fsum;
                    System.out.println("Your total grade is: " + total);
                    if (total <= 100 && total >= 90) {
                        System.out.println("Your letter grade is: A");
                    } else if (total <= 89 && total >= 80) {
                        System.out.println("Your letter grade is: B");
                    } else if (total <= 79 && total >= 70) {
                        System.out.println("Your letter grade is: C");
                    } else if (total <= 69 && total >= 60) {
                        System.out.println("Your letter grade is: D");
                    } else {
                        System.out.println("Your letter grade is: F");
                    }
                    int diff = 70 - total;
                    System.out.println("You need " + diff + " or more points in order to pass the course.");
                    System.out.println();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (option != 6);
        sc.close();
    }
}