class Animal
{
    static String name = "cat";
    void sound()
    {
        System.out.println("Animal is crying");
    }

}
class  Dog extends Animal
{
     void sound()
    {
        System.out.println("Dog is Barking");
    }

}
// static methods does not inherites but they are available to use
class First
{
    public static void main(String arg[])
    {
        Dog d= new Dog();
        d.sound();
        System.out.println(d.name);
        d.sound();
    }
}