package tf;

import com.google.android.gms.internal.measurement.r7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public final class h4 {

    public final String f14630a;

    public final boolean f14631b;

    public final com.google.android.gms.internal.measurement.l3 f14632c;

    public final BitSet f14633d;

    public final BitSet f14634e;

    public final u.e f14635f;

    public final u.e f14636g;

    public final c f14637h;

    public h4(c cVar, String str) {
        this.f14637h = cVar;
        this.f14630a = str;
        this.f14631b = true;
        this.f14633d = new BitSet();
        this.f14634e = new BitSet();
        this.f14635f = new u.e(0);
        this.f14636g = new u.e(0);
    }

    public h4(c cVar, String str, com.google.android.gms.internal.measurement.l3 l3Var, BitSet bitSet, BitSet bitSet2, u.e eVar, u.e eVar2) {
        this.f14637h = cVar;
        this.f14630a = str;
        this.f14633d = bitSet;
        this.f14634e = bitSet2;
        this.f14635f = eVar;
        this.f14636g = new u.e(0);
        for (Integer num : (u.b) eVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f14636g.put(num, arrayList);
        }
        this.f14631b = false;
        this.f14632c = l3Var;
    }

    public final void a(b bVar) {
        int iQ;
        boolean z10;
        boolean zV;
        switch (bVar.f14542g) {
            case 0:
                iQ = ((com.google.android.gms.internal.measurement.n1) bVar.f14544i).q();
                break;
            default:
                iQ = ((com.google.android.gms.internal.measurement.u1) bVar.f14544i).q();
                break;
        }
        if (bVar.f14538c != null) {
            this.f14634e.set(iQ, true);
        }
        Boolean bool = bVar.f14539d;
        if (bool != null) {
            this.f14633d.set(iQ, bool.booleanValue());
        }
        if (bVar.f14540e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            u.e eVar = this.f14635f;
            Long l = (Long) eVar.get(numValueOf);
            long jLongValue = bVar.f14540e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                eVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (bVar.f14541f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            u.e eVar2 = this.f14636g;
            List arrayList = (List) eVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                eVar2.put(numValueOf2, arrayList);
            }
            switch (bVar.f14542g) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                arrayList.clear();
            }
            r7.a();
            h1 h1Var = (h1) this.f14637h.B;
            g gVar = h1Var.D;
            a0 a0Var = b0.F0;
            String str = this.f14630a;
            if (gVar.f1(str, a0Var)) {
                switch (bVar.f14542g) {
                    case 0:
                        zV = ((com.google.android.gms.internal.measurement.n1) bVar.f14544i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            r7.a();
            if (!h1Var.D.f1(str, a0Var)) {
                arrayList.add(Long.valueOf(bVar.f14541f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(bVar.f14541f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.s2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.r2 r2VarW = com.google.android.gms.internal.measurement.s2.w();
        r2VarW.b();
        ((com.google.android.gms.internal.measurement.s2) r2VarW.B).x(i10);
        r2VarW.b();
        ((com.google.android.gms.internal.measurement.s2) r2VarW.B).A(this.f14631b);
        com.google.android.gms.internal.measurement.l3 l3Var = this.f14632c;
        if (l3Var != null) {
            r2VarW.b();
            ((com.google.android.gms.internal.measurement.s2) r2VarW.B).z(l3Var);
        }
        com.google.android.gms.internal.measurement.k3 k3VarX = com.google.android.gms.internal.measurement.l3.x();
        ArrayList arrayListD1 = t0.D1(this.f14633d);
        k3VarX.b();
        ((com.google.android.gms.internal.measurement.l3) k3VarX.B).B(arrayListD1);
        ArrayList arrayListD2 = t0.D1(this.f14634e);
        k3VarX.b();
        ((com.google.android.gms.internal.measurement.l3) k3VarX.B).z(arrayListD2);
        u.e eVar = this.f14635f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.C);
            for (Integer num : (u.b) eVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) eVar.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.x2 x2VarT = com.google.android.gms.internal.measurement.y2.t();
                    x2VarT.b();
                    ((com.google.android.gms.internal.measurement.y2) x2VarT.B).u(iIntValue);
                    long jLongValue = l.longValue();
                    x2VarT.b();
                    ((com.google.android.gms.internal.measurement.y2) x2VarT.B).v(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.y2) x2VarT.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            k3VarX.b();
            ((com.google.android.gms.internal.measurement.l3) k3VarX.B).D(arrayList);
        }
        u.e eVar2 = this.f14636g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.C);
            for (Integer num2 : (u.b) eVar2.keySet()) {
                com.google.android.gms.internal.measurement.m3 m3VarU = com.google.android.gms.internal.measurement.n3.u();
                int iIntValue2 = num2.intValue();
                m3VarU.b();
                ((com.google.android.gms.internal.measurement.n3) m3VarU.B).v(iIntValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m3VarU.b();
                    ((com.google.android.gms.internal.measurement.n3) m3VarU.B).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.n3) m3VarU.e());
            }
            list = arrayList3;
        }
        k3VarX.b();
        ((com.google.android.gms.internal.measurement.l3) k3VarX.B).F(list);
        r2VarW.b();
        ((com.google.android.gms.internal.measurement.s2) r2VarW.B).y((com.google.android.gms.internal.measurement.l3) k3VarX.e());
        return (com.google.android.gms.internal.measurement.s2) r2VarW.e();
    }
}
