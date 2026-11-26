package androidx.media3.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class p2 {
    public boolean A;
    public fh.t0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;

    public int f1388e;

    public int f1389f;

    public int f1390g;

    public int f1391h;
    public fh.t0 m;

    public fh.t0 f1395n;

    public fh.t0 f1396o;

    public int f1397p;

    public fh.t0 f1398q;

    public fh.t0 f1399r;

    public int f1400s;

    public int f1401t;

    public int f1402u;

    public fh.t0 f1403v;

    public o2 f1404w;

    public boolean f1405x;

    public fh.t0 f1406y;

    public int f1407z;

    public int f1384a = Integer.MAX_VALUE;

    public int f1385b = Integer.MAX_VALUE;

    public int f1386c = Integer.MAX_VALUE;

    public int f1387d = Integer.MAX_VALUE;

    public int f1392i = Integer.MAX_VALUE;

    public int f1393j = Integer.MAX_VALUE;

    public boolean f1394k = true;
    public boolean l = true;

    public p2() {
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        this.m = d2Var;
        this.f1395n = d2Var;
        this.f1396o = d2Var;
        this.f1397p = 0;
        this.f1398q = d2Var;
        this.f1399r = d2Var;
        this.f1400s = 0;
        this.f1401t = Integer.MAX_VALUE;
        this.f1402u = Integer.MAX_VALUE;
        this.f1403v = d2Var;
        this.f1404w = o2.f1365d;
        this.f1405x = false;
        this.f1406y = d2Var;
        this.f1407z = 0;
        this.A = true;
        this.B = d2Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static fh.d2 f(String[] strArr) {
        fh.q0 q0VarM = fh.t0.m();
        for (String str : strArr) {
            str.getClass();
            q0VarM.c(e7.i0.I(str));
        }
        return q0VarM.g();
    }

    public void a(m2 m2Var) {
        this.H.put(m2Var.f1353a, m2Var);
    }

    public q2 b() {
        return new q2(this);
    }

    public p2 c() {
        this.H.clear();
        return this;
    }

    public p2 d(int i10) {
        Iterator it = this.H.values().iterator();
        while (it.hasNext()) {
            if (((m2) it.next()).f1353a.f1340c == i10) {
                it.remove();
            }
        }
        return this;
    }

    public final void e(q2 q2Var) {
        this.f1384a = q2Var.f1441a;
        this.f1385b = q2Var.f1442b;
        this.f1386c = q2Var.f1443c;
        this.f1387d = q2Var.f1444d;
        this.f1388e = q2Var.f1445e;
        this.f1389f = q2Var.f1446f;
        this.f1390g = q2Var.f1447g;
        this.f1391h = q2Var.f1448h;
        this.f1392i = q2Var.f1449i;
        this.f1393j = q2Var.f1450j;
        this.f1394k = q2Var.f1451k;
        this.l = q2Var.l;
        this.f1395n = q2Var.f1452n;
        this.m = q2Var.m;
        this.f1396o = q2Var.f1453o;
        this.f1397p = q2Var.f1454p;
        this.f1398q = q2Var.f1455q;
        this.f1400s = q2Var.f1457s;
        this.f1399r = q2Var.f1456r;
        this.f1401t = q2Var.f1458t;
        this.f1402u = q2Var.f1459u;
        this.f1403v = q2Var.f1460v;
        this.f1404w = q2Var.f1461w;
        this.f1405x = q2Var.f1462x;
        this.f1406y = q2Var.f1463y;
        this.f1407z = q2Var.A;
        this.A = q2Var.B;
        this.B = q2Var.f1464z;
        this.C = q2Var.C;
        this.D = q2Var.D;
        this.E = q2Var.E;
        this.F = q2Var.F;
        this.G = q2Var.G;
        this.I = new HashSet(q2Var.I);
        this.H = new HashMap(q2Var.H);
    }

    public p2 g() {
        this.C = -3;
        return this;
    }

    public p2 h(m2 m2Var) {
        l2 l2Var = m2Var.f1353a;
        d(l2Var.f1340c);
        this.H.put(l2Var, m2Var);
        return this;
    }

    public p2 i() {
        return j(new String[0]);
    }

    public p2 j(String... strArr) {
        this.f1406y = f(strArr);
        this.A = false;
        return this;
    }

    public p2 k() {
        this.f1407z = 0;
        this.A = false;
        return this;
    }

    public p2 l(int i10, boolean z10) {
        if (z10) {
            this.I.add(Integer.valueOf(i10));
            return this;
        }
        this.I.remove(Integer.valueOf(i10));
        return this;
    }
}
