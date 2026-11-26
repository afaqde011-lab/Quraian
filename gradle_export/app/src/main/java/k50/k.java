package k50;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface k extends i0, ReadableByteChannel {
    int M(y yVar);

    String N(Charset charset);

    boolean T(long j);

    String W();

    long a0(j jVar);

    i b();

    void e0(long j);

    long j0();

    InputStream l0();

    l m(long j);

    boolean m0(long j, l lVar);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    byte[] t();

    long w(byte b, long j, long j2);

    String z(long j);
}
