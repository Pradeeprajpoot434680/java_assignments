
class ComplexNum {
    int real, img;

    ComplexNum(int r, int i) {
        real = r;
        img = i;
    }
}

class Queue {
    private ComplexNum arr[];
    private int size, front, rear;

   void Initialization(int n) {  
        arr = new ComplexNum[n];
        size = n;
        front = rear = -1;
    }

    protected boolean isEmpty() {
        return front == -1;
    }

    protected boolean isFull() {
        return (rear + 1) % size == front;
    }

    void Enqueue(ComplexNum x) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1) {  
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = x;
    }

    ComplexNum Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return new ComplexNum(-1, -1);
        }

        ComplexNum x = arr[front];

        if (front == rear) {  
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return x;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print("(" + arr[i].real + "," + arr[i].img + "i), ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

class Question3
{
    public static void main(String arg[])
    {
        Queue s = new Queue();
        s.Initialization(5);
        System.out.println(s.isEmpty());
        ComplexNum c1 = new ComplexNum(1,2);
        ComplexNum c2 = new ComplexNum(7,4);
        ComplexNum c3 = new ComplexNum(11,23);
        ComplexNum c4 = new ComplexNum(8,25);
        ComplexNum c5 = new ComplexNum(12,22);
        ComplexNum c6 = new ComplexNum(17,42);
        s.Dequeue();
        s.Enqueue(c1);
        s.Enqueue(c2);
        s.Enqueue(c3);
        s.Enqueue(c4);
        // System.out.println(s.isEmpty());
        s.Enqueue(c5);
        System.out.println(s.isFull());

        // System.out.println(s.isEmpty());
        s.Enqueue(c6);
        System.out.println(s.isFull());
        System.out.println(s.isEmpty());
        ComplexNum c = s.Dequeue();
        System.out.println("(" + c.real + "," + c.img + "i) ");
        s.display();
    }
}


//output
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-3> java Question3
// true
// Queue underflow
// true
// Queue overflow
// true
// false
// (1,2i), 
// (7,4i), (11,23i), (8,25i), (12,22i),