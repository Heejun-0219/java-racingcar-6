package racingcar.Model;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputCarNameValidatorTest {
    private static final InputCarNameValidator validator = new InputCarNameValidator();

    @Test
    void 구분자_포함() {
        String input = "pobi,woni,jun";
        assertThat(validator.validateNameBeforeSplit(input)).contains("pobi", "woni", "jun");
    }

    // IllegalArgumentException 발생
    @Test
    void 구분자_미포함() {
        String input = "pobiwonijun";
        assertThatThrownBy(() -> validator.validateNameBeforeSplit(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 쉼표(,)를 기준으로 구분해야 합니다.");
    }

    @Test
    void split_후_에러체크() {
        String input = "pobi,woni,jun";
        assertThat(validator.validateNameAfterSplit(validator.validateNameBeforeSplit(input))).contains("pobi", "woni",
                "jun");
    }

    @Test
    void split_후_최소_자동차_갯수_체크() {
        List<String> input = Arrays.asList("pobi");
        assertThatThrownBy(() -> validator.validateNameAfterSplit(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 경주를 위한 자동차는 2대 이상이어야 합니다.");
    }

    @Test
    void split_후_중복_체크() {
        List<String> input = Arrays.asList("pobi", "pobi", "jun");
        assertThatThrownBy(() -> validator.validateNameAfterSplit(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복된 이름이 존재합니다.");
    }

    @Test
    void split_후_자동차_이름_최소_길이_체크() {
        List<String> input = Arrays.asList("", "woni", "jun");
        assertThatThrownBy(() -> validator.validateNameAfterSplit(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 1글자 이상, 5글자 이하만 가능합니다.");
    }

    @Test
    void split_후_자동차_이름_최대_길이_체크() {
        List<String> input = Arrays.asList("pobipo", "woni", "jun");
        assertThatThrownBy(() -> validator.validateNameAfterSplit(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 1글자 이상, 5글자 이하만 가능합니다.");
    }
}
