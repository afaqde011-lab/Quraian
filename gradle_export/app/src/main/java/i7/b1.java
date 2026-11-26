package i7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import androidx.media3.common.k2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b1 {

    public boolean f7223a;

    public final Object f7224b;

    public final Object f7225c;

    public final Object f7226d;

    public final Object f7227e;

    public final Object f7228f;

    public final Object f7229g;

    public final Object f7230h;

    public final Object f7231i;

    public final Object f7232j;

    public Object f7233k;
    public Object l;

    public b1() {
        this.f7224b = new sg.u[4];
        this.f7225c = new Matrix[4];
        this.f7226d = new Matrix[4];
        this.f7227e = new PointF();
        this.f7228f = new Path();
        this.f7229g = new Path();
        this.f7230h = new sg.u();
        this.f7231i = new float[2];
        this.f7232j = new float[2];
        this.f7233k = new Path();
        this.l = new Path();
        this.f7223a = true;
        for (int i10 = 0; i10 < 4; i10++) {
            ((sg.u[]) this.f7224b)[i10] = new sg.u();
            ((Matrix[]) this.f7225c)[i10] = new Matrix();
            ((Matrix[]) this.f7226d)[i10] = new Matrix();
        }
    }

    public b1(i0 i0Var, j7.f fVar, e7.d0 d0Var, j7.j jVar) {
        this.f7224b = jVar;
        this.f7229g = i0Var;
        this.f7233k = new s7.d1();
        this.f7226d = new IdentityHashMap();
        this.f7227e = new HashMap();
        this.f7225c = new ArrayList();
        this.f7231i = fVar;
        this.f7232j = d0Var;
        this.f7228f = new HashMap();
        this.f7230h = new HashSet();
    }

    public k2 a(int i10, ArrayList arrayList, s7.d1 d1Var) {
        ArrayList arrayList2 = (ArrayList) this.f7225c;
        if (!arrayList.isEmpty()) {
            this.f7233k = d1Var;
            for (int i11 = i10; i11 < arrayList.size() + i10; i11++) {
                a1 a1Var = (a1) arrayList.get(i11 - i10);
                if (i11 > 0) {
                    a1 a1Var2 = (a1) arrayList2.get(i11 - 1);
                    a1Var.f7219d = a1Var2.f7216a.f13766o.f13728a.getWindowCount() + a1Var2.f7219d;
                    a1Var.f7220e = false;
                    a1Var.f7218c.clear();
                } else {
                    a1Var.f7219d = 0;
                    a1Var.f7220e = false;
                    a1Var.f7218c.clear();
                }
                int windowCount = a1Var.f7216a.f13766o.f13728a.getWindowCount();
                for (int i12 = i11; i12 < arrayList2.size(); i12++) {
                    ((a1) arrayList2.get(i12)).f7219d += windowCount;
                }
                arrayList2.add(i11, a1Var);
                ((HashMap) this.f7227e).put(a1Var.f7217b, a1Var);
                if (this.f7223a) {
                    g(a1Var);
                    if (((IdentityHashMap) this.f7226d).isEmpty()) {
                        ((HashSet) this.f7230h).add(a1Var);
                    } else {
                        z0 z0Var = (z0) ((HashMap) this.f7228f).get(a1Var);
                        if (z0Var != null) {
                            z0Var.f7512a.c(z0Var.f7513b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(sg.m r22, float[] r23, float r24, android.graphics.RectF r25, o10.b r26, android.graphics.Path r27) {
        throw new UnsupportedOperationException("Method not decompiled: i7.b1.b(sg.m, float[], float, android.graphics.RectF, o10.b, android.graphics.Path):void");
    }

    public k2 c() {
        ArrayList arrayList = (ArrayList) this.f7225c;
        if (arrayList.isEmpty()) {
            return k2.EMPTY;
        }
        int windowCount = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            a1Var.f7219d = windowCount;
            windowCount += a1Var.f7216a.f13766o.f13728a.getWindowCount();
        }
        return new h1(arrayList, (s7.d1) this.f7233k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f7230h).iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (a1Var.f7218c.isEmpty()) {
                z0 z0Var = (z0) ((HashMap) this.f7228f).get(a1Var);
                if (z0Var != null) {
                    z0Var.f7512a.c(z0Var.f7513b);
                }
                it.remove();
            }
        }
    }

    public void e(a1 a1Var) {
        if (a1Var.f7220e && a1Var.f7218c.isEmpty()) {
            z0 z0Var = (z0) ((HashMap) this.f7228f).remove(a1Var);
            z0Var.getClass();
            y0 y0Var = z0Var.f7514c;
            s7.a aVar = z0Var.f7512a;
            aVar.o(z0Var.f7513b);
            aVar.r(y0Var);
            aVar.q(y0Var);
            ((HashSet) this.f7230h).remove(a1Var);
        }
    }

    public boolean f(Path path, int i10) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((sg.u[]) this.f7224b)[i10].b(((Matrix[]) this.f7225c)[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public void g(a1 a1Var) {
        s7.v vVar = a1Var.f7216a;
        ?? r4 = new s7.b0() {
            @Override
            public final void a(s7.a aVar, k2 k2Var) {
                e7.d0 d0Var = ((i0) this.f7463a.f7229g).H;
                d0Var.e(2);
                d0Var.f(22);
            }
        };
        y0 y0Var = new y0(this, a1Var);
        ((HashMap) this.f7228f).put(a1Var, new z0(vVar, r4, y0Var));
        Handler handler = new Handler(e7.i0.r(), null);
        vVar.getClass();
        c50.h hVar = vVar.f13639c;
        hVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hVar.D;
        s7.f0 f0Var = new s7.f0();
        f0Var.f13680a = handler;
        f0Var.f13681b = y0Var;
        copyOnWriteArrayList.add(f0Var);
        Handler handler2 = new Handler(e7.i0.r(), null);
        n7.h hVar2 = vVar.f13640d;
        hVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = hVar2.f11170c;
        n7.g gVar = new n7.g();
        gVar.f11166a = handler2;
        gVar.f11167b = y0Var;
        copyOnWriteArrayList2.add(gVar);
        vVar.k(r4, (g7.s) this.l, (j7.j) this.f7224b);
    }

    public void h(s7.y yVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f7226d;
        a1 a1Var = (a1) identityHashMap.remove(yVar);
        a1Var.getClass();
        a1Var.f7216a.n(yVar);
        a1Var.f7218c.remove(((s7.s) yVar).A);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(a1Var);
    }

    public void i(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f7225c;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            a1 a1Var = (a1) arrayList.remove(i12);
            ((HashMap) this.f7227e).remove(a1Var.f7217b);
            int i13 = -a1Var.f7216a.f13766o.f13728a.getWindowCount();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((a1) arrayList.get(i14)).f7219d += i13;
            }
            a1Var.f7220e = true;
            if (this.f7223a) {
                e(a1Var);
            }
        }
    }
}
