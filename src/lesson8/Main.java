package lesson8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 5, 9, 4);
        System.out.println(nums.stream()
                .max(Comparator.comparingInt(a -> a))
                .get());
        System.out.println(nums.stream()
                .min(Comparator.comparing(a -> a))
                .get());

        System.out.println("Профильтрованный список: ");
        List<Integer> unmodifiableList = nums.stream()
                .filter((a) -> a >= 5)
                .toList();
        unmodifiableList.forEach(System.out::println);

        List<Integer> list = nums.stream()
                .filter((a) -> a >= 5)
                .collect(Collectors.toList());
        list.clear();

        System.out.print("Сумма чисел: ");
        System.out.println(nums.stream()
                .reduce(Integer::sum)
                .get());

        List<ARequest> requests = List.of(new ARequest("Alex", 7999999999L, "Smolensk"),
                new ARequest("Semen", 79534757845L, "Spb"),
                new ARequest("Anastasiya", 795347234845L, "Spb"),
                new ARequest("Evgeniya", 7653246549L, "Tver"));

        System.out.println("Имена абонов:");
        requests.stream()
                .map(ARequest::getName)
                .forEach(System.out::println);
        List<AResponse> responses = requests.stream()
                .map(request -> new AResponse(request.getName(), String.valueOf(request.getNumberPhone()), 200))
                .toList();
        responses.forEach(System.out::println);

        requests.stream().sorted(Comparator.comparingLong(ARequest::getNumberPhone))
                .toList()
                .forEach(System.out::println);


        String abonsFromSpb = requests.stream()
                .filter(request -> "Spb".equals(request.getAddress()))
                .map(ARequest::getName)
                .collect(Collectors.joining(", ", "Абоны из Питера: ", "."));
        System.out.println(abonsFromSpb);

        IntStream.of(1, 4, 3, 2, 5, 12, 2);
        int sum = IntStream.range(10, 100)
                .reduce(Integer::sum)
                .getAsInt();
        System.out.println(sum);

        List<String> strings = List.of("Орск", "Москва", "Иркутск", "Владивосток", "Уфа", "Тыва", "Волгоград");

        System.out.println(strings.stream()
                .filter(city -> city.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ")));

        Student[] emptyStudents = new Student[10];

        Student[] students = {
                new Student("Иван", 20),
                new Student("Анна", 17),
                new Student("Сергей", 19)
        };
        System.out.println(Arrays.stream(students)
                .filter(student -> student != null && student.getAge() > 18)
                .count());

        long mult = LongStream.iterate(2, i -> i + 2)
                .limit(10)
                .reduce(1, (a, i) -> a * i);
        System.out.println(mult);

        System.out.println(strings.stream()
                .filter(city -> city.length() > 5)
                .findFirst()
                .get());

    }
}
