package wc;

import a40.u1;
import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import av.o;
import g00.k;
import h00.d0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import rc.f;
import rc.n;
import rc.p;
import rc.q;
import rc.t;

public final class c extends b {
    public final q H;

    public c(Window.Callback callback, Activity activity, o oVar, List list, cd.b bVar, f fVar, q qVar) {
        super(callback, activity, oVar, list, bVar, fVar);
        m.e(list, "viewTargetLocators");
        m.e(bVar, "logger");
        m.e(fVar, "autocaptureState");
        this.H = qVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q qVar;
        boolean z10;
        boolean z11;
        f fVar;
        f fVar2;
        String str;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && (qVar = this.H) != null) {
            ConcurrentHashMap concurrentHashMap = qVar.f13219f;
            if (motionEvent.getAction() == 1) {
                Activity activity = this.B;
                Window window = activity.getWindow();
                View decorView = window != null ? window.getDecorView() : null;
                cd.b bVar = this.D;
                if (decorView == null) {
                    bVar.a("DecorView is null in handleFrustrationInteraction()");
                    return zDispatchTouchEvent;
                }
                tc.c cVarB = this.G;
                if (cVarB != null) {
                    this.G = null;
                } else {
                    k kVar = new k(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
                    tc.b[] bVarArr = tc.b.A;
                    cVarB = tc.a.b(decorView, kVar, this.C, bVar);
                    if (cVarB == null) {
                        bVar.b("Unable to find click target for frustration interaction");
                        return zDispatchTouchEvent;
                    }
                }
                boolean z12 = cVarB.f14519i;
                boolean z13 = cVarB.f14518h;
                if (z13 && z12) {
                    bVar.b("Ignoring all frustration interactions for target: " + cVarB.f14512b);
                    return zDispatchTouchEvent;
                }
                float x2 = motionEvent.getX();
                float y10 = motionEvent.getY();
                System.currentTimeMillis();
                String str2 = cVarB.f14512b;
                p pVar = new p(str2, cVarB.f14513c, cVarB.f14514d, cVarB.f14515e, cVarB.f14516f, cVarB.f14517g);
                f fVar3 = qVar.f13216c;
                cd.b bVar2 = qVar.f13215b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                System.currentTimeMillis();
                if (fVar3.f13171e.contains(t.f13222b)) {
                    if (z13) {
                        z10 = z12;
                        z11 = zDispatchTouchEvent;
                        fVar2 = fVar3;
                        bVar2 = bVar2;
                        bVar2.b("Skipping rage click processing for ignored target: " + str2);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append('_');
                        float f3 = qVar.f13217d;
                        sb2.append((int) (x2 / f3));
                        sb2.append('_');
                        sb2.append((int) (y10 / f3));
                        String string = sb2.toString();
                        rc.o oVar = (rc.o) concurrentHashMap.get(string);
                        if (oVar != null) {
                            z10 = z12;
                            ArrayList arrayList = oVar.f13207g;
                            z11 = zDispatchTouchEvent;
                            float f10 = oVar.f13205e;
                            float f11 = oVar.f13204d;
                            str = str2;
                            fVar2 = fVar3;
                            long j9 = oVar.f13201a;
                            if (jCurrentTimeMillis - j9 <= 1000) {
                                PointF pointF = new PointF(x2, y10);
                                PointF pointF2 = new PointF(f11, f10);
                                if (PointF.length(pointF.x - pointF2.x, pointF.y - pointF2.y) <= f3) {
                                    oVar.f13203c++;
                                    oVar.f13202b = jCurrentTimeMillis;
                                    arrayList.add(new n(x2, y10, jCurrentTimeMillis));
                                    if (oVar.f13203c >= 4) {
                                        Map mapJ = ze.d.j(cVarB, activity);
                                        k kVar2 = new k("[Amplitude] Begin Time", Long.valueOf(j9));
                                        k kVar3 = new k("[Amplitude] End Time", Long.valueOf(oVar.f13202b));
                                        k kVar4 = new k("[Amplitude] Duration", Long.valueOf(oVar.f13202b - j9));
                                        k kVar5 = new k("[Amplitude] X", Integer.valueOf((int) f11));
                                        k kVar6 = new k("[Amplitude] Y", Integer.valueOf((int) f10));
                                        k kVar7 = new k("[Amplitude] Click Count", Integer.valueOf(oVar.f13203c));
                                        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            n nVar = (n) it.next();
                                            arrayList2.add(d0.R(new k[]{new k("[Amplitude] X", Integer.valueOf((int) nVar.f13198a)), new k("[Amplitude] Y", Integer.valueOf((int) nVar.f13199b)), new k("timestamp", Long.valueOf(nVar.f13200c))}));
                                            it = it;
                                            kVar2 = kVar2;
                                            kVar4 = kVar4;
                                            kVar5 = kVar5;
                                            kVar6 = kVar6;
                                        }
                                        rc.c.i(qVar.f13214a, "[Amplitude] Rage Click", d0.U(mapJ, d0.R(new k[]{kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, new k("[Amplitude] Clicks", arrayList2)})), 4);
                                        bVar2.b("Rage click detected with " + oVar.f13203c + " clicks");
                                        concurrentHashMap.remove(string);
                                    }
                                } else {
                                    concurrentHashMap.put(string, new rc.o(jCurrentTimeMillis, jCurrentTimeMillis, x2, y10, pVar, va.a.W(new n(x2, y10, jCurrentTimeMillis))));
                                }
                            } else {
                                concurrentHashMap.put(string, new rc.o(jCurrentTimeMillis, jCurrentTimeMillis, x2, y10, pVar, va.a.W(new n(x2, y10, jCurrentTimeMillis))));
                            }
                        } else {
                            z10 = z12;
                            z11 = zDispatchTouchEvent;
                            str = str2;
                            fVar2 = fVar3;
                            concurrentHashMap.put(string, new rc.o(jCurrentTimeMillis, jCurrentTimeMillis, x2, y10, pVar, va.a.W(new n(x2, y10, jCurrentTimeMillis))));
                        }
                        str2 = str;
                    }
                    fVar = fVar2;
                } else {
                    z10 = z12;
                    z11 = zDispatchTouchEvent;
                    bVar2 = bVar2;
                    fVar = fVar3;
                }
                if (!fVar.f13171e.contains(rc.r.f13220b)) {
                    return z11;
                }
                if (z10) {
                    bVar2.b("Skipping dead click processing for ignored target: " + str2);
                    return z11;
                }
                u1 u1Var = qVar.f13218e;
                if (u1Var == null || !u1Var.a()) {
                    bVar2.a("Dead click detection is disabled - call start() to enable.");
                    return z11;
                }
                bVar2.a("Dead click detection is disabled - no UI change signals observed yet. Ensure SessionReplay plugin is active.");
                return z11;
            }
        }
        return zDispatchTouchEvent;
    }
}
