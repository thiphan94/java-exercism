// import org.junit.jupiter.api.Test;

// import static org.assertj.core.api.Assertions.assertThat;

// public class GreeterTest {

//     @Test
//     public void testThatGreeterReturnsTheCorrectGreeting() {
//         assertThat(new Greeter().getGreeting()).isEqualTo("Hello, World!");
//     }

// }
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

}
