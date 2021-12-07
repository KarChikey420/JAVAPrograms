class Test{
    public void sum(){
        System.out.println("sum of Test");
    }
}
class Solution extends Test{
    public void show(){
        System.out.println("show of solution");
    }
}
class my_class{
    public static void main(String[] args){
        Test t1 = new Test();
        t1.sum();
        Solution s1 = new Solution();
        s1.show();
        s1.sum();
    }
}