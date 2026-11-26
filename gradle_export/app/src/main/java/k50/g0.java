package k50;

import java.io.Closeable;
import java.io.Flushable;

public interface g0 extends Closeable, Flushable {
    k0 c();

    void c0(i iVar, long j);

    @Override
    void close();

    void flush();
}
