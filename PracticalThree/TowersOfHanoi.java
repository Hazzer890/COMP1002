package PracticalThree;

import java.util.Scanner;

public class TowersOfHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numDisks = scanner.nextInt();
        scanner.close();
        solveTowersOfHanoi(numDisks, 1, 3, 2, 0);
    }

    public static void solveTowersOfHanoi(int numDisks, int src, int dest, int aux, int level) {
        if (numDisks == 1) {
            moveDisk(src, dest, level);
            return;
        }
        solveTowersOfHanoi(numDisks - 1, src, aux, dest, level + 1);
        moveDisk(src, dest, level);
        solveTowersOfHanoi(numDisks - 1, aux, dest, src, level + 1);
    }

    public static void moveDisk(int src, int dest, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println("Moving disk from peg " + src + " to peg " + dest);
    }
}

