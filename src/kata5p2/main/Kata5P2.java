package kata5p2.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.HistogramDisplay;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;

public class Kata5P2 {
    
    
    private static List<String> mailList;
    private static Histogram histogram;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        input();
        process();
        output();  
    }
    
    public static void input() throws IOException{
        MailListReader bd = new MailListReader();
        mailList = bd.read("jdbc:sqlite:Kata5.db", "email");
    }
    
    public static void process(){
        MailHistogramBuilder builded = new MailHistogramBuilder();
        histogram = builded.build(mailList);

    }
    
    public static void output(){
        new HistogramDisplay(histogram).execute();
    }
    
}
