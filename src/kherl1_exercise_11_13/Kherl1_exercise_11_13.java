/*

CSCI 6617 S2 Fall 2019
Java Programming
KRIKOR HERLOPIAN
Kherl1@unh.newhaven.edu
Instructor: Sheehan

Kherl1_exercise_11_13.java
This class is for Exercise 11.13

 */
package kherl1_exercise_11_13;

/**
 *
 * @author krikorherlopian
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author krikorherlopian
 */
public class Kherl1_exercise_11_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter 10 integers: ");
        int i = 0;
        do {
            list.add(input.nextInt());
        } while (++i < 10);

        removeDuplicate(list);

        System.out.print("The distinct integers are ");
        i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " ");
            i++;
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) == list.get(i)) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }

}
