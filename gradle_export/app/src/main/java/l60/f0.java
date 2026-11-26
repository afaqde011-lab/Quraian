package l60;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

public final class f0 extends w0 {
    public final Method d;
    public final int e;
    public final String f;
    public final a g;
    public final boolean h;

    public f0(Method method, int i, String str, boolean z) {
        a aVar = a.B;
        this.d = method;
        this.e = i;
        Objects.requireNonNull(str, "name == null");
        this.f = str;
        this.g = aVar;
        this.h = z;
    }

    @Override
    public final void a(m0 m0Var, Object obj) throws EOFException {
        String strB0;
        String str = this.f;
        if (obj == null) {
            throw w0.n(this.d, this.e, a1.b.p("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.g.getClass();
        String string = obj.toString();
        if (m0Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strB0 = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.h;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                k50.i iVar = new k50.i();
                iVar.v0(0, string, iCharCount);
                k50.i iVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (iVar2 == null) {
                                iVar2 = new k50.i();
                            }
                            iVar2.x0(iCodePointAt2);
                            long j = iVar2.B;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bF = iVar2.F(j2);
                                iVar.q0(37);
                                char[] cArr = m0.l;
                                iVar.q0(cArr[((bF & 255) >> 4) & 15]);
                                iVar.q0(cArr[bF & 15]);
                                j2++;
                                iVar2 = iVar2;
                            }
                            iVar2.a();
                        } else {
                            iVar.x0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strB0 = iVar.b0();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = m0Var.c.replace("{" + str + "}", strB0);
        if (m0.m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        }
        m0Var.c = strReplace;
    }
}
