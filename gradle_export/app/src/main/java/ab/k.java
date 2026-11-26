package ab;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.common.b1;
import androidx.media3.common.q0;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.t0;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k9.a2;
import k9.d1;
import k9.g1;
import k9.i1;
import k9.j1;
import k9.k3;
import k9.m1;
import k9.m3;
import k9.p1;
import k9.p3;
import k9.q1;
import k9.s1;
import k9.t2;
import k9.t3;
import k9.v1;
import k9.v3;
import k9.w1;
import k9.y1;
import k9.z1;

public final class k implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public k(Object obj, Object obj2, Object obj3, List list, int i10) {
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = list;
    }

    public k(m1 m1Var, AtomicInteger atomicInteger, t0 t0Var, ArrayList arrayList, kh.b0 b0Var) {
        this.A = 3;
        this.B = atomicInteger;
        this.C = t0Var;
        this.D = arrayList;
        this.E = b0Var;
    }

    public k(w1 w1Var, g1 g1Var, String str, Bundle bundle, k9.u uVar) {
        this.A = 7;
        this.B = w1Var;
        this.C = str;
        this.D = bundle;
        this.E = uVar;
    }

    @Override
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2;
        k9.k kVar;
        Bundle bundleB;
        switch (this.A) {
            case 0:
                List list = (List) this.B;
                hb.i iVar = (hb.i) this.C;
                za.b bVar = (za.b) this.D;
                WorkDatabase workDatabase = (WorkDatabase) this.E;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).c(iVar.f6976a);
                }
                l.b(bVar, workDatabase, list);
                return;
            case 1:
                ce.b bVar2 = (ce.b) this.B;
                xd.i iVar2 = (xd.i) this.C;
                String str = iVar2.f16547a;
                ud.g gVar = (ud.g) this.D;
                xd.h hVar = (xd.h) this.E;
                bVar2.getClass();
                Logger logger = ce.b.f3142f;
                try {
                    yd.e eVarA = bVar2.f3145c.a(str);
                    if (eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.d(new IllegalArgumentException(str2));
                    } else {
                        ((ee.h) bVar2.f3147e).x(new ce.a(bVar2, iVar2, ((vd.b) eVarA).a(hVar), 0));
                        gVar.d(null);
                    }
                    return;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    gVar.d(e3);
                    return;
                }
            case 2:
                oj.q qVar = (oj.q) this.B;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.C;
                k9.f fVar = (k9.f) this.D;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.E;
                synchronized (qVar.B) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            qVar.x(fVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 3:
                AtomicInteger atomicInteger = (AtomicInteger) this.B;
                t0 t0Var = (t0) this.C;
                ArrayList arrayList = (ArrayList) this.D;
                kh.b0 b0Var = (kh.b0) this.E;
                if (atomicInteger.incrementAndGet() == t0Var.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        kh.v vVar = (kh.v) arrayList.get(i10);
                        if (vVar != null) {
                            try {
                                bitmap = (Bitmap) b5.u(vVar);
                            } catch (CancellationException | ExecutionException e10) {
                                e7.a.c("MLSLegacyStub", "Failed to get bitmap", e10);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(k9.p.a((q0) t0Var.get(i10), bitmap));
                    }
                    b0Var.l(arrayList2);
                    return;
                }
                return;
            case 4:
                m1 m1Var = (m1) this.B;
                a2 a2Var = (a2) this.C;
                Bundle bundle = (Bundle) this.D;
                String str3 = (String) this.E;
                s1 s1Var = m1Var.M;
                if (m1Var.K.P(a2Var, 50001)) {
                    s1Var.C(a2Var, str3, k9.p.h(s1Var.f9418f, bundle));
                    return;
                }
                return;
            case 5:
                m1 m1Var2 = (m1) this.B;
                a2 a2Var2 = (a2) this.C;
                l9.q qVar2 = (l9.q) this.D;
                String str4 = (String) this.E;
                if (!m1Var2.K.P(a2Var2, 50004)) {
                    qVar2.f(null);
                    return;
                }
                s1 s1Var2 = m1Var2.M;
                nv.p pVar = s1Var2.F;
                g1 g1Var = s1Var2.E;
                a2 a2VarF = s1Var2.F(a2Var2);
                pVar.getClass();
                kotlin.jvm.internal.m.e(g1Var, "session");
                kotlin.jvm.internal.m.e(a2VarF, "browser");
                kotlin.jvm.internal.m.e(str4, "mediaId");
                AudioPlayerService audioPlayerService = pVar.a;
                kh.b0 b0VarL = AudioPlayerService.l(audioPlayerService, new d40.l(audioPlayerService, str4, (k00.c) null, 5));
                b0VarL.a(new q1(s1Var2, b0VarL, a2Var2, 0), new p1(s1Var2, 0));
                kh.b0 b0VarV = e7.i0.V(b0VarL, new i1(m1Var2, 0));
                b0VarV.a(new j1(b0VarV, qVar2, 0), kh.p.A);
                return;
            case 6:
                s1 s1Var3 = (s1) this.B;
                kh.b0 b0Var2 = (kh.b0) this.C;
                a2 a2Var3 = (a2) this.D;
                String str5 = (String) this.E;
                k9.q qVar3 = (k9.q) s1.I(b0Var2);
                if (qVar3 == null || qVar3.f9394a != 0) {
                    z1 z1Var = a2Var3.f9209d;
                    z1Var.getClass();
                    s1Var3.G.remove(str5, a2Var3);
                    s1Var3.H.remove(z1Var, str5);
                    return;
                }
                return;
            case 7:
                w1 w1Var = (w1) this.B;
                w1Var.E.execute(new e(w1Var, (k9.u) this.E, (String) this.C, (Bundle) this.D));
                return;
            case 8:
                w1 w1Var2 = (w1) this.B;
                k9.v vVar2 = (k9.v) this.C;
                v1 v1Var = (v1) this.D;
                g1 g1Var2 = (g1) this.E;
                try {
                    k9.u uVar = (k9.u) vVar2.get(0L, TimeUnit.MILLISECONDS);
                    if (w1Var2.d(g1Var2)) {
                        v1Var.A.g(v1Var.B);
                    }
                    uVar.addListener(v1Var);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    w1Var2.A.h(g1Var2);
                    return;
                }
            case 9:
                bb.d dVar = (bb.d) this.B;
                AtomicInteger atomicInteger2 = (AtomicInteger) this.C;
                ArrayList arrayList3 = (ArrayList) this.D;
                ArrayList arrayList4 = (ArrayList) this.E;
                if (atomicInteger2.incrementAndGet() == arrayList3.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList4.size()) {
                        kh.v vVar3 = (kh.v) arrayList4.get(i11);
                        if (vVar3 != null) {
                            try {
                                bitmap2 = (Bitmap) b5.u(vVar3);
                            } catch (CancellationException | ExecutionException e11) {
                                e7.a.c("MediaSessionLegacyStub", "Failed to get bitmap", e11);
                                bitmap2 = null;
                            }
                        } else {
                            bitmap2 = null;
                        }
                        arrayList5.add(new l9.d0(null, k9.p.i((q0) arrayList3.get(i11), bitmap2), i11 == -1 ? -1L : i11));
                        i11++;
                        break;
                    }
                    t2.D(((t2) dVar.E).f9467j, arrayList5);
                    return;
                }
                return;
            case 10:
                m1 m1Var3 = (m1) this.B;
                AtomicReference atomicReference = (AtomicReference) this.C;
                a2 a2Var4 = (a2) this.D;
                e7.g gVar2 = (e7.g) this.E;
                atomicReference.set(m1Var3.J.s(a2Var4));
                gVar2.d();
                return;
            case 11:
                p3 p3Var = (p3) this.B;
                a2 a2Var5 = (a2) this.C;
                s1 s1Var4 = (s1) this.D;
                k9.k kVar2 = (k9.k) this.E;
                oj.q qVar4 = p3Var.f9384f;
                boolean z10 = false;
                try {
                    p3Var.f9385g.remove(a2Var5);
                    if (!s1Var4.o()) {
                        k3 k3Var = (k3) a2Var5.f9209d;
                        k3Var.getClass();
                        IBinder iBinderAsBinder = k3Var.A.asBinder();
                        y1 y1VarS = s1Var4.s(a2Var5);
                        if (qVar4.M(a2Var5)) {
                            e7.a.m("MediaSessionStub", "Controller " + a2Var5 + " has sent connection request multiple times");
                        }
                        qVar4.q(iBinderAsBinder, a2Var5, y1VarS.f9553a, y1VarS.f9554b);
                        b3.g1 g1VarI = qVar4.I(a2Var5);
                        if (g1VarI != null) {
                            v3 v3Var = s1Var4.f9430t;
                            t3 t3Var = s1Var4.f9429s;
                            b1 b1Var = y1VarS.f9554b;
                            t3 t3VarG2 = p3Var.g2(t3Var);
                            MediaSession.Token token = ((l9.c0) s1Var4.f9420h.f9467j.B).f10128c.B;
                            PendingIntent pendingIntent = s1Var4.f9431u;
                            t0 t0Var2 = y1VarS.f9555c;
                            if (t0Var2 == null) {
                                t0Var2 = s1Var4.B;
                            }
                            t0 t0Var3 = y1VarS.f9556d;
                            if (t0Var3 == null) {
                                t0Var3 = s1Var4.C;
                            }
                            try {
                                k9.i iVar3 = new k9.i(1009000300, 8, p3Var, pendingIntent, t0Var2, t0Var3, s1Var4.f9428r, y1VarS.f9553a, b1Var, v3Var.getAvailableCommands(), s1Var4.f9422j.f9293a.getExtras(), s1Var4.D, t3VarG2, token);
                                if (s1Var4.o()) {
                                    z3.v(kVar2);
                                    return;
                                }
                                try {
                                    int iF = g1VarI.f();
                                    kVar = kVar2;
                                    try {
                                        try {
                                            if (kVar instanceof d1) {
                                                bundleB = new Bundle();
                                                bundleB.putBinder(k9.i.B, new k9.h(iVar3));
                                            } else {
                                                bundleB = iVar3.b(a2Var5.f9208c);
                                            }
                                            kVar.Z(iF, bundleB);
                                            z10 = true;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (RemoteException unused2) {
                                    }
                                } catch (RemoteException unused3) {
                                    kVar = kVar2;
                                }
                                if (z10) {
                                    s1Var4.z(a2Var5);
                                    break;
                                }
                                if (z10) {
                                    return;
                                }
                                z3.v(kVar);
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                kVar = kVar2;
                            }
                            if (!z10) {
                                z3.v(kVar);
                            }
                            throw th;
                        }
                        e7.a.m("MediaSessionStub", "Ignoring connection request from unknown controller info");
                    }
                    z3.v(kVar2);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    kVar = kVar2;
                }
                break;
            case 12:
                s1 s1Var5 = (s1) this.B;
                kh.b0 b0Var3 = (kh.b0) this.C;
                e7.h hVar2 = (e7.h) this.D;
                kh.v vVar4 = (kh.v) this.E;
                if (s1Var5.o()) {
                    b0Var3.l(null);
                    return;
                }
                try {
                    hVar2.accept(vVar4);
                    b0Var3.l(null);
                    return;
                } catch (Throwable th6) {
                    b0Var3.m(th6);
                    return;
                }
            case 13:
                s1 s1Var6 = (s1) this.C;
                m3 m3Var = (m3) this.D;
                a2 a2Var6 = (a2) this.E;
                List list2 = (List) this.B;
                if (s1Var6.o()) {
                    return;
                }
                m3Var.b(s1Var6.f9430t, a2Var6, list2);
                return;
            case 14:
                ((o9.a) this.C).a((o9.p) this.B, (o9.m) this.D, (ArrayList) this.E);
                return;
            case 15:
                o9.p pVar2 = (o9.p) this.B;
                o9.a aVar = (o9.a) this.C;
                o9.m mVar = (o9.m) this.D;
                Collection collection = (Collection) this.E;
                pVar2.getClass();
                aVar.a(pVar2, mVar, collection);
                return;
            default:
                ui.b bVar3 = (ui.b) this.C;
                String str6 = (String) this.D;
                Map map = (Map) this.E;
                List list3 = (List) this.B;
                qi.h hVar3 = (qi.h) bVar3.C;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar3.H;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str7 = (String) atomicMarkableReference.getReference();
                    File fileP = hVar3.f13025a.p(str6, "user-data");
                    BufferedWriter bufferedWriter = null;
                    try {
                        try {
                            qi.g gVar3 = new qi.g();
                            gVar3.put("userId", str7);
                            String string = gVar3.toString();
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileP), qi.h.f13024b));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                oi.g.b(bufferedWriter2, "Failed to close user metadata file.");
                            } catch (Exception e12) {
                                e = e12;
                                bufferedWriter = bufferedWriter2;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                oi.g.b(bufferedWriter, "Failed to close user metadata file.");
                            } catch (Throwable th7) {
                                th = th7;
                                bufferedWriter = bufferedWriter2;
                                oi.g.b(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                if (!map.isEmpty()) {
                    hVar3.h(str6, map, false);
                }
                if (list3.isEmpty()) {
                    return;
                }
                hVar3.i(str6, list3);
                return;
        }
    }
}
