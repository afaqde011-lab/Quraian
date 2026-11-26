package s7;

import androidx.media3.common.l2;
import com.google.protobuf.RuntimeVersion;
import fh.d2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

public final class i0 implements y, x {
    public final y[] A;
    public final boolean[] B;
    public final IdentityHashMap C;
    public final rc.d D;
    public final ArrayList E = new ArrayList();
    public final HashMap F = new HashMap();
    public x G;
    public l1 H;
    public y[] I;
    public l J;

    public i0(rc.d dVar, long[] jArr, y... yVarArr) {
        this.D = dVar;
        this.A = yVarArr;
        dVar.getClass();
        fh.r0 r0Var = fh.t0.B;
        d2 d2Var = d2.E;
        this.J = new l(d2Var, d2Var);
        this.C = new IdentityHashMap();
        this.I = new y[0];
        this.B = new boolean[yVarArr.length];
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            long j9 = jArr[i10];
            if (j9 != 0) {
                this.B[i10] = true;
                this.A[i10] = new k1(yVarArr[i10], j9);
            }
        }
    }

    @Override
    public final void a(y yVar) {
        ArrayList arrayList = this.E;
        arrayList.remove(yVar);
        if (arrayList.isEmpty()) {
            y[] yVarArr = this.A;
            int i10 = 0;
            for (y yVar2 : yVarArr) {
                i10 += yVar2.s().f13710a;
            }
            l2[] l2VarArr = new l2[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < yVarArr.length; i12++) {
                l1 l1VarS = yVarArr[i12].s();
                int i13 = l1VarS.f13710a;
                int i14 = 0;
                while (i14 < i13) {
                    l2 l2VarA = l1VarS.a(i14);
                    int i15 = l2VarA.f1338a;
                    androidx.media3.common.t[] tVarArr = new androidx.media3.common.t[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        androidx.media3.common.t tVar = l2VarA.f1341d[i16];
                        androidx.media3.common.s sVarA = tVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = tVar.f1583a;
                        if (str == null) {
                            str = RuntimeVersion.SUFFIX;
                        }
                        sb2.append(str);
                        sVarA.f1491a = sb2.toString();
                        tVarArr[i16] = new androidx.media3.common.t(sVarA);
                    }
                    l2 l2Var = new l2(i12 + ":" + l2VarA.f1339b, tVarArr);
                    this.F.put(l2Var, l2VarA);
                    l2VarArr[i11] = l2Var;
                    i14++;
                    i11++;
                }
            }
            this.H = new l1(l2VarArr);
            x xVar = this.G;
            xVar.getClass();
            xVar.a(this);
        }
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        y[] yVarArr = this.I;
        return (yVarArr.length > 0 ? yVarArr[0] : this.A[0]).c(j9, l1Var);
    }

    @Override
    public final void d(c1 c1Var) {
        x xVar = this.G;
        xVar.getClass();
        xVar.d(this);
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return this.J.e(m0Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((y) arrayList.get(i10)).e(m0Var);
        }
        return false;
    }

    @Override
    public final long g() {
        return this.J.g();
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[rVarArr.length];
        int[] iArr2 = new int[rVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.C;
            if (i11 >= length) {
                break;
            }
            a1 a1Var = a1VarArr[i11];
            Integer num = a1Var == null ? null : (Integer) identityHashMap.get(a1Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            v7.r rVar = rVarArr[i11];
            if (rVar != null) {
                String str = rVar.d().f1339b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        a1[] a1VarArr2 = new a1[length2];
        a1[] a1VarArr3 = new a1[rVarArr.length];
        v7.r[] rVarArr2 = new v7.r[rVarArr.length];
        y[] yVarArr = this.A;
        ArrayList arrayList = new ArrayList(yVarArr.length);
        long j10 = j9;
        int i12 = 0;
        while (i12 < yVarArr.length) {
            int i13 = i10;
            while (i13 < rVarArr.length) {
                a1VarArr3[i13] = iArr[i13] == i12 ? a1VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    v7.r rVar2 = rVarArr[i13];
                    rVar2.getClass();
                    l2 l2Var = (l2) this.F.get(rVar2.d());
                    l2Var.getClass();
                    rVarArr2[i13] = new h0(rVar2, l2Var);
                } else {
                    rVarArr2[i13] = null;
                }
                i13++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            y[] yVarArr2 = yVarArr;
            int i14 = i12;
            long jI = yVarArr2[i12].i(rVarArr2, zArr, a1VarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = jI;
            } else if (jI != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < rVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    a1 a1Var2 = a1VarArr3[i15];
                    a1Var2.getClass();
                    a1VarArr2[i15] = a1VarArr3[i15];
                    identityHashMap.put(a1Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr3[i15] == i14) {
                    ta.c0.A(a1VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(yVarArr2[i14]);
            }
            i12 = i14 + 1;
            yVarArr = yVarArr2;
            iArr = iArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(a1VarArr2, i16, a1VarArr, i16, length2);
        this.I = (y[]) arrayList.toArray(new y[i16]);
        AbstractList abstractListA = fh.w.A(new oj.l(6), arrayList);
        this.D.getClass();
        this.J = new l(arrayList, abstractListA);
        return j10;
    }

    @Override
    public final boolean isLoading() {
        return this.J.isLoading();
    }

    @Override
    public final void j() {
        for (y yVar : this.A) {
            yVar.j();
        }
    }

    @Override
    public final long k(long j9) {
        long jK = this.I[0].k(j9);
        int i10 = 1;
        while (true) {
            y[] yVarArr = this.I;
            if (i10 >= yVarArr.length) {
                return jK;
            }
            if (yVarArr[i10].k(jK) != jK) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override
    public final void m(x xVar, long j9) {
        this.G = xVar;
        ArrayList arrayList = this.E;
        y[] yVarArr = this.A;
        Collections.addAll(arrayList, yVarArr);
        for (y yVar : yVarArr) {
            yVar.m(this, j9);
        }
    }

    @Override
    public final void o(boolean z10, long j9) {
        for (y yVar : this.I) {
            yVar.o(z10, j9);
        }
    }

    @Override
    public final long p() {
        long j9 = -9223372036854775807L;
        for (y yVar : this.I) {
            long jP = yVar.p();
            if (jP == -9223372036854775807L) {
                if (j9 != -9223372036854775807L && yVar.k(j9) != j9) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j9 == -9223372036854775807L) {
                for (y yVar2 : this.I) {
                    if (yVar2 == yVar) {
                        break;
                    }
                    if (yVar2.k(jP) != jP) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j9 = jP;
            } else if (jP != j9) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j9;
    }

    @Override
    public final l1 s() {
        l1 l1Var = this.H;
        l1Var.getClass();
        return l1Var;
    }

    @Override
    public final long t() {
        return this.J.t();
    }

    @Override
    public final void v(long j9) {
        this.J.v(j9);
    }
}
