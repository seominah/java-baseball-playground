package calculator;

public class StringCalculator {
    public int add(String str) {
        if (isBlank(str)) {
            return 0;
        }

        return sum(split(str));

    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }

    private String[] split(String str) {
        String[] values = str.split(" ");
        return values;
    }

    private int sum(String[] values) {
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
