package calculator;

public class StringCalculator {
    public int add(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] values = str.split(" ");
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;

    }
}
