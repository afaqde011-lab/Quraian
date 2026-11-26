package m3;

import java.util.ArrayList;
import java.util.List;
import s10.w0;

public final class h implements CharSequence {
    public final List A;
    public final String B;
    public final ArrayList C;
    public final ArrayList D;

    static {
        w0 w0Var = g0.f10427a;
    }

    public h(String str) {
        this(str, (List) h00.x.A);
    }

    public h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    public h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.A = list;
        this.B = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) list.get(i10);
                Object obj = fVar.f10423a;
                if (obj instanceof i0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(fVar);
                } else if (obj instanceof v) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(fVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.C = arrayList;
        this.D = arrayList2;
        List listI1 = arrayList2 != null ? h00.q.i1(arrayList2, new g(0)) : null;
        if (listI1 == null || listI1.isEmpty()) {
            return;
        }
        int i11 = ((f) h00.q.L0(listI1)).f10425c;
        u.v vVar = u.k.f14870a;
        u.v vVar2 = new u.v(1);
        vVar2.a(i11);
        int size2 = listI1.size();
        for (int i12 = 1; i12 < size2; i12++) {
            f fVar2 = (f) listI1.get(i12);
            while (vVar2.f14904b != 0) {
                int iD = vVar2.d();
                int i13 = fVar2.f10424b;
                int i14 = fVar2.f10425c;
                if (i13 < iD) {
                    if (i14 > iD) {
                        s3.a.a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                vVar2.e(vVar2.f14904b - 1);
            }
            vVar2.a(fVar2.f10425c);
        }
    }

    public final List a(int i10) {
        List list = this.A;
        if (list == null) {
            return h00.x.A;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            f fVar = (f) obj;
            if ((fVar.f10423a instanceof o) && i.b(0, i10, fVar.f10424b, fVar.f10425c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final h b(u00.k kVar) {
        e eVar = new e(this);
        ArrayList arrayList = eVar.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) kVar.invoke(((d) arrayList.get(i10)).a(Integer.MIN_VALUE));
            arrayList.set(i10, new d(fVar.f10424b, fVar.f10425c, fVar.f10423a, fVar.f10426d));
        }
        return eVar.f();
    }

    @Override
    public final h subSequence(int i10, int i11) {
        ArrayList arrayList;
        if (!(i10 <= i11)) {
            s3.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        String str = this.B;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        h hVar = i.f10456a;
        if (i10 > i11) {
            s3.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        List list = this.A;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                f fVar = (f) list.get(i12);
                int i13 = fVar.f10424b;
                int i14 = fVar.f10425c;
                if (i.b(i10, i11, i13, i14)) {
                    arrayList.add(new f(Math.max(i10, fVar.f10424b) - i10, Math.min(i11, i14) - i10, fVar.f10423a, fVar.f10426d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new h(arrayList, strSubstring);
    }

    @Override
    public final char charAt(int i10) {
        return this.B.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.B, hVar.B) && kotlin.jvm.internal.m.a(this.A, hVar.A);
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        List list = this.A;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override
    public final int length() {
        return this.B.length();
    }

    @Override
    public final String toString() {
        return this.B;
    }
}
