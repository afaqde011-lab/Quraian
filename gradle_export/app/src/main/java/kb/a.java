package kb;

import b6.o;
import bi.b;
import g4.c;
import h00.q;
import hb.g;
import hb.h;
import hb.i;
import hb.k;
import hb.p;
import hb.u;
import hb.z;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import za.v;

public abstract class a {

    public static final String f9581a;

    static {
        String strF = v.f("DiagnosticsWrkr");
        m.d(strF, "tagWithPrefix(...)");
        f9581a = strF;
    }

    public static final String a(k kVar, z zVar, h hVar, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            i iVarC = b.C(pVar);
            String str = pVar.f7004a;
            g gVarA = hVar.a(iVarC);
            Integer numValueOf = gVarA != null ? Integer.valueOf(gVarA.f6973c) : null;
            kVar.getClass();
            m.e(str, "workSpecId");
            String strR0 = q.R0((List) rd.a.M(kVar.f6980a, true, false, new o(str, 23)), ",", (String) null, (String) null, (u00.k) null, 62);
            zVar.getClass();
            String strR1 = q.R0((List) rd.a.M(zVar.f7033a, true, false, new u(str, 6)), ",", (String) null, (String) null, (u00.k) null, 62);
            StringBuilder sbN = c.n("\n", str, "\t ");
            sbN.append(pVar.f7006c);
            sbN.append("\t ");
            sbN.append(numValueOf);
            sbN.append("\t ");
            sbN.append(pVar.f7005b.name());
            sbN.append("\t ");
            sbN.append(strR0);
            sbN.append("\t ");
            sbN.append(strR1);
            sbN.append('\t');
            sb2.append(sbN.toString());
        }
        return sb2.toString();
    }
}
