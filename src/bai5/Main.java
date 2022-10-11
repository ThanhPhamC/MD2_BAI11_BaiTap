package bai5;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra: ");
        String inputCheck= sc.nextLine();
        char[] newarr=inputCheck.toCharArray();
        Stack<Character> stack=new Stack<>();
        Queue<Character> characterQueue=new ArrayDeque<>();
        for (int i = 0; i < newarr.length; i++) {
            stack.push(newarr[i]);
            characterQueue.add(newarr[i]);
        }
        for (int i = 0; i < newarr.length; i++) {
            if (stack.pop().equals(characterQueue.poll())){
                System.out.println("là chuỗi đối xứng");
            }else {
                System.out.println("là chuỗi không đối xứng");
            }
        }

    }
}
