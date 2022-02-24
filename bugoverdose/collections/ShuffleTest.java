package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShuffleTest {

    List<Integer> nums;

    @BeforeEach
    void setup() {
        nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    @Test
    void shuffle() {
        String originalNums = new ArrayList<>(nums).toString();

        Collections.shuffle(nums);

        assertThat(nums.toString()).isNotEqualTo(originalNums);
    }
}
