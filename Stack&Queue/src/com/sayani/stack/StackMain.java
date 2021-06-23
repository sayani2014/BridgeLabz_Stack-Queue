/**
 * Ability to create a Stack of 56->30->70
 * Use LinkedList to do the Stack Operations
 * Here push will internally call add method on LinkedList.
 * So 70 will be added first then 30 and then 56 to make 56 on top of the Stack
 *
 * @author: SAYANI KOLEY
 * @since: 23.06.2021
 */

package com.sayani.stack;

import java.util.Scanner;

public class StackMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StackImplementation stackOperation = new StackImplementation();

        boolean flag = true;

        while(flag) {
            int choice = userMenu();
            switch(choice) {
                case 1:
                    System.out.print("Enter the element you want to insert to the stack: ");
                    int element = input.nextInt();
                    stackOperation.push(element);
                    flag = true;
                    break;
                case 2:
                    stackOperation.display();
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
