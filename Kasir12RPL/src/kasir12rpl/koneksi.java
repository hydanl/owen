package kasir12rpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi { // Ganti 'koneksi' jika nama kelas Anda berbeda
    // GANTI detail koneksi ini dengan milik Anda!
    private static final String URL = "jdbc:postgresql://localhost:5432/Restoran"; 
    private static final String USER = "postgres"; 
    private static final String PASSWORD = "12345678"; 

    public static Connection getConnection() throws SQLException {
        // Pastikan driver PostgreSQL JDBC sudah di Library proyek NetBeans Anda
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}