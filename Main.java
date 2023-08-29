// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                int[][] two={
                        {30},
                        {300,500},
                        {3000,5000,5000}};
                int i,j;
                for( i=0;i<two.length;i++){
                    System.out.println("Value"+(i+1)+":");
                    for( j=0;j<two[i].length;j++){
                        System.out.print(two[i][j]+" ");
                    }
                    //System.out.println();
                }
            }
        }

