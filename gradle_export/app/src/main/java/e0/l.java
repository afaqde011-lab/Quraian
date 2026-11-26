package e0;

import com.google.android.gms.cast.MediaError;
import d0.y1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;
import ri.t1;
import x.b1;
import x.t;

public abstract class l {

    public static final float f4950a = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;

    public static final Object a(y1 y1Var, float f3, x.j jVar, t tVar, u00.k kVar, m00.c cVar) {
        j jVar2;
        float f10;
        w wVar;
        if (cVar instanceof j) {
            jVar2 = (j) cVar;
            int i10 = jVar2.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar2.E = i10 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(cVar);
            }
        } else {
            jVar2 = new j(cVar);
        }
        Object obj = jVar2.D;
        l00.a aVar = l00.a.A;
        int i11 = jVar2.E;
        if (i11 == 0) {
            t1.O(obj);
            w wVar2 = new w();
            boolean z10 = ((Number) jVar.a()).floatValue() == 0.0f;
            i iVar = new i(f3, wVar2, y1Var, kVar, 0);
            jVar2.B = jVar;
            jVar2.C = wVar2;
            jVar2.A = f3;
            jVar2.E = 1;
            if (x.c.g(jVar, tVar, !z10, iVar, jVar2) == aVar) {
                return aVar;
            }
            f10 = f3;
            wVar = wVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = jVar2.A;
            wVar = jVar2.C;
            jVar = jVar2.B;
            t1.O(obj);
        }
        return new a(new Float(f10 - wVar.A), jVar);
    }

    public static final Object b(y1 y1Var, float f3, float f10, x.j jVar, b1 b1Var, u00.k kVar, m00.c cVar) {
        k kVar2;
        float fFloatValue;
        x.j jVar2;
        w wVar;
        float f11 = f3;
        if (cVar instanceof k) {
            kVar2 = (k) cVar;
            int i10 = kVar2.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar2.F = i10 - Integer.MIN_VALUE;
            } else {
                kVar2 = new k(cVar);
            }
        } else {
            kVar2 = new k(cVar);
        }
        k kVar3 = kVar2;
        Object obj = kVar3.E;
        l00.a aVar = l00.a.A;
        int i11 = kVar3.F;
        if (i11 == 0) {
            t1.O(obj);
            w wVar2 = new w();
            fFloatValue = ((Number) jVar.a()).floatValue();
            Float f12 = new Float(f11);
            boolean z10 = ((Number) jVar.a()).floatValue() == 0.0f;
            i iVar = new i(f10, wVar2, y1Var, kVar, 1);
            kVar3.C = jVar;
            kVar3.D = wVar2;
            kVar3.A = f11;
            kVar3.B = fFloatValue;
            kVar3.F = 1;
            if (x.c.i(jVar, f12, b1Var, !z10, iVar, kVar3) == aVar) {
                return aVar;
            }
            jVar2 = jVar;
            wVar = wVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f13 = kVar3.B;
            float f14 = kVar3.A;
            wVar = kVar3.D;
            jVar2 = kVar3.C;
            t1.O(obj);
            fFloatValue = f13;
            f11 = f14;
        }
        return new a(new Float(f11 - wVar.A), x.c.l(jVar2, 0.0f, d(((Number) jVar2.a()).floatValue(), fFloatValue), 29));
    }

    public static final void c(x.h hVar, y1 y1Var, u00.k kVar, float f3) {
        float fA;
        try {
            fA = y1Var.a(f3);
        } catch (CancellationException unused) {
            hVar.a();
            fA = 0.0f;
        }
        kVar.invoke(Float.valueOf(fA));
        if (Math.abs(f3 - fA) > 0.5f) {
            hVar.a();
        }
    }

    public static final float d(float f3, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return (f10 <= 0.0f ? f3 >= f10 : f3 <= f10) ? f3 : f10;
    }
}
