package bai7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Person implements Comparable<Person>{
    private String name;

    private boolean sex;
    private Date date;

    public Person() {
    }
    public Person(String name, boolean sex, Date date) {
        this.name = name;
        this.sex = sex;
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void inputdata(Scanner sc) throws ParseException {
        System.out.println("Nhập tên: ");
        this.name=sc.nextLine();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nhập năm sinh: ");
        this.date = df.parse(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        this.sex=Boolean.parseBoolean(sc.nextLine());
    }
    public void displaydata(){
        System.out.printf("Tên: %-20s, Giới tính: %-10b, Năm sinh %tc\n",name,sex,date);
    }
    public int compareTo(Person o) {
        return this.getDate().compareTo(o.getDate());
    }
}
