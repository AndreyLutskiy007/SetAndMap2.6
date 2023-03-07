import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 4, 1, 1, 2, 3, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> strings = new ArrayList<>(List.of("world", "hello", "hello", "hello"));
        task3(strings);
        task4(strings);
    }

    public static void task1(List<Integer> nums) {

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
        System.out.println();

    }

    public static void task2(List<Integer> nums) {
        Set<Integer> numSet = new TreeSet<>(nums); //отсортировка по возрастанию, быстрее работает, чем Collections.sort
        // или   Collections.sort(nums);//отсортировка по возрастанию
        for (Integer num : numSet)
            if (isEqually(num)) {
                System.out.print(num);
            }
        System.out.println();
    }


    public static boolean isEqually(Integer num) {
        return num % 2 == 0;
    }


    public static void task3(List<String> strings) {
        System.out.println(new HashSet(strings));
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> repeatString = new HashMap<>();
        for (String string : strings) {
            if (repeatString.get(string) == null) {
                repeatString.put(string, 1);
            } else {
                repeatString.put(string, repeatString.get(string) + 1);

            }
        }
        for (Map.Entry<String, Integer> entry : repeatString.entrySet()) {
            System.out.println(entry);
        }

    }

}