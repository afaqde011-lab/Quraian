package y1;

import android.app.PendingIntent;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import java.util.Arrays;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.q;
import l1.z0;
import s10.w0;
import sd.p1;
import u00.n;

public abstract class k {

    public static final w0 f16585a = new w0(new wy.k(23), new xn.a(17), 15);

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final w0 b(n nVar, u00.k kVar) {
        m3.a aVar = new m3.a(nVar, 23);
        d0.d(1, kVar);
        return new w0(aVar, kVar, 15);
    }

    public static final Object c(Object[] objArr, u00.a aVar, l1.j jVar, int i10) {
        return d(Arrays.copyOf(objArr, objArr.length), f16585a, aVar, jVar, ((i10 << 6) & 7168) | 384);
    }

    public static final Object d(Object[] objArr, j jVar, u00.a aVar, l1.j jVar2, int i10) {
        Object[] objArr2;
        j jVar3;
        final Object obj;
        Object objC;
        g0 g0Var = (g0) jVar2;
        long j9 = g0Var.T;
        z3.r(36);
        final String string = Long.toString(j9, 36);
        m.d(string, "toString(...)");
        m.c(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final f fVar = (f) g0Var.k(h.f16584a);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            Object objF = (fVar == null || (objC = fVar.c(string)) == null) ? null : jVar.f(objC);
            if (objF == null) {
                objF = aVar.invoke();
            }
            objArr2 = objArr;
            jVar3 = jVar;
            b bVar = new b(jVar3, fVar, string, objF, objArr2);
            g0Var.n0(bVar);
            objN = bVar;
        } else {
            objArr2 = objArr;
            jVar3 = jVar;
        }
        final b bVar2 = (b) objN;
        Object objInvoke = Arrays.equals(objArr2, bVar2.E) ? bVar2.D : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zI = g0Var.i(bVar2) | ((((i10 & 112) ^ 48) > 32 && g0Var.i(jVar3)) || (i10 & 48) == 32) | g0Var.i(fVar) | g0Var.g(string) | g0Var.i(objInvoke) | g0Var.i(objArr2);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            final Object[] objArr3 = objArr2;
            obj = objInvoke;
            final j jVar4 = jVar3;
            u00.a aVar2 = new u00.a() {
                public final Object invoke() throws PendingIntent.CanceledException {
                    boolean z10;
                    b bVar3 = bVar2;
                    f fVar2 = bVar3.B;
                    f fVar3 = fVar;
                    boolean z11 = true;
                    if (fVar2 != fVar3) {
                        bVar3.B = fVar3;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str = bVar3.C;
                    String str2 = string;
                    if (m.a(str, str2)) {
                        z11 = z10;
                    } else {
                        bVar3.C = str2;
                    }
                    bVar3.A = jVar4;
                    bVar3.D = obj;
                    bVar3.E = objArr3;
                    e eVar = bVar3.F;
                    if (eVar != null && z11) {
                        ((p1) eVar).L();
                        bVar3.F = null;
                        bVar3.a();
                    }
                    return b0.a;
                }
            };
            g0Var.n0(aVar2);
            objN2 = aVar2;
        } else {
            obj = objInvoke;
        }
        q.k((u00.a) objN2, jVar2);
        return obj;
    }

    public static final z0 e(Object[] objArr, u00.a aVar, l1.j jVar, int i10) {
        return (z0) d(Arrays.copyOf(objArr, objArr.length), new w0(new wy.k(21), new xn.a(15), 15), aVar, jVar, ((i10 << 3) & 7168) | 384);
    }

    public static final Object f(Object[] objArr, j jVar, u00.a aVar, l1.j jVar2, int i10) {
        return d(Arrays.copyOf(objArr, objArr.length), jVar, aVar, jVar2, ((i10 << 3) & 7168) | (i10 & 112) | 384);
    }

    public static final d g(l1.j jVar) {
        g0 g0Var = (g0) jVar;
        g0Var.c0(1967007413);
        Object[] objArr = new Object[0];
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = new sy.e(21);
            g0Var.n0(objN);
        }
        d dVar = (d) f(objArr, d.E, (u00.a) objN, jVar, 384);
        dVar.C = (f) g0Var.k(h.f16584a);
        g0Var.r(false);
        return dVar;
    }
}
