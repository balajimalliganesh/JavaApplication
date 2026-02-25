import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int actualResult = calculator.multiply(4, 5);
        
        // Verifies that the expected value matches the actual result
        assertEquals(expectedResult, actualResult, "Regular multiplication should work");
    }
@Test
    public void testMultiplyWithZero() {
        Calculator calculator = new Calculator();
        
        // You can provide an optional message as the last parameter
        assertEquals(0, calculator.multiply(0, 5), "Multiplication with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiplication with zero should be zero");
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This Build is ran from Github Actions");
    }
}
