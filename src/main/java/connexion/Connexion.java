package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

    private static String login = "nr1hj2943xngfnnc";
    private static String password = "ks7se2vsvrlofn71";
    private static String url = "jdbc:mysql://nr1hj2943xngfnnc:ks7se2vsvrlofn71@exbodcemtop76rnz.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/cxpbt81w78eq8vo0";
    private Connection connection = null;
    private static Connexion instane;

    private Connexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
        	System.out.println(url);
            System.out.println("Driver introvable");
        } catch (SQLException e) {
            System.out.println("Connexion errror");
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Connexion getInstane() {
        if (instane == null) {
            instane = new Connexion();
        }
        return instane;
    }

}
