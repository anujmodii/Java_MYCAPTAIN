import java.io.*;
class T3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer" );
        int a=Integer.parseInt(br.readLine());
        int s=0;
        while(a>0)
        {
            int r=a%10;
            a/=10;
            s+=r;
        }
        System.out.println("Sum of digits="+s);
    }
}