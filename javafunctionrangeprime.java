public class javafunctionrangeprime {
    
    public static boolean isprime(int n){
boolean isprime =true; 
if (n==2){
    return true;
}
for(int i=2;i<=Math.sqrt(n);i++){
    if( n%i==0){
       return false;
    }
    
}
return true;
    }
      
public static void rangeprime(int n){
    for(int i=2;i<=n;i++){
       if( isprime(i)){
        System.out.print(i+" ");

        }
    } 
    System.out.println();
}
public static void main(String args[]){
       rangeprime(100);
    }
}
