import java.util.*;

class Matrix{
    // Ma tran n x m
    private int n,m;
    private long[][] a;
    public Matrix(int n, int m){
        a = new long[n][m];
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner scanner)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b)
    {
        Matrix res = new Matrix(n,b.m);
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<b.m; j++)
            {
                long tmp = 0;
                for(int k = 0; k<m; k++)
                {
                    tmp += a[i][k] * b.a[k][j];
                }
                res.a[i][j] = tmp;
            }
        }
        return res;
    }

    // Ghi de len phuong thuc toString() cua Java
    @Override
    public String toString(){
        String[] s = new String[n];
        for(int i = 0; i<n; i++)
        {
            s[i] = "";
            for(int j = 0; j<m; j++)
            {
                s[i] += a[i][j] + " ";
            }
        }
        return String.join("\n",s);
    }

}
public class J04016{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
}
}

