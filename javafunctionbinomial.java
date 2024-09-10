public class javafunctionbinomial {
    public static int factorial(int n ){
        int f=1;
        for(int i=1;i<=n;i++)
        f*=i;
        return(f);

    }
   
    public static int binomial(int n,int r){
        int gfact=factorial(n);
        int rfact=factorial(r);
        int nmrfact=factorial(n-r);
        int binomialcoeff=gfact/(rfact*nmrfact);

        return binomialcoeff;

    }
       public static void main(String args[]){
       System.out.println(binomial(6,2));
    }
}

    

