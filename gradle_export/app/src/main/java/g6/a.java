package g6;

import a40.z;
import android.content.Context;
import androidx.glance.session.SessionWorker;
import c3.g1;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryEpisodeParams;
import d40.l1;
import d6.r;
import e1.v0;
import ev.c0;
import g1.b5;
import g1.k8;
import g2.x;
import gz.m1;
import hw.j;
import hx.e0;
import java.util.Locale;
import k00.c;
import kh.b0;
import l1.z0;
import m0.w;
import m00.i;
import n0.g;
import no.d;
import nx.p0;
import oo.g0;
import ot.o;
import u00.k;
import u00.n;
import v2.v;
import zz.b;

public final class a extends i implements n {
    public final int A;
    public int B;
    public Object C;
    public final Object D;

    public a(Object obj, Object obj2, c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
    }

    public a(Object obj, c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
    }

    public a(k kVar, b0 b0Var, c cVar) {
        super(2, cVar);
        this.A = 21;
        this.C = (i) kVar;
        this.D = b0Var;
    }

    public final c create(Object obj, c cVar) {
        switch (this.A) {
            case 0:
                a aVar = new a((l1) this.D, cVar, 0);
                aVar.C = obj;
                return aVar;
            case 1:
                return new a((c0) this.C, (u00.a) this.D, cVar, 1);
            case 2:
                return new a((qt.k) this.C, (u00.a) this.D, cVar, 2);
            case 3:
                return new a((m1) this.C, (b) this.D, cVar, 3);
            case 4:
                return new a((x) this.C, (k8) this.D, cVar, 4);
            case 5:
                a aVar2 = new a((b5) this.D, cVar, 5);
                aVar2.C = obj;
                return aVar2;
            case 6:
                return new a((j) this.C, (cq.a) this.D, cVar, 6);
            case 7:
                return new a((e0) this.C, (cq.a) this.D, cVar, 7);
            case 8:
                return new a((i3.c) this.C, (Runnable) this.D, cVar, 8);
            case 9:
                return new a((g1) this.C, (String) this.D, cVar, 9);
            case 10:
                return new a((jd.a) this.C, (gd.a) this.D, cVar, 10);
            case 11:
                return new a((jn.a) this.C, (Locale) this.D, cVar, 11);
            case 12:
                return new a((jp.e0) this.C, (jp.x) this.D, cVar, 12);
            case 13:
                return new a((SessionWorker) this.C, (r) this.D, cVar, 13);
            case 14:
                return new a((w) this.C, (z0) this.D, cVar, 14);
            case 15:
                return new a((lw.b) this.C, (wb.i) this.D, cVar, 15);
            case 16:
                return new a((v) this.C, (w) this.D, cVar, 16);
            case 17:
                a aVar3 = new a((mb.j) this.D, cVar, 17);
                aVar3.C = obj;
                return aVar3;
            case TYPE_SINT64_VALUE:
                return new a((g) this.C, (d0.g) this.D, cVar, 18);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new a((d) this.C, (ho.k) this.D, cVar, 19);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new a((no.n) this.C, (AudioStoryEpisodeParams) this.D, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new a((k) this.C, (b0) this.D, cVar);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new a((p0) this.C, (yt.a) this.D, cVar, 22);
            case 23:
                return new a((nz.n) this.C, (u00.a) this.D, cVar, 23);
            case 24:
                a aVar4 = new a((oo.c0) this.D, cVar, 24);
                aVar4.C = obj;
                return aVar4;
            case 25:
                return new a((Context) this.C, (wb.i) this.D, cVar, 25);
            case RuntimeVersion.MINOR:
                return new a((l1.g1) this.C, (z0) this.D, cVar, 26);
            case 27:
                return new a((Context) this.C, (String) this.D, cVar, 27);
            case 28:
                return new a((v) this.C, (v0) this.D, cVar, 28);
            default:
                return new a((qt.k) this.C, (o) this.D, cVar, 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((t5.b) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 14:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 15:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 16:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                return create((wb.i) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case TYPE_SINT64_VALUE:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 23:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 24:
                return create((g0) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 25:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((z) obj, (c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r68) throws kotlin.NoWhenBranchMatchedException {
        throw new UnsupportedOperationException("Method not decompiled: g6.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
