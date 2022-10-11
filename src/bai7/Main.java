package bai7;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Stack<Person> listPersonMale = new Stack<>();  //nam
        Stack<Person> listPersonFemale = new Stack<>();  //nu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số người muốn thêm: ");
        int inputNumber = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < inputNumber; i++) {
            System.out.println(" Nhập thông tin người thứ " + (i + 1));
            Person person = new Person();
            person.inputdata(sc);
            if (person.isSex()) {
                listPersonMale.push(person);
            } else {
                listPersonFemale.push(person);
            }
        }
        Collections.sort(listPersonFemale);
        Collections.sort(listPersonMale);
        System.out.println("Danh sách nam:");
        for (Person person : listPersonMale) {
            person.displaydata();
        }
        System.out.println("Danh sách nữ:");
        for (Person person : listPersonFemale) {
            person.displaydata();
        }
    }
}


