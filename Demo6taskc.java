public class Demo6taskc {
    public static void main(String[] args) {
        String a="\u001B[33m+-------------+------------+----------+\u001B[0m";
        String start="\u001B[33m";
        String end="\u001B[0m";
        System.out.println(a);
        System.out.printf("%3$s|%4$s \u001B[1m%-12s\u001B[0m%3$s|%4$s\u001B[1m%-12s\u001B[0m%3$s|%4$s\u001B[1m%5$s\u001B[0m%3$s|%4$s\n","CITY","STATE",start,end,"POPULATION");
        System.out.println(a);
        System.out.printf("%3$s|%4$s %-12s%3$s|%4$s%-12s%3$s|%4$s\u001B[35m%5$ ,10d\u001B[0m%3$s|%4$s\n","Los Angeles","California",start,end,3966936);
        System.out.printf("%3$s|%4$s %-21s%3$s|%4$s%-21s%3$s|%4$s\u001B[35m%5$ ,10d\u001B[0m%3$s|%4$s\n","\u001B[32mNew\u001B[0m York","\u001B[32mNew\u001B[0m York",start,end,8366817);
        System.out.println(a); 
    }
}
