import java.io.*;
class T7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of sqaure matrix" );
        int n=Integer.parseInt(br.readLine());
        int[][] a=new int[n][n],b=new int[n][n],c=new int[n][n];
        System.out.println("Enter first sqaure matrix" );
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                System.out.print("\n a["+i+"]["+j+"]=");
                a[i][j]=Integer.parseInt(br.readLine());
            } 

        System.out.println("Enter second sqaure matrix" );
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                System.out.print("\n b["+i+"]["+j+"]=");
                b[i][j]=Integer.parseInt(br.readLine());
            }     

         for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                c[i][j]=a[i][j]+b[i][j];   

         System.out.println("Sum of sqaure matrices : " );

         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             System.out.print(a[i][j]+" ");
             System.out.print("\t");
             for(int j=0;j<n;j++)
             System.out.print(b[i][j]+" ");
             System.out.print("\t");
             for(int j=0;j<n;j++)
             System.out.print(c[i][j]+" ");
             System.out.print("\n");
         }
    }
}
       