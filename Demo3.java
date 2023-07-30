public class Demo3 {
    public static void main(String[] args) {
        int num1=123;
        int num2=456;
        int num3=7890;
        String color="\u001B[33m";
        String reset = "\u001B[0m";
        System.out.printf("%s(%s)%s %s-%s\n",color,num1,reset,num2,num3);
    }
}
