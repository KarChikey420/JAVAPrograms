import java.util.Scanner;

class A{
 int a;
 int b;
 int c;
Scanner sc=new Scanner(System.in);
}

class B extends A{
    void input(){
        System.out.println("Enter two number:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class kartik extends A{
    void add(){
        c=a+b;
    }
    void result(){
        System.out.println("sum is"+c);
    }
    public static void main(String[] args){
        B obj1=new B();
        obj1.input();

        kartik obj2=new kartik();
        obj2.add();
        obj2.result();
    }
}


    

