import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample(){
    }

    public boolean validate(String regex){
        Pattern pt = Pattern.compile(ACCOUNT_REGEX);
        Matcher mc = pt.matcher(regex);
        return mc.matches();
    }
}
