import java.io.*;
class T6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer" );
        int a=Integer.parseInt(br.readLine());
        if(a>0)
        System.out.println("Integer is positive");
        else if (a<0)
        System.out.println("Integer is negative");
        else
        System.out.println("Integer is zero");
    }
}