import java.util.Scanner;
class Matrix
{
    int arr[][];
    int n;
    Matrix(int n)
    {
        arr=new int[n][];
        this.n = n;
    }
    void create()
    {
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                arr[i] = new int[3];
            }else{
                arr[i] = new int[4];
            }
        }
    }
    void init_values()
    {
        for(int i=0; i<n; i++)
        {
           if(i%2==0)
           {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = i+j;
            }
           }else{
            for(int j=0; j<4; j++)
            {
                arr[i][j] = i+j+4;
            }
           }
        }
    }

    void showMatrix()
    {
         for(int i=0; i<n; i++)
        {
           if(i%2==0)
           {
            for(int j=0; j<3; j++)
            {
               System.out.print(arr[i][j] + " ");
            }
           }else{
            for(int j=0; j<4; j++)
            {
                 System.out.print(arr[i][j] + " ");
            }
           }
           System.out.println("");
        }

    }
}
class Question4
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give the number of rows:");
        int a = scn.nextInt();
        Matrix arr = new Matrix(a);
        arr.create();
        arr.init_values();
        arr.showMatrix();
    }
}

// output
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-3> java Question4
// Give the number of rows:
// 8

// 0 1 2 
// 5 6 7 8 
// 2 3 4 
// 7 8 9 10 
// 4 5 6 
// 9 10 11 12 
// 6 7 8 
// 11 12 13 14 