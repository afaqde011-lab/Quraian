package h4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class m {

    public static int f6592f;

    public ArrayList f6593a;

    public int f6594b;

    public int f6595c;

    public ArrayList f6596d;

    public int f6597e;

    public final void a(ArrayList arrayList) {
        int size = this.f6593a.size();
        if (this.f6597e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m mVar = (m) arrayList.get(i10);
                if (this.f6597e == mVar.f6594b) {
                    c(this.f6595c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(e4.c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f6593a;
        if (arrayList.size() == 0) {
            return 0;
        }
        g4.f fVar = (g4.f) ((g4.e) arrayList.get(0)).S;
        cVar.t();
        fVar.b(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((g4.e) arrayList.get(i11)).b(cVar, false);
        }
        if (i10 == 0 && fVar.f6171y0 > 0) {
            g4.k.a(fVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f6172z0 > 0) {
            g4.k.a(fVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f6596d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g4.e eVar = (g4.e) arrayList.get(i12);
            gj.e eVar2 = new gj.e(14);
            new WeakReference(eVar);
            e4.c.n(eVar.H);
            e4.c.n(eVar.I);
            e4.c.n(eVar.J);
            e4.c.n(eVar.K);
            e4.c.n(eVar.L);
            this.f6596d.add(eVar2);
        }
        if (i10 == 0) {
            iN = e4.c.n(fVar.H);
            iN2 = e4.c.n(fVar.J);
            cVar.t();
        } else {
            iN = e4.c.n(fVar.I);
            iN2 = e4.c.n(fVar.K);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, m mVar) {
        int i11 = mVar.f6594b;
        for (g4.e eVar : this.f6593a) {
            ArrayList arrayList = mVar.f6593a;
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            if (i10 == 0) {
                eVar.f6146m0 = i11;
            } else {
                eVar.f6148n0 = i11;
            }
        }
        this.f6597e = i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f6595c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else {
            str = i10 == 2 ? "Both" : "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String strG = g4.c.g(this.f6594b, "] <", sb2);
        Iterator it = this.f6593a.iterator();
        while (it.hasNext()) {
            strG = strG + " " + ((g4.e) it.next()).f6136g0;
        }
        return w.c.j(strG, " >");
    }
}
