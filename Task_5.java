import java.io.*;
class T5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of minutes" );
        int a=Integer.parseInt(br.readLine());
        int hr=a/60;
        int d=hr/24;
        int y=d/365;
        d=d- y*365;
        if (y>0)
        System.out.println(a+" minutes is roughly "+y+" years and "+ d+ " days");
        else
        System.out.println(a+" minutes is roughly "+ d+ " days");
    }
}