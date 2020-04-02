import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
        };
        System.out.println(printTextPerRole(roles, textLines));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i]).append(":\n");

            for (int j = 0; j <textLines.length ; j++) {

                if (textLines[j].startsWith(roles[i] + ":")) {
                   textLines[j] = textLines[j].replaceFirst(roles[i] + ": ", "");
                    result.append(j + 1).append(") ").append(textLines[j]).append("\n");
                }

            }
            result.append("\n");
        }
        return result.toString();

    }
}