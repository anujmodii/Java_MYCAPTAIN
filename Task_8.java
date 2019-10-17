import java.io.*;
class T8
{
    public static void main(String args[]) throws IOException
    {
        T8 obj=new T8();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string" );
        String a=br.readLine();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
           int x=obj.cvowel(a.charAt(i));
            if(x==1)
            c++;
        }
        System.out.println("No. of vowels : " + c);
    }
    int cvowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return 1;
        else
        return 0;
    }
}