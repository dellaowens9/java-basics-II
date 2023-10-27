package Inheritance;

public class Employee extends Person {
    
    
    public Employee(String firstName, String lastName, byte age, Integer ssn, Integer salary){
        super(firstName, lastName, age, ssn, salary);
    } 

    public String speak(){
    
        return this.getFirstName() + " " + this.getLastName() + " " + this.getSalary(); 
    }

    public static void main(String []args){
        Employee employee1 = new Employee("John", "Smith",(byte)12345478, 12, 56000);
        System.out.println(employee1.speak());  
    }

    
}
