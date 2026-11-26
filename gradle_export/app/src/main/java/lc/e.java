package lc;

import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.List;
import java.util.Locale;
import oj.q;

public final class e {

    public final List f10239a;

    public final cc.a f10240b;

    public final String f10241c;

    public final long f10242d;

    public final int f10243e;

    public final long f10244f;

    public final String f10245g;

    public final List f10246h;

    public final jc.d f10247i;

    public final int f10248j;

    public final int f10249k;
    public final int l;
    public final float m;

    public final float f10250n;

    public final float f10251o;

    public final float f10252p;

    public final jc.a f10253q;

    public final q f10254r;

    public final jc.b f10255s;

    public final List f10256t;

    public final int f10257u;

    public final boolean f10258v;

    public final hf.c f10259w;

    public final ce.c f10260x;

    public e(List list, cc.a aVar, String str, long j9, int i10, long j10, String str2, List list2, jc.d dVar, int i11, int i12, int i13, float f3, float f10, float f11, float f12, jc.a aVar2, q qVar, List list3, int i14, jc.b bVar, boolean z10, hf.c cVar, ce.c cVar2) {
        this.f10239a = list;
        this.f10240b = aVar;
        this.f10241c = str;
        this.f10242d = j9;
        this.f10243e = i10;
        this.f10244f = j10;
        this.f10245g = str2;
        this.f10246h = list2;
        this.f10247i = dVar;
        this.f10248j = i11;
        this.f10249k = i12;
        this.l = i13;
        this.m = f3;
        this.f10250n = f10;
        this.f10251o = f11;
        this.f10252p = f12;
        this.f10253q = aVar2;
        this.f10254r = qVar;
        this.f10256t = list3;
        this.f10257u = i14;
        this.f10255s = bVar;
        this.f10258v = z10;
        this.f10259w = cVar;
        this.f10260x = cVar2;
    }

    public final String a(String str) {
        int i10;
        StringBuilder sbQ = x5.q(str);
        sbQ.append(this.f10241c);
        sbQ.append("\n");
        long j9 = this.f10244f;
        cc.a aVar = this.f10240b;
        e eVar = (e) aVar.f3112g.b(j9);
        if (eVar != null) {
            sbQ.append("\t\tParents: ");
            sbQ.append(eVar.f10241c);
            for (e eVar2 = (e) aVar.f3112g.b(eVar.f10244f); eVar2 != null; eVar2 = (e) aVar.f3112g.b(eVar2.f10244f)) {
                sbQ.append("->");
                sbQ.append(eVar2.f10241c);
            }
            sbQ.append(str);
            sbQ.append("\n");
        }
        List list = this.f10246h;
        if (!list.isEmpty()) {
            sbQ.append(str);
            sbQ.append("\tMasks: ");
            sbQ.append(list.size());
            sbQ.append("\n");
        }
        int i11 = this.f10248j;
        if (i11 != 0 && (i10 = this.f10249k) != 0) {
            sbQ.append(str);
            sbQ.append("\tBackground: ");
            sbQ.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.l)));
        }
        List list2 = this.f10239a;
        if (!list2.isEmpty()) {
            sbQ.append(str);
            sbQ.append("\tShapes:\n");
            for (Object obj : list2) {
                sbQ.append(str);
                sbQ.append("\t\t");
                sbQ.append(obj);
                sbQ.append("\n");
            }
        }
        return sbQ.toString();
    }

    public final String toString() {
        return a(RuntimeVersion.SUFFIX);
    }
}
