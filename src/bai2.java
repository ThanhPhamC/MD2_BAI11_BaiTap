import java.util.Scanner;
import java.util.Stack;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> wStack = new Stack<>();
        System.out.println("Nhập vào mảng số nguyên:");
        String inputNumber = sc.nextLine();
         char[] arrChar = inputNumber.toCharArray();
        System.out.println("---------");
         for (int i=0; i<arrChar.length;i++){
                wStack.push(arrChar[i]);
         }
        System.out.println("dao nguoc so nguyen la:");
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(wStack.pop());
        }
    }
}
