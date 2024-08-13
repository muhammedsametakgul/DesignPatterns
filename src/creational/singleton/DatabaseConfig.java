package creational.singleton;

public class DatabaseConfig {
    private static final DatabaseConfig instance = new DatabaseConfig();

    private  DatabaseConfig(){

    }

    public static DatabaseConfig getInstance(){
        return instance;
    }
    public void connectToDatabase(){
        System.out.println("DB Connected");
    }
}
