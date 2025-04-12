import java.io.FileReader;

class First
{
    public static void readFile(String path) throws Exception
    {
        FileReader reader = new FileReader(path);
    }
    public static void main(String arg[])
    {

            readFile("data.txt");
        
    }
}