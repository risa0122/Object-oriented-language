
public class Student {
	String name;
	int rollno;
	int age;
	
	Student(String n, int r, int a){
		this.name = n;
		this.rollno = r;
		this.age = a;
	}
	void print() {
		System.out.println("이름: "+name);
		System.out.println("학번: "+rollno);
		System.out.println("나이: "+age);
	}

}
