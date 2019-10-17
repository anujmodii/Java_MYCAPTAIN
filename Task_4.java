import java.io.*;
class T4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter in inches");
        double r=Double.parseDouble(br.readLine());
        System.out.println(r+"inches = "+(r*0.0254)+" meters");
    }
}