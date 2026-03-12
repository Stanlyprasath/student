import java.util.Scanner;

public class StudentMarklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;
	
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " +average);
	if (total >50)
		System.out.println("Pass")
	else
		System.out.println("Fail")