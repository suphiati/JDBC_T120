package jdbcTesting;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Query01 {

    // Sizden bir JDBC sorgusu yapmanız istedndiğinde ilk yapmanız gereken iş;

     // Database yöneticisinden ilgili database bilgilerini (database access information) almak olmalıdır

    /*
        URL: "jdbc:mysql://194.140.198.209/wonderworld_qa2";
        USERNAME:"wonderworld_qacollegeuser";
        PASSWORD:"1gvyfx6#Q";


     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


    //1. Adim olarak: Kullanılacak veritabani için doğru sürücüyü ekle

        Class.forName("mysql.jdbc.Driver");

    //2. Adım olarak: Veritabanı ile iletişim başlat

        Connection connection=DriverManager.getConnection("jdbc:mysql://45.87.83.5/u168183796_qawonder",
                                    "u168183796_qawonderuser",
                                    "1gvyfx6#Q");



    }
}
