package x40;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class d0 implements Closeable {
    public c0 A;

    public final byte[] a() throws IOException {
        long jL = l();
        if (jL > 2147483647L) {
            throw new IOException(w.c.i(jL, "Cannot buffer entire body for content length: "));
        }
        k50.k kVarV = v();
        try {
            byte[] bArrT = kVarV.t();
            kVarV.close();
            int length = bArrT.length;
            if (jL == -1 || jL == length) {
                return bArrT;
            }
            throw new IOException("Content-Length (" + jL + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ta.c0.C(kVarV, th);
                throw th2;
            }
        }
    }

    @Override
    public void close() {
        y40.b.d(v());
    }

    public final Charset i() {
        String str;
        s sVarR = r();
        if (sVarR != null) {
            Charset charsetForName = r30.a.a;
            String[] strArr = sVarR.c;
            int i = 0;
            int iY = ca.v.y(0, strArr.length - 1, 2);
            if (iY < 0) {
                str = null;
                break;
            }
            while (true) {
                if (!r30.r.q0(strArr[i], "charset")) {
                    if (i == iY) {
                        str = null;
                        break;
                    }
                    i += 2;
                } else {
                    str = strArr[i + 1];
                    break;
                }
            }
            if (str != null) {
                try {
                    charsetForName = Charset.forName(str);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (charsetForName != null) {
                return charsetForName;
            }
        }
        return r30.a.a;
    }

    public abstract long l();

    public abstract s r();

    public abstract k50.k v();

    public final String x() throws IOException {
        k50.k kVarV = v();
        try {
            String strN = kVarV.N(y40.b.r(kVarV, i()));
            kVarV.close();
            return strN;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ta.c0.C(kVarV, th);
                throw th2;
            }
        }
    }
}
