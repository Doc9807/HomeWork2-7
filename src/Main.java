import java.util.*;

public class Main {

    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + "; ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + "; ");
                prevNum = num;
            }
        }
        System.out.println();
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.print(uniqueWords + "; ");
        System.out.println();
    }

    public static void task4() {
        Map<String, Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values() + "; ");
    }
}