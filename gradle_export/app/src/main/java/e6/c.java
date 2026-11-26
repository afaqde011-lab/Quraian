package e6;

import a10.w;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.AudioStoryCatalogsModel;
import com.mchutov.quranify.audiostories.data.source.local.db.AudioStoriesDatabase;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.player.AudioStoryPlayerLauncher;
import eq.j;
import g00.b0;
import g1.n6;
import g1.t4;
import g1.z6;
import i2.c0;
import j3.z;
import java.time.LocalDate;
import java.util.Arrays;
import jo.o;
import k0.i;
import k1.r;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.t;
import oo.g1;
import qo.y;
import tn.g;
import tn.h;
import tn.l;
import tn.n;
import u00.k;
import vn.s;
import vn.u;
import w.j0;
import w.s0;
import w.v;
import w.x0;
import w.y0;
import x.i0;
import x.q1;

public final class c implements k {
    public final int A;

    public c(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        int i11 = 4;
        int i12 = 5;
        b0 b0Var = b0.a;
        switch (i10) {
            case 0:
                return (c6.f) obj;
            case 1:
                Byte b7 = (Byte) obj;
                b7.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b7}, 1));
            case 2:
                c0 c0Var = (c0) obj;
                m.e(c0Var, "$this$graphicsLayer");
                c0Var.L0(false);
                return b0Var;
            case 3:
                v vVar = (v) obj;
                q1 q1Var = eq.k.b;
                q1 q1Var2 = eq.k.a;
                m.e(vVar, "$this$AnimatedContent");
                c cVar = new c(i12);
                g00.k kVar = ((Number) vVar.c()).intValue() < ((Number) vVar.a()).intValue() ? new g00.k(s0.c(q1Var2, 2).a(s0.j(new j(cVar, 0), q1Var)), s0.d(q1Var2, 2).a(s0.l(new j(cVar, 1), q1Var))) : new g00.k(s0.c(q1Var2, 2).a(s0.j(new j(cVar, 2), q1Var)), s0.d(q1Var2, 2).a(s0.l(new j(cVar, 3), q1Var)));
                return new j0((x0) kVar.A, (y0) kVar.B, w.m.c(2), i11);
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 6:
                Byte b10 = (Byte) obj;
                b10.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b10}, 1));
            case 7:
                i iVar = (i) obj;
                m.e(iVar, "$this$LazyVerticalGrid");
                i.p(iVar, null, null, eu.a.g, 7);
                i.p(iVar, null, null, eu.a.h, 7);
                i.p(iVar, null, null, eu.a.i, 7);
                i.p(iVar, null, null, eu.a.j, 7);
                i.p(iVar, null, null, eu.a.k, 7);
                i.p(iVar, null, null, eu.a.l, 7);
                return b0Var;
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 9:
                bx.c cVar2 = (bx.c) obj;
                m.e(cVar2, "it");
                return Integer.valueOf(cVar2.a);
            case 10:
                m.e((ep.f) obj, "it");
                return b0Var;
            case 11:
                m.e((LocalDate) obj, "it");
                return b0Var;
            case 12:
                y50.a aVar = (y50.a) obj;
                m.e(aVar, "$this$module");
                fo.a aVar2 = new fo.a(17);
                v50.c cVar3 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                a10.d dVarB = b0Var2.b(AudioStoriesDatabase.class);
                b60.b bVar = c60.a.e;
                aVar.a(new w50.e(new v50.a(bVar, dVarB, (b60.a) null, aVar2, cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(DataStore.class), (b60.a) null, new fo.a(0), cVar3)));
                fo.a aVar3 = new fo.a(11);
                v50.c cVar4 = v50.c.B;
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.c.class), (b60.a) null, aVar3, cVar4)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(wn.d.class), (b60.a) null, new fo.a(23), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(xn.e.class), (b60.a) null, new fo.b(5, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(xn.b.class), (b60.a) null, new fo.b(11, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(xn.c.class), (b60.a) null, new fo.b(12, (byte) 0), cVar3)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(g.class), (b60.a) null, new fo.b(13, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.f.class), (b60.a) null, new fo.b(14, (byte) 0), cVar4)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(s.class), (b60.a) null, new fo.b(15, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(no.d.class), (b60.a) null, new fo.a(28), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(ao.a.class), (b60.a) null, new fo.b(9, (byte) 0), cVar3)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.d.class), (b60.a) null, new fo.b(16, (byte) 0), cVar4)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(io.a.class), (b60.a) null, new fo.b(17, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(co.a.class), (b60.a) null, new fo.b(18, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(vn.f.class), (b60.a) null, new fo.b(19, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(vn.b0.class), (b60.a) null, new fo.b(20, (byte) 0), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(u.class), (b60.a) null, new dm.a(27), cVar3)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(h.class), (b60.a) null, new dm.a(28), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.b.class), (b60.a) null, new dm.a(29), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.e.class), (b60.a) null, new fo.a(1), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.a.class), (b60.a) null, new fo.a(2), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.i.class), (b60.a) null, new fo.a(3), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(n.class), (b60.a) null, new fo.a(4), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.m.class), (b60.a) null, new fo.a(5), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(l.class), (b60.a) null, new fo.a(6), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.k.class), (b60.a) null, new fo.a(7), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(tn.j.class), (b60.a) null, new fo.a(8), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.d.class), (b60.a) null, new fo.a(9), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.i.class), (b60.a) null, new fo.a(10), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(o.class), (b60.a) null, new fo.a(12), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.m.class), (b60.a) null, new fo.a(13), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.h.class), (b60.a) null, new fo.a(14), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.k.class), (b60.a) null, new fo.a(15), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(jo.b.class), (b60.a) null, new fo.a(16), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(g1.class), (b60.a) null, new fo.a(18), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.n.class), (b60.a) null, new fo.a(19), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(y.class), (b60.a) null, new fo.a(20), cVar4)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(bm.a.class), new b60.b("StoryDeepLinkHandler"), new fo.a(21), cVar3)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(AudioStoryPlayerLauncher.class), (b60.a) null, new fo.a(22), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.l.class), (b60.a) null, new fo.a(24), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.k.class), (b60.a) null, new fo.a(25), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(AudioStoryAnalytics.class), (b60.a) null, new fo.a(26), cVar4)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(no.e.class), (b60.a) null, new fo.a(27), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(go.a.class), (b60.a) null, new fo.a(29), cVar3)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var2.b(no.g.class), (b60.a) null, new fo.b(0, (byte) 0), cVar3)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.c.class), (b60.a) null, new fo.b(1, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.m.class), (b60.a) null, new fo.b(2, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.b.class), (b60.a) null, new fo.b(3, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.e.class), (b60.a) null, new fo.b(4, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.g.class), (b60.a) null, new fo.b(6, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.a.class), (b60.a) null, new fo.b(7, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.j.class), (b60.a) null, new fo.b(8, (byte) 0), cVar4)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var2.b(ko.h.class), (b60.a) null, new fo.b(10, (byte) 0), cVar4)));
                return b0Var;
            case 13:
                m.e((CorruptionException) obj, "it");
                AudioStoryCatalogsModel defaultInstance = AudioStoryCatalogsModel.getDefaultInstance();
                m.d(defaultInstance, "getDefaultInstance(...)");
                return defaultInstance;
            case 14:
                y50.a aVar4 = (y50.a) obj;
                m.e(aVar4, "$this$module");
                aVar4.a(new w50.e(new v50.a(c60.a.e, a0.a.b(gq.a.class), (b60.a) null, new fo.b(21, (byte) 0), v50.c.A)));
                return b0Var;
            case 15:
                m.e((n4.j) obj, "<this>");
                return b0Var;
            case 16:
                m.e((n6) obj, "it");
                return true;
            case 17:
                j3.y.k((j3.a0) obj, 0);
                return b0Var;
            case TYPE_SINT64_VALUE:
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                w[] wVarArr = j3.y.f8004a;
                z zVar = j3.w.m;
                w wVar = j3.y.f8004a[5];
                ((j3.a0) obj).a(zVar, Boolean.TRUE);
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                w[] wVarArr2 = j3.y.f8004a;
                z zVar2 = j3.w.m;
                w wVar2 = j3.y.f8004a[5];
                ((j3.a0) obj).a(zVar2, Boolean.TRUE);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                Integer num2 = (Integer) obj;
                num2.intValue();
                return num2;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                j3.l lVar = new j3.l(new e00.g(17), new e00.g(17));
                w[] wVarArr3 = j3.y.f8004a;
                z zVar3 = j3.w.f7997v;
                w wVar3 = j3.y.f8004a[12];
                ((j3.a0) obj).a(zVar3, lVar);
                return b0Var;
            case 23:
                float f3 = t4.f5966a;
                return Boolean.TRUE;
            case 24:
                j3.y.o((j3.a0) obj);
                return b0Var;
            case 25:
                w[] wVarArr4 = j3.y.f8004a;
                ((j3.a0) obj).a(j3.w.f8000y, b0Var);
                return b0Var;
            case RuntimeVersion.MINOR:
                i0 i0Var = (i0) obj;
                i0Var.f16302a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                i0Var.a(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, fValueOf).f16292b = r.f8843a;
                i0Var.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                i0Var.a(1800, fValueOf2);
                i0Var.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                i0Var.a(3300, fValueOf3);
                i0Var.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                i0Var.a(4800, fValueOf4);
                i0Var.a(6000, fValueOf4);
                return b0Var;
            case 27:
                w[] wVarArr5 = j3.y.f8004a;
                z zVar4 = j3.w.m;
                w wVar4 = j3.y.f8004a[5];
                ((j3.a0) obj).a(zVar4, Boolean.TRUE);
                return b0Var;
            case 28:
                t tVar = z6.f6045a;
                return b0Var;
            default:
                j3.y.o((j3.a0) obj);
                return b0Var;
        }
    }
}
