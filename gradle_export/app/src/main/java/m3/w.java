package m3;

public abstract class w {

    public static final long f10546a;

    public static final int f10547b = 0;

    static {
        y3.p[] pVarArr = y3.o.f16598b;
        f10546a = y3.o.f16599c;
    }

    public static final v a(v vVar, int i10, int i11, long j9, x3.q qVar, x xVar, x3.i iVar, int i12, int i13, x3.s sVar) {
        long j10;
        int i14 = i10;
        int i15 = i11;
        long j11 = j9;
        x3.q qVar2 = qVar;
        x xVar2 = xVar;
        x3.i iVar2 = iVar;
        int i16 = i12;
        int i17 = i13;
        x3.s sVar2 = sVar;
        if (i14 == 0 || i14 == vVar.f10537a) {
            y3.p[] pVarArr = y3.o.f16598b;
            if ((j11 & 1095216660480L) == 0) {
                j10 = 0;
            } else {
                j10 = 0;
                if (y3.o.a(j11, vVar.f10539c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(vVar.f10540d)) && ((i15 == 0 || i15 == vVar.f10538b) && ((xVar2 == null || xVar2.equals(vVar.f10541e)) && ((iVar2 == null || iVar2.equals(vVar.f10542f)) && ((i16 == 0 || i16 == vVar.f10543g) && ((i17 == 0 || i17 == vVar.f10544h) && (sVar2 == null || sVar2.equals(vVar.f10545i)))))))) {
                return vVar;
            }
        } else {
            j10 = 0;
        }
        y3.p[] pVarArr2 = y3.o.f16598b;
        if ((j11 & 1095216660480L) == j10) {
            j11 = vVar.f10539c;
        }
        if (qVar2 == null) {
            qVar2 = vVar.f10540d;
        }
        if (i14 == 0) {
            i14 = vVar.f10537a;
        }
        if (i15 == 0) {
            i15 = vVar.f10538b;
        }
        x xVar3 = vVar.f10541e;
        if (xVar3 != null && xVar2 == null) {
            xVar2 = xVar3;
        }
        if (iVar2 == null) {
            iVar2 = vVar.f10542f;
        }
        if (i16 == 0) {
            i16 = vVar.f10543g;
        }
        if (i17 == 0) {
            i17 = vVar.f10544h;
        }
        if (sVar2 == null) {
            sVar2 = vVar.f10545i;
        }
        return new v(i14, i15, j11, qVar2, xVar2, iVar2, i16, i17, sVar2);
    }
}
