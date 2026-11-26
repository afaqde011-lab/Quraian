package s7;

import androidx.media3.common.k2;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import fh.d2;
import fh.u1;
import fh.v1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class k0 extends j {

    public static final androidx.media3.common.q0 f13701s;

    public final a[] f13702k;
    public final ArrayList l;
    public final k2[] m;

    public final ArrayList f13703n;

    public final rc.d f13704o;

    public int f13705p;

    public long[][] f13706q;

    public MergingMediaSource$IllegalMergeException f13707r;

    static {
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        fh.r0 r0Var = fh.t0.B;
        d2 d2Var = d2.E;
        List list = Collections.EMPTY_LIST;
        d2 d2Var2 = d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        f13701s = new androidx.media3.common.q0("MergingMediaSource", new androidx.media3.common.g0(e0Var), null, new androidx.media3.common.k0(j0Var), androidx.media3.common.t0.K, androidx.media3.common.m0.f1344d);
    }

    public k0(a... aVarArr) {
        rc.d dVar = new rc.d(1);
        this.f13702k = aVarArr;
        this.f13704o = dVar;
        this.f13703n = new ArrayList(Arrays.asList(aVarArr));
        this.f13705p = -1;
        this.l = new ArrayList(aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            this.l.add(new ArrayList());
        }
        this.m = new k2[aVarArr.length];
        this.f13706q = new long[0][];
        new HashMap();
        fh.w.g(8, "expectedKeys");
        fh.w.g(2, "expectedValuesPerKey");
        new v1(fh.a0.c(8)).G = new u1();
    }

    @Override
    public final boolean a(androidx.media3.common.q0 q0Var) {
        a[] aVarArr = this.f13702k;
        return aVarArr.length > 0 && aVarArr[0].a(q0Var);
    }

    @Override
    public final y b(a0 a0Var, a1.i iVar, long j9) {
        a[] aVarArr = this.f13702k;
        int length = aVarArr.length;
        y[] yVarArr = new y[length];
        k2[] k2VarArr = this.m;
        int indexOfPeriod = k2VarArr[0].getIndexOfPeriod(a0Var.f13644a);
        for (int i10 = 0; i10 < length; i10++) {
            a0 a0VarA = a0Var.a(k2VarArr[i10].getUidOfPeriod(indexOfPeriod));
            yVarArr[i10] = aVarArr[i10].b(a0VarA, iVar, j9 - this.f13706q[indexOfPeriod][i10]);
            ((List) this.l.get(i10)).add(new j0(a0VarA, yVarArr[i10]));
        }
        return new i0(this.f13704o, this.f13706q[indexOfPeriod], yVarArr);
    }

    @Override
    public final androidx.media3.common.q0 h() {
        a[] aVarArr = this.f13702k;
        return aVarArr.length > 0 ? aVarArr[0].h() : f13701s;
    }

    @Override
    public final void j() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f13707r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.j();
    }

    @Override
    public final void l(g7.s sVar) {
        this.f13698j = sVar;
        this.f13697i = e7.i0.l(null);
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f13702k;
            if (i10 >= aVarArr.length) {
                return;
            }
            x(Integer.valueOf(i10), aVarArr[i10]);
            i10++;
        }
    }

    @Override
    public final void n(y yVar) {
        i0 i0Var = (i0) yVar;
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f13702k;
            if (i10 >= aVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i10);
            y[] yVarArr = i0Var.A;
            boolean[] zArr = i0Var.B;
            y yVar2 = zArr[i10] ? ((k1) yVarArr[i10]).A : yVarArr[i10];
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((j0) list.get(i11)).f13700b.equals(yVar2)) {
                    list.remove(i11);
                    break;
                }
            }
            a aVar = aVarArr[i10];
            y[] yVarArr2 = i0Var.A;
            aVar.n(zArr[i10] ? ((k1) yVarArr2[i10]).A : yVarArr2[i10]);
            i10++;
        }
    }

    @Override
    public final void p() {
        super.p();
        Arrays.fill(this.m, (Object) null);
        this.f13705p = -1;
        this.f13707r = null;
        ArrayList arrayList = this.f13703n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f13702k);
    }

    @Override
    public final void s(androidx.media3.common.q0 q0Var) {
        this.f13702k[0].s(q0Var);
    }

    @Override
    public final a0 t(Object obj, a0 a0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((j0) list.get(i10)).f13699a.equals(a0Var)) {
                return ((j0) ((List) arrayList.get(0)).get(i10)).f13699a;
            }
        }
        return null;
    }

    @Override
    public final void w(Object obj, a aVar, k2 k2Var) {
        Integer num = (Integer) obj;
        if (this.f13707r != null) {
            return;
        }
        if (this.f13705p == -1) {
            this.f13705p = k2Var.getPeriodCount();
        } else if (k2Var.getPeriodCount() != this.f13705p) {
            this.f13707r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f13706q.length;
        k2[] k2VarArr = this.m;
        if (length == 0) {
            this.f13706q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f13705p, k2VarArr.length);
        }
        ArrayList arrayList = this.f13703n;
        arrayList.remove(aVar);
        k2VarArr[num.intValue()] = k2Var;
        if (arrayList.isEmpty()) {
            m(k2VarArr[0]);
        }
    }
}
