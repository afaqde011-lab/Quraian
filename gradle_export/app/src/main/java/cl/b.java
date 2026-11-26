package cl;

import ab.a0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import c3.k1;
import c4.w;
import g00.b0;
import h00.r;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import k2.h;
import kotlin.jvm.internal.m;
import l1.p2;
import l1.z;
import l1.z0;
import m3.n0;
import os.x;
import u00.k;
import y3.j;
import y3.o;

public final class b implements k {
    public final int A;
    public final long B;
    public final Object C;

    public b(long j, Object obj, int i) {
        this.A = i;
        this.B = j;
        this.C = obj;
    }

    public b(Object obj, long j, int i) {
        this.A = i;
        this.C = obj;
        this.B = j;
    }

    @Override
    public final Object invoke(Object obj) {
        Window window;
        ArrayList arrayList;
        Window window2;
        Iterator it;
        int i = this.A;
        Activity activity = null;
        b0 b0Var = b0.a;
        long j = this.B;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                View view = (View) obj2;
                z DisposableEffect = (z) obj;
                m.e(DisposableEffect, "$this$DisposableEffect");
                ArrayList<Window> arrayList2 = new ArrayList();
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        window = null;
                    } else if (parent instanceof w) {
                        window = ((w) parent).getWindow();
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (window != null) {
                    arrayList2.add(window);
                }
                Context context = view.getContext();
                m.d(context, "getContext(...)");
                while (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        if (activity != null && (window2 = activity.getWindow()) != null) {
                            if (arrayList2.isEmpty()) {
                                arrayList2.add(window2);
                            } else {
                                it = arrayList2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        arrayList2.add(window2);
                                    }
                                } while (!m.a((Window) it.next(), window2));
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return new c(0);
                        }
                        arrayList = new ArrayList(r.q0(arrayList2, 10));
                        for (Window window3 : arrayList2) {
                            arrayList.add(new d(window3, window3.getNavigationBarColor(), window3.isNavigationBarContrastEnforced()));
                        }
                        for (Window window4 : arrayList2) {
                            window4.setNavigationBarColor(i2.b0.C(j));
                            window4.setNavigationBarContrastEnforced(false);
                        }
                        return new k1(arrayList, 3);
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    m.d(context, "getBaseContext(...)");
                }
                if (activity != null) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(window2);
                    } else {
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                arrayList2.add(window2);
                            }
                        } while (!m.a((Window) it.next(), window2));
                    }
                }
                if (arrayList2.isEmpty()) {
                    return new c(0);
                }
                arrayList = new ArrayList(r.q0(arrayList2, 10));
                while (r3.hasNext()) {
                    arrayList.add(new d(window3, window3.getNavigationBarColor(), window3.isNavigationBarContrastEnforced()));
                }
                while (r0.hasNext()) {
                    window4.setNavigationBarColor(i2.b0.C(j));
                    window4.setNavigationBarContrastEnforced(false);
                }
                return new k1(arrayList, 3);
            case 1:
                l2.b bVar = (l2.b) obj2;
                k2.d record = (k2.d) obj;
                m.e(record, "$this$record");
                long j2 = this.B;
                if (j2 != 16) {
                    k2.d.R(record, j2, 0L, 0L, 0.0f, (h) null, 0, 126);
                }
                rd.a.x(record, bVar);
                return b0Var;
            case 2:
                k2.d.R((k2.d) obj, this.B, 0L, 0L, a0.x(((Number) ((p2) obj2).getValue()).floatValue(), 0.0f, 1.0f), (h) null, 0, 118);
                return b0Var;
            case 3:
                l0.z zVar = (l0.z) obj2;
                long jC = j.c(((j) ((x.b) obj).d()).a, j);
                int i2 = l0.z.t;
                zVar.g(jC);
                zVar.c.invoke();
                return b0Var;
            case 4:
                x xVar = (x) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (jLongValue <= 946684800 || jLongValue > j) {
                    return null;
                }
                xVar.getClass();
                LocalDate localDate = Instant.ofEpochSecond(jLongValue).atZone(ZoneId.systemDefault()).toLocalDate();
                m.d(localDate, "toLocalDate(...)");
                return f50.c.z(localDate);
            default:
                z0 z0Var = (z0) obj2;
                n0 result = (n0) obj;
                m.e(result, "result");
                if (result.d()) {
                    long j3 = ((o) z0Var.getValue()).a;
                    kh.o.p(j3, j);
                    if (Float.compare(o.c(j3), o.c(j)) > 0) {
                        z0Var.setValue(new o(kh.o.F(Math.max(o.c(j), o.c(((o) z0Var.getValue()).a) * 0.92f), 4294967296L)));
                    }
                }
                return b0Var;
        }
    }
}
