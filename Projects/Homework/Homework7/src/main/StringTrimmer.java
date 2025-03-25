
import java.util.List;

public class StringTrimmer {
    public static void trimStrings(List<String> list) {
        list.replaceAll(String::trim);
    }
}