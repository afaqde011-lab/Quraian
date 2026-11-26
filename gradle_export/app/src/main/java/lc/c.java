package lc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.internal.measurement.y3;
import java.util.ArrayList;
import java.util.List;
import u.q;

public final class c extends b {
    public final fc.f A;
    public final ArrayList B;
    public final RectF C;
    public final RectF D;
    public boolean E;

    public c(cc.i iVar, e eVar, List list, cc.a aVar) {
        b bVar;
        b cVar;
        String str;
        super(iVar, eVar);
        this.B = new ArrayList();
        this.C = new RectF();
        this.D = new RectF();
        new Paint();
        this.E = true;
        jc.b bVar2 = eVar.f10255s;
        if (bVar2 != null) {
            fc.e eVarM0 = bVar2.m0();
            this.A = (fc.f) eVarM0;
            f(eVarM0);
            eVarM0.a(this);
        } else {
            this.A = null;
        }
        q qVar = new q(aVar.f3113h.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                for (int i10 = 0; i10 < qVar.g(); i10++) {
                    b bVar4 = (b) qVar.b(qVar.d(i10));
                    if (bVar4 != null && (bVar = (b) qVar.b(bVar4.f10228p.f10244f)) != null) {
                        bVar4.f10232t = bVar;
                    }
                }
                return;
            }
            e eVar2 = (e) list.get(size);
            int iB = e4.f.b(eVar2.f10243e);
            if (iB == 0) {
                cVar = new c(iVar, eVar2, (List) aVar.f3108c.get(eVar2.f10245g), aVar);
            } else if (iB == 1) {
                cVar = new h(iVar, eVar2);
            } else if (iB == 2) {
                cVar = new d(iVar, eVar2);
            } else if (iB == 3) {
                cVar = new f(iVar, eVar2);
            } else if (iB == 4) {
                cVar = new g(iVar, eVar2, this, aVar);
            } else if (iB != 5) {
                switch (eVar2.f10243e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                oc.b.a("Unknown layer type ".concat(str));
                cVar = null;
            } else {
                cVar = new j(iVar, eVar2);
            }
            if (cVar != null) {
                qVar.e(cVar, cVar.f10228p.f10242d);
                if (bVar3 != null) {
                    bVar3.f10231s = cVar;
                    bVar3 = null;
                } else {
                    this.B.add(0, cVar);
                    int iB2 = e4.f.b(eVar2.f10257u);
                    if (iB2 == 1 || iB2 == 2) {
                        bVar3 = cVar;
                    }
                }
            }
            size--;
        }
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.C;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).c(rectF2, this.f10226n, true);
            rectF.union(rectF2);
        }
    }

    @Override
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        e eVar = this.f10228p;
        float f3 = eVar.f10251o;
        float f10 = eVar.f10252p;
        RectF rectF = this.D;
        rectF.set(0.0f, 0.0f, f3, f10);
        matrix.mapRect(rectF);
        this.f10227o.getClass();
        canvas.save();
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.E || !"__container".equals(eVar.f10241c)) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((b) arrayList.get(size)).d(canvas, matrix, i10);
            }
        }
        canvas.restore();
        y3.D();
    }

    @Override
    public final void n(float f3) {
        super.n(f3);
        e eVar = this.f10228p;
        fc.f fVar = this.A;
        if (fVar != null) {
            cc.a aVar = this.f10227o.A;
            f3 = ((((Float) fVar.e()).floatValue() * eVar.f10240b.l) - eVar.f10240b.f3115j) / ((aVar.f3116k - aVar.f3115j) + 0.01f);
        }
        if (fVar == null) {
            float f10 = eVar.f10250n;
            cc.a aVar2 = eVar.f10240b;
            f3 -= f10 / (aVar2.f3116k - aVar2.f3115j);
        }
        if (eVar.m != 0.0f && !"__container".equals(eVar.f10241c)) {
            f3 /= eVar.m;
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).n(f3);
        }
    }
}
