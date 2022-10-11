package bai6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra: ");
        String inputString=sc.nextLine();
        Stack<Character> firstStack=new Stack<>();
        Stack<Character> secondStack=new Stack<>();
        char[] arrchar=inputString.toCharArray();
        for (int i = 0; i < arrchar.length; i++) {
            if (arrchar[i]=='('){
                firstStack.push('(');
            } else if (arrchar[i]==')') {
                secondStack.push(')');
            }else{
                continue;
            }
        }
        if (firstStack.size()==secondStack.size()){
            System.out.println("biểu thức đúng");
        }else{
            System.out.println("biểu thức sai");
        }
    }


}
