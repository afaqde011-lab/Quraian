package k50;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

public interface j extends g0, WritableByteChannel {
    j J(int i, byte[] bArr);

    j K(String str);

    j Q(long j);

    j V(l lVar);

    i b();

    @Override
    void flush();

    j h0(long j);

    OutputStream i0();

    j write(byte[] bArr);

    j writeByte(int i);

    j writeInt(int i);

    j writeShort(int i);
}
