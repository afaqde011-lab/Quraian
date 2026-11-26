package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class b0 {

    public static final Charset f4244a;

    public static final byte[] f4245b;

    static {
        Charset.forName("US-ASCII");
        f4244a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4245b = bArr;
        ByteBuffer.wrap(bArr);
        androidx.datastore.preferences.protobuf.j.j(bArr, 0, 0, false);
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
