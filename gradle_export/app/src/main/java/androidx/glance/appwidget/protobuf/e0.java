package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class e0 {

    public static final Charset f885a;

    public static final byte[] f886b;

    static {
        Charset.forName("US-ASCII");
        f885a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f886b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }
}
