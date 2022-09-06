import java.io.*;
class Bufinput{
    public static void main(String args[])
    {
        File f = new File("textfile.dat");
        try
        {
            BufferedInputStream bufin = new BufferedInputStream(new FileInputStream(f));
            int c;
            while((c=bufin.read()) != -1)
            {
                System.out.println((char)c);
            }
        
        bufin.close();
        }
    catch(IOException e)
    {
        System.out.println("error");
    }
}
}