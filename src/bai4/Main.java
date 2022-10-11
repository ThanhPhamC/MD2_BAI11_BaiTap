package bai4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("input number: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        while (inputNumber>0) {
            int sodu = inputNumber % 2;
            stack.push(sodu);
            inputNumber = inputNumber / 2;
        }
        while (!stack.isEmpty()){
            System.out.printf("%d\t",stack.pop());
        }
    }

}
