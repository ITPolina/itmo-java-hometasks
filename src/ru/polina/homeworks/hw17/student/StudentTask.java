package ru.polina.homeworks.hw17.student;

import ru.polina.homeworks.hw17.student.Student;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        /*Map<Student.Gender, ArrayList<Student>> genderMap = new HashMap<>();
        ArrayList<Student> maleList = students.stream()
                .filter(student -> student.getGender() == Student.Gender.MALE)
                .collect(Collectors.toCollection(ArrayList::new));
        genderMap.put(Student.Gender.MALE, maleList);
        ArrayList<Student> femaleList = students.stream()
                .filter(student -> student.getGender() == Student.Gender.FEMALE)
                .collect(Collectors.toCollection(ArrayList::new));
        genderMap.put(Student.Gender.FEMALE, femaleList);
        System.out.println(genderMap);*/
        System.out.println("Задание 1");
        Map<Student.Gender, ArrayList<Student>> genderMap2 = students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getGender(),
                        Collectors.toCollection(ArrayList::new)
                ));
        System.out.println(genderMap2);


        //  2. Найти средний возраст учеников
        //System.out.println("Задание 2");
        //Double studentAverageAge = students.stream()
               //.          student ->(int) (ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now())));


        //  3. Найти самого младшего ученика
        System.out.println("Задание 3");
        Student youngestStudent = students.stream()
                   .sorted((student1, student2) -> {
                       if (student1.getBirth().isAfter(student2.getBirth())) return -1;
                       if (student1.getBirth().isBefore(student2.getBirth())) return 1;
                       else return 0;
                   })
                   .findFirst()
                   .get();
        System.out.println(youngestStudent);

        //  4. Найти самого старшего ученика
        System.out.println("Задание 4");
        Student oldestStudent = students.stream()
                .sorted((student1, student2) -> {
                    if (student1.getBirth().isAfter(student2.getBirth())) return 1;
                    if (student1.getBirth().isBefore(student2.getBirth())) return -1;
                    else return 0;
                })
                .findFirst()
                .get();
        System.out.println(oldestStudent);

        //  5. Собрать учеников в группы по году рождения
        System.out.println("Задание 5");
        Map<Integer, ArrayList<Student>> ageMap = students.stream()
                .collect(Collectors.groupingBy(
                        student -> student.getBirth().getYear(),
                        Collectors.toCollection(ArrayList::new)
                ));
        System.out.println(ageMap);
        //  6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        System.out.println("Задание 6");

        //  7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        System.out.println("Задание 7");

        //  8. Вывести в консоль всех учеников в возрасте от N до M лет
        System.out.println("Задание 8");
        int M = 15;
        int N = 8;
        students.stream().filter(student -> ((ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now()) < M )
                        && (ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now()) > N)))
                .forEach(student -> System.out.println(student));


        //  9. Собрать в список всех учеников с именем=someName
        System.out.println("Задание 9");
        String someName = "Алена";
            List<Student> someNameList = students.stream()
                    .filter(student -> student.getName().equalsIgnoreCase(someName)) //Вопрос: а если нет ни одного студента с именем someName?
                    .collect(Collectors.toList());
        System.out.println(someNameList);
        //  10. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        System.out.println("Задание 10");
        Map<Student.Gender, Integer> genderAgeMap = students.stream()
              .collect(Collectors.groupingBy(
                    student -> student.getGender(),
                    Collectors.summingInt(student -> (int) (ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now())))//???как считать возраст
              ));
        System.out.println(genderAgeMap);


    }
}
