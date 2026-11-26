package nc;

import com.google.android.gms.cast.Cast;
import java.io.Closeable;
import java.util.Arrays;

public abstract class c implements Closeable {
    public static final String[] E = new String[Cast.MAX_NAMESPACE_LENGTH];
    public int A;
    public int[] B;
    public String[] C;
    public int[] D;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            E[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = E;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract boolean A();

    public abstract double F();

    public abstract int G();

    public abstract String I();

    public abstract int O();

    public final void S(int i10) {
        int i11 = this.A;
        int[] iArr = this.B;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new a("Nesting too deep at " + v());
            }
            this.B = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.C;
            this.C = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.D;
            this.D = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.B;
        int i12 = this.A;
        this.A = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int Z(h7.b bVar);

    public abstract void a();

    public abstract void b0();

    public abstract void f0();

    public abstract void i();

    public abstract void l();

    public final void n0(String str) throws b {
        throw new b(str + " at path " + v());
    }

    public abstract void r();

    public final String v() {
        int i10 = this.A;
        int[] iArr = this.B;
        String[] strArr = this.C;
        int[] iArr2 = this.D;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean x();
}
