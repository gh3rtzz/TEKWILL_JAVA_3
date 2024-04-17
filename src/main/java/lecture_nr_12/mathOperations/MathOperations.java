package lecture_nr_12.mathOperations;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum MathOperations {

    ADDITION((x, y) -> x + y),
    SUBTRACTION((x, y) -> x - y),
    DIVISION((x, y) -> x / y),
    MULTIPLICATION((x, y) -> x * y);

    public BiFunction<Integer, Integer, Integer> algorithm;

    MathOperations(BiFunction<Integer, Integer, Integer> algorithm) {
        this.algorithm = algorithm;
    }
}
