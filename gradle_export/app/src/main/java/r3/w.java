package r3;

import com.google.protobuf.RuntimeVersion;
import m3.h0;
import m3.q0;
import s10.w0;

public final class w {

    public static final w0 f13098d = new w0(new qs.c(17), new pp.d(29), 15);

    public final m3.h f13099a;

    public final long f13100b;

    public final q0 f13101c;

    public w(String str, long j9, int i10) {
        this(new m3.h((i10 & 1) != 0 ? RuntimeVersion.SUFFIX : str), (i10 & 2) != 0 ? q0.f10518b : j9, (q0) null);
    }

    public w(m3.h hVar, long j9, q0 q0Var) {
        q0 q0Var2;
        this.f13099a = hVar;
        this.f13100b = h0.c(hVar.B.length(), j9);
        if (q0Var != null) {
            q0Var2 = new q0(h0.c(hVar.B.length(), q0Var.f10520a));
        } else {
            q0Var2 = null;
        }
        this.f13101c = q0Var2;
    }

    public static w a(w wVar, String str) {
        long j9 = wVar.f13100b;
        q0 q0Var = wVar.f13101c;
        wVar.getClass();
        return new w(new m3.h(str), j9, q0Var);
    }

    public static w b(w wVar, m3.h hVar, long j9, int i10) {
        if ((i10 & 1) != 0) {
            hVar = wVar.f13099a;
        }
        if ((i10 & 2) != 0) {
            j9 = wVar.f13100b;
        }
        q0 q0Var = (i10 & 4) != 0 ? wVar.f13101c : null;
        wVar.getClass();
        return new w(hVar, j9, q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return q0.c(this.f13100b, wVar.f13100b) && kotlin.jvm.internal.m.a(this.f13101c, wVar.f13101c) && kotlin.jvm.internal.m.a(this.f13099a, wVar.f13099a);
    }

    public final int hashCode() {
        int iHashCode = this.f13099a.hashCode() * 31;
        int i10 = q0.f10519c;
        int iF = w.c.f(iHashCode, this.f13100b, 31);
        q0 q0Var = this.f13101c;
        return iF + (q0Var != null ? Long.hashCode(q0Var.f10520a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f13099a) + "', selection=" + ((Object) q0.i(this.f13100b)) + ", composition=" + this.f13101c + ')';
    }
}
