package Bai_17.ThucHanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Trọng Hiếu", "Thái Bình"));
        students.add(new Student(2, "Nguyễn Anh Thoa", "Hải Phòng"));
        students.add(new Student(3, "Hoàng Hữu Trí", "Hà Nội"));
        students.add(new Student(4, "Trần Anh Hào", "Hà Tĩnh"));
        students.add(new Student(5, "Đậu Văn Đức", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

        //tạo phương thức writeToObject(String path, List<Student> students)
        // để ghi danh sách học viên hiện có vào trong file nhị phân
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }



}
