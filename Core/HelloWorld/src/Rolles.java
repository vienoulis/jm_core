import com.sun.deploy.util.ArrayUtil;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rolles {



//        String[] roles = new String[]{
//                "Городничий",
//                "Аммос Федорович",
//                "Артемий Филиппович",
//                "Лука Лукич"
//        };
//        String[] textLines = new String[]{
////                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
////                "Аммос Федорович: Как ревизор?",
////                "Артемий Филиппович: Как ревизор?",
////                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
////                "Аммос Федорович: Вот те на!",
////                "Артемий Филиппович: Вот не было заботы, так подай!",
////                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
//        };
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "Демис Карибидис",
                "Лука"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука Лукич: сэмпл текс Лука Лукич:",
                "Лука Лукич: Лука: Господи боже!  еще и с секретным предписаньем",
                "  "
        };






    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder("");
        StringBuilder buffer = new StringBuilder("");
        String regex = "";

        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i]).append(":\n");
            for (int j = 0; j <textLines.length ; j++) {

                regex = roles[i] + ":.*";
                if (textLines[j].matches(regex)) {
                    buffer.append(textLines[j]);
                    buffer.delete(0, buffer.indexOf(":") + 2);
                    result.append(j + 1).append(") ").append(buffer).append("\n");
                }
                buffer.delete(0, buffer.length() + 2 );
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static int[] mergeArrays2(int[] a1, int[] a2) {
        if (a1.length == 0) return a2;
        if (a2.length == 0) return a1;

        int[] result = new int[a1.length + a2.length];
//        result[0] = Math.min(a1[0],a2[0]);
        int max = Math.max(a1[0], a2[0]);
        int a1Count = 0;
        int a2Count = 0;
        result[result.length - 1] = Math.max(a1[a1.length - 1], a2[a2.length - 1]);

        for (int i = 0; i < a1.length + a2.length - 1; i++) {
//            if ()
        }

        return result;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int a1Count = 0, a2Count = 0;
        for (int i = 0; i < result.length; i++) {

            if (a1Count > a1.length - 1) {
                int a = a2[a2Count];
                result[i] = a;
                a2Count++;
            } else if (a2Count > a2.length - 1) {
                int a = a1[a1Count];
                result[i] = a;
                a1Count++;
            } else if (a1[a1Count] < a2[a2Count]) {
                int a = a1[a1Count];
                result[i] = a;
                a1Count++;
            } else {
                int b = a2[a2Count];
                result[i] = b;
                a2Count++;
            }
        }
        return result;
    }
}