package fc;

import a40.c0;
import ab.a0;
import android.graphics.Matrix;
import android.graphics.PointF;
import bt.h2;
import c3.o3;
import ca.q;
import g00.b0;
import g1.l0;
import g1.n6;
import h00.y;
import h1.j0;
import h1.n0;
import java.util.Collection;
import java.util.Iterator;
import l1.e1;
import l1.i1;
import ri.t1;
import u00.p;
import z.b1;

public final class n {

    public final Object f5626a;

    public final Object f5627b;

    public final Object f5628c;

    public final Object f5629d;

    public final Object f5630e;

    public final Object f5631f;

    public final Object f5632g;

    public final Object f5633h;

    public final Object f5634i;

    public final Object f5635j;

    public final Object f5636k;
    public final Object l;
    public final Object m;

    public final Object f5637n;

    public n(n6 n6Var, q qVar, u00.a aVar, l0 l0Var, u00.k kVar) {
        this.f5626a = qVar;
        this.f5627b = aVar;
        this.f5628c = l0Var;
        this.f5629d = kVar;
        this.f5630e = new j0();
        h1.l lVar = new h1.l();
        lVar.B = this;
        lVar.A = new h1.k(this);
        this.f5631f = lVar;
        this.f5632g = l1.q.z(n6Var);
        this.f5633h = l1.q.r(new h1.g(this, 0));
        this.f5634i = l1.q.r(new h1.g(this, 1));
        this.f5635j = new e1(Float.NaN);
        l1.q.q(l1.c.G, new h1.g(this, 2));
        this.f5636k = new e1(0.0f);
        this.l = l1.q.z(null);
        this.m = l1.q.z(new n0(y.A));
        this.f5637n = new h1.j(this);
    }

    public n(jc.d dVar) {
        this.f5626a = new Matrix();
        db.g gVar = dVar.f8262a;
        this.f5631f = (i) (gVar == null ? null : gVar.m0());
        jc.e eVar = dVar.f8263b;
        this.f5632g = eVar == null ? null : eVar.m0();
        jc.a aVar = dVar.f8264c;
        this.f5633h = (h) (aVar == null ? null : aVar.m0());
        jc.b bVar = dVar.f8265d;
        this.f5634i = (f) (bVar == null ? null : bVar.m0());
        jc.b bVar2 = dVar.f8267f;
        f fVar = bVar2 == null ? null : (f) bVar2.m0();
        this.f5635j = fVar;
        if (fVar != null) {
            this.f5627b = new Matrix();
            this.f5628c = new Matrix();
            this.f5629d = new Matrix();
            this.f5630e = new float[9];
        } else {
            this.f5627b = null;
            this.f5628c = null;
            this.f5629d = null;
            this.f5630e = null;
        }
        jc.b bVar3 = dVar.f8268g;
        this.f5636k = bVar3 == null ? null : (f) bVar3.m0();
        jc.a aVar2 = dVar.f8266e;
        if (aVar2 != null) {
            this.f5637n = (f) aVar2.m0();
        }
        jc.b bVar4 = dVar.f8269h;
        if (bVar4 != null) {
            this.l = (f) bVar4.m0();
        } else {
            this.l = null;
        }
        jc.b bVar5 = dVar.f8270i;
        if (bVar5 != null) {
            this.m = (f) bVar5.m0();
        } else {
            this.m = null;
        }
    }

    public void a(lc.b bVar) {
        bVar.f((f) this.f5637n);
        bVar.f((f) this.l);
        bVar.f((f) this.m);
        bVar.f((i) this.f5631f);
        bVar.f((e) this.f5632g);
        bVar.f((h) this.f5633h);
        bVar.f((f) this.f5634i);
        bVar.f((f) this.f5635j);
        bVar.f((f) this.f5636k);
    }

    public void b(a aVar) {
        f fVar = (f) this.f5637n;
        if (fVar != null) {
            fVar.a(aVar);
        }
        f fVar2 = (f) this.l;
        if (fVar2 != null) {
            fVar2.a(aVar);
        }
        f fVar3 = (f) this.m;
        if (fVar3 != null) {
            fVar3.a(aVar);
        }
        i iVar = (i) this.f5631f;
        if (iVar != null) {
            iVar.a(aVar);
        }
        e eVar = (e) this.f5632g;
        if (eVar != null) {
            eVar.a(aVar);
        }
        h hVar = (h) this.f5633h;
        if (hVar != null) {
            hVar.a(aVar);
        }
        f fVar4 = (f) this.f5634i;
        if (fVar4 != null) {
            fVar4.a(aVar);
        }
        f fVar5 = (f) this.f5635j;
        if (fVar5 != null) {
            fVar5.a(aVar);
        }
        f fVar6 = (f) this.f5636k;
        if (fVar6 != null) {
            fVar6.a(aVar);
        }
    }

