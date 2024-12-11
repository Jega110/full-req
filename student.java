class Student{
String name;
int age;

Student(String num, int age){
    this.name = name;
    this.age = age;
    System.out.println(this.name);
}
Student(Student student){
    this.name = student.name;
    this.age = student.age;
    System.out.println(this.name);
}
public static void main (String args[]){
    Student student1 = new Student("arshad",20);
    Student student2 = new Student(student1);
}
}
