public class Demo4 {
    public static void main(String[] args) {
        int day=28;
        int month =12;
        int year=2023;
        int hour=23;
        int minut=59;
        int second=59;
        String title="\u001B[33m";
        String reset = "\u001B[0m";
        System.out.printf("\u001B[31m%d\u001B[0m/\u001B[32m%d\u001B[0m/\u001B[33m%d\u001B[0m \u001B[34m%d\u001B[0m:\u001B[35m%d\u001B[0m:\u001B[36m%d\u001B[0m\n",month,day,year,hour,minut,second);
    }
}
