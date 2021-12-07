import java.util.Scanner;

interface Shape{
    public void color();
    public void volume();
    public void area();
    public void show(); 
}
class ractangle implements Shape { 
    int ar;
    String col;
    Scanner sc=new Scanner(System.in);
    public void color() 
    { 
        System.out.println("enter color:");
        col=sc.nextLine();
    }
    public void volume()
    {
    System.out.println("volume can not defind");
    }
    public void area()
    {
    int B,H;
    System.out.println("enter B and H:");
    B=sc.nextInt();
    H=sc.nextInt();
    ar=B*H;
    }
    public void show()
    {
      System.out.println(col+" "+ar);  
    }
}
class circal implements Shape { 
    float ar;
    String col;
    Scanner sc=new Scanner(System.in);
    public void color() 
    {
       System.out.println("enter color:");
       col=sc.nextLine();   
    }
    public void volume()
    {
        System.out.println("volume can not defind");
    }
    public void area()
    {
       int side;
       System.out.println("enter side:");
       side=sc.nextInt();
       ar=side*side;
    }
    public void show()
    {
      System.out.println(col+" "+ar);  
    }
}
class square implements Shape { 
    int ar;
    String col;
    Scanner sc=new Scanner(System.in);
    public void color() 
    {
        System.out.println("enter color:");
        col=sc.nextLine();
    }
    public void volume()
    {
    System.out.println("volume can not defind");
    }
    public void area()
    {
    int side;
    System.out.println("enter side:");
    side=sc.nextInt();
    ar=side*side;
    }
    public void show()
    {
      System.out.println(col+" "+ar);  
    }
}
class object{
    public static void main(String[] args){
        ractangle obj= new ractangle();
        obj.color();
        obj.volume();
        obj.area();
        obj.show();

        circal obj2= new circal();
        obj2.color();
        obj2.volume();
        obj2.area();
        obj2.show();

        square obj3= new square();
        obj3.color();
        obj3.volume();
        obj3.area();
        obj3.show();

    }
}
