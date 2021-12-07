public class percentage {
    public static void main(String[] args){
    int sub1,sub2,sub3,sub4,sub5;
    sub1=Integer.parseInt(args[0]);
    sub2=Integer.parseInt(args[1]);
    sub3=Integer.parseInt(args[2]);
    sub4=Integer.parseInt(args[3]);
    sub5=Integer.parseInt(args[4]);

    int percentage=((sub1+sub2+sub3+sub4+sub5)/500)*100;
    System.out.println(percentage);
    }
}
