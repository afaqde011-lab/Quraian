package a1;

import android.content.ClipDescription;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g1.g4;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;

public final class e1 implements u00.k {
    public final int A;
    public final Object B;

    public e1(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.A;
        Object obj2 = this.B;
        switch (i10) {
            case 0:
                ((f1) obj2).a((r3.g) obj);
                return g00.b0.a;
            case 1:
                t1 t1Var = (t1) obj2;
                z2.a0 a0Var = (z2.a0) obj;
                h2.c cVar = (h2.c) t1Var.U.f1962y.getValue();
                if (cVar == null) {
                    cVar = h2.c.f6545e;
                }
                z2.a0 a0VarE = t1Var.S.e();
                if (a0VarE != null) {
                    return w0.h.e(cVar, a0VarE, a0Var);
                }
                g0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 2:
                ClipDescription clipDescription = ((e2.d) obj).f5049a.getClipDescription();
                Iterable<a0.a> iterable = (Iterable) ((w1) obj2).invoke();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z10 = false;
                } else {
                    for (a0.a aVar : iterable) {
                        z10 = true;
                        if (kotlin.jvm.internal.m.a(aVar, a0.a.f2c) || (clipDescription != null && clipDescription.hasMimeType(aVar.f3a))) {
                        }
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 3:
                al.h hVar = (al.h) obj2;
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                l1.f1 f1Var = hVar.a;
                f1Var.i(f1Var.h() + 1);
                return new al.g(hVar, 0);
            case 4:
                bt.j2 j2Var = (bt.j2) obj2;
                xs.c cVar2 = j2Var.s;
                int iB = j2Var.e.b();
                cVar2.getClass();
                ArrayList arrayListC = xs.c.c(iB, (ss.v) obj);
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
                long epochSecond = localDateNow.with((TemporalAdjuster) DayOfWeek.MONDAY).atStartOfDay(zoneIdSystemDefault).toEpochSecond();
                long epochSecond2 = localDateNow.with((TemporalAdjuster) DayOfWeek.SUNDAY).atStartOfDay(zoneIdSystemDefault).toEpochSecond();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListC) {
                    long j9 = ((rs.f) obj3).b;
                    if (epochSecond <= j9 && j9 <= epochSecond2) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 5:
                String str = (String) obj;
                kotlin.jvm.internal.m.e(str, "it");
                ((bz.s) obj2).l(new bz.d(str));
                return g00.b0.a;
            case 6:
                na.a aVar2 = (na.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "db");
                ((ca.p) obj2).f3072i = aVar2;
                return g00.b0.a;
            case 7:
                p9.g gVar = (p9.g) obj;
                kotlin.jvm.internal.m.e(gVar, "key");
                p9.e eVar = (p9.e) ((h00.a) obj2).invoke(gVar);
                return new p9.e(eVar, new v1.c(new w(eVar, 4), 1942556508, true));
            case 8:
                v2.s sVar = (v2.s) obj;
                ((gv.a1) obj2).invoke(sVar, Float.valueOf(Float.intBitsToFloat((int) (v2.r.h(sVar, false) >> 32))));
                sVar.a();
                return g00.b0.a;
            case 9:
                d0.u2 u2Var = (d0.u2) obj2;
                return new h2.b(u2Var.c(u2Var.f4522k, ((h2.b) obj).f6544a, u2Var.f4521j));
            case 10:
                d00.n0 n0Var = (d00.n0) obj2;
                d00.b1 b1Var = (d00.b1) obj;
                kotlin.jvm.internal.m.e(b1Var, "level");
                n0Var.d0.a(n0Var.C1(), b1Var);
                return g00.b0.a;
            case 11:
                ((dq.u) obj2).l(new dq.c((PlayerItem) obj));
                return g00.b0.a;
            case 12:
                bu.b bVar = (bu.b) obj;
                kotlin.jvm.internal.m.e(bVar, "it");
                ((du.t0) obj2).l(new du.n(bVar));
                return g00.b0.a;
            case 13:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((am.c) obj2, 4);
            case 14:
                k2.d dVar = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar, "$this$drawScaledContent");
                rd.a.x(dVar, ((e00.t) obj2).j);
                return g00.b0.a;
            case 15:
                v2.s sVar2 = (v2.s) obj;
                if (((e1.m) obj2).a(sVar2.f15401c)) {
                    sVar2.a();
                }
                return g00.b0.a;
            case 16:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((ez.s) obj2, 6);
            case 17:
                Integer num = (Integer) obj;
                num.intValue();
                String string = ri.t1.i((e60.a) obj2).getString(2131886133, num);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                return string;
            case TYPE_SINT64_VALUE:
                g1.o0 o0Var = (g1.o0) obj2;
                a40.c0.y(o0Var.p1(), (k00.i) null, (a40.a0) null, new g1.m0(o0Var, (h2.b) obj, null, 1), 3);
                return g00.b0.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                j3.y.e((j3.a0) obj, (String) ((g00.k) obj2).A);
                return g00.b0.a;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                g4 g4Var = (g4) obj2;
                g4Var.show();
                return new c3.k1(g4Var, 7);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                m3.o0 o0Var2 = (m3.o0) obj2;
                m3.f fVar = (m3.f) obj;
                m3.c cVar3 = (m3.c) fVar.f10423a;
                if (cVar3 instanceof m3.n) {
                    m3.n nVar = (m3.n) cVar3;
                    if (nVar.f10494b == null) {
                        return m3.f.a(fVar, new m3.n(nVar.f10493a, o0Var2, nVar.f10495c), 0, 0, 14);
                    }
                }
                if (!(cVar3 instanceof m3.m)) {
                    return fVar;
                }
                m3.m mVar = (m3.m) cVar3;
                return mVar.f10481b == null ? m3.f.a(fVar, new m3.m(mVar.f10480a, o0Var2, mVar.f10482c), 0, 0, 14) : fVar;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                gj.i iVar = (gj.i) obj2;
                t5.b bVar2 = (t5.b) obj;
                t5.d dVar2 = gj.i.f6354c;
                long j10 = 0;
                for (Map.Entry entry : bVar2.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        t5.d dVar3 = (t5.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = iVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            bVar2.e(dVar3, Set.of(strB));
                            j10++;
                        } else {
                            bVar2.d(dVar3);
                        }
                    }
                }
                if (j10 == 0) {
                    bVar2.d(dVar2);
                    return null;
                }
                bVar2.e(dVar2, Long.valueOf(j10));
                return null;
            case 23:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((gv.l) obj2, 8);
            case 24:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                ((c00.x) obj2).k(c00.d.a);
                return new cl.c(1);
            case 25:
                Context context = (Context) obj;
                kotlin.jvm.internal.m.e(context, "context");
                View viewInflate = LayoutInflater.from(context).inflate(2131558429, (ViewGroup) null);
                kotlin.jvm.internal.m.c(viewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                PlayerView playerView = (PlayerView) viewInflate;
                playerView.setPlayer(((b00.c) obj2).f);
                return playerView;
            case RuntimeVersion.MINOR:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((gv.n0) obj2, 9);
            case 27:
                kotlin.jvm.internal.m.e((l1.z) obj, "$this$DisposableEffect");
                return new c3.k1((gv.f1) obj2, 10);
            case 28:
                m1.e eVar2 = (m1.e) obj2;
                Object[] objArr = eVar2.A;
                int i11 = eVar2.C;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((z2.x0) objArr[i12]).b();
                }
                return g00.b0.a;
            default:
                c3.d2 d2Var = (c3.d2) obj;
                d2Var.f2644a = "padding";
                d2Var.f2646c.c((h0.n1) obj2, "paddingValues");
                return g00.b0.a;
        }
    }
}
