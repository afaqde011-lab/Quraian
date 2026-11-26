package c20;

import e30.a0;
import e30.h0;
import e30.p0;
import e30.q;
import e30.w;
import e30.z0;
import h00.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;
import x20.n;

public final class i extends q {
    public i(a0 lowerBound, a0 upperBound) {
        super(lowerBound, upperBound);
        m.e(lowerBound, "lowerBound");
        m.e(upperBound, "upperBound");
        f30.d.a.b(lowerBound, upperBound);
    }

    public static final ArrayList E0(p20.h hVar, w wVar) throws IOException {
        List<p0> listE0 = wVar.e0();
        ArrayList arrayList = new ArrayList(r.q0(listE0, 10));
        for (p0 typeProjection : listE0) {
            m.e(typeProjection, "typeProjection");
            StringBuilder sb = new StringBuilder();
            h00.q.Q0(va.a.R(typeProjection), sb, ", ", null, null, new p20.g(hVar, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String F0(String str, String str2) {
        if (!k.B0(str, '<')) {
            return str;
        }
        return k.d1(str, '<') + '<' + str2 + '>' + k.b1('>', str, str);
    }

    @Override
    public final z0 A0(f30.f kotlinTypeRefiner) {
        m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        m.e(type, "type");
        a0 type2 = this.C;
        m.e(type2, "type");
        return new i(type, type2);
    }

    @Override
    public final z0 B0(h0 newAttributes) {
        m.e(newAttributes, "newAttributes");
        return new i(this.B.B0(newAttributes), this.C.B0(newAttributes));
    }

    @Override
    public final a0 C0() {
        return this.B;
    }

    @Override
    public final String D0(p20.h hVar, p20.h hVar2) throws IOException {
        a0 a0Var = this.B;
        String strX = hVar.X(a0Var);
        a0 a0Var2 = this.C;
        String strX2 = hVar.X(a0Var2);
        if (hVar2.a.n()) {
            return "raw (" + strX + ".." + strX2 + ')';
        }
        if (a0Var2.e0().isEmpty()) {
            return hVar.F(strX, strX2, ab.a0.c0(this));
        }
        ArrayList arrayListE0 = E0(hVar, a0Var);
        ArrayList arrayListE1 = E0(hVar, a0Var2);
        String strR0 = h00.q.R0(arrayListE0, ", ", null, null, h.A, 30);
        ArrayList arrayListT1 = h00.q.t1(arrayListE0, arrayListE1);
        if (!arrayListT1.isEmpty()) {
            Iterator it = arrayListT1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strX2 = F0(strX2, strR0);
                    break;
                }
                g00.k kVar = (g00.k) it.next();
                String str = (String) kVar.A;
                String str2 = (String) kVar.B;
                if (!m.a(str, k.R0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strX2 = F0(strX2, strR0);
            break;
        }
        String strF0 = F0(strX, strR0);
        return m.a(strF0, strX2) ? strF0 : hVar.F(strF0, strX2, ab.a0.c0(this));
    }

    @Override
    public final n N() {
        j10.h hVarG = m0().g();
        j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        if (eVar != null) {
            n nVarU0 = eVar.u0(new g());
            m.d(nVarU0, "getMemberScope(...)");
            return nVarU0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + m0().g()).toString());
    }

    @Override
    public final w A0(f30.f kotlinTypeRefiner) {
        m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        a0 type = this.B;
        m.e(type, "type");
        a0 type2 = this.C;
        m.e(type2, "type");
        return new i(type, type2);
    }

    @Override
    public final z0 z0(boolean z) {
        return new i(this.B.z0(z), this.C.z0(z));
    }
}
