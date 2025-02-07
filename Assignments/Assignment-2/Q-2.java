class Student extends Person
{
    String branch ;
    int semester;
    void setStudent(String name,int age,String city,int pincode,String state,int semester,String branch)
    {
        setPerson(name,age,city,pincode,state);
        this.semester = semester;
        this.branch = branch;
    }
    void showStudent()
    {
        System.out.println("*****student info ******");
        showPerson();
        System.out.println("Semester is:"+ semester);
        System.out.println("Branch is:"+ branch);
    }
}
class Question2
{
    public static void main(String arg[])
    {
        Student s1 = new Student();
        s1.setStudent("Pradeep",20,"new delhi",392048,"delhi",2,"CSE");
        s1.showStudent();
    }
}


// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java Question2  
// *****student info ******
// Name is :Pradeep
// Age is :20
// city is :new delhi
// Pincode  is :392048
// state is :delhi
// Semester is:2
// Branch is:CSE