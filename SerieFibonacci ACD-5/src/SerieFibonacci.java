import java.util.*;

public class SerieFibonacci {
    private Map<Long, Long> numeroF;

    public SerieFibonacci() {
        numeroF = new HashMap<Long, Long>();
    }

    public long numeroFib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (numeroF.containsKey(n)) {
            return numeroF.get(n);
        }
        long fibValue = numeroFib(n - 1) + numeroFib(n - 2);
        numeroF.put(n, fibValue);
        return fibValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < numeroF.size(); i++) {
            sb.append(numeroFib(i)).append(" ");
        }
        return sb.toString();
    }
}