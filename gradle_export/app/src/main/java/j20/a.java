package j20;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class a extends k20.a {
    public static final a f = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        m.e(numbers, "numbers");
    }
}
