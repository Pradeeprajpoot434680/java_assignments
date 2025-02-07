
class ArrayTest
{
    
    public static void main(String arg[])
    {
        
       int[][] a = new int[4][];
       for(int i=1; i<=4; i++)
       {
        a[i-1] = new int[i];
       }
       for(int i=0; i<4; i++)
       {
        for(int j=0; j<a[i].length; j++)
        {
            System.out.print(a[i][j]+ " ");
        }
        System.out.println();
       }

       System.out.println(a);
    }
}