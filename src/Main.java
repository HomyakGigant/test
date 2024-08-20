import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String str = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile("Л[а-я]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}