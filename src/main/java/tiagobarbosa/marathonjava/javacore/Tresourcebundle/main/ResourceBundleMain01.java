package tiagobarbosa.marathonjava.javacore.Tresourcebundle.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleMain01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodMorning"));

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("goodMorning"));
    }
}
