public class Main {
    public static void main(String[] args) {
        String str_1 = "AaBbCcDd";
        StringBuilder uppercaseStr = new StringBuilder();
        StringBuilder lowercaseStr = new StringBuilder();
        
        // Получаем заглавные буквы (четные индексы: 0, 2, 4, 6)
        for (int i = 0; i < str_1.length(); i += 2) {
            uppercaseStr.append(str_1.charAt(i));
        }
        
        // Получаем строчные буквы (нечетные индексы: 1, 3, 5, 7)
        for (int i = 1; i < str_1.length(); i += 2) {
            lowercaseStr.append(str_1.charAt(i));
        }
