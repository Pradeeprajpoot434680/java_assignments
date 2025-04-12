import java.io.*;
class FileNotFoundExc
{
    public static void main(String arg[])
    {
        File file = new File("File.txt");
        FileReader reader = null;
        try
        {
            reader = new FileReader(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        System.out.println(reader);
    }
}