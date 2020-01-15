package config;

public class EnvConfig {
    private static final String ENV = "test";
    private static final String USERNAME = "foo";
    private static final String PASSWORD = "bar";
    public static final String URI_LOGIN = "https://" + USERNAME + ":" + PASSWORD + "@" + ENV + ".grinfer.com/";
    public static String URI_API_LOGIN = "https://" + USERNAME + ":" + PASSWORD + "@" + ENV + ".grinfer.com/api/";

}
