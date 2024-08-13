package creational.singleton;

public class Main {
    public static void main(String[] args) {
        /**
         * When an object was created, it gets the object already created on DatabaseConfig.
         * It increases performance
         */
        DatabaseConfig dbConfig = DatabaseConfig.getInstance();
        dbConfig.connectToDatabase();
    }
}
