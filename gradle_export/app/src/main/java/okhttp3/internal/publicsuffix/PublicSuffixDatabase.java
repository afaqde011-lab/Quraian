package okhttp3.internal.publicsuffix;

import bi.b;
import gj.e;
import h00.q;
import h00.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k50.c0;
import k50.s;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import q30.l;
import r30.k;
import va.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "gj/e", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = a.R("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listX0 = k.X0(str, new char[]{'.'}, 6);
        return m.a(q.T0(listX0), "") ? q.I0(listX0) : listX0;
    }

    public final String a(String str) {
        String strD;
        String strD2;
        String strD3;
        List listX0;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        m.d(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        List listX1 = x.A;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        f50.m mVar = f50.m.a;
                        f50.m.a.getClass();
                        f50.m.g("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listC.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.d(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            m.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strD = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                m.k("publicSuffixListBytes");
                throw null;
            }
            strD = e.d(bArr2, bArr, i2);
            if (strD != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strD2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strD2 = null;
                break;
            }
            bArr3[i3] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                m.k("publicSuffixListBytes");
                throw null;
            }
            strD2 = e.d(bArr4, bArr3, i3);
            if (strD2 != null) {
                break;
            }
            i3++;
        }
        if (strD2 == null) {
            strD3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strD3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                m.k("publicSuffixExceptionListBytes");
                throw null;
            }
            strD3 = e.d(bArr5, bArr, i5);
            if (strD3 != null) {
                break;
            }
            i5++;
        }
        if (strD3 != null) {
            listX0 = k.X0("!".concat(strD3), new char[]{'.'}, 6);
        } else if (strD == null && strD2 == null) {
            listX0 = f;
        } else {
            List listX2 = strD != null ? k.X0(strD, new char[]{'.'}, 6) : listX1;
            if (strD2 != null) {
                listX1 = k.X0(strD2, new char[]{'.'}, 6);
            }
            listX0 = listX2.size() > listX1.size() ? listX2 : listX1;
        }
        if (listC.size() == listX0.size() && ((String) listX0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listX0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listX0.size();
        } else {
            size = listC.size();
            size2 = listX0.size() + 1;
        }
        return l.p0(l.l0(q.D0(c(str)), size - size2), ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                c0 c0VarR = b.r(new s(b.S(resourceAsStream)));
                try {
                    long j = c0VarR.readInt();
                    c0VarR.e0(j);
                    byte[] bArrO = c0VarR.B.O(j);
                    long j2 = c0VarR.readInt();
                    c0VarR.e0(j2);
                    byte[] bArrO2 = c0VarR.B.O(j2);
                    c0VarR.close();
                    synchronized (this) {
                        this.c = bArrO;
                        this.d = bArrO2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ta.c0.C(c0VarR, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
