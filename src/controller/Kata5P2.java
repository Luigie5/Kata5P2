package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import view.MailHistogramBuilder;
import view.MailListReader;
import view.MailListReaderDDBB;
public class Kata5P2 {
    List<String> lista;
    Histogram<String> histogram;
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        new Kata5P2().execute();
    }
    private void execute() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        input();
        process();
        output();
    }
    private void input() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        lista=MailListReaderDDBB.read();
    }
    private void process(){
        histogram=MailHistogramBuilder.build(lista);
    }
    private void output(){
        new HistogramDisplay(histogram).execute();
    }
}