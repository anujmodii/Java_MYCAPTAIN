import java.io.*;
class T9
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 numbers" );
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        if(a==b || b==c||a==c)
        System.out.println("Enter different nos.");
        else
        {
        if(a<b && a<c)
        System.out.println(a +" is smallest");
        else if(b<a && b<c)
        System.out.println(b +" is smallest");
        else
        System.out.println(c +" is smallest");
        }
    }
}