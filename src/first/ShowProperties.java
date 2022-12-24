package first;


public class ShowProperties {
    public static int a;
    public static double b;
    public static String getUserName(){
        return System.getProperty("user.name");
    }
}
