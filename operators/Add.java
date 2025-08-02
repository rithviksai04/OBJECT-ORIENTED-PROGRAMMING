package operators;

import java.util.Scanner;

public class Add {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter theory marks (out of 100): ");
int theory = sc.nextInt();

System.out.print("Enter practical marks (out of 100): ");
int practical = sc.nextInt();

if (theory >= 40 && practical >= 40) 
{System.out.println("Student passed both theory and practical.");
        } else {
 System.out.println("Student failed in one or both subjects.");
        }

    }
}
