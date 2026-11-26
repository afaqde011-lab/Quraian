package ik;

import bk.i;
import com.google.android.gms.cast.Cast;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class b implements Closeable, Flushable {
    public static final Pattern L = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] M = new String[Cast.MAX_NAMESPACE_LENGTH];
    public static final String[] N;
    public final Writer A;
    public int[] B;
    public int C;
    public i D;
    public String E;
    public String F;
    public boolean G;
    public int H;
    public boolean I;
    public String J;
    public boolean K;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            M[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = M;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        N = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.B = iArr;
        this.C = 0;
        if (iArr.length == 0) {
            this.B = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.B;
        int i10 = this.C;
        this.C = i10 + 1;
        iArr2[i10] = 6;
        this.H = 2;
        this.K = true;
        Objects.requireNonNull(writer, "out == null");
        this.A = writer;
        O(i.f2550d);
    }

    public void A(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.J != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int I = I();
        if (I != 3 && I != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.J = str;
    }

    public final void F() throws IOException {
        if (this.G) {
            return;
        }
        String str = this.D.f2551a;
        Writer writer = this.A;
        writer.write(str);
        int i10 = this.C;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.D.f2552b);
        }
    }

    public b G() throws IOException {
        if (this.J != null) {
            if (!this.K) {
                this.J = null;
                return this;
            }
            q0();
        }
        a();
        this.A.write("null");
        return this;
    }

    public final int I() {
        int i10 = this.C;
        if (i10 != 0) {
            return this.B[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void O(i iVar) {
        Objects.requireNonNull(iVar);
        this.D = iVar;
        this.F = ",";
        if (iVar.f2553c) {
            this.E = ": ";
            if (iVar.f2551a.isEmpty()) {
                this.F = ", ";
            }
        } else {
            this.E = ":";
        }
        this.G = this.D.f2551a.isEmpty() && this.D.f2552b.isEmpty();
    }

    public final void S(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.H = i10;
    }

    public final void Z(String str) throws IOException {
        String str2;
        String[] strArr = this.I ? N : M;
        Writer writer = this.A;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public final void a() throws IOException {
        int I = I();
        if (I == 1) {
            this.B[this.C - 1] = 2;
            F();
            return;
        }
        Writer writer = this.A;
        if (I == 2) {
            writer.append((CharSequence) this.F);
            F();
        } else {
            if (I == 4) {
                writer.append((CharSequence) this.E);
                this.B[this.C - 1] = 5;
                return;
            }
            if (I != 6) {
                if (I != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.H != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.B[this.C - 1] = 7;
        }
    }

    public void b0(double d3) throws IOException {
        q0();
        if (this.H == 1 || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            a();
            this.A.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    @Override
    public void close() throws IOException {
        this.A.close();
        int i10 = this.C;
        if (i10 > 1 || (i10 == 1 && this.B[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.C = 0;
    }

    public void f0(long j9) throws IOException {
        q0();
        a();
        this.A.write(Long.toString(j9));
    }

    @Override
    public void flush() throws IOException {
        if (this.C == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.A.flush();
    }

    public void i() throws IOException {
        q0();
        a();
        int i10 = this.C;
        int[] iArr = this.B;
        if (i10 == iArr.length) {
            this.B = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.B;
        int i11 = this.C;
        this.C = i11 + 1;
        iArr2[i11] = 1;
        this.A.write(91);
    }

    public void l() throws IOException {
        q0();
        a();
        int i10 = this.C;
        int[] iArr = this.B;
        if (i10 == iArr.length) {
            this.B = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.B;
        int i11 = this.C;
        this.C = i11 + 1;
        iArr2[i11] = 3;
        this.A.write(123);
    }

    public void n0(Number number) throws IOException {
        if (number == null) {
            G();
            return;
        }
        q0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.H != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !L.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        a();
        this.A.append((CharSequence) string);
    }

    public void o0(String str) throws IOException {
        if (str == null) {
            G();
            return;
        }
        q0();
        a();
        Z(str);
    }

    public void p0(boolean z10) throws IOException {
        q0();
        a();
        this.A.write(z10 ? "true" : "false");
    }

    public final void q0() throws IOException {
        if (this.J != null) {
            int I = I();
            if (I == 5) {
                this.A.write(this.F);
            } else if (I != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            F();
            this.B[this.C - 1] = 4;
            Z(this.J);
            this.J = null;
        }
    }

    public final void r(int i10, int i11, char c10) throws IOException {
        int I = I();
        if (I != i11 && I != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.J != null) {
            throw new IllegalStateException("Dangling name: " + this.J);
        }
        this.C--;
        if (I == i11) {
            F();
        }
        this.A.write(c10);
    }

    public void v() throws IOException {
        r(1, 2, ']');
    }

    public void x() throws IOException {
        r(3, 5, '}');
    }
}
