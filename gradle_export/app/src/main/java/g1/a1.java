package g1;

import com.google.protobuf.RuntimeVersion;
import java.util.Locale;

public final class a1 implements u00.a {
    public final int A = 0;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public a1(g1 g1Var, h1.t tVar, h1.a0 a0Var, Locale locale, l1.z0 z0Var) {
        this.C = g1Var;
        this.D = tVar;
        this.E = a0Var;
        this.B = locale;
        this.F = z0Var;
    }

    public a1(Long l, Long l10, z00.e eVar, d6 d6Var, Locale locale) {
        this.C = l;
        this.D = l10;
        this.E = eVar;
        this.F = d6Var;
        this.B = locale;
    }

    public a1(kotlin.jvm.internal.v vVar, kotlin.jvm.internal.w wVar, l1.z0 z0Var, l1.z0 z0Var2, l1.z0 z0Var3) {
        this.C = vVar;
        this.D = wVar;
        this.F = z0Var;
        this.E = z0Var2;
        this.B = z0Var3;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                g1 g1Var = (g1) this.C;
                h1.t tVar = (h1.t) this.D;
                h1.a0 a0Var = (h1.a0) this.E;
                Locale locale = (Locale) this.B;
                l1.z0 z0Var = (l1.z0) this.F;
                return l1.q.z(((r3.w) z0Var.getValue()).f13099a.B.length() > 0 ? g1Var.a(tVar.c(((r3.w) z0Var.getValue()).f13099a.B, a0Var.f6490c, locale), locale) : RuntimeVersion.SUFFIX);
            case 1:
                return new b3((Long) this.C, (Long) this.D, (z00.e) this.E, 0, (d6) this.F, (Locale) this.B);
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.C;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.D;
                l1.z0 z0Var2 = (l1.z0) this.F;
                l1.z0 z0Var3 = (l1.z0) this.E;
                l1.z0 z0Var4 = (l1.z0) this.B;
                Boolean bool = Boolean.FALSE;
                z0Var2.setValue(bool);
                ((u00.k) z0Var3.getValue()).invoke(bool);
                if (vVar.A) {
                    ((u00.k) z0Var4.getValue()).invoke(Float.valueOf(wVar.A));
                }
                return g00.b0.a;
        }
    }
}
