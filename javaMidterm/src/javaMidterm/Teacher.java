//Berke Kucuk 1803021040
package javaMidterm;

public class Main{
public static void main(String[] args) {
Primary_Teacher t1 = new Primary_Teacher(10000, "Berke Kucuk","Beykent University", 9999);

Teacher t2

= new Primary_Teacher(-1, "undefined","nan", -1);

t2.setId(10001);
t2.setName("Hasan Kucuk");
t2.setSchool("Istanbul University");
t2.setSalary(1100);

College_Teacher t3 = new College_Teacher(10002, "Berkay Kucuk","Kent University", 4400);
Teacher t4

= new College_Teacher(10003, "Simge Kucuk","Istanbul University", 22000);

t1.print();
t2.print();
t3.print();
t4.print();
}
}
class Teacher extends Teaching {
private int id;
private String name;
private String school;
private double salary;

public Teacher(int id, String name, String school, double salary){
this.id = id;
this.name = name;

this.school = school;
this.salary = salary;
}

public void print(){
System.out.println("Teacher id: "+id);
System.out.println("\tTeacher name: "+name);
System.out.println("\tSchool: "+school);
System.out.println("\tSalary: "+salary);
}

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

public String getSchool() {
return school;
}
public void setSchool(String school) {
this.school = school;
}

public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
}

abstract class Teaching{
public void print(){
System.out.println("Print info");
};

public double getSalary(){
return 0;
};
}

class Primary_Teacher extends Teacher{
private String school_type;
private double salary;

public Primary_Teacher(int id, String name, String school, double salary){
super(id, name, school, salary);
this.salary = salary;
this.school_type = "Primary";
}

public void print(){
System.out.println("Teacher id: " + super.getId());

System.out.println("\tTeacher name: " + super.getName());
System.out.println("\tSchool: " + super.getSchool());
System.out.println("\tSalary: " + super.getSalary());
}

public String getSchool_type(){
return this.school_type;
}

public double getSalary() {
return salary;
}
}

class College_Teacher extends Teacher{
private String school_type;
private double salary;

public College_Teacher(int id, String name, String school, double salary){
super(id, name, school, salary);
this.salary = salary;
this.school_type = "Collage";
}

public void print(){
System.out.println("Teacher id: "+super.getId());
System.out.println("\tTeacher name: "+super.getName());
System.out.println("\tSchool: "+super.getSchool());
System.out.println("\tSalary: "+super.getSalary());
}

public String getSchool_type(){
return this.school_type;
}

public double getSalary() {
return salary;
}
}

