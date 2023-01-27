class A{
    int a,b;
    public void show(){
System.out.println("Hello");

    }
}
class B extends A{
    int c,d;
    public void write(){
        System.out.println("Writing");

    }
}
class C extends A{
int e,f;
public void speak(){
    System.out.println("Speaking");
}

}

public class Test {
    public static void main(String[] args) {
        //singlr inheritance
        B b=new B();
        C c=new C();
    }
    
}
