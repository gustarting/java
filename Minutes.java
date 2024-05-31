public class Minutes {
    public static void printDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long YY = minutes / (60 * 24 * 365);
            long DD = (minutes % (60 * 24 * 365)) / (60 * 24);
            long WW = DD / 7;
            long days = DD % 7;

            System.out.println("" + minutes + " minutes = " + YY + " year(s), " + WW + " week(s), and " + days + " day(s)");
        }
    }
    public static void main(String[] args) {
        printDays(20182024);
    }
}

