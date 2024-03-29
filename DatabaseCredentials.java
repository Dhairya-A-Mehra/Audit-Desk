

public class DatabaseCredentials {
    private static String uname = "root";
    private static String pass = "rutu2004"; //enter your mysql password here
    private static String url = "jdbc:mysql://127.0.0.1:3306/pbl1";

    public static String getUname() {
        return uname;
    }
    public static String getPass() {
        return pass;
    }
    public static String getUrl() {
        return url;
    }
}
