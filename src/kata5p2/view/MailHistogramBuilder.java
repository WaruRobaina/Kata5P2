package kata5p2.view;

import java.util.List;
import kata5p2.model.Histogram;


public class MailHistogramBuilder {
  
    public MailHistogramBuilder(){}

    public Histogram<String> build (List<String> mails){
        Histogram<String> histogram = new Histogram();
        for (String mail : mails) {
            histogram.increment(mail);
        }
        return histogram;
    }
     
}
