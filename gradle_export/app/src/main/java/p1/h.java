package p1;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l1.s0;
import l1.t0;

public final class h extends k20.d {

    public static final h f12269d = new h(0, 4, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) throws KotlinNothingValueException {
        t0 t0Var = (t0) kVar.d(2);
        t0 t0Var2 = (t0) kVar.d(3);
        l1.n nVar = (l1.n) kVar.d(1);
        s0 s0VarP = (s0) kVar.d(0);
        if (s0VarP == null && (s0VarP = nVar.p(t0Var)) == null) {
            l1.l.b("Could not resolve state for movable content");
            throw new KotlinNothingValueException();
        }
        o1.h hVarD = o1.j.d(s0VarP.f9927a);
        if (kVar2.f11501n > 0 || kVar2.u(kVar2.f11507t + 1) != 1) {
            l1.l.a("Check failed");
        }
        int i10 = kVar2.f11507t;
        int i11 = kVar2.f11498i;
        int i12 = kVar2.f11499j;
        kVar2.a(1);
        kVar2.R();
        kVar2.d();
        o1.k kVarK = hVarD.k();
        try {
            List listW = g4.W(kVarK, 2, kVar2, false, true, true);
            kVarK.e(true);
            kVar2.k();
            kVar2.j();
            kVar2.f11507t = i10;
            kVar2.f11498i = i11;
            kVar2.f11499j = i12;
            l1.q.m(kVar2, listW, t0Var2.f9932c);
        } catch (Throwable th2) {
            kVarK.e(false);
            throw th2;
        }
    }
}
