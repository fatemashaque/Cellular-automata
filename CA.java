import java.awt.*;

public class CA{

    public static byte [][]cells;

    public static void CA(int n, int r, int[] rules){
        Dimension size=new Dimension(n*2,n*2);
        cells=new byte[256][(n*2)+1];
        cells[0][size.width/2]=1;
        
        display(n, r, rules);

    }

    static void display(int n, int r, int[] rules){
        int total=0;
        for (int i = 0; i < cells.length - 1; i++) {
            total++;
            if (total==n+1){
                return;
            }
            
            for (int c = 1; c < cells[i].length - 1; c++) {
                byte left = cells[i][c - 1];
                byte middle= cells[i][c];
                byte right = cells[i][c + 1];
                cells[i + 1][c] = binary(r,rules,left, middle, right); 
                if (cells[i][c] == 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                 
                
            }
            System.out.println("");
        }
    }
    private static byte binary(int r,int[] rules,int left, int middle, int right){
        int ind= (left << 2 | middle << 1 | right);
        return (byte) (rules[r] >> ind & 1);
    }

    public static void main(String[]args){
        int n= Integer.parseInt(args[0]);
        int r=Integer.parseInt(args[1]);
        int[] rules=new int[256];
        for(int i =0; i<256;i++){
            rules[i]=i;
        }
        CA(n,r,rules);
    }
}