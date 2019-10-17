import java.io.*;
class T1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter radius of circle");
        double r=Double.parseDouble(br.readLine());
        System.out.println("Radius of circle="+r+" units \n Perimeter ="+(2*3.14*r)+"units \n Area="+(3.14*r*r)+"unit sq.");
    }
}