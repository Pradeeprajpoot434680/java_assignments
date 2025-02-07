class Employee extends Person
{
    String organization;
    String designation;
    int salary;
    void setEmployee(String name,int age,String city,int pincode,String state,String organization,String designation,int salary)
    {
        setPerson(name,age,city,pincode,state);
        this.organization = organization;
        this.designation = designation;
        this.salary = salary;
    }
    void showEmployee()
    {
        System.out.println("***** Employee*****");
        showPerson();
        System.out.println("Organization is:"+organization + ",  designation is :"+designation + ", and salary is :" + salary);
    }

}
class Question3
{
    public static void main(String arg[])
    {
        Employee e1 = new Employee();
        e1.setEmployee("Pradeep",20,"new delhi",392048,"delhi","Flipkart","gurugram",500000);
        e1.showEmployee();
    }
}

// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java Question3  
// ***** Employee*****
// Name is :Pradeep
// Age is :20
// city is :new delhi
// Pincode  is :392048
// state is :delhi
// Organization is:Flipkart,  designation is :gurugram, and salary is :500000