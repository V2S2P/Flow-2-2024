import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File("Student.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int grade = Integer.parseInt(parts[1]);

                Student student = new Student(name,grade);
                students.add(student);
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found." + e);
        }

        for (Student student: students){
            System.out.println(student);
        }

        System.out.println("\nUpdated grades.");

        for (Student student: students){
            if (student.getName().equals("Valdemar") || student.getName().equals("Big Hank")){
                student.setGrade(10);
                System.out.println(student);
            }
        }
        try {
            FileWriter writer = new FileWriter("UpdatedStudents.txt");

            for (Student student: students){
                writer.write(student.toString() + "\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println("An error occurred while writing to file." + e);
        }
    }
}