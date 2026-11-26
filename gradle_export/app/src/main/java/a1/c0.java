package a1;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.glance.session.SessionWorker;
import bv.e3;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;

public final class c0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final Object C;

    public c0(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public c0(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
    }

    public c0(u00.a aVar, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = (kotlin.jvm.internal.n) aVar;
    }

    public c0(u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 16;
        this.C = (m00.i) nVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                c0 c0Var = new c0((d0) this.C, cVar, 0);
                c0Var.B = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0((u00.a) this.C, cVar);
                c0Var2.B = obj;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0((androidx.lifecycle.r) this.C, cVar, 2);
                c0Var3.B = obj;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0((as.b1) this.C, cVar, 3);
                c0Var4.B = obj;
                return c0Var4;
            case 4:
                return new c0((av.l) this.B, (l1.z0) this.C, cVar, 4);
            case 5:
                return new c0((yu.a) this.B, (av.n) this.C, cVar, 5);
            case 6:
                c0 c0Var5 = new c0((az.r) this.C, cVar, 6);
                c0Var5.B = obj;
                return c0Var5;
            case 7:
                c0 c0Var6 = new c0((b1.e0) this.C, cVar, 7);
                c0Var6.B = obj;
                return c0Var6;
            case 8:
                return new c0((bt.j2) this.B, (ys.c) this.C, cVar, 8);
            case 9:
                return new c0((e3) this.B, (bv.o1) this.C, cVar, 9);
            case 10:
                return new c0((bz.s) this.B, (String) this.C, cVar, 10);
            case 11:
                c0 c0Var7 = new c0((d6.l1) this.C, cVar, 11);
                c0Var7.B = obj;
                return c0Var7;
            case 12:
                c0 c0Var8 = new c0((dq.u) this.C, cVar, 12);
                c0Var8.B = obj;
                return c0Var8;
            case 13:
                c0 c0Var9 = new c0((ds.n) this.C, cVar, 13);
                c0Var9.B = obj;
                return c0Var9;
            case 14:
                return new c0((zs.b) this.B, (zs.a) this.C, cVar, 14);
            case 15:
                c0 c0Var10 = new c0((MainActivity) this.C, cVar, 15);
                c0Var10.B = obj;
                return c0Var10;
            case 16:
                c0 c0Var11 = new c0((u00.n) this.C, cVar);
                c0Var11.B = obj;
                return c0Var11;
            case 17:
                c0 c0Var12 = new c0((ez.u) this.C, cVar, 17);
                c0Var12.B = obj;
                return c0Var12;
            case TYPE_SINT64_VALUE:
                c0 c0Var13 = new c0((fy.c0) this.C, cVar, 18);
                c0Var13.B = obj;
                return c0Var13;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new c0((b00.c) this.B, (zz.a) this.C, cVar, 19);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new c0((fw.c) this.B, (fw.b) this.C, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new c0((ey.b) this.B, (ey.a) this.C, cVar, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new c0((l1.z0) this.B, (l1.z0) this.C, cVar, 22);
            case 23:
                c0 c0Var14 = new c0((hw.j) this.C, cVar, 23);
                c0Var14.B = obj;
                return c0Var14;
            case 24:
                return new c0((i) this.B, (String) this.C, cVar, 24);
            case 25:
                return new c0((is.c1) this.B, (ss.v) this.C, cVar, 25);
            case RuntimeVersion.MINOR:
                return new c0((js.h) this.B, (hs.j) this.C, cVar, 26);
            case 27:
                c0 c0Var15 = new c0((SessionWorker) this.C, cVar, 27);
                c0Var15.B = obj;
                return c0Var15;
            case 28:
                return new c0((ld.l) this.B, (r30.h) this.C, cVar, 28);
            default:
                return new c0((jp.x) this.B, (c3.t2) this.C, cVar, 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                c0 c0VarCreate = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                c0VarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 3:
                c0 c0VarCreate2 = create((as.z) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                c0VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 4:
                c0 c0VarCreate3 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                c0VarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            case 5:
                c0 c0VarCreate4 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                c0VarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
            case 6:
                c0 c0VarCreate5 = create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                c0VarCreate5.invokeSuspend(b0Var5);
                return b0Var5;
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                c0 c0VarCreate6 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                c0VarCreate6.invokeSuspend(b0Var6);
                return b0Var6;
            case 9:
                c0 c0VarCreate7 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                c0VarCreate7.invokeSuspend(b0Var7);
                return b0Var7;
            case 10:
                c0 c0VarCreate8 = create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                c0VarCreate8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                return create((f6.s) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                c0 c0VarCreate9 = create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                c0VarCreate9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                c0 c0VarCreate10 = create((mr.g) obj, (k00.c) obj2);
                g00.b0 b0Var10 = g00.b0.a;
                c0VarCreate10.invokeSuspend(b0Var10);
                return b0Var10;
            case 14:
                c0 c0VarCreate11 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var11 = g00.b0.a;
                c0VarCreate11.invokeSuspend(b0Var11);
                return b0Var11;
            case 15:
                c0 c0VarCreate12 = create((du.n0) obj, (k00.c) obj2);
                g00.b0 b0Var12 = g00.b0.a;
                c0VarCreate12.invokeSuspend(b0Var12);
                return b0Var12;
            case 16:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                c0 c0VarCreate13 = create((Throwable) obj, (k00.c) obj2);
                g00.b0 b0Var13 = g00.b0.a;
                c0VarCreate13.invokeSuspend(b0Var13);
                return b0Var13;
            case TYPE_SINT64_VALUE:
                c0 c0VarCreate14 = create((List) obj, (k00.c) obj2);
                g00.b0 b0Var14 = g00.b0.a;
                c0VarCreate14.invokeSuspend(b0Var14);
                return b0Var14;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                c0 c0VarCreate15 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var15 = g00.b0.a;
                c0VarCreate15.invokeSuspend(b0Var15);
                return b0Var15;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                c0 c0VarCreate16 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var16 = g00.b0.a;
                c0VarCreate16.invokeSuspend(b0Var16);
                return b0Var16;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                c0 c0VarCreate17 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var17 = g00.b0.a;
                c0VarCreate17.invokeSuspend(b0Var17);
                return b0Var17;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                c0 c0VarCreate18 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var18 = g00.b0.a;
                c0VarCreate18.invokeSuspend(b0Var18);
                return b0Var18;
            case 23:
                c0 c0VarCreate19 = create((List) obj, (k00.c) obj2);
                g00.b0 b0Var19 = g00.b0.a;
                c0VarCreate19.invokeSuspend(b0Var19);
                return b0Var19;
            case 24:
                c0 c0VarCreate20 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var20 = g00.b0.a;
                c0VarCreate20.invokeSuspend(b0Var20);
                return b0Var20;
            case 25:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                c0 c0VarCreate21 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var21 = g00.b0.a;
                c0VarCreate21.invokeSuspend(b0Var21);
                return b0Var21;
            case 27:
                return create((l6.m) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                c0 c0VarCreate22 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var22 = g00.b0.a;
                c0VarCreate22.invokeSuspend(b0Var22);
                return b0Var22;
            default:
                c0 c0VarCreate23 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var23 = g00.b0.a;
                c0VarCreate23.invokeSuspend(b0Var23);
                return b0Var23;
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        as.u0 u0VarA;
        String message;
        Integer num;
        String strK;
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        Long releaseAtEpochMillis;
        String message2;
        String str2;
        String str3;
        c3.t2 t2Var;
        int i11 = this.A;
        int i12 = 10;
        int i13 = 2;
        int i14 = 3;
        boolean z10 = true;
        z10 = true;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.C;
        switch (i11) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar = (a40.z) this.B;
                d0 d0Var = (d0) obj2;
                AtomicReference atomicReference = d0Var.f31b;
                return Boolean.valueOf(atomicReference.compareAndSet(null, a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d((a40.e1) atomicReference.getAndSet(null), d0Var, null, i14), 3)));
            case 1:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                k00.i iVarA = ((a40.z) this.B).A();
                kotlin.jvm.internal.n nVar = (kotlin.jvm.internal.n) obj2;
                try {
                    a40.y1 y1Var = new a40.y1();
                    y1Var.F = a40.c0.u(a40.c0.r(iVarA), true, y1Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a40.y1.G;
                    try {
                        do {
                            i10 = atomicIntegerFieldUpdater.get(y1Var);
                            if (i10 != 0) {
                                if (i10 != 2 && i10 != 3) {
                                    a40.y1.m(i10);
                                    throw null;
                                }
                            }
                            return nVar.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(y1Var, i10, 0));
                        return nVar.invoke();
                    } finally {
                        y1Var.l();
                    }
                } catch (InterruptedException e3) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e3);
                }
            case 2:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar2 = (a40.z) this.B;
                androidx.lifecycle.r rVar = (androidx.lifecycle.r) obj2;
                androidx.lifecycle.q qVar = rVar.A;
                if (qVar.b().compareTo(androidx.lifecycle.p.B) >= 0) {
                    qVar.a(rVar);
                } else {
                    a40.c0.j(zVar2.A(), (CancellationException) null);
                }
                return b0Var;
            case 3:
                as.z zVar3 = (as.z) this.B;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                as.b1 b1Var = (as.b1) obj2;
                pm.b bVar = ((vm.a) b1Var).c;
                if (zVar3 != null) {
                    dw.a aVar5 = zVar3.a;
                    qr.r rVar2 = aVar5.g ? qr.r.A : ((as.u0) bVar.d.getValue()).j;
                    u0VarA = as.u0.a(as.b1.n(b1Var, as.u0.a((as.u0) bVar.d.getValue(), aVar5, zVar3.b, (u30.b) null, (u30.b) null, 0, false, (String) null, false, rVar2, false, false, ze.d.E(zVar3.c), zVar3.d, ze.d.E(zVar3.e), (u30.b) null, false, false, (String) null, false, false, 2067960), zVar3.b, aVar5, rVar2, (String) null, false, 48), (dw.a) null, (u30.b) null, (u30.b) null, (u30.b) null, 0, false, (String) null, false, (qr.r) null, false, false, (u30.b) null, false, (u30.b) null, (u30.b) null, false, false, (String) null, false, (aVar5.c() || b1Var.o.a(aVar5) == null) ? false : true, 1048575);
                } else {
                    u0VarA = as.u0.a((as.u0) bVar.d.getValue(), (dw.a) null, (u30.b) null, (u30.b) null, (u30.b) null, 0, false, (String) null, false, (qr.r) null, false, false, (u30.b) null, false, (u30.b) null, (u30.b) null, false, false, (String) null, false, false, 2097150);
                }
                b1Var.i(u0VarA);
                return b0Var;
            case 4:
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                if (!((bv.o1) ((l1.z0) obj2).getValue()).R) {
                    ((av.l) this.B).dismissAllowingStateLoss();
                }
                return b0Var;
            case 5:
                l00.a aVar7 = l00.a.A;
                ri.t1.O(obj);
                if (((yu.a) this.B) == null) {
                    av.n nVar2 = (av.n) obj2;
                    Dialog dialog = nVar2.getDialog();
                    eg.f fVar = dialog instanceof eg.f ? (eg.f) dialog : null;
                    BottomSheetBehavior bottomSheetBehaviorF = fVar != null ? fVar.f() : null;
                    if (bottomSheetBehaviorF == null) {
                        nVar2.dismissAllowingStateLoss();
                    } else {
                        bottomSheetBehaviorF.K(5);
                    }
                }
                return b0Var;
            case 6:
                Throwable th2 = (Throwable) this.B;
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                az.r rVar3 = (az.r) obj2;
                pm.b bVar2 = ((vm.a) rVar3).c;
                pm.c cVar = rVar3.e;
                rVar3.i(az.q.a((az.q) bVar2.d.getValue(), (u30.c) null, (String) null, false, false, false, 31));
                if ((th2 instanceof ApiException) || (th2 instanceof AuthException)) {
                    message = th2.getMessage();
                    if (message == null) {
                        message = cVar.a(2131887216, new Object[0]);
                    }
                } else {
                    message = cVar.a(2131887216, new Object[0]);
                }
                ab.a0.A0(rVar3, new az.h(message));
                return b0Var;
            case 7:
                l00.a aVar9 = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar4 = (a40.z) this.B;
                b1.e0 e0Var = (b1.e0) obj2;
                k00.c cVar2 = null;
                a40.c0.y(zVar4, (k00.i) null, (a40.a0) null, new i2(e0Var, cVar2, z10 ? 1 : 0), 3);
                return a40.c0.y(zVar4, (k00.i) null, (a40.a0) null, new i2(e0Var, cVar2, i13), 3);
            case 8:
                l00.a aVar10 = l00.a.A;
                ri.t1.O(obj);
                bt.j2 j2Var = (bt.j2) this.B;
                j2Var.i(bt.a1.a((bt.a1) ((vm.a) j2Var).c.d.getValue(), (ys.c) obj2, false, false, (bx.c) null, false, false, false, false, (AuthRootLauncher) null, (ys.b) null, (ys.f) null, (u30.b) null, (ys.m) null, (ys.a) null, (mr.g) null, 0, (u30.b) null, false, false, false, false, false, false, 16777214));
                return b0Var;
            case 9:
                bv.o1 o1Var = (bv.o1) obj2;
                l00.a aVar11 = l00.a.A;
                ri.t1.O(obj);
                e3 e3Var = (e3) this.B;
                if (e3Var.s.k()) {
                    h00.b bVar3 = o1Var.E;
                    Integer numT = (!o1Var.D || bVar3.isEmpty()) ? null : c7.i.T(o1Var.a, bVar3);
                    if (numT == null) {
                        numT = o1Var.F;
                    }
                    e3Var.i(bv.o1.a(o1Var, 0L, 0L, 0.0f, 0.0f, 0.0f, (PlayerItem) null, false, false, 0, false, false, false, (zz.a) null, (u30.b) null, (u30.b) null, (u30.b) null, (u30.b) null, (u30.b) null, false, (yu.g) null, false, false, false, false, false, false, false, (ru.d) null, true, false, (u30.b) null, numT, (u30.f) null, (ot.b) null, (String) null, (u30.f) null, false, (String) null, (String) null, (String) null, (rt.g) null, 0, false, false, false, false, (ot.e) null, false, (su.c) null, (su.t) null, false, (yu.a) null, false, false, false, 1872756735, 16777215));
                } else {
                    e3Var.m.f(true, zp.b.I);
                }
                return b0Var;
            case 10:
                l00.a aVar12 = l00.a.A;
                ri.t1.O(obj);
                bz.s sVar = (bz.s) this.B;
                sVar.i(bz.p.a((bz.p) ((vm.a) sVar).c.d.getValue(), false, (u30.b) null, (String) null, (String) null, false, false, false, 15));
                ab.a0.A0(sVar, new bz.k(bz.s.k(sVar, (String) obj2, false), ol.c.B));
                sVar.m();
                return b0Var;
            case 11:
                l00.a aVar13 = l00.a.A;
                ri.t1.O(obj);
                f6.s sVar2 = (f6.s) this.B;
                androidx.glance.appwidget.protobuf.x xVar = (androidx.glance.appwidget.protobuf.x) sVar2.d(5);
                if (!xVar.A.equals(sVar2)) {
                    xVar.c();
                    androidx.glance.appwidget.protobuf.x.d(xVar.B, sVar2);
                }
                d6.l1 l1Var = (d6.l1) obj2;
                f6.r rVar4 = (f6.r) xVar;
                int iS = ((f6.s) rVar4.B).s();
                rVar4.c();
                f6.s.p((f6.s) rVar4.B, iS);
                rVar4.c();
                f6.s.o((f6.s) rVar4.B);
                for (Map.Entry entry : l1Var.f4672b.entrySet()) {
                    f6.w wVar = (f6.w) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (l1Var.f4675e.contains(new Integer(iIntValue))) {
                        f6.t tVarR = f6.u.r();
                        tVarR.c();
                        f6.u.n((f6.u) tVarR.B, wVar);
                        tVarR.c();
                        f6.u.o((f6.u) tVarR.B, iIntValue);
                        rVar4.c();
                        f6.s.n((f6.s) rVar4.B, (f6.u) tVarR.a());
                    }
                }
                return rVar4.a();
            case 12:
                g00.k kVar = (g00.k) this.B;
                l00.a aVar14 = l00.a.A;
                ri.t1.O(obj);
                ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) kVar.A;
                long jLongValue = ((Number) kVar.B).longValue();
                dq.u uVar = (dq.u) obj2;
                xw.e eVar = uVar.g;
                SharedPreferences sharedPreferences = eVar.a;
                SharedPreferences sharedPreferences2 = eVar.a;
                if (sharedPreferences.getBoolean("skipReciterEventCelebrationAfterOnboardingOnce", false)) {
                    uVar.m((Integer) null);
                } else {
                    if (reciterCollectionEvent != null) {
                        if (!(reciterCollectionEvent.getReleaseAtEpochMillis() == null ? false : !z3.F(reciterCollectionEvent, jLongValue)) || (releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis()) == null) {
                            numValueOf2 = null;
                        } else {
                            double dLongValue = (releaseAtEpochMillis.longValue() - jLongValue) / 1000.0d;
                            if (dLongValue <= 0.0d || dLongValue > 6.0d) {
                                numValueOf2 = null;
                            } else {
                                numValueOf2 = Integer.valueOf(Math.max(1, (int) dLongValue));
                            }
                        }
                        num = numValueOf2;
                    } else {
                        num = null;
                    }
                    Object[] objArr = uVar.l != null && num == null && uVar.j == null;
                    if (objArr != false && reciterCollectionEvent != null) {
                        ta.c0.M(androidx.lifecycle.u0.i(uVar), null, null, null, new d0.i2(uVar, reciterCollectionEvent, (k00.c) null, i12), 31);
                    }
                    uVar.l = num;
                    if (num != null) {
                        a40.u1 u1Var = uVar.k;
                        if (u1Var != null) {
                            u1Var.i((CancellationException) null);
                        }
                        uVar.k = null;
                        uVar.j = null;
                    }
                    Integer num2 = uVar.j;
                    if (num2 != null) {
                        num = num2;
                    }
                    uVar.m(num);
                    if (objArr == true) {
                        str = null;
                    } else {
                        if (sharedPreferences2.getBoolean("skipReciterEventCelebrationAfterOnboardingOnce", false) || reciterCollectionEvent == null || reciterCollectionEvent.getReciterIds().isEmpty() || !z3.F(reciterCollectionEvent, jLongValue)) {
                            strK = null;
                        } else {
                            strK = z3.K(reciterCollectionEvent);
                            String str4 = RuntimeVersion.SUFFIX;
                            String string = sharedPreferences2.getString("lastSeenReciterEventCelebrationKey", RuntimeVersion.SUFFIX);
                            if (string != null) {
                                str4 = string;
                            }
                            if (str4.equals(strK)) {
                                strK = null;
                            }
                        }
                        str = strK;
                    }
                    if (str != null && uVar.k == null && reciterCollectionEvent != null && uVar.j == null && !((dq.m) ((vm.a) uVar).c.d.getValue()).e) {
                        Long releaseAtEpochMillis2 = reciterCollectionEvent.getReleaseAtEpochMillis();
                        if (releaseAtEpochMillis2 != null) {
                            double dLongValue2 = (releaseAtEpochMillis2.longValue() - jLongValue) / 1000.0d;
                            if (dLongValue2 <= 0.0d || dLongValue2 > 6.0d) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(Math.max(1, (int) dLongValue2));
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            uVar.k = ta.c0.M(androidx.lifecycle.u0.i(uVar), null, null, new r1(uVar, null, i13), new dq.s(uVar, str, reciterCollectionEvent, jLongValue, (k00.c) null), 23);
                        }
                    }
                }
                return b0Var;
            case 13:
                mr.g gVar = (mr.g) this.B;
                l00.a aVar15 = l00.a.A;
                ri.t1.O(obj);
                ds.n nVar3 = (ds.n) obj2;
                nVar3.i(ds.m.a((ds.m) ((vm.a) nVar3).c.d.getValue(), gVar, 0, false, false, 30));
                return b0Var;
            case 14:
                l00.a aVar16 = l00.a.A;
                ri.t1.O(obj);
                zs.a aVar17 = (zs.a) obj2;
                aVar17.a.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a((p9.g) h00.q.U0(((zs.b) this.B).a), InsightsRoute.InsightsScreen.INSTANCE)));
                aVar17.b.setValue(Boolean.TRUE);
                return b0Var;
            case 15:
                du.n0 n0Var = (du.n0) this.B;
                l00.a aVar18 = l00.a.A;
                ri.t1.O(obj);
                MainActivity mainActivity = (MainActivity) obj2;
                if (!n0Var.f && !n0Var.g) {
                    z10 = false;
                }
                mainActivity.M = z10;
                if (z10) {
                    av.i iVarD = mainActivity.getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment");
                    av.i iVar = iVarD instanceof av.i ? iVarD : null;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    oo.c0 c0VarD = mainActivity.getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment");
                    oo.c0 c0Var = c0VarD instanceof oo.c0 ? c0VarD : null;
                    if (c0Var != null) {
                        c0Var.dismiss();
                    }
                    mainActivity.N = false;
                    mainActivity.O = false;
                    MainActivity.h(mainActivity);
                }
                return b0Var;
            case 16:
                l00.a aVar19 = l00.a.A;
                ri.t1.O(obj);
                k00.i iVar2 = ((a40.z) this.B).A().get(k00.d.A);
                kotlin.jvm.internal.m.b(iVar2);
                k00.i iVar3 = (k00.e) iVar2;
                a40.q qVarB = a40.c0.b();
                k00.c cVar3 = null;
                a40.c0.x(a40.z0.A, iVar3, a40.a0.D, new e2(qVarB, (u00.n) obj2, (k00.c) null));
                while (!qVarB.Q()) {
                    try {
                        return a40.c0.C(iVar3, new a0(qVarB, cVar3, 16));
                    } catch (InterruptedException unused) {
                        cVar3 = null;
                    }
                }
                return qVarB.D();
            case 17:
                ez.u uVar2 = (ez.u) obj2;
                Throwable th3 = (Throwable) this.B;
                l00.a aVar20 = l00.a.A;
                ri.t1.O(obj);
                if ((th3 instanceof ApiException) || (th3 instanceof AuthException)) {
                    message2 = th3.getMessage();
                    if (message2 == null) {
                        message2 = uVar2.e.a(2131887261, new Object[0]);
                    }
                } else {
                    message2 = uVar2.e.a(2131887261, new Object[0]);
                }
                uVar2.i(ez.t.a((ez.t) ((vm.a) uVar2).c.d.getValue(), (String) null, (String) null, message2, ((ez.t) ((vm.a) uVar2).c.d.getValue()).d + 1, (ep.f) null, (LocalDate) null, false, false, 499));
                return b0Var;
            case TYPE_SINT64_VALUE:
                List list = (List) this.B;
                l00.a aVar21 = l00.a.A;
                ri.t1.O(obj);
                fy.c0 c0Var2 = (fy.c0) obj2;
                fy.u uVar3 = (fy.u) ((vm.a) c0Var2).c.d.getValue();
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((yt.b) it.next()).a));
                }
                u30.b bVarD0 = g4.d0(h00.q.G0(arrayList));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Integer num3 = ((yt.b) it2.next()).e;
                    if (num3 != null) {
                        arrayList2.add(num3);
                    }
                }
                u30.b bVarD1 = g4.d0(h00.q.G0(arrayList2));
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Integer num4 = ((yt.b) it3.next()).d;
                    if (num4 != null) {
                        arrayList3.add(num4);
                    }
                }
                c0Var2.i(fy.u.a(uVar3, (String) null, (u30.b) null, (u30.b) null, (u30.b) null, false, false, bVarD0, bVarD1, g4.d0(h00.q.G0(arrayList3)), 63));
                fy.c0.j(c0Var2);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                l00.a aVar22 = l00.a.A;
                ri.t1.O(obj);
                b00.c cVar4 = (b00.c) this.B;
                zz.a aVar23 = (zz.a) obj2;
                i7.z zVar5 = cVar4.f;
                if (aVar23 == null) {
                    Uri uri = Uri.parse("asset:///videos/background/playerBackground.mp4");
                    if (cVar4.e != null || zVar5.getMediaItemCount() <= 0) {
                        zVar5.setMediaItem(androidx.media3.common.q0.b(uri));
                        zVar5.prepare();
                        cVar4.e = null;
                    }
                } else {
                    String str5 = aVar23.a;
                    String strK2 = aVar23.b;
                    if (r30.r.x0(strK2, "http", false)) {
                        strK2 = cVar4.c.k(str5, strK2);
                    }
                    zVar5.setMediaItem(androidx.media3.common.q0.b(Uri.parse(strK2)));
                    zVar5.prepare();
                    cVar4.e = aVar23;
                }
                cVar4.f.play();
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                l00.a aVar24 = l00.a.A;
                ri.t1.O(obj);
                ((fw.b) obj2).a.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a((p9.g) h00.q.U0(((fw.c) this.B).a), PlaylistsRoute.PlaylistsScreen.INSTANCE)));
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                l00.a aVar25 = l00.a.A;
                ri.t1.O(obj);
                ((ey.a) obj2).a.setValue(Boolean.valueOf(kotlin.jvm.internal.m.a((p9.g) h00.q.U0(((ey.b) this.B).a), SearchRoute.SearchScreen.INSTANCE)));
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                l00.a aVar26 = l00.a.A;
                ri.t1.O(obj);
                l1.z0 z0Var = (l1.z0) this.B;
                float f3 = hv.v.a;
                u00.k kVar2 = (u00.k) z0Var.getValue();
                Boolean bool = (Boolean) ((l1.z0) obj2).getValue();
                bool.booleanValue();
                kVar2.invoke(bool);
                return b0Var;
            case 23:
                List list2 = (List) this.B;
                l00.a aVar27 = l00.a.A;
                ri.t1.O(obj);
                hw.j jVar = (hw.j) obj2;
                jVar.i(hw.f.a((hw.f) ((vm.a) jVar).c.d.getValue(), list2.isEmpty() ? g4.d0(h00.n.V0(new dw.a[]{new dw.a(-1, "favourites", jVar.g.a(2131886989, new Object[0]), RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, false, h00.x.A, v30.g.B)})) : g4.d0(list2), false, false, false, 24));
                return b0Var;
            case 24:
                l00.a aVar28 = l00.a.A;
                ri.t1.O(obj);
                ((ad.f) ((i) this.B).B).i((String) obj2);
                return b0Var;
            case 25:
                l00.a aVar29 = l00.a.A;
                ri.t1.O(obj);
                bk.m mVar = ((is.c1) this.B).d;
                ss.v vVar = (ss.v) obj2;
                kotlin.jvm.internal.m.e(vVar, "from");
                Integer numValueOf3 = Integer.valueOf(vVar.a);
                Integer numValueOf4 = Integer.valueOf(vVar.b);
                Integer numValueOf5 = Integer.valueOf(vVar.c);
                ss.x xVar2 = vVar.d;
                hs.a0 a0Var = new hs.a0(Integer.valueOf(xVar2.b), Long.valueOf(xVar2.a), xVar2.c);
                Long lValueOf = Long.valueOf(vVar.e);
                ss.o oVar = vVar.k;
                int i15 = oVar == null ? -1 : fs.i.a[oVar.ordinal()];
                if (i15 != -1) {
                    if (i15 == 1) {
                        str3 = "uploading";
                    } else if (i15 == 2) {
                        str3 = "pending";
                    } else if (i15 == 3) {
                        str3 = "completed";
                    } else if (i15 == 4) {
                        str3 = "skipped";
                    } else {
                        if (i15 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = "failed";
                    }
                    str2 = str3;
                } else {
                    str2 = null;
                }
                Instant instant = vVar.l;
                String string2 = instant != null ? instant.toString() : null;
                List<ss.c> list3 = vVar.f;
                ArrayList arrayList4 = new ArrayList(h00.r.q0(list3, 10));
                for (ss.c cVar5 : list3) {
                    String str6 = cVar5.a;
                    arrayList4.add(new hs.c(Integer.valueOf(cVar5.c), Long.valueOf(cVar5.b), str6, str6));
                }
                List<ss.i> list4 = vVar.g;
                ArrayList arrayList5 = new ArrayList(h00.r.q0(list4, 10));
                for (ss.i iVar4 : list4) {
                    String str7 = iVar4.a;
                    arrayList5.add(new hs.g(Integer.valueOf(iVar4.b), Long.valueOf(iVar4.c), str7, str7));
                    numValueOf3 = numValueOf3;
                }
                Integer num5 = numValueOf3;
                List<ss.s> list5 = vVar.h;
                ArrayList arrayList6 = new ArrayList(h00.r.q0(list5, 10));
                for (ss.s sVar3 : list5) {
                    String str8 = sVar3.a;
                    if (r30.k.L0(str8)) {
                        str8 = null;
                    }
                    arrayList6.add(new hs.w(Integer.valueOf(sVar3.b), Long.valueOf(sVar3.c), str8));
                }
                List<ss.w> list6 = vVar.i;
                ArrayList arrayList7 = new ArrayList(h00.r.q0(list6, 10));
                for (ss.w wVar2 : list6) {
                    String str9 = wVar2.a;
                    arrayList7.add(new hs.z(str9, str9, Integer.valueOf(wVar2.b), Integer.valueOf(wVar2.c), Long.valueOf(wVar2.d), Integer.valueOf(wVar2.e)));
                }
                List<ss.b> list7 = vVar.j;
                ArrayList arrayList8 = new ArrayList(h00.r.q0(list7, 10));
                for (ss.b bVar4 : list7) {
                    String str10 = bVar4.a;
                    arrayList8.add(new hs.b(str10, str10, Integer.valueOf(bVar4.b), bVar4.c, Long.valueOf(bVar4.d), Integer.valueOf(bVar4.e)));
                }
                return mVar.i(new hs.t(num5, numValueOf4, numValueOf5, a0Var, lValueOf, str2, string2, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8));
            case RuntimeVersion.MINOR:
                l00.a aVar30 = l00.a.A;
                ri.t1.O(obj);
                js.h hVar = (js.h) this.B;
                ik.b bVar5 = new ik.b(new OutputStreamWriter(new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(hVar.a()), Cast.MAX_MESSAGE_LENGTH)), r30.a.a));
                try {
                    hVar.c.k((hs.j) obj2, hs.j.class, bVar5);
                    bVar5.close();
                    return b0Var;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ta.c0.C(bVar5, th4);
                        throw th5;
                    }
                }
            case 27:
                l00.a aVar31 = l00.a.A;
                ri.t1.O(obj);
                return (d6.r) ((l6.m) this.B).f10037a.get(((SessionWorker) obj2).l);
            case 28:
                l00.a aVar32 = l00.a.A;
                ri.t1.O(obj);
                ad.f fVar2 = ((ld.l) this.B).f10277a;
                String str11 = (String) ((r30.h) obj2).a().get(1);
                kotlin.jvm.internal.m.e(str11, "insertId");
                fVar2.f447d.remove(str11);
                return b0Var;
            default:
                l00.a aVar33 = l00.a.A;
                ri.t1.O(obj);
                if (((jp.x) this.B).p && (t2Var = (c3.t2) obj2) != null) {
                    ((c3.p1) t2Var).a();
                }
                return b0Var;
        }
    }
}
