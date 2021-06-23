/**
 * Ability to dequeue from the beginning
 * Use LinkedList to do the Queue Operations
 *
 * @author: SAYANI KOLEY
 * @since: 23.06.2021
 */

package com.sayani.queue;

import java.util.Scanner;

public class QueueMain {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        QueueImplementation queueOperation = new QueueImplementation();

        boolean flag = true;

        while(flag) {
            int choice = userMenu();
            switch(choice) {
                case 1:
                    System.out.print("Enter the element you want to insert to the stack: ");
                    int element = input.nextInt();
                    queueOperation.enqueue(element);
                    flag = true;
                    break;
                case 2:
                    queueOperation.dequeue();
                    flag = true;
                    break;
                case 3:
                    queueOperation.display();
                    flag = true;
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }

    public static int userMenu () {
        System.out.println("Press 1 to Enqueue");
        System.out.println("Press 2 to Dequeue");
        System.out.println("Press 3 to Display");
        System.out.println("Press 4 to Quit");

        int choice = input.nextInt();

        return choice;
    }
}
