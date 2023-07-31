public class Demo6taskd {
    public static void main(String[] args) {
        String a="\u001B[33m+--------+---------+------+\u001B[0m";
        String start="\u001B[33m";
        String end="\u001B[0m";
        System.out.println(a);
        System.out.printf("%3$s|%4$s \u001B[1m%-7s\u001B[0m%3$s|%4$s\u001B[1m%9s\u001B[0m%3$s|%4$s\u001B[1m%5$6s\u001B[0m%3$s|%4$s\n","ITEM","QUANTITY",start,end,"PRICE");
        System.out.println(a);
        System.out.printf("%3$s|%4$s %-7s%3$s|%4$s%9s%3$s|%4$s\u001B[35m$%5$3.2f\u001B[0m%3$s |%4$s\n","Apple","5",start,end,0.99);
        System.out.printf("%3$s|%4$s %-7s%3$s|%4$s%18s%3$s|%4$s\u001B[35m$%5$3.2f\u001B[0m%3$s |%4$s\n","Orange","\u001B[32m10\u001B[0m",start,end,1.49);
        System.out.println(a);  
    }
}
