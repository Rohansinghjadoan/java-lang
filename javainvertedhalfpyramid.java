public class javainvertedhalfpyramid {
    public static void inverted_rotated_halfpyramid(int n){
      //rows
        for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
             System.out.print("*");
        }
        System.out.println();
      }
    }
     public static void main(String args[]){

        inverted_rotated_halfpyramid( 4);
     }

    
}
