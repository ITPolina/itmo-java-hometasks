package hw4;

public interface Workout {
    public static void main(String[] args) {
        //replace(char, char)
        // String replace(char oldChar, char newChar) —
        // заменяет все вхождения символа первого аргумента oldChar вторым — newChar.

        String value = "In JavaRush, Diego the best, Diego is Java God".replace(',', ';');
        System.out.println(value);

        //replaceFirst(String, String)
        //String replaceFirst(String regex, String replacement) —
        // заменяет первую подстроку, которая соответствует
        // указанному регулярному выражению, замещающей строкой.

        String value1 = "In JavaRush, Diego the best, Diego is Java God".replaceFirst("Diego", "Amigo");
        System.out.println(value1);
        // Вывод в консоль:
        //
        //In JavaRush, Amigo the best, Diego is Java God
        //
        //Как мы видим, изменилось только первое вхождение "Diego",
        // ну а дальнейшие остались за бортом — то есть, нетронутыми.
        String str = "Жили у бабуси два веселых гуся, убежали от бабуси";
        str = str.replaceFirst("бабуси","дедуси");
        System.out.println(str);
        str = str.replaceAll("бабуси","дедуси");
        System.out.println(str);

        String str1 = "Я буду летчиком!";
        String str2 = "Я буду летчиком!";
        String str3 = "Я буду дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result); //0

        result = str2.compareTo(str3);
        System.out.println(result); //11

        result = str3.compareTo(str1);
        System.out.println(result);// -11
        String str4 = "   ";
        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());

        String sample = "abc";
        String multiple = sample.repeat(3);
        System.out.println(multiple);




    }
}
