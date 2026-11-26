package c7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface m {

    public static final ByteBuffer f2925a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    k e(k kVar);

    void f();

    void flush();

    default long g(long j9) {
        return j9;
    }

    void reset();
}
