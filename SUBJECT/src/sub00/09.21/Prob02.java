// ��� ���
class Human
{
	private String name;
	private int age;

	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge()
	{
		return age;
	}
	public void print(){
		System.out.println("�� �� : "+name+"\t�� �� : "+age);
	}

}

class Student extends Human
{
	private int id;

	public Student(String name, int age, int id){
		super(name, age);
		this.id = id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void print(){
		System.out.println("��    �� : "+getName()+"\t�� �� : "+getAge()+"\t��    �� : "+id);
	}
}

class Teacher extends Human
{
	private String subject;

	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void print(){
		System.out.println("��    �� : "+getName()+"\t�� �� : "+getAge()+"\t������ : "+subject);
	}
}

class Employee extends Human
{
	private String dept;

	public Employee(String name, int age, String dept){
		super(name, age);
		this.dept = dept;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	public String getDept(){
		return dept;
	}

	public void print(){
		System.out.println("��    �� : "+getName()+"\t�� �� : "+getAge()+"\t��    �� : "+dept);
	}
}

// Ŭ���� ���� ����
/*class Student 
{
	private String name;
	private int age;
	private int id;

	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAge(int id){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void print(){
		System.out.println("��    �� : "+name+"\t�� �� : "+age+"\t��    �� : "+id);
	}
}

class Teacher
{
	private String name;
	private int age;
	private String subject;

	public Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setAge(int id){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void print(){
		System.out.println("��    �� : "+name+"\t�� �� : "+age+"\t������ : "+subject);
	}
}

class Employee
{
	private String name;
	private int age;
	private String dept;

	public Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public void setDept(String dept){
		this.dept = dept;
	}

	public String getDept(){
		return dept;
	}

	public void setAge(int id){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void print(){
		System.out.println("��    �� : "+name+"\t�� �� : "+age+"\t��    ��: "+dept);
	}
}*/



public class Prob02
{	
	public static void main(String[] args) 
	{
		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();
	}
}
