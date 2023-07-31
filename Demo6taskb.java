public class Demo6taskb {
    public static void main(String[] args) {
        String a="\u001B[33m+-------------+-----+\u001B[0m";
        String start="\u001B[33m";
        String end="\u001B[0m";
        System.out.println(a);
        System.out.printf("%3$s|%4$s \u001B[1m\u001B[34m%-12s\u001B[0m%3$s|%4$s\u001B[1m\u001B[34m%4s\u001B[0m %3$s|%4$s\n","NAME","AGE",start,end);
        System.out.println(a);
        System.out.printf("%3$s|%4$s %-12s%3$s|%4$s\u001B[35m%4s\u001B[0m %3$s|%4$s\n","Alice","24",start,end);
        System.out.printf("%3$s|%4$s %-12s%3$s|%4$s\u001B[35m%4s\u001B[0m %3$s|%4$s\n","Bob","30",start,end);
        System.out.println(a);



    }
}
