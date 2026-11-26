package id;

import a1.i;
import g00.b0;
import g1.b5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import ri.t1;

public final class g {

    public final fd.d f7607a;

    public final rc.c f7608b;

    public final cd.b f7609c;

    public final rc.g f7610d;

    public final jd.a f7611e;

    public final AtomicBoolean f7612f;

    public String f7613g;

    public String f7614h;

    public final AtomicBoolean f7615i;

    public final c f7616j;

    public g(fd.d dVar, rc.c cVar, cd.b bVar, rc.g gVar, jd.a aVar) {
        c fVar;
        m.e(bVar, "logger");
        this.f7607a = dVar;
        this.f7608b = cVar;
        this.f7609c = bVar;
        this.f7610d = gVar;
        this.f7611e = aVar;
        this.f7612f = new AtomicBoolean(false);
        this.f7615i = new AtomicBoolean(false);
        if (dVar instanceof ad.f) {
            fVar = new i((ad.f) dVar, bVar, cVar);
        } else if (dVar instanceof ld.m) {
            fVar = new hb.f();
        } else {
            bVar.c("Custom storage, identify intercept not started");
            fVar = null;
        }
        this.f7616j = fVar;
    }

    public final java.lang.Object a(gd.a r12, m00.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: id.g.a(gd.a, m00.c):java.lang.Object");
    }

    public final Object b(gd.a aVar, m00.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.D = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.B;
        l00.a aVar2 = l00.a.A;
        int i11 = eVar.D;
        try {
            if (i11 == 0) {
                t1.O(obj);
                fd.d dVar = this.f7607a;
                eVar.A = this;
                eVar.D = 1;
                Object objG = dVar.g(aVar, eVar);
                this = objG;
                if (objG == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g gVar = eVar.A;
                t1.O(obj);
                this = gVar;
            }
        } catch (Exception e3) {
            c7.i.N(e3, this.f7609c, "Error when intercepting identifies");
        }
        return b0.a;
    }

    public final Object c(m00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.D = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.B;
        l00.a aVar = l00.a.A;
        int i11 = fVar.D;
        if (i11 == 0) {
            t1.O(objJ);
            fVar.A = this;
            fVar.D = 1;
            c cVar2 = this.f7616j;
            m.b(cVar2);
            objJ = cVar2.j(fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = fVar.A;
            t1.O(objJ);
        }
        gd.a aVar2 = (gd.a) objJ;
        if (aVar2 != null) {
            b5 b5Var = this.f7611e.E;
            if (b5Var == null) {
                m.k("pipeline");
                throw null;
            }
            b5Var.b(aVar2);
        }
        return b0.a;
    }
}
