public class operators {
    public static void main(String[] args) {
        int x= 5;
        int y=7;
        System.out.println("X is:" +x);
        System.out.println("Y is : "+y);

        byte b=10;
        System.out.println("B is :"+b);
        int i=b;//implicit type casting 
        System.out.println("I IS:"+i);
        byte b2=(byte)129;//Explicit type casting
        System.out.println("b2 is :"+b2);

        byte b3=(byte)128;
        System.out.println("b3 is:"+b3);
        byte b4=(byte)256;
        System.out.println("b4 is:"+b4);

        float f =(float)5.56;
        System.out.println("Float is :"+f);
        char c ='a';
        System.out.println(c);
        //operators
        int z=x+y;
        System.out.println(z);
        char c3='e';
        int e =c3-'a';
        System.out.println("E is :"+e);

        int m=5;
        int n=m++;
        int q=6;
        int t=--q;
        System.out.println("m is :"+m + " n is :"+n);
        System.out.println( "t is :"+t+ "and q is :"+q);
    }
    
}
