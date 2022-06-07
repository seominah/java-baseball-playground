package calculator;

public class StringCalculator {
    public int add(String str) {
        if (isBlank(str)) {
            return 0;
        }

        return sum(toInt(split(str)));

    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }

    private String[] split(String str) {
        String[] values = str.split(" ");
        return values;
    }

    private int[] toInt(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = toPositive(values[i]);
        }
        return numbers;
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0 ) {
            throw new RuntimeException();
        }
        return number;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
