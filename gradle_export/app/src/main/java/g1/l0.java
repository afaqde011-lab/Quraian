package g1;

import android.app.LocaleManager;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

public final class l0 implements u00.a {
    public final int A;
    public final Object B;

    public l0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke() {
        int i10;
        String language;
        oa.f fVar;
        int i11 = this.A;
        Object obj = this.B;
        switch (i11) {
            case 0:
                o0 o0Var = (o0) obj;
                a40.c0.y(o0Var.p1(), (k00.i) null, (a40.a0) null, new a1.a0(o0Var, (k00.c) null, 19), 3);
                return g00.b0.a;
            case 1:
                ((g4) obj).E.invoke();
                return g00.b0.a;
            case 2:
                return new y3.f(com.google.android.gms.internal.measurement.b5.A(h1.e1.f6499d, h1.e1.f6500e, ((h1.d1) obj).invoke()));
            case 3:
                return ((m6) obj).f5886c;
            case 4:
                return kh.n.T((ot.e) obj);
            case 5:
                int iOrdinal = ((gm.a) obj).ordinal();
                if (iOrdinal == 0) {
                    i10 = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 24;
                }
                return new y3.f(i10);
            case 6:
                return kotlin.jvm.internal.m.i((Object[]) obj);
            case 7:
                return ((Iterable) obj).iterator();
            case 8:
                ((hw.j) obj).j(hw.b.a);
                return g00.b0.a;
            case 9:
                ((hx.e0) obj).k(hx.a.a);
                return g00.b0.a;
            case 10:
                ia.g gVar = (ia.g) obj;
                gVar.getLifecycle().a(new ia.b(gVar, 0));
                return g00.b0.a;
            case 11:
                rd.a.M(((WorkDatabase) obj).w().f7028a, false, true, new j7(18));
                return g00.b0.a;
            case 12:
                return Float.valueOf(((h1.g0) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 13:
                ((jk.g) obj).B1();
                return g00.b0.a;
            case 14:
                return kh.n.T((TopRecitersLauncher) obj);
            case 15:
                ((jx.x) obj).j(jx.a.a);
                return g00.b0.a;
            case 16:
                LocaleManager localeManager = (LocaleManager) obj;
                Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
                return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
            case 17:
                l0.c0 c0Var = ((l0.f0) obj).f9738j;
                if (c0Var != null) {
                    b3.m.m(c0Var);
                }
                return g00.b0.a;
            case TYPE_SINT64_VALUE:
                l6.f fVar2 = (l6.f) obj;
                long jLongValue = ((Number) fVar2.B.invoke()).longValue();
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                synchronized (fVar2.D) {
                    yVar.A = jLongValue - fVar2.F;
                    yVar2.A = 1000000000 / ((long) fVar2.E);
                }
                a40.c0.y(fVar2.A, (k00.i) null, (a40.a0) null, new b1.w(yVar, yVar2, fVar2, jLongValue, (k00.c) null), 3);
                return g00.b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                Object obj2 = ((List) obj).get(2);
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return (h2.c) obj;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                n40.f fVar3 = (n40.f) obj;
                return Integer.valueOf(p40.o0.f(fVar3, fVar3.k));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return kh.n.T((ReciterLauncher) obj);
            case 23:
                oa.g gVar2 = (oa.g) obj;
                String str = gVar2.B;
                if (str == null || !gVar2.D) {
                    fVar = new oa.f(gVar2.A, gVar2.B, new o9.q(1), gVar2.C, gVar2.E);
                } else {
                    Context context = gVar2.A;
                    kotlin.jvm.internal.m.e(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.m.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    fVar = new oa.f(gVar2.A, new File(noBackupFilesDir, str).getAbsolutePath(), new o9.q(1), gVar2.C, gVar2.E);
                }
                fVar.setWriteAheadLoggingEnabled(gVar2.G);
                return fVar;
            case 24:
                ((oo.c0) obj).dismiss();
                return g00.b0.a;
            case 25:
                return h00.q.R0(h00.q.i1(((z1.s) obj).B, new ba.m(18)), ";", (String) null, (String) null, new m3.c0(22), 30);
            case RuntimeVersion.MINOR:
                ((pz.l) obj).j(pz.a.a);
                return g00.b0.a;
            case 27:
                return (m3.h) obj;
            case 28:
                return new q0.b2((d0.q1) obj, 0.0f);
            default:
                return ((q0.j1) obj).d();
        }
    }
}
