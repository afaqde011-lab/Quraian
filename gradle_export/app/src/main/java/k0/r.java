package k0;

import java.util.List;

public final class r {

    public final int f8529a;

    public final q[] f8530b;

    public final h7.b f8531c;

    public final List f8532d;

    public final int f8533e;

    public final int f8534f;

    public final int f8535g;

    public r(int i10, q[] qVarArr, h7.b bVar, List list, int i11) {
        this.f8529a = i10;
        this.f8530b = qVarArr;
        this.f8531c = bVar;
        this.f8532d = list;
        this.f8533e = i11;
        int iMax = 0;
        for (q qVar : qVarArr) {
            iMax = Math.max(iMax, qVar.f8519n);
        }
        this.f8534f = iMax;
        int i12 = iMax + this.f8533e;
        this.f8535g = i12 >= 0 ? i12 : 0;
    }

    public final q[] a(int i10, int i11, int i12) {
        q[] qVarArr = this.f8530b;
        int length = qVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            q qVar = qVarArr[i13];
            int i16 = i14 + 1;
            int i17 = (int) ((d) this.f8532d.get(i14)).f8459a;
            qVar.m(i10, ((int[]) this.f8531c.B)[i15], i11, i12, this.f8529a, i15);
            i15 += i17;
            i13++;
            i14 = i16;
        }
        return qVarArr;
    }
}
