package q0;

public abstract class j2 {

    public static final bg.b f12662a = new bg.b(r3.o.f13083a, 0, 0);

    public static final r3.c0 a(r3.e0 e0Var, m3.h hVar) {
        r3.c0 c0VarD = e0Var.d(hVar);
        int length = hVar.B.length();
        m3.h hVar2 = c0VarD.f13065a;
        r3.p pVar = c0VarD.f13066b;
        int length2 = hVar2.B.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            b(pVar.z(i10), length2, i10);
        }
        b(pVar.z(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            c(pVar.k(i11), length, i11);
        }
        c(pVar.k(length2), length, length2);
        return new r3.c0(hVar2, new bg.b(pVar, hVar.B.length(), hVar2.B.length()));
    }

    public static final void b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbP = oi.k.p(i12, i10, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbP.append(i11);
        sbP.append(']');
        g0.a.c(sbP.toString());
    }

    public static final void c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbP = oi.k.p(i12, i10, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbP.append(i11);
        sbP.append(']');
        g0.a.c(sbP.toString());
    }
}
