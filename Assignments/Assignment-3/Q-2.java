//implement stack 
class Stack
{
    private int size, index,arr[];
    Stack(int n)
    {
        size = n;
        arr = new int[n];
        index = -1;
    }
    protected Boolean isEmpty()
    {
        if(index == -1)
        return true;
        return false;
    };
    protected Boolean isFull()
    {
        if(index==size-1)
        return true;
        return false;
    }
    int Top()
    {
        if(!isEmpty())
        {
            return arr[index];
        }
        System.out.println("Stack underflow");
        return -1;
    }
    void Push(int x)
    {
        if(isFull())
        {
            System.out.println("stack overflow");
            
            return;
        }
        index++;
        arr[index] = x;
        System.out.println(x + " is pushed into stack");
    }
    int Pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return -1;
        }
        int p = arr[index];
        index--;
        return p;
    }
    protected void display()
    {
        for(int i=0; i<=index; i++)
        {
            System.out.print(arr[i]+", ");
        }
    }

}

class Question2
{
    public static void main(String arg[])
    {
        Stack s = new Stack(5);
        s.Pop();
        s.Push(4);
        s.Push(5);
        s.Push(7);
        s.Push(9);
        System.out.println(s.isEmpty());
        s.Push(1);
        System.out.println(s.isFull());
        s.Push(2);
        System.out.println(s.isFull());
         System.out.println(s.Pop());
        s.display();
    }
}


//output
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-3> java Question2
// Stack underflow
// 4 is pushed into stack
// 5 is pushed into stack
// 7 is pushed into stack
// 9 is pushed into stack
// false
// 1 is pushed into stack
// true
// stack overflow
// true
// 1
// 4, 5, 7, 9,
        

      