package ru.polina.homeworks.hw15;

import java.util.*;

public class MapTask {
        //1.
    public static List<String> cityLogins (HashMap<String, String> hashMap, String city) {
        ArrayList<String> loginsArrayList = new ArrayList<>();
        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            if (pair.getValue().equalsIgnoreCase(city)) {
                loginsArrayList.add(pair.getKey());
            }
        }
        if (loginsArrayList.isEmpty()) System.out.println("Такого города нет в списке");
        //System.out.println(loginsArrayList);
        return loginsArrayList;
    };
    //2.
    public static Map<String, Integer> repetitionsNumber (List <String> words) {
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        for (String word : words) {
            if(!wordsHashMap.containsKey(word)) {
                wordsHashMap.put(word, 1);
            } else {
                wordsHashMap.replace(word, wordsHashMap.get(word) + 1);
            }
        }
        //System.out.println(wordsHashMap);
        return wordsHashMap;
    };
    //3.
    public static Map<String, Customer> customerMapByAge (HashMap<String, Customer> hashMap, Integer from, Integer to) {
        HashMap<String, Customer> customerMapByAge = new HashMap<>();
        for(Map.Entry<String, Customer> pair : hashMap.entrySet()) {
            if (pair.getValue().getAge() >= from && pair.getValue().getAge() < to)
                customerMapByAge.put(pair.getKey(), pair.getValue());
        }
        //System.out.println(customerMapByAge);
        return customerMapByAge;
    };

    //4.
    public static Map<String, Long> wordAmount (String text, String word) {
        String[] wordsArray = text.split(" ");
        //можно ли создать ArrayList на основе массива слов, нужен ли он тут?
        HashMap<String, Long> wordAmountMap = new HashMap<>(1);
        long i = 0;
        for (String s : wordsArray) {
            if (s.equalsIgnoreCase(word)) i++;
        }
        wordAmountMap.put(word, i);
        //System.out.println(wordAmountMap);
        return wordAmountMap;
    };

    //5.TODO // написать метод, который собирает все слова в группы по количеству букв:
    //        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
    //        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
    public static Map<Integer, ArrayList<String>> wordsGroup (String text) {
        String[] wordsArray = text.split(" ");
        HashMap<Integer, ArrayList<String>> wordsAmountMap = new HashMap<>();
        for (String s : wordsArray) {
            if(!wordsAmountMap.containsKey(s.length())) {
                ArrayList<String> wordsList = new ArrayList<>();
                wordsList.add(s);
                wordsAmountMap.put(s.length(),wordsList);

            } else {
                wordsAmountMap.get(s.length()).add(s);
            }
        }
        System.out.println(wordsAmountMap);
        return wordsAmountMap;
    };

    //6. TODO написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов
    // (артикли и предлоги тоже считаем за слова)
    public static TreeMap<Integer, ArrayList<String>> wordsTop (String text) {
        String[] wordsArray = text.split(" ");
        HashMap<String, Integer> wordsAmountMap = new HashMap<>();
        for (String s : wordsArray) {
            if (!wordsAmountMap.containsKey(s)) {
                wordsAmountMap.put(s, 1);
            } else {
                wordsAmountMap.replace(s, wordsAmountMap.get(s) + 1);
            }
        }
        System.out.println(wordsAmountMap);

        TreeMap<Integer, ArrayList<String>> wordsTopMap = new TreeMap<>();
        for (Map.Entry<String, Integer> pair : wordsAmountMap.entrySet()) {
            if (!wordsTopMap.containsKey(pair.getValue())) {
                ArrayList<String> topList = new ArrayList<>();
                topList.add(pair.getKey());
                wordsTopMap.put(pair.getValue(), topList);
            } else {
                wordsTopMap.get(pair.getValue()).add(pair.getKey());
            }
        }

        System.out.println(wordsTopMap);
        return wordsTopMap;

    };


    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO:: написать статический метод, который принимает на вход мапу (firstTaskMap) и город (city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";
        //cityLogins(firstTaskMap, city);
        //List <String> cl = cityLogins(firstTaskMap, city);
        //System.out.println(cl);

        // TODO:: дан список слов (words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов
        //  в мапе вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        //repetitionsNumber(words);

        // TODO:: дана мапа (customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));

        //customerMapByAge(customerMap, 23, 48);


        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов
        //  (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

       // wordAmount(text, "a");

        // wordsGroup(text);
        wordsTop(text);
    }
}
