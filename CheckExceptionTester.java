import java.net.MalformedURLException;
import java.net.URL;

public class CheckExceptionTester {

    public static void main(String[] args) {
        CheckExceptionTester checkedExceptionTester = new CheckExceptionTester();
        checkedExceptionTester.urlTesterByTryCatch("http://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
        } catch (MalformedURLException murle) {
            murle.printStackTrace();
        }
    }
}
