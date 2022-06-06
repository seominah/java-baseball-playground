package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1", "2");
    }
    
    @Test
    void substring() {
        String str ="(1,2)";
        String result = str.substring(1, str.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("4번째 위치를 가져오면 StringIndexOutOfBoundsException 에러 발생")
    void charAt() {
        assertThatThrownBy(() -> {
            int result = "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");

    }
}
