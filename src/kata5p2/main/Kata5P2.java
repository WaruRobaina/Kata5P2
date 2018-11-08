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
    
    
    private List<Mail> mailList;
    private Histogram<String> histogram;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata5P2 k4 = new Kata5P2();
        k4.execute();  
    }
    
    public void execute() throws IOException{
        input();
        process();
        output();
    }
    
    public void input() throws IOException{
        String fileName;
        fileName = "email.txt";
        mailList = MailListReader.read(fileName);
    }
    
    public void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
    
}
