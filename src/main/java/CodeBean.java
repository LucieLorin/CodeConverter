import java.util.Locale;

public class CodeBean {

    public String getISO3Code(String ISO2Code) {
        Locale locale = new Locale("", ISO2Code);
        return locale.getISO3Country();
    }
}
