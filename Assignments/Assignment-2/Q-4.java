class Question4
{
    public static void main(String arg[])
    {
        Person p = new Person();
        Employee e = new Employee();
        Student s = new Student();
        s.setStudent("Pradeep",20,"new delhi",392048,"delhi",2,"CSE");
        p.setPerson("pradeep",20,"jaipur",202393,"rajasthan");
        e.setEmployee("Pradeep",20,"new delhi",392048,"delhi","Flipkart","gurugram",500000);
        p.showPerson();
        s.showStudent();
        e.showEmployee();
    }
}
   
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java Question4  
// Name is :pradeep
// Age is :20
// city is :jaipur
// Pincode  is :202393
// state is :rajasthan
// *****student info ******
// Name is :Pradeep
// Age is :20
// city is :new delhi
// Pincode  is :392048
// state is :delhi
// Semester is:2
// Branch is:CSE
// ***** Employee*****
// Name is :Pradeep
// Age is :20
// city is :new delhi
// Pincode  is :392048
// state is :delhi
// Organization is:Flipkart,  designation is :gurugram, and salary is :500000