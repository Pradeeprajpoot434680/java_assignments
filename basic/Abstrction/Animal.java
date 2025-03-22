abstract class Sound
{
    String name;
    Sound(String name)
    {
        this.name = name;
    }
    abstract void makeSound();
    void display()
    {
        System.out.println("Animal name:"+name);
    }
}
class Dog extends Sound
{
    Dog(String name)
    {
        super(name);
    }
    void makeSound()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Sound {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

class Animal
{
    public static void main(String arg[])
    {
        Sound ob1 = new Dog("Dog");
        Sound ob2 = new Cat("Cat");
        ob1.makeSound();
        ob1.display();
        
        ob2.makeSound();
        ob2.display();


    }
}