    public Object c(Object obj, b1 b1Var, p pVar, k00.c cVar) {
        h1.i iVar;
        e1 e1Var = (e1) this.f5635j;
        u00.k kVar = (u00.k) this.f5629d;
        if (cVar instanceof h1.i) {
            iVar = (h1.i) cVar;
            int i10 = iVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.C = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new h1.i(this, cVar);
            }
        } else {
            iVar = new h1.i(this, cVar);
        }
        h1.i iVar2 = iVar;
        Object obj2 = iVar2.A;
        l00.a aVar = l00.a.A;
        int i11 = iVar2.C;
        k00.c cVar2 = null;
        try {
            if (i11 == 0) {
                t1.O(obj2);
                if (g().f6524a.containsKey(obj)) {
                    j0 j0Var = (j0) this.f5630e;
                    ea.q qVar = new ea.q(this, obj, pVar, cVar2, 2);
                    iVar2.C = 1;
                    j0Var.getClass();
                    if (c0.k(new o3(b1Var, j0Var, qVar, (k00.c) null), iVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    l(obj);
                }
                return b0.a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
            m(null);
            Object objA = g().a(e1Var.h());
            if (objA != null && Math.abs(e1Var.h() - g().d(objA)) <= 0.5f && ((Boolean) kVar.invoke(objA)).booleanValue()) {
                l(objA);
            }
            return b0.a;
        } catch (Throwable th2) {
            m(null);
            Object objA2 = g().a(e1Var.h());
            if (objA2 != null && Math.abs(e1Var.h() - g().d(objA2)) <= 0.5f && ((Boolean) kVar.invoke(objA2)).booleanValue()) {
                l(objA2);
            }
            throw th2;
        }
    }

    public Object d(b1 b1Var, h2 h2Var, m00.c cVar) {
        h1.h hVar;
        e1 e1Var = (e1) this.f5635j;
        u00.k kVar = (u00.k) this.f5629d;
        if (cVar instanceof h1.h) {
            hVar = (h1.h) cVar;
            int i10 = hVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.C = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h1.h(this, cVar);
            }
        } else {
            hVar = new h1.h(this, cVar);
        }
        Object obj = hVar.A;
        l00.a aVar = l00.a.A;
        int i11 = hVar.C;
        try {
            if (i11 == 0) {
                t1.O(obj);
                j0 j0Var = (j0) this.f5630e;
                d40.l lVar = new d40.l(this, h2Var, (k00.c) null, 1);
                hVar.C = 1;
                j0Var.getClass();
                if (c0.k(new o3(b1Var, j0Var, (u00.k) lVar, (k00.c) null), hVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            Object objA = g().a(e1Var.h());
            if (objA != null && Math.abs(e1Var.h() - g().d(objA)) <= 0.5f && ((Boolean) kVar.invoke(objA)).booleanValue()) {
                l(objA);
            }
            return b0.a;
        } catch (Throwable th2) {
            Object objA2 = g().a(e1Var.h());
            if (objA2 != null && Math.abs(e1Var.h() - g().d(objA2)) <= 0.5f && ((Boolean) kVar.invoke(objA2)).booleanValue()) {
                l(objA2);
            }
            throw th2;
        }
    }

    public void e() {
        for (int i10 = 0; i10 < 9; i10++) {
            ((float[]) this.f5630e)[i10] = 0.0f;
        }
    }

    public Object f(float f3, float f10, Object obj) {
        q qVar = (q) this.f5626a;
        n0 n0VarG = g();
        float fD = n0VarG.d(obj);
        float fFloatValue = ((Number) ((u00.a) this.f5627b).invoke()).floatValue();
        if (fD != f3 && !Float.isNaN(fD)) {
            if (fD < f3) {
                if (f10 >= fFloatValue) {
                    Object objB = n0VarG.b(f3, true);
                    kotlin.jvm.internal.m.b(objB);
                    return objB;
                }
                Object objB2 = n0VarG.b(f3, true);
                kotlin.jvm.internal.m.b(objB2);
                if (f3 >= Math.abs(Math.abs(((Number) qVar.invoke(Float.valueOf(Math.abs(n0VarG.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f10 <= (-fFloatValue)) {
                    Object objB3 = n0VarG.b(f3, false);
                    kotlin.jvm.internal.m.b(objB3);
                    return objB3;
                }
                Object objB4 = n0VarG.b(f3, false);
                kotlin.jvm.internal.m.b(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) qVar.invoke(Float.valueOf(Math.abs(fD - n0VarG.d(objB4))))).floatValue()));
                if (f3 >= 0.0f ? f3 <= fAbs : Math.abs(f3) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public n0 g() {
        return (n0) ((i1) this.m).getValue();
    }

    public Matrix h() {
        PointF pointF;
        PointF pointF2;
        Matrix matrix = (Matrix) this.f5627b;
        f fVar = (f) this.f5636k;
        Matrix matrix2 = (Matrix) this.f5629d;
        Matrix matrix3 = (Matrix) this.f5628c;
        float[] fArr = (float[]) this.f5630e;
        Matrix matrix4 = (Matrix) this.f5626a;
        matrix4.reset();
        e eVar = (e) this.f5632g;
        if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
            float f3 = pointF2.x;
            if (f3 != 0.0f || pointF2.y != 0.0f) {
                matrix4.preTranslate(f3, pointF2.y);
            }
        }
        f fVar2 = (f) this.f5634i;
        if (fVar2 != null) {
            float fI = fVar2.i();
            if (fI != 0.0f) {
                matrix4.preRotate(fI);
            }
        }
        f fVar3 = (f) this.f5635j;
        if (fVar3 != null) {
            float fCos = fVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-fVar.i()) + 90.0f));
            float fSin = fVar == null ? 1.0f : (float) Math.sin(Math.toRadians((-fVar.i()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(fVar3.i()));
            e();
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f10 = -fSin;
            fArr[3] = f10;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
            e();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            matrix3.setValues(fArr);
            e();
            fArr[0] = fCos;
            fArr[1] = f10;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            matrix2.setValues(fArr);
            matrix3.preConcat(matrix);
            matrix2.preConcat(matrix3);
            matrix4.preConcat(matrix2);
        }
        h hVar = (h) this.f5633h;
        if (hVar != null) {
            pc.b bVar = (pc.b) hVar.e();
            float f11 = bVar.f12488a;
            if (f11 != 1.0f || bVar.f12489b != 1.0f) {
                matrix4.preScale(f11, bVar.f12489b);
            }
        }
        i iVar = (i) this.f5631f;
        if (iVar != null && (((pointF = (PointF) iVar.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            matrix4.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix4;
    }

    public Matrix i(float f3) {
        Matrix matrix = (Matrix) this.f5626a;
        e eVar = (e) this.f5632g;
        PointF pointF = eVar == null ? null : (PointF) eVar.e();
        h hVar = (h) this.f5633h;
        pc.b bVar = hVar == null ? null : (pc.b) hVar.e();
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f3, pointF.y * f3);
        }
        if (bVar != null) {
            double d3 = f3;
            matrix.preScale((float) Math.pow(bVar.f12488a, d3), (float) Math.pow(bVar.f12489b, d3));
        }
        f fVar = (f) this.f5634i;
        if (fVar != null) {
            float fFloatValue = ((Float) fVar.e()).floatValue();
            i iVar = (i) this.f5631f;
            PointF pointF2 = iVar != null ? (PointF) iVar.e() : null;
            matrix.preRotate(fFloatValue * f3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public float j(float f3) {
        Float fValueOf;
        e1 e1Var = (e1) this.f5635j;
        float fH = (Float.isNaN(e1Var.h()) ? 0.0f : e1Var.h()) + f3;
        float fC = g().c();
        Collection collectionValues = g().f6524a.values();
        kotlin.jvm.internal.m.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return a0.x(fH, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public float k() {
        e1 e1Var = (e1) this.f5635j;
        if (Float.isNaN(e1Var.h())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return e1Var.h();
    }

    public void l(Object obj) {
        ((i1) this.f5632g).setValue(obj);
    }

    public void m(Object obj) {
        ((i1) this.l).setValue(obj);
    }
}
