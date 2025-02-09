package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class Main01 {

    public static void main(String[] args) {

        try (Connection conn = DBUtil.getConnection()) {
            System.out.println("Udalo sie");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
