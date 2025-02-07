class Address
{
    String city;
    int pincode;
    String state;
    void setAddress(String city,int pincode,String state)
    {
        this.city = city;
        this.pincode = pincode;
        this.state = state;
    }
    void showAddress()
    {
        System.out.println("city is :"+ city);
        System.out.println("Pincode  is :"+ pincode);
        System.out.println("state is :"+ state);
    }
}
        
class Person extends Address
{
    String name;
    int age;
    void setPerson(String name,int age,String city,int pincode,String state)
    {
        setAddress(city,pincode,state); 
        this.name = name;
        this.age = age;
    }

    void showPerson()
    {
       
        System.out.println("Name is :" + name);
        System.out.println("Age is :" + age);
        showAddress();
    }
}
class Question1
{
    public static void main(String arg[])
    {
        Person p1 = new Person();
        p1.setPerson("pradeep",20,"jaipur",202393,"rajasthan");
        p1.showPerson();
        Person p2 = new Person();
        p2.setPerson("rahul",21,"new delhi",854354,"Delhi");
        p2.showPerson();
    }
}
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java Question1  
// Name is :pradeep
// Age is :20
// city is :jaipur
// Pincode  is :202393
// state is :rajasthan
// Name is :rahul
// Age is :21
// city is :new delhi
// Pincode  is :854354
// state is :Delhi