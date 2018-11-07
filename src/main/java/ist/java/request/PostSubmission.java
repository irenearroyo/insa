package ist.java.request;
import java.util.*

public class PostSubmission {
   private Calendar Timestamp;
   private String Author;
   private String Tweet;


  public PostSubmission (){
        Timestamp = Calendar.getInstance().getTime();
    }
}
