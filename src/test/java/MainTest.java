import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class MainTest {

//    @Test
//    void shouldFailOnPurpose() {
//        assertEquals(5, 2 + 2, "This test is intentionally failing to demonstrate a red CI pipeline.");
//    }

    @Test
    void shouldFailOnPurpose() {
        assertEquals(4, 2 + 2, "This test is intentionally succeed to demonstrate a red CI pipeline.");
    }
}
