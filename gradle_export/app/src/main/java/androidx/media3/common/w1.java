package androidx.media3.common;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;

public final class w1 extends k2 {

    public final fh.t0 f1665a;

    public final int[] f1666b;

    public final int[] f1667c;

    public final HashMap f1668d;

    public w1(List list) {
        int size = list.size();
        this.f1665a = fh.t0.o(list);
        this.f1666b = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size2 = 1;
            if (i10 >= size) {
                break;
            }
            s1 s1Var = (s1) list.get(i10);
            this.f1666b[i10] = i11;
            if (!s1Var.f1552p.isEmpty()) {
                size2 = s1Var.f1552p.size();
            }
            i11 += size2;
            i10++;
        }
        this.f1667c = new int[i11];
        this.f1668d = new HashMap();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            s1 s1Var2 = (s1) list.get(i13);
            int i14 = 0;
            while (true) {
                if (i14 < (s1Var2.f1552p.isEmpty() ? 1 : s1Var2.f1552p.size())) {
                    this.f1668d.put(s1.a(s1Var2, i14), Integer.valueOf(i12));
                    this.f1667c[i12] = i13;
                    i12++;
                    i14++;
                }
            }
        }
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        Integer num = (Integer) this.f1668d.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        int i11 = this.f1667c[i10];
        int i12 = i10 - this.f1666b[i11];
        s1 s1Var = (s1) this.f1665a.get(i11);
        fh.t0 t0Var = s1Var.f1552p;
        if (t0Var.isEmpty()) {
            Object obj = s1Var.f1539a;
            long j9 = s1Var.f1550n;
            h2Var.j(obj, obj, i11, s1Var.m + j9, -j9, c.f1128f, s1Var.f1551o);
            return h2Var;
        }
        u1 u1Var = (u1) t0Var.get(i12);
        Object obj2 = u1Var.f1656a;
        h2Var.j(obj2, Pair.create(s1Var.f1539a, obj2), i11, u1Var.f1657b, s1Var.f1553q[i12], u1Var.f1658c, u1Var.f1659d);
        return h2Var;
    }

    @Override
    public final h2 getPeriodByUid(Object obj, h2 h2Var) {
        Integer num = (Integer) this.f1668d.get(obj);
        num.getClass();
        getPeriod(num.intValue(), h2Var, true);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return this.f1667c.length;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        int i11 = this.f1667c[i10];
        return s1.a((s1) this.f1665a.get(i11), i10 - this.f1666b[i11]);
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        s1 s1Var = (s1) this.f1665a.get(i10);
        int i11 = this.f1666b[i10];
        fh.t0 t0Var = s1Var.f1552p;
        j2Var.b(s1Var.f1539a, s1Var.f1541c, s1Var.f1543e, s1Var.f1545g, s1Var.f1546h, s1Var.f1547i, s1Var.f1548j, s1Var.f1549k, s1Var.f1544f, s1Var.l, s1Var.m, i11, (i11 + (t0Var.isEmpty() ? 1 : t0Var.size())) - 1, s1Var.f1550n);
        j2Var.f1293k = s1Var.f1551o;
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return this.f1665a.size();
    }
}
