package problems.function;

@FunctionalInterface
public interface CustomFunction<T, R> {

    R apply(T t);
}
