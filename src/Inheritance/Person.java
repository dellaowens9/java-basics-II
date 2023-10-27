package Inheritance;

    public  class Person {
        private int ssn;
        private byte age;
        private String firstName;
        private String lastName;
        private int salary; 

        Person(){}; 
    
        Person(String firstName, String lastName, Byte age, Integer ssn, Integer salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.ssn = ssn;
            this.salary = salary; 
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public byte getAge() {
            return age;
        }

        public int getSalary(){
            return salary; 
        }
}
