package x00;

import java.util.Random;

public abstract class a extends d {
    @Override
    public final int a(int i) {
        return (f().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override
    public final int b() {
        return f().nextInt();
    }

    @Override
    public final long d() {
        return f().nextLong();
    }

    public abstract Random f();

    public final int g(int i) {
        return f().nextInt(i);
    }
}
