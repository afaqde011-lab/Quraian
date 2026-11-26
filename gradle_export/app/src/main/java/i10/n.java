package i10;

import java.io.Serializable;
import kotlin.jvm.internal.z;

public final class n extends n30.l {
    public final int b;
    public final Object c;
    public final Serializable d;

    public n(int i, Serializable serializable, Object obj) {
        this.b = i;
        this.c = obj;
        this.d = serializable;
    }

    public n(z zVar, u00.k kVar) {
        this.b = 2;
        this.d = zVar;
        this.c = kVar;
    }

    @Override
    public void b(Object obj) {
        switch (this.b) {
            case 2:
                j10.c current = (j10.c) obj;
                kotlin.jvm.internal.m.e(current, "current");
                z zVar = (z) this.d;
                if (zVar.A == null && ((Boolean) ((u00.k) this.c).invoke(current)).booleanValue()) {
                    zVar.A = current;
                    break;
                }
                break;
        }
    }

    @Override
    public final boolean c(Object obj) {
        switch (this.b) {
            case 0:
                j10.e javaClassDescriptor = (j10.e) obj;
                z zVar = (z) this.d;
                kotlin.jvm.internal.m.e(javaClassDescriptor, "javaClassDescriptor");
                String strQ = bi.b.Q(javaClassDescriptor, (String) this.c);
                if (r.b.contains(strQ)) {
                    zVar.A = l.A;
                } else if (r.d.contains(strQ)) {
                    zVar.A = l.B;
                } else if (r.c.contains(strQ)) {
                    zVar.A = l.C;
                } else if (r.a.contains(strQ)) {
                    zVar.A = l.E;
                }
                return zVar.A == null;
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                if (((Boolean) ((u00.k) this.c).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            default:
                j10.c current = (j10.c) obj;
                kotlin.jvm.internal.m.e(current, "current");
                return ((z) this.d).A == null;
        }
    }

    @Override
    public final Object j() {
        switch (this.b) {
            case 0:
                l lVar = (l) ((z) this.d).A;
                return lVar == null ? l.D : lVar;
            case 1:
                return Boolean.valueOf(((boolean[]) this.d)[0]);
            default:
                return (j10.c) ((z) this.d).A;
        }
    }
}
