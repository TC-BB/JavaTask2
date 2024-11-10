import org.example.ExpressionEvaluator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExpressionEvaluatorTest {

    @Test
    void testSimpleExpression() throws Exception {
        assertEquals(5.0, ExpressionEvaluator.evaluate("2 + 3"));
    }

    @Test
    void testWithParentheses() throws Exception {
        assertEquals(10.0, ExpressionEvaluator.evaluate("( 2 + 3 ) * 2"));
    }

    @Test
    void testWithDivision() throws Exception {
        assertEquals(2.0, ExpressionEvaluator.evaluate("4 / 2"));
    }

    @Test
    void testWithMultipleOperators() throws Exception {
        assertEquals(11.0, ExpressionEvaluator.evaluate("2 + 3 * 2 + 3"));
    }

    @Test
    void testWithInvalidExpression() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("2 + * 3"));
    }

    @Test
    void testWithDivisionByZero() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("5 / 0"));
    }

    @Test
    void testWithIncorrectParentheses() {
        assertThrows(Exception.class, () -> ExpressionEvaluator.evaluate("( 2 + 3" ));
    }
}