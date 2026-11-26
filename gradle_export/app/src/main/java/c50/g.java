package c50;

import java.util.regex.Pattern;
import k50.c0;
import k50.i;
import k50.k;
import x40.d0;
import x40.s;

public final class g extends d0 {
    public final int B;
    public final long C;
    public final Object D;
    public final k E;

    public g(Object obj, long j, k kVar, int i) {
        this.B = i;
        this.D = obj;
        this.C = j;
        this.E = kVar;
    }

    @Override
    public final long l() {
        switch (this.B) {
            case 0:
                break;
        }
        return this.C;
    }

    @Override
    public final s r() {
        int i = this.B;
        Object obj = this.D;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = s.d;
                try {
                    return w50.c.H(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (s) obj;
        }
    }

    @Override
    public final k v() {
        switch (this.B) {
            case 0:
                return (c0) this.E;
            default:
                return (i) this.E;
        }
    }
}
