public class Main {
    //shani

    public static String StringChallenge(String str) {
        String flag = "true";
        String s1 = temiz(str);
        String ters = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            ters = ters + s1.charAt(i);
        }
        for (int i = 0 ; i < s1.length(); i++) {
            if (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(ters.charAt(i))) {
                continue;
            } else {
                flag = "false";
                break;
            }
        }
        return flag;
    }

    public static String temiz(String str) {
        String text = str;

        String answer = "";
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character)) {
                answer = answer + Character.toLowerCase(character);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(StringChallenge("Noel - sees Leon"));
    }
}
