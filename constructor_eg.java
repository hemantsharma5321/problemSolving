clas Student{
String name;
int roll_no;

void display(){
System.out.println(name + roll_no);
}  
  //constructor 
  Student(String name,int roll){
  this.name=name;
  this.roll_no=roll;
  }
}

public class Construcor_eg{
  public static void main(String [] args){
    Student s1=new Student("hemant" , 40);
    s1.display();
    
  }
}
