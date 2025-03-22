class Person
{
    String name;
    int age;
    String address;
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void setDetails(String name,int age,String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void Display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    Person ObjectClone()
    {
        Person p =new Person(this.name,this.age,this.address);
        return p;
    }
}
class Main
{
    public static void main(String arg[])
    {
        Person p1 = new Person("pradeep",20,"Jaipur");
        //copy of first object
        Person p2 = p1.ObjectClone();
        p1.setDetails("rahul",42,"dsiuab");
        p1.Display();
        p2.Display();
    }
}