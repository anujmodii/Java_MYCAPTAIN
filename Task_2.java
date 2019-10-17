import java.io.*;
class T2
{
    public static void main(String args[]) throws IOException
    {
        T2 obj=new T2();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first binary no." );
        String a=br.readLine();
        System.out.println("Enter the second binary no." );
        String b=br.readLine();
        int x=obj.binToDec(a);
        int y=obj.binToDec(b);
        int z=x+y;
        String c="";
        while(z>0)
        {
            int r=z%2;
            z/=2;
            c=Integer.toString(r)+c;
        }
        System.out.println(a+" + "+b+"="+c);
    }
    int binToDec(String a)
    {
        int c=0;
        int x=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            int r=Integer.parseInt(""+a.charAt(i)+"");
            x+=(int)Math.pow(2,c++)*r;
        }
        return x;
    }
}