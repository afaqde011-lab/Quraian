package m0;

import d0.q1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import z2.l1;

public final class f {

    public final int f10321a;

    public final List f10322b;

    public final long f10323c;

    public final Object f10324d;

    public final b2.h f10325e;

    public final y3.m f10326f;

    public final boolean f10327g;

    public final int f10328h;

    public final int[] f10329i;

    public int f10330j;

    public int f10331k;

    public f(int i10, int i11, List list, long j9, Object obj, b2.h hVar, y3.m mVar) {
        q1 q1Var = q1.A;
        this.f10321a = i10;
        this.f10322b = list;
        this.f10323c = j9;
        this.f10324d = obj;
        this.f10325e = hVar;
        this.f10326f = mVar;
        q1 q1Var2 = q1.A;
        this.f10327g = false;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            l1 l1Var = (l1) list.get(i12);
            iMax = Math.max(iMax, !this.f10327g ? l1Var.B : l1Var.A);
        }
        this.f10328h = iMax;
        this.f10329i = new int[this.f10322b.size() * 2];
        this.f10331k = Integer.MIN_VALUE;
    }

    public final void a(int i10) {
        this.f10330j += i10;
        int[] iArr = this.f10329i;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f10327g;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final void b(int i10, int i11, int i12) throws KotlinNothingValueException {
        int i13;
        this.f10330j = i10;
        boolean z10 = this.f10327g;
        this.f10331k = z10 ? i12 : i11;
        List list = this.f10322b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            l1 l1Var = (l1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f10329i;
            if (z10) {
                iArr[i15] = Math.round((1 + (this.f10326f != y3.m.A ? 0.0f * (-1) : 0.0f)) * ((i11 - l1Var.A) / 2.0f));
                iArr[i15 + 1] = i10;
                i13 = l1Var.B;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                b2.h hVar = this.f10325e;
                if (hVar == null) {
                    throw g4.c.o("null verticalAlignment");
                }
                iArr[i16] = hVar.a(l1Var.B, i12);
                i13 = l1Var.A;
            }
            i10 += i13;
        }
    }
}
