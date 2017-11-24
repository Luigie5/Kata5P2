package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderDDBB {
    public static List<String> read() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        List<String> lista =new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection c= DriverManager.getConnection("jdbc:sqlite:KATA.sdb");
        Statement st= c.createStatement();
        ResultSet rs= st.executeQuery("select * from mail");
        while(rs.next()){
            lista.add(rs.getString("mail"));
        }
        return lista;
    }
}
