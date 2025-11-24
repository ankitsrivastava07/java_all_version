package problems.function;

@FunctionalInterface
public interface CustomPredicate<T> {

    boolean test(T num);
}
