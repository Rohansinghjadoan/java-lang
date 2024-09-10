public class javahollowrec {
    public static void hollow_rec(int totalrow,int totalcolm){

        for (int i=1;i<=totalrow;i++){
        for(int j=1;j<=totalcolm;j++){
            if(i==1||i==totalrow||j==1||j==totalcolm){
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }

        }
         System.out.println();
    }
   
}
public static void main(String args[]){
    hollow_rec(4,5);
}
}
