//A. Greg's Workout
//time limit per test2 seconds
//memory limit per test256 megabytes
//inputstandard input
//outputstandard output

//Greg is a beginner bodybuilder. Today the gym coach gave him the training plan. All it had was n integers a1, a2, ..., an. These numbers mean that Greg needs to do exactly n exercises today. Besides, Greg should repeat the i-th in order exercise ai times.
//Greg now only does three types of exercises: "chest" exercises, "biceps" exercises and "back" exercises. Besides, his training is cyclic, that is, the first exercise he does is a "chest" one, the second one is "biceps", the third one is "back", the fourth one is "chest", the fifth one is "biceps", and so on to the n-th exercise.
//Now Greg wonders, which muscle will get the most exercise during his training. We know that the exercise Greg repeats the maximum number of times, trains the corresponding muscle the most. Help Greg, determine which muscle will get the most training.

//Input
//The first line contains integer n (1 ≤ n ≤ 20). The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 25) — the number of times Greg repeats the exercises.

//Output
//Print word "chest" (without the quotes), if the chest gets the most exercise, "biceps" (without the quotes), if the biceps gets the most exercise and print "back" (without the quotes) if the back gets the most exercise.

//SOLUTION:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] repetitions = new int[n];
        
        for (int i = 0; i < n; i++) {
            repetitions[i] = scanner.nextInt();
        }
        
        int chestTotal = 0, bicepsTotal = 0, backTotal = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                chestTotal += repetitions[i];
            } else if (i % 3 == 1) {
                bicepsTotal += repetitions[i];
            } else {
                backTotal += repetitions[i];
            }
        }
        
        int maxTotal = Math.max(chestTotal, Math.max(bicepsTotal, backTotal));
        
        if (maxTotal == chestTotal) {
            System.out.println("chest");
        } else if (maxTotal == bicepsTotal) {
            System.out.println("biceps");
        } else {
            System.out.println("back");
        }
    }
}
