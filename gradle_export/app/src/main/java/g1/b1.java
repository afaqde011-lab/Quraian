package g1;

import com.google.protobuf.RuntimeVersion;
import java.util.Locale;

public final class b1 implements u00.k {
    public final int A = 0;
    public final u00.k B;
    public final l1.z0 C;
    public final l1.z0 D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public b1(h1.a0 a0Var, l1.z0 z0Var, u00.k kVar, h1.t tVar, Locale locale, g1 g1Var, l1.z0 z0Var2) {
        this.E = a0Var;
        this.C = z0Var;
        this.B = kVar;
        this.F = tVar;
        this.G = locale;
        this.H = g1Var;
        this.D = z0Var2;
    }

    public b1(u30.b bVar, u00.k kVar, lo.u uVar, l1.p2 p2Var, l1.z0 z0Var, l1.z0 z0Var2, l1.g1 g1Var) {
        this.E = bVar;
        this.B = kVar;
        this.F = uVar;
        this.G = p2Var;
        this.C = z0Var;
        this.D = z0Var2;
        this.H = g1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                h1.a0 a0Var = (h1.a0) this.E;
                h1.t tVar = (h1.t) this.F;
                Locale locale = (Locale) this.G;
                g1 g1Var = (g1) this.H;
                r3.w wVar = (r3.w) obj;
                String str = wVar.f13099a.B;
                int length = str.length();
                String str2 = a0Var.f6490c;
                if (length <= str2.length()) {
                    for (int i10 = 0; i10 < str.length(); i10++) {
                        if (Character.isDigit(str.charAt(i10))) {
                        }
                    }
                    this.D.setValue(wVar);
                    String string = r30.k.j1(str).toString();
                    int length2 = string.length();
                    l1.z0 z0Var = this.C;
                    u00.k kVar = this.B;
                    Long lValueOf = null;
                    if (length2 != 0 && string.length() >= str2.length()) {
                        h1.s sVarC = tVar.c(string, str2, locale);
                        z0Var.setValue(g1Var.a(sVarC, locale));
                        if (((CharSequence) z0Var.getValue()).length() == 0 && sVarC != null) {
                            lValueOf = Long.valueOf(sVarC.D);
                        }
                        kVar.invoke(lValueOf);
                    } else {
                        z0Var.setValue(RuntimeVersion.SUFFIX);
                        kVar.invoke((Object) null);
                    }
                }
                break;
            default:
                h00.b bVar = (u30.b) this.E;
                lo.u uVar = (lo.u) this.F;
                l1.p2 p2Var = (l1.p2) this.G;
                l1.g1 g1Var2 = (l1.g1) this.H;
                j0.h hVar = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar, "$this$LazyColumn");
                hVar.r(bVar.a(), new a1.v2(new ou.a(10), bVar, 28), new as.r0(18, bVar), new v1.c(new q2(bVar, bVar, this.B, uVar, p2Var, this.C, this.D, g1Var2, 1), 2039820996, true));
                break;
        }
        return g00.b0.a;
    }
}
