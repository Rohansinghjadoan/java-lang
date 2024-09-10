import java.util.*;
public class javafunction01 {
    

public static int calculatesum(int num1,int num2){ //parameter or formsl parameter
    int sum= num1+ num2 ;
    return sum;
}
public static void main(String args[]){
    Scanner sc = new Scanner( System.in );
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum= calculatesum(a,b);//argument or actual parametre
    System.out.println("sumis:"+sum);

}
}

