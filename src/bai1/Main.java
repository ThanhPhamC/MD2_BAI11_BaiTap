package bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
        System.out.println("Nhập chuỗi từ: ");
        String inputString = sc.nextLine();
        String[] arrString = inputString.split("\\s");
        for (int i = 0; i < arrString.length; i++) {
            if (treemap.containsKey(arrString[i])) {
                    treemap.put(arrString[i],treemap.get(arrString[i])+1 );
                }else {
                treemap.put(arrString[i],1);
            }
        }
        System.out.println(treemap);
    }
}
