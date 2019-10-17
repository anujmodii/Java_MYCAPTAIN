import java.io.*;
class T10
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of terms" );
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            System.out.println("Number is : "+i+" and its cube is: " +(i*i*i));
        }
    }
}
