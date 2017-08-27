package com.quanglinhit;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	static ArrayList<Student> listStudents=new ArrayList<>();
	public static void menu(){
		System.out.println("\t=====Student Management=====");
		System.out.println("1. Hiển thị danh sách sinh viên");
		System.out.println("2. Thêm mới sinh viên");
		System.out.println("3. Sửa thông tin sinh viên");
		System.out.println("4. Xóa thông tin sinh viên");
		System.out.println("5. Thoát");
		System.out.println("Chọn chức năng [1-5]");
		Scanner sc= new Scanner(System.in);
		String choose=sc.nextLine();
		switch (choose) {
			case "1": display(); break;
			case "2": addStudent(); break;
			case "3": modifyStudent(); break;
			case "4": delStudent(); break;
			case "5": exit(); break;
			default: exception(); break;
		}
	}
		
	private static void exception() {
		System.out.println("Nhập sai rồi nhập lại đi");
		System.out.println("--------------------");
		menu();
	}

	private static void exit() {
		System.exit(0);
	}

	private static void delStudent() {
		System.out.println("Nhập tên hoặc mã sinh viên: ");
		Scanner sc=new Scanner(System.in);
		String search=sc.nextLine();
		listStudents.forEach(stu->{
			if (stu.getName().startsWith(search) || stu.getName().contentEquals(search) || 
				stu.getCode().startsWith(search) || stu.getCode().contentEquals(search)) {
				System.out.println("Bạn đã xóa thông tin sinh viên:");
				System.out.println("Tên sv: "+stu.getName()+"\nMã sv: "+stu.getCode());
				System.out.println("SĐT sv: "+stu.getPhone()+"\nĐịa chỉ sv: "+stu.getAddress());
				listStudents.remove(stu);
				System.out.println("--------------------");
				menu();
				
			}else {
				System.out.println("Không có sinh viên này!!!");
				System.out.println("--------------------");
				menu();
			}
		});
	}

	private static void modifyStudent() {
		System.out.println("Nhập tên hoặc mã sinh viên: ");
		Scanner sc=new Scanner(System.in);
		String search=sc.nextLine();
		listStudents.forEach(stu->{
			if (stu.getName().startsWith(search) || stu.getName().contentEquals(search) || 
				stu.getCode().startsWith(search) || stu.getCode().contentEquals(search)) {
				System.out.println("Bạn đang sửa thông tin sinh viên:");
				System.out.println("Tên sv: "+stu.getName()+"\nMã sv: "+stu.getCode());
				System.out.println("SĐT sv: "+stu.getPhone()+"\nĐịa chỉ sv: "+stu.getAddress());
				System.out.println("--------------------");

				System.out.println("Nhập tên sv: ");
				String name=sc.nextLine();
				System.out.println("Nhập mã sv: ");
				String code=sc.nextLine();
				System.out.println("Nhập SĐT: ");
				String phone=sc.nextLine();
				System.out.println("Nhập địa chỉ: ");
				String address=sc.nextLine();
				
				stu.setName(name);
				stu.setCode(code);
				stu.setPhone(phone);
				stu.setAddress(address);
				System.out.println("--------------------");
				
			}else {
				System.out.println("Không có sinh viên này!!!");
				System.out.println("--------------------");
			}
		});
		menu();
	}

	private static void addStudent() {
		Student student= new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên sv: ");
		String name=sc.nextLine();
		System.out.println("Nhập mã sv: ");
		String code=sc.nextLine();
		System.out.println("Nhập SĐT: ");
		String phone=sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		String address=sc.nextLine();
		
		student.setName(name);
		student.setCode(code);
		student.setPhone(phone);
		student.setAddress(address);
		listStudents.add(student);
		System.out.println("--------------------");
		menu();
	}

	private static void display() {
		listStudents.forEach(stu->{
			System.out.println("Tên sv: "+stu.getName());
			System.out.println("Mã sv: "+stu.getCode());
			System.out.println("SĐT sv: "+stu.getPhone());
			System.out.println("Địa chỉ sv: "+stu.getAddress());
			System.out.println("--------------------");
		});
		menu();
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student("Linh","D00425","0964014282","Đống Đa");
		Student stu2 = new Student("Tuấn","D00433","0910978956","Hà Đông");
		Student stu3 = new Student("Đức","D00463","0165273677","Cầu Giấy");
		Student stu4 = new Student("Nam","D00484","0993216598","Thanh Xuân");
		Student stu5 = new Student("Khánh","D00421","0907470842","Hoàn Kiếm");
		Student stu6 = new Student("Danh","D00495","0163854754","Ba Đình");
		listStudents.add(stu1); listStudents.add(stu2); listStudents.add(stu3);
		listStudents.add(stu4); listStudents.add(stu5); listStudents.add(stu6);
		menu();
	}

}
