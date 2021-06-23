/**
 * Ability to create a Queue of 56->30->70
 * Use LinkedList to do the Queue Operations
 * Here enqueu will internally call append method on LinkedList.
 * So 56 will be added first then 30 and then 70 to make 56 on top of the Stack
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
                    queueOperation.display();
                    flag = true;
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    public static int userMenu () {
        System.out.println("Press 1 to Insert");
        System.out.println("Press 2 to Display");
        System.out.println("Press 3 to Quit");

        int choice = input.nextInt();

        return choice;
    }
}
