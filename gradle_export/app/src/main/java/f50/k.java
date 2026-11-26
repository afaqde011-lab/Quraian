package f50;

import a1.e1;
import a1.f2;
import a40.c0;
import a40.w1;
import a40.z;
import a8.n0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.UserManager;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.lifecycle.f1;
import b2.o;
import b2.r;
import b3.g;
import b3.i;
import bt.m0;
import c3.o0;
import c3.o1;
import c3.t2;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.q1;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import d0.q0;
import d10.j1;
import e1.j0;
import e7.i0;
import f50.k;
import g00.b0;
import g1.l0;
import g1.z6;
import g2.t;
import gc.n;
import h0.p1;
import h0.s;
import h0.u;
import h0.v;
import h0.z1;
import i2.t0;
import j0.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import jp.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.q2;
import l1.r1;
import l1.z0;
import lu.w;
import m3.r0;
import qd.s0;
import ri.t1;
import z1.p;
import z2.w0;

public abstract class k {
    public static final gc.j A(gc.k kVar, l1.j jVar) {
        g0 g0Var = (g0) jVar;
        g0Var.d0(1388713460);
        q0 q0Var = new q0(3, (k00.c) null, 3);
        Context context = (Context) g0Var.k(o0.b);
        g0Var.d0(-3686930);
        boolean zG = g0Var.g(kVar);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.a;
        if (zG || objN == cVar) {
            objN = q.z(new gc.j());
            g0Var.n0(objN);
        }
        g0Var.r(false);
        z0 z0Var = (z0) objN;
        g0Var.d0(-3686552);
        boolean zG2 = g0Var.g(kVar) | g0Var.g("__LottieInternalDefaultCacheKey__");
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            g0Var.n0(u(context, kVar, "__LottieInternalDefaultCacheKey__"));
        }
        g0Var.r(false);
        q.h(kVar, "__LottieInternalDefaultCacheKey__", new n(q0Var, context, kVar, z0Var, (k00.c) null), g0Var);
        gc.j jVar2 = (gc.j) z0Var.getValue();
        g0Var.r(false);
        return jVar2;
    }

    public static final String[] B(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", 0);
    }

    public static final long C(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final long D(double d) {
        long jG = w00.a.G(d * 1000);
        if (jG < 0) {
            return 0L;
        }
        return jG;
    }

    public static boolean E(Context context) {
        ApplicationInfo applicationInfo;
        boolean zO;
        ApplicationInfo applicationInfo2;
        boolean z;
        boolean z2;
        ApplicationInfo applicationInfo3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            zO = i >= 34 ? a5.b.o(MediaRouter2.getInstance(context)) : false;
        } else {
            Intent intentPutExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
            Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(intentPutExtra, 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    if (activityInfo != null && (applicationInfo2 = activityInfo.applicationInfo) != null && (applicationInfo2.flags & 129) != 0) {
                        context.sendBroadcast(intentPutExtra);
                    }
                } else {
                    Intent intentPutExtra2 = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(intentPutExtra2, 0).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ActivityInfo activityInfo2 = it2.next().activityInfo;
                            if (activityInfo2 != null && (applicationInfo = activityInfo2.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                                intentPutExtra2.setPackage(applicationInfo.packageName);
                                context.startActivity(intentPutExtra2);
                            }
                        }
                    }
                }
                zO = true;
            }
        }
        if (!zO) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                Intent intentPutExtra3 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
                AudioDeviceInfo[] devices = ((AudioManager) context.getSystemService(AudioManager.class)).getDevices(2);
                int length = devices.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    int type = devices[i2].getType();
                    if (type == 3 || type == 4 || type == 5 || type == 6 || type == 8 || type == 11 || type == 30 || type == 22 || type == 23 || type == 26 || type == 27) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                Intent intentPutExtra4 = intentPutExtra3.putExtra("EXTRA_CLOSE_ON_CONNECT", !z);
                Iterator<ResolveInfo> it3 = context.getPackageManager().queryIntentActivities(intentPutExtra4, 0).iterator();
                while (it3.hasNext()) {
                    ActivityInfo activityInfo3 = it3.next().activityInfo;
                    if (activityInfo3 != null && (applicationInfo3 = activityInfo3.applicationInfo) != null && (applicationInfo3.flags & 129) != 0) {
                        intentPutExtra4.setPackage(applicationInfo3.packageName);
                        context.startActivity(intentPutExtra4);
                        z2 = true;
                        if (z2) {
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            return false;
        }
        return true;
    }

    public static final Class F(ClassLoader classLoader, String fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static int G(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static final void a(final x uiState, final boolean z, final u00.k onAction, l1.j jVar, final int i) {
        int i2;
        l1.j jVar2;
        Object jVar3;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z2 = uiState.a;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar4 = (g0) jVar;
        jVar4.e0(1871233356);
        if ((i & 6) == 0) {
            i2 = (jVar4.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar4.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar4.i(onAction) ? 256 : 128;
        }
        int i3 = i2;
        if (jVar4.S(i3 & 1, (i3 & 147) != 146)) {
            xk.d dVarR = c7.i.R(jVar4);
            q2.a aVar = (q2.a) jVar4.k(o1.l);
            t2 t2Var = (t2) jVar4.k(o1.q);
            Object objN = jVar4.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new t();
                jVar4.n0(objN);
            }
            t tVar = (t) objN;
            boolean zG = jVar4.g(uiState.f) | jVar4.h(z2);
            Object objN2 = jVar4.N();
            if (zG || objN2 == obj) {
                objN2 = q.r(new lp.g(uiState, 2));
                jVar4.n0(objN2);
            }
            p2 p2Var = (p2) objN2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z3 = (i3 & 112) == 32;
            Object objN3 = jVar4.N();
            boolean z4 = z3;
            k00.c cVar = null;
            if (z4 || objN3 == obj) {
                objN3 = new lp.i(z, tVar, null, 2);
                jVar4.n0(objN3);
            }
            q.i(boolValueOf, jVar4, (u00.n) objN3);
            String str = uiState.g;
            boolean zI = ((i3 & 14) == 4) | jVar4.i(aVar) | jVar4.i(dVarR);
            Object objN4 = jVar4.N();
            if (zI || objN4 == obj) {
                jVar3 = new lp.j(uiState, aVar, dVarR, cVar, 3);
                jVar4.n0(jVar3);
            } else {
                jVar3 = objN4;
            }
            q.i(str, jVar4, (u00.n) jVar3);
            String strU = z3.U(jVar4, 2131886239);
            boolean zBooleanValue = ((Boolean) p2Var.getValue()).booleanValue();
            int i4 = i3 & 896;
            boolean zG2 = jVar4.g(t2Var) | (i4 == 256);
            Object objN5 = jVar4.N();
            if (zG2 || objN5 == obj) {
                objN5 = new ez.m(t2Var, onAction, 7);
                jVar4.n0(objN5);
            }
            ip.a aVar2 = new ip.a(strU, zBooleanValue, z2, (u00.a) objN5);
            r rVarV = c7.i.V(o.A, dVarR, jVar4);
            boolean zG3 = jVar4.g(t2Var) | (i4 == 256);
            Object objN6 = jVar4.N();
            if (zG3 || objN6 == obj) {
                objN6 = new ez.m(t2Var, onAction, 8);
                jVar4.n0(objN6);
            }
            jVar2 = jVar4;
            up.f.a((u00.a) objN6, null, rVarV, aVar2, false, v1.d.d(1516154552, new m0(uiState, onAction, p2Var, t2Var, tVar, 4), jVar4), jVar2, 196608, 18);
        } else {
            jVar2 = jVar4;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i5 = 2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = i5;
                    l1.j jVar5 = (l1.j) obj2;
                    ((Integer) obj3).intValue();
                    switch (i6) {
                        case 0:
                            g4.g(uiState, z, onAction, jVar5, q.K(i | 1));
                            break;
                        case 1:
                            b5.e(uiState, z, onAction, jVar5, q.K(i | 1));
                            break;
                        default:
                            f50.k.a(uiState, z, onAction, jVar5, q.K(i | 1));
                            break;
                    }
                    return b0.a;
                }
            };
        }
    }

    public static final void b(ln.c state, dn.l lVar, l1.j jVar, int i) {
        ln.c cVar;
        dn.l lVar2;
        kotlin.jvm.internal.m.e(state, "state");
        g0 g0Var = (g0) jVar;
        g0Var.e0(33114548);
        int i2 = (g0Var.g(state) ? 4 : 2) | i | (g0Var.e(lVar.ordinal()) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            cVar = state;
            lVar2 = lVar;
            va.a.b(ze.d.u(b6.k.a), j6.c.d, v1.d.d(-1958002542, new kn.b(lVar, cVar, lVar.b(((y3.h) g0Var.k(b6.g.a)).a), 0), g0Var), g0Var, 384, 0);
        } else {
            cVar = state;
            lVar2 = lVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(cVar, lVar2, i, 28);
        }
    }

    public static final void c(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1997762257);
        if (g0Var.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(a0.a, gx.d.class, aVarA, (b60.a) null, g0Var);
            }
            gx.d dVar = (gx.d) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar2) {
                objN2 = oi.k.f(a0.a, gx.e.class, aVarA2, (b60.a) null, g0Var);
            }
            gx.e eVar = (gx.e) objN2;
            h00.a aVarT = t(q50.c.b(g0Var).c("RECITERS_SCOPE_KEY", new b60.b("RECITERS_SCOPE_KEY")), g0Var);
            Object objU0 = h00.q.U0(eVar.a);
            boolean zG3 = g0Var.g(eVar) | g0Var.g(dVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar2) {
                objN3 = new w(eVar, dVar, cVar, 9);
                g0Var.n0(objN3);
            }
            q.i(objU0, g0Var, (u00.n) objN3);
            p pVar = eVar.a;
            h0.a0 a0Var = z1.c;
            boolean zG4 = g0Var.g(eVar);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar2) {
                pi.c cVar3 = new pi.c(0, eVar, gx.e.class, "navigateBack", "navigateBack()V", 0, 3);
                g0Var.n0(cVar3);
                objN4 = cVar3;
            }
            List listS = va.a.S(new p9.f[]{bi.b.N(g0Var), p30.f.o0(g0Var)});
            q2 q2Var = cq.l.a;
            p30.f.O(pVar, a0Var, null, (u00.a) ((a10.g) objN4), listS, null, null, null, null, new e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ou.a(i, 15);
        }
    }

    public static final void d(bx.c cVar, u00.a onClick, boolean z, boolean z2, u30.b downloadedReciters, r rVar, y3.f fVar, l1.j jVar, int i, int i2) {
        y3.f fVar2;
        int i3;
        r rVar2;
        y3.f fVar3;
        int i4;
        float f;
        int i5;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        g0 g0Var = (g0) jVar;
        g0Var.e0(874641828);
        int i6 = i | (g0Var.i(cVar) ? 4 : 2) | (g0Var.i(onClick) ? 32 : 16) | (g0Var.h(z) ? 256 : 128) | (g0Var.h(z2) ? 2048 : 1024) | (g0Var.g(downloadedReciters) ? 16384 : 8192);
        int i7 = 196608 | i6;
        int i8 = i2 & 64;
        if (i8 != 0) {
            i3 = i6 | 1769472;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            i3 = i7 | (g0Var.g(fVar2) ? 1048576 : 524288);
        }
        if (g0Var.S(i3 & 1, (599187 & i3) != 599186)) {
            if (i8 != 0) {
                fVar2 = null;
            }
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            if (fVar2 != null) {
                f = fVar2.A;
            } else {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    i4 = 110;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = 160;
                }
                f = i4;
            }
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                i5 = 165;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 210;
            }
            float f2 = i5;
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
            Object objN = g0Var.N();
            if (z3 || objN == l1.i.a) {
                objN = q.r(new gl.a(downloadedReciters, cVar, z, 5));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            r rVar3 = o.A;
            r rVarK = w00.a.k(w50.c.o(z1.e(z1.q(rVar3, f), f2), ((Boolean) p2Var.getValue()).booleanValue(), null, onClick, 6), !((Boolean) p2Var.getValue()).booleanValue());
            v vVarA = u.a(h0.i.g(8), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarK, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar4 = b3.h.f;
            q.I(vVarA, g0Var, fVar4);
            b3.f fVar5 = b3.h.e;
            q.I(m1VarM, g0Var, fVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar6 = b3.h.g;
            q.I(numValueOf, g0Var, fVar6);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            y3.f fVar7 = fVar2;
            b3.f fVar8 = b3.h.d;
            q.I(rVarC, g0Var, fVar8);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar4);
            q.I(m1VarM2, g0Var, fVar5);
            a1.b.v(iHashCode2, g0Var, fVar6, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar8);
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar.e;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, f2.h.c(z1.m(rVar3, f), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            if (z2) {
                g0Var.c0(-2044898537);
                c.i(s.a.a(rVar3, b2.b.C), g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-2044772646);
                g0Var.r(false);
            }
            g0Var.r(true);
            String str2 = cVar.b;
            gm.a aVar2 = gm.a.B;
            z6.b(str2, (r) null, dl.a.i, aVar == aVar2 ? kh.o.z(16) : kh.o.z(15), aVar == aVar2 ? q3.u.D : q3.u.B, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 0, 25008, 238506);
            g0Var = g0Var;
            g0Var.r(true);
            fVar3 = fVar7;
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
            fVar3 = fVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sx.a(cVar, onClick, z, z2, downloadedReciters, rVar2, fVar3, i, i2);
        }
    }

    public static final void e(r rVar, v1.c cVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(884796452);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVar2 = o.A;
            r rVarC = h0.c.C(z.n.f(z1.d(rVar2, 1.0f), i2.t.b(0.1f, dl.a.i), p0.f.a(24)), 16);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC2, g0Var, b3.h.d);
            cVar.invoke(h0.w.a, g0Var, 54);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j0(rVar, cVar, i, 1);
        }
    }

    public static final void f(TopRecitersLauncher launcher, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(launcher, "launcher");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1610629341);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? g0Var.g(launcher) : g0Var.i(launcher) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            e60.a aVarA = q50.c.a(g0Var);
            k00.c cVar = null;
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(a0.a, cq.a.class, aVarA, (b60.a) null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            u00.a aVarA2 = cq.l.a(g0Var);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && g0Var.i(launcher));
            Object objN2 = g0Var.N();
            if (z || objN2 == cVar2) {
                objN2 = new l0(launcher, 14);
                g0Var.n0(objN2);
            }
            u00.a aVar2 = (u00.a) objN2;
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            jx.x xVar = (jx.x) c7.i.S(a0.a.b(jx.x.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), aVar2);
            z0 z0VarQ = k00.f.q(xVar.c.d, g0Var, 0);
            boolean zG2 = g0Var.g(xVar);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar2) {
                objN3 = new l0(xVar, 15);
                g0Var.n0(objN3);
            }
            s0.E(false, (u00.a) objN3, g0Var, 0, 1);
            boolean zG3 = g0Var.g(xVar) | g0Var.g(aVarA2) | g0Var.i(aVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar2) {
                ev.p pVar = new ev.p(xVar, aVarA2, aVar, cVar, 17);
                g0Var.n0(pVar);
                objN4 = pVar;
            }
            q.i(b0.a, g0Var, (u00.n) objN4);
            jx.s sVar = (jx.s) z0VarQ.getValue();
            boolean zG4 = g0Var.g(xVar);
            Object objN5 = g0Var.N();
            if (zG4 || objN5 == cVar2) {
                objN5 = new gz.e1(1, xVar, jx.x.class, "action", "action(Lcom/mchutov/quranify/reciters/presentation/screen/collection/topreciters/TopRecitersAction;)V", 0, 4);
                g0Var.n0(objN5);
            }
            kx.a.c(sVar, (u00.k) ((a10.g) objN5), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.e(launcher, i, 3);
        }
    }

    public static final void g(final List items, final int i, final u00.k onSelectedIndexChange, final r rVar, final v1.c cVar, final float f, final int i2, final float f2, long j, long j2, final boolean z, final boolean z2, final j0.v vVar, boolean z3, i2.t tVar, boolean z4, boolean z5, l1.j jVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        boolean z6;
        l1.j jVar2;
        final long j3;
        final boolean z7;
        final i2.t tVar2;
        final boolean z8;
        final boolean z9;
        r1 r1VarT;
        boolean z11;
        i2.t tVar3;
        boolean z12;
        boolean z13;
        int size;
        int i14;
        int i15;
        int i16;
        boolean z14;
        int iY;
        j0.v vVarA;
        q2.a aVar;
        int i17;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objN;
        j0.v vVar2;
        int i18;
        b3.g gVar;
        o oVar;
        i2.o0 o0Var;
        final int i19;
        int i21;
        s sVar;
        final float f3;
        i2.t tVar4;
        boolean z21;
        final int i22;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean zI;
        Object obj;
        final boolean z25;
        kotlin.jvm.internal.m.e(items, "items");
        kotlin.jvm.internal.m.e(onSelectedIndexChange, "onSelectedIndexChange");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1546855845);
        if ((i3 & 6) == 0) {
            i6 = i3 | (jVar3.i(items) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= jVar3.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= jVar3.i(onSelectedIndexChange) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= jVar3.g(rVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= jVar3.i(cVar) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= jVar3.d(f) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= jVar3.e(i2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= jVar3.d(f2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= jVar3.f(j) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= jVar3.f(j2) ? 536870912 : 268435456;
        }
        int i23 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (jVar3.h(z) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= jVar3.h(z2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= jVar3.g(vVar) ? 256 : 128;
        }
        int i24 = i7;
        int i25 = i5 & 8192;
        if (i25 != 0) {
            i8 = i24 | 3072;
        } else {
            int i26 = i24;
            if ((i4 & 3072) == 0) {
                i26 |= jVar3.h(z3) ? 2048 : 1024;
            }
            i8 = i26;
        }
        int i27 = i5 & 16384;
        if (i27 == 0) {
            i9 = i8;
            if ((i4 & 24576) == 0) {
                i9 |= jVar3.g(tVar) ? 16384 : 8192;
            }
            i11 = i5 & 32768;
            if (i11 != 0) {
                i9 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (jVar3.h(z4)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i9 |= i12;
            }
            i13 = i5 & 65536;
            if (i13 != 0) {
                i9 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i9 |= jVar3.h(z5) ? 1048576 : 524288;
            }
            if ((i23 & 306783379) == 306783378 || (i9 & 599187) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (jVar3.S(i23 & 1, z6)) {
                if (i25 != 0) {
                    z11 = true;
                } else {
                    z11 = z3;
                }
                if (i27 != 0) {
                    tVar3 = null;
                } else {
                    tVar3 = tVar;
                }
                if (i11 != 0) {
                    z12 = true;
                } else {
                    z12 = z4;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z5;
                }
                if (i2 % 2 == 1) {
                    throw new IllegalArgumentException("visibleItemCount must be odd");
                }
                size = items.size();
                i14 = i2 / 2;
                if (z12) {
                    i15 = size * 10000;
                } else {
                    i15 = size;
                }
                if (z12) {
                    iY = (size * 5000) + i;
                    z14 = false;
                } else {
                    i16 = size - 1;
                    if (i16 < 0) {
                        i16 = 0;
                    }
                    z14 = false;
                    iY = ab.a0.y(i, 0, i16);
                }
                if (vVar == null) {
                    jVar3.c0(469813958);
                    vVarA = j0.x.a(iY, jVar3, 2);
                    jVar3.r(false);
                } else {
                    jVar3.c0(469813493);
                    jVar3.r(z14);
                    vVarA = vVar;
                }
                e0.h hVarI = t1.I(vVarA, jVar3);
                aVar = (q2.a) jVar3.k(o1.l);
                Boolean boolValueOf = Boolean.valueOf(vVarA.j.a());
                boolean zG = jVar3.g(vVarA) | jVar3.e(size);
                i17 = i9 & 458752;
                if (i17 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z26 = zG | z15;
                if ((i23 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z27 = z26 | z16;
                if ((i9 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zI2 = z27 | z17 | jVar3.i(aVar);
                if ((i23 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | zI2;
                objN = jVar3.N();
                Object obj2 = l1.i.a;
                if (!z19 || objN == obj2) {
                    jVar2 = jVar3;
                    j0.v vVar3 = vVarA;
                    objN = new fl.d(vVar3, size, z12, i, z2, aVar, onSelectedIndexChange, null);
                    vVar2 = vVar3;
                    i18 = size;
                    jVar2.n0(objN);
                } else {
                    jVar2 = jVar3;
                    i18 = size;
                    vVar2 = vVarA;
                }
                q.i(boolValueOf, jVar2, (u00.n) objN);
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode = Long.hashCode(((g0) jVar2).T);
                m1 m1VarM = jVar2.m();
                r rVarC = b2.a.c(rVar, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                b3.f fVar = b3.h.f;
                q.I(w0VarD, jVar2, fVar);
                b3.f fVar2 = b3.h.e;
                q.I(m1VarM, jVar2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                q.I(numValueOf, jVar2, fVar3);
                b3.e eVar = b3.h.h;
                q.E(jVar2, eVar);
                b3.f fVar4 = b3.h.d;
                q.I(rVarC, jVar2, fVar4);
                oVar = o.A;
                int i28 = i9;
                r rVarD = z1.d(oVar, 1.0f);
                o0Var = i2.b0.b;
                float f4 = i2 * f;
                r rVarE = z1.e(z.n.f(rVarD, j2, o0Var), f4);
                v vVarA2 = u.a(h0.i.c, b2.b.M, jVar2, 0);
                int iHashCode2 = Long.hashCode(((g0) jVar2).T);
                m1 m1VarM2 = jVar2.m();
                r rVarC2 = b2.a.c(rVarE, jVar2);
                jVar2.g0();
                i19 = i18;
                if (((g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                q.I(vVarA2, jVar2, fVar);
                q.I(m1VarM2, jVar2, fVar2);
                a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
                q.I(rVarC2, jVar2, fVar4);
                if (z11) {
                    jVar2.c0(1660541924);
                    j3 = j;
                    r rVarF = z.n.f(z1.e(z1.d(oVar, 1.0f), f2), j3, o0Var);
                    i21 = i14;
                    h0.c.h(z1.e(oVar, i21 * f), jVar2);
                    h0.o.a(rVarF, jVar2, 0);
                    h0.c.h(z1.e(oVar, f - f2), jVar2);
                    h0.o.a(rVarF, jVar2, 0);
                    jVar2.r(false);
                } else {
                    j3 = j;
                    i21 = i14;
                    jVar2.c0(1660908065);
                    jVar2.r(false);
                }
                jVar2.r(true);
                sVar = s.a;
                if (tVar3 != 0) {
                    jVar2.c0(-1412327971);
                    f3 = f;
                    r rVarE2 = z1.e(h0.c.E(z1.d(sVar.a(oVar, b2.b.E), 1.0f), 12, 0.0f, 2), f3);
                    p0.e eVar2 = p0.f.a;
                    p0.d dVar = new p0.d(50);
                    tVar4 = tVar3;
                    z21 = false;
                    h0.o.a(z.n.f(f2.h.c(rVarE2, new p0.e(dVar, dVar, dVar, dVar)), tVar4.a, o0Var), jVar2, 0);
                    jVar2.r(false);
                } else {
                    f3 = f;
                    tVar4 = tVar3;
                    z21 = false;
                    jVar2.c0(-1411995465);
                    jVar2.r(false);
                }
                r rVarE3 = z1.e(z1.d(oVar, 1.0f), f4);
                p1 p1VarE = h0.c.e(0.0f, i21 * f3, 1);
                i22 = i15;
                boolean zE = jVar2.e(i22);
                if (i17 == 131072) {
                    z22 = true;
                } else {
                    z22 = z21;
                }
                boolean zE2 = zE | z22 | jVar2.e(i19);
                if ((i23 & 458752) == 131072) {
                    z23 = true;
                } else {
                    z23 = z21;
                }
                boolean z28 = zE2 | z23;
                if ((i23 & 57344) == 16384) {
                    z24 = true;
                } else {
                    z24 = z21;
                }
                zI = z28 | z24 | jVar2.i(items);
                Object objN2 = jVar2.N();
                if (!zI || objN2 == obj2) {
                    z25 = z12;
                    obj = new u00.k() {
                        @Override
                        public final Object invoke(Object obj3) {
                            h LazyColumn = (h) obj3;
                            m.e(LazyColumn, "$this$LazyColumn");
                            final boolean z29 = z25;
                            final int i29 = i19;
                            final float f5 = f3;
                            final v1.c cVar2 = cVar;
                            final List list = items;
                            h.s(LazyColumn, i22, (e6.c) null, new v1.c(new u00.p() {
                                @Override
                                public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    j0.b items2 = (j0.b) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    g0 g0Var = (j) obj6;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    m.e(items2, "$this$items");
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= g0Var.e(iIntValue) ? 32 : 16;
                                    }
                                    g0 g0Var2 = g0Var;
                                    if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        if (z29) {
                                            int i31 = i29;
                                            iIntValue = ((iIntValue % i31) + i31) % i31;
                                        }
                                        r rVarE4 = z1.e(o.A, f5);
                                        w0 w0VarD2 = h0.o.d(b2.b.E, false);
                                        int iHashCode3 = Long.hashCode(g0Var2.T);
                                        m1 m1VarM3 = g0Var2.m();
                                        r rVarC3 = b2.a.c(rVarE4, g0Var);
                                        i.c.getClass();
                                        g gVar2 = b3.h.b;
                                        g0Var2.g0();
                                        if (g0Var2.S) {
                                            g0Var2.l(gVar2);
                                        } else {
                                            g0Var2.q0();
                                        }
                                        q.I(w0VarD2, g0Var, b3.h.f);
                                        q.I(m1VarM3, g0Var, b3.h.e);
                                        q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                                        q.E(g0Var, b3.h.h);
                                        q.I(rVarC3, g0Var, b3.h.d);
                                        cVar2.invoke(list.get(iIntValue), Boolean.FALSE, g0Var, 48);
                                        g0Var2.r(true);
                                    } else {
                                        g0Var2.V();
                                    }
                                    return b0.a;
                                }
                            }, -1423119799, true), 6);
                            return b0.a;
                        }
                    };
                    jVar2.n0(obj);
                } else {
                    obj = objN2;
                    z25 = z12;
                }
                boolean z29 = z13;
                k00.f.d(rVarE3, vVar2, p1VarE, null, null, hVarI, z29, null, (u00.k) obj, jVar2, (i28 << 3) & 29360128, 312);
                if (z) {
                    jVar2.c0(-1411070580);
                    r rVarB = sVar.b();
                    g00.k kVar = new g00.k(Float.valueOf(0.0f), new i2.t(j2));
                    g00.k kVar2 = new g00.k(Float.valueOf(0.1f), new i2.t(i2.t.b(0.7f, j2)));
                    Float fValueOf = Float.valueOf(0.25f);
                    long j4 = i2.t.f;
                    h0.o.a(z.n.e(rVarB, sg.f.Q(new g00.k[]{kVar, kVar2, new g00.k(fValueOf, new i2.t(j4)), new g00.k(Float.valueOf(0.75f), new i2.t(j4)), new g00.k(Float.valueOf(0.9f), new i2.t(i2.t.b(0.7f, j2))), new g00.k(Float.valueOf(1.0f), new i2.t(j2))}), (t0) null, 6), jVar2, z21);
                    jVar2.r(z21);
                } else {
                    jVar2.c0(-1410229705);
                    jVar2.r(z21);
                }
                jVar2.r(true);
                z8 = z25;
                tVar2 = tVar4;
                z9 = z29;
                z7 = z11;
            } else {
                jVar2 = jVar3;
                j3 = j;
                j2 = j2;
                jVar2.V();
                z7 = z3;
                tVar2 = tVar;
                z8 = z4;
                z9 = z5;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                final long j5 = j2;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iK = q.K(i3 | 1);
                        int iK2 = q.K(i4);
                        k.g(items, i, onSelectedIndexChange, rVar, cVar, f, i2, f2, j3, j5, z, z2, vVar, z7, tVar2, z8, z9, (j) obj3, iK, iK2, i5);
                        return b0.a;
                    }
                };
            }
        }
        i9 = i8 | 24576;
        i11 = i5 & 32768;
        if (i11 != 0) {
            i9 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (jVar3.h(z4)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i9 |= i12;
        }
        i13 = i5 & 65536;
        if (i13 != 0) {
            i9 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            i9 |= jVar3.h(z5) ? 1048576 : 524288;
        }
        if ((i23 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (jVar3.S(i23 & 1, z6)) {
            if (i25 != 0) {
                z11 = true;
            } else {
                z11 = z3;
            }
            if (i27 != 0) {
                tVar3 = null;
            } else {
                tVar3 = tVar;
            }
            if (i11 != 0) {
                z12 = true;
            } else {
                z12 = z4;
            }
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = z5;
            }
            if (i2 % 2 == 1) {
                throw new IllegalArgumentException("visibleItemCount must be odd");
            }
            size = items.size();
            i14 = i2 / 2;
            if (z12) {
                i15 = size * 10000;
            } else {
                i15 = size;
            }
            if (z12) {
                iY = (size * 5000) + i;
                z14 = false;
            } else {
                i16 = size - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                z14 = false;
                iY = ab.a0.y(i, 0, i16);
            }
            if (vVar == null) {
                jVar3.c0(469813958);
                vVarA = j0.x.a(iY, jVar3, 2);
                jVar3.r(false);
            } else {
                jVar3.c0(469813493);
                jVar3.r(z14);
                vVarA = vVar;
            }
            e0.h hVarI2 = t1.I(vVarA, jVar3);
            aVar = (q2.a) jVar3.k(o1.l);
            Boolean boolValueOf2 = Boolean.valueOf(vVarA.j.a());
            boolean zG2 = jVar3.g(vVarA) | jVar3.e(size);
            i17 = i9 & 458752;
            if (i17 == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z210 = zG2 | z15;
            if ((i23 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z211 = z210 | z16;
            if ((i9 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zI3 = z211 | z17 | jVar3.i(aVar);
            if ((i23 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | zI3;
            objN = jVar3.N();
            Object obj3 = l1.i.a;
            if (z19) {
                jVar2 = jVar3;
                j0.v vVar4 = vVarA;
                objN = new fl.d(vVar4, size, z12, i, z2, aVar, onSelectedIndexChange, null);
                vVar2 = vVar4;
                i18 = size;
                jVar2.n0(objN);
            } else {
                jVar2 = jVar3;
                j0.v vVar5 = vVarA;
                objN = new fl.d(vVar5, size, z12, i, z2, aVar, onSelectedIndexChange, null);
                vVar2 = vVar5;
                i18 = size;
                jVar2.n0(objN);
            }
            q.i(boolValueOf2, jVar2, (u00.n) objN);
            w0 w0VarD2 = h0.o.d(b2.b.A, false);
            int iHashCode3 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM3 = jVar2.m();
            r rVarC3 = b2.a.c(rVar, jVar2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            b3.f fVar5 = b3.h.f;
            q.I(w0VarD2, jVar2, fVar5);
            b3.f fVar6 = b3.h.e;
            q.I(m1VarM3, jVar2, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar7 = b3.h.g;
            q.I(numValueOf2, jVar2, fVar7);
            b3.e eVar3 = b3.h.h;
            q.E(jVar2, eVar3);
            b3.f fVar8 = b3.h.d;
            q.I(rVarC3, jVar2, fVar8);
            oVar = o.A;
            int i29 = i9;
            r rVarD2 = z1.d(oVar, 1.0f);
            o0Var = i2.b0.b;
            float f5 = i2 * f;
            r rVarE4 = z1.e(z.n.f(rVarD2, j2, o0Var), f5);
            v vVarA3 = u.a(h0.i.c, b2.b.M, jVar2, 0);
            int iHashCode4 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM4 = jVar2.m();
            r rVarC4 = b2.a.c(rVarE4, jVar2);
            jVar2.g0();
            i19 = i18;
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            q.I(vVarA3, jVar2, fVar5);
            q.I(m1VarM4, jVar2, fVar6);
            a1.b.v(iHashCode4, jVar2, fVar7, jVar2, eVar3);
            q.I(rVarC4, jVar2, fVar8);
            if (z11) {
                jVar2.c0(1660541924);
                j3 = j;
                r rVarF2 = z.n.f(z1.e(z1.d(oVar, 1.0f), f2), j3, o0Var);
                i21 = i14;
                h0.c.h(z1.e(oVar, i21 * f), jVar2);
                h0.o.a(rVarF2, jVar2, 0);
                h0.c.h(z1.e(oVar, f - f2), jVar2);
                h0.o.a(rVarF2, jVar2, 0);
                jVar2.r(false);
            } else {
                j3 = j;
                i21 = i14;
                jVar2.c0(1660908065);
                jVar2.r(false);
            }
            jVar2.r(true);
            sVar = s.a;
            if (tVar3 != 0) {
                jVar2.c0(-1412327971);
                f3 = f;
                r rVarE5 = z1.e(h0.c.E(z1.d(sVar.a(oVar, b2.b.E), 1.0f), 12, 0.0f, 2), f3);
                p0.e eVar4 = p0.f.a;
                p0.d dVar2 = new p0.d(50);
                tVar4 = tVar3;
                z21 = false;
                h0.o.a(z.n.f(f2.h.c(rVarE5, new p0.e(dVar2, dVar2, dVar2, dVar2)), tVar4.a, o0Var), jVar2, 0);
                jVar2.r(false);
            } else {
                f3 = f;
                tVar4 = tVar3;
                z21 = false;
                jVar2.c0(-1411995465);
                jVar2.r(false);
            }
            r rVarE6 = z1.e(z1.d(oVar, 1.0f), f5);
            p1 p1VarE2 = h0.c.e(0.0f, i21 * f3, 1);
            i22 = i15;
            boolean zE3 = jVar2.e(i22);
            if (i17 == 131072) {
                z22 = true;
            } else {
                z22 = z21;
            }
            boolean zE4 = zE3 | z22 | jVar2.e(i19);
            if ((i23 & 458752) == 131072) {
                z23 = true;
            } else {
                z23 = z21;
            }
            boolean z212 = zE4 | z23;
            if ((i23 & 57344) == 16384) {
                z24 = true;
            } else {
                z24 = z21;
            }
            zI = z212 | z24 | jVar2.i(items);
            Object objN3 = jVar2.N();
            if (zI) {
                z25 = z12;
                obj = new u00.k() {
                    @Override
                    public final Object invoke(Object obj4) {
                        h LazyColumn = (h) obj4;
                        m.e(LazyColumn, "$this$LazyColumn");
                        final boolean z213 = z25;
                        final int i210 = i19;
                        final float f6 = f3;
                        final v1.c cVar2 = cVar;
                        final List list = items;
                        h.s(LazyColumn, i22, (e6.c) null, new v1.c(new u00.p() {
                            @Override
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                j0.b items2 = (j0.b) obj5;
                                int iIntValue = ((Integer) obj6).intValue();
                                g0 g0Var = (j) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                m.e(items2, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= g0Var.e(iIntValue) ? 32 : 16;
                                }
                                g0 g0Var2 = g0Var;
                                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    if (z213) {
                                        int i31 = i210;
                                        iIntValue = ((iIntValue % i31) + i31) % i31;
                                    }
                                    r rVarE7 = z1.e(o.A, f6);
                                    w0 w0VarD3 = h0.o.d(b2.b.E, false);
                                    int iHashCode5 = Long.hashCode(g0Var2.T);
                                    m1 m1VarM5 = g0Var2.m();
                                    r rVarC5 = b2.a.c(rVarE7, g0Var);
                                    i.c.getClass();
                                    g gVar2 = b3.h.b;
                                    g0Var2.g0();
                                    if (g0Var2.S) {
                                        g0Var2.l(gVar2);
                                    } else {
                                        g0Var2.q0();
                                    }
                                    q.I(w0VarD3, g0Var, b3.h.f);
                                    q.I(m1VarM5, g0Var, b3.h.e);
                                    q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                                    q.E(g0Var, b3.h.h);
                                    q.I(rVarC5, g0Var, b3.h.d);
                                    cVar2.invoke(list.get(iIntValue), Boolean.FALSE, g0Var, 48);
                                    g0Var2.r(true);
                                } else {
                                    g0Var2.V();
                                }
                                return b0.a;
                            }
                        }, -1423119799, true), 6);
                        return b0.a;
                    }
                };
                jVar2.n0(obj);
            } else {
                z25 = z12;
                obj = new u00.k() {
                    @Override
                    public final Object invoke(Object obj4) {
                        h LazyColumn = (h) obj4;
                        m.e(LazyColumn, "$this$LazyColumn");
                        final boolean z213 = z25;
                        final int i210 = i19;
                        final float f6 = f3;
                        final v1.c cVar2 = cVar;
                        final List list = items;
                        h.s(LazyColumn, i22, (e6.c) null, new v1.c(new u00.p() {
                            @Override
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                j0.b items2 = (j0.b) obj5;
                                int iIntValue = ((Integer) obj6).intValue();
                                g0 g0Var = (j) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                m.e(items2, "$this$items");
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= g0Var.e(iIntValue) ? 32 : 16;
                                }
                                g0 g0Var2 = g0Var;
                                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    if (z213) {
                                        int i31 = i210;
                                        iIntValue = ((iIntValue % i31) + i31) % i31;
                                    }
                                    r rVarE7 = z1.e(o.A, f6);
                                    w0 w0VarD3 = h0.o.d(b2.b.E, false);
                                    int iHashCode5 = Long.hashCode(g0Var2.T);
                                    m1 m1VarM5 = g0Var2.m();
                                    r rVarC5 = b2.a.c(rVarE7, g0Var);
                                    i.c.getClass();
                                    g gVar2 = b3.h.b;
                                    g0Var2.g0();
                                    if (g0Var2.S) {
                                        g0Var2.l(gVar2);
                                    } else {
                                        g0Var2.q0();
                                    }
                                    q.I(w0VarD3, g0Var, b3.h.f);
                                    q.I(m1VarM5, g0Var, b3.h.e);
                                    q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                                    q.E(g0Var, b3.h.h);
                                    q.I(rVarC5, g0Var, b3.h.d);
                                    cVar2.invoke(list.get(iIntValue), Boolean.FALSE, g0Var, 48);
                                    g0Var2.r(true);
                                } else {
                                    g0Var2.V();
                                }
                                return b0.a;
                            }
                        }, -1423119799, true), 6);
                        return b0.a;
                    }
                };
                jVar2.n0(obj);
            }
            boolean z213 = z13;
            k00.f.d(rVarE6, vVar2, p1VarE2, null, null, hVarI2, z213, null, (u00.k) obj, jVar2, (i29 << 3) & 29360128, 312);
            if (z) {
                jVar2.c0(-1411070580);
                r rVarB2 = sVar.b();
                g00.k kVar3 = new g00.k(Float.valueOf(0.0f), new i2.t(j2));
                g00.k kVar4 = new g00.k(Float.valueOf(0.1f), new i2.t(i2.t.b(0.7f, j2)));
                Float fValueOf2 = Float.valueOf(0.25f);
                long j6 = i2.t.f;
                h0.o.a(z.n.e(rVarB2, sg.f.Q(new g00.k[]{kVar3, kVar4, new g00.k(fValueOf2, new i2.t(j6)), new g00.k(Float.valueOf(0.75f), new i2.t(j6)), new g00.k(Float.valueOf(0.9f), new i2.t(i2.t.b(0.7f, j2))), new g00.k(Float.valueOf(1.0f), new i2.t(j2))}), (t0) null, 6), jVar2, z21);
                jVar2.r(z21);
            } else {
                jVar2.c0(-1410229705);
                jVar2.r(z21);
            }
            jVar2.r(true);
            z8 = z25;
            tVar2 = tVar4;
            z9 = z213;
            z7 = z11;
        } else {
            jVar2 = jVar3;
            j3 = j;
            j2 = j2;
            jVar2.V();
            z7 = z3;
            tVar2 = tVar;
            z8 = z4;
            z9 = z5;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final long j7 = j2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iK = q.K(i3 | 1);
                    int iK2 = q.K(i4);
                    k.g(items, i, onSelectedIndexChange, rVar, cVar, f, i2, f2, j3, j7, z, z2, vVar, z7, tVar2, z8, z9, (j) obj4, iK, iK2, i5);
                    return b0.a;
                }
            };
        }
    }

    public static final Exception h(g5.a aVar, String str, GetPublicKeyCredentialDomException getPublicKeyCredentialDomException) {
        return new GetPublicKeyCredentialDomException(aVar, str);
    }

    public static final Object i(Context context, gc.k kVar, String str, String str2, String str3, String str4, m00.c cVar) {
        gc.m mVar;
        String str5;
        String str6;
        String str7;
        Context context2;
        cc.a aVar;
        Context context3;
        String str8;
        Object objJ;
        cc.a aVar2;
        String str9;
        Object objJ2;
        if (cVar instanceof gc.m) {
            mVar = (gc.m) cVar;
            int i = mVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.F = i - Integer.MIN_VALUE;
            } else {
                mVar = new gc.m(cVar);
            }
        } else {
            mVar = new gc.m(cVar);
        }
        Object objQ = mVar.E;
        l00.a aVar3 = l00.a.A;
        int i2 = mVar.F;
        Object obj = b0.a;
        if (i2 == 0) {
            t1.O(objQ);
            cc.n nVarU = u(context, kVar, str4);
            if (nVarU == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + kVar + '.').toString());
            }
            mVar.A = context;
            str5 = str;
            mVar.B = str5;
            str6 = str2;
            mVar.C = str6;
            str7 = str3;
            mVar.D = str7;
            mVar.F = 1;
            a40.k kVar2 = new a40.k(1, s0.j0(mVar));
            kVar2.r();
            nVarU.b(new gc.l(kVar2, 0));
            nVarU.a(new gc.l(kVar2, 1));
            objQ = kVar2.q();
            if (objQ != aVar3) {
                context2 = context;
            }
            return aVar3;
        }
        if (i2 == 1) {
            String str10 = (String) mVar.D;
            String str11 = mVar.C;
            String str12 = mVar.B;
            context2 = (Context) mVar.A;
            t1.O(objQ);
            str6 = str11;
            str5 = str12;
            str7 = str10;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cc.a aVar4 = (cc.a) mVar.A;
                t1.O(objQ);
                return aVar4;
            }
            aVar2 = (cc.a) mVar.D;
            str9 = mVar.C;
            str6 = mVar.B;
            context3 = (Context) mVar.A;
            t1.O(objQ);
            str8 = null;
        }
        mVar.A = aVar2;
        mVar.B = str8;
        mVar.C = str8;
        mVar.D = str8;
        mVar.F = 3;
        if (!aVar2.e.isEmpty()) {
            h40.e eVar = a40.m0.a;
            Context context4 = context3;
            objJ2 = c0.J(new az.p(aVar2, context4, str6, str9, null, 3), h40.d.C, mVar);
            if (objJ2 == aVar3) {
                obj = objJ2;
            }
        }
        if (obj != aVar3) {
            return aVar3;
        }
        return aVar2;
        cc.a aVar5 = (cc.a) objQ;
        mVar.A = context2;
        mVar.B = str6;
        mVar.C = str7;
        mVar.D = aVar5;
        mVar.F = 2;
        if (aVar5.d.isEmpty()) {
            aVar = aVar5;
            objJ = obj;
            context3 = context2;
            str8 = null;
        } else {
            h40.e eVar2 = a40.m0.a;
            h40.d dVar = h40.d.C;
            Context context5 = context2;
            f2 f2Var = new f2(aVar5, context5, str5, (k00.c) null, 9);
            aVar = aVar5;
            context3 = context5;
            str8 = null;
            objJ = c0.J(f2Var, dVar, mVar);
            if (objJ != aVar3) {
                objJ = obj;
            }
        }
        if (objJ != aVar3) {
            aVar2 = aVar;
            str9 = str7;
            mVar.A = aVar2;
            mVar.B = str8;
            mVar.C = str8;
            mVar.D = str8;
            mVar.F = 3;
            if (!aVar2.e.isEmpty()) {
                h40.e eVar3 = a40.m0.a;
                Context context6 = context3;
                objJ2 = c0.J(new az.p(aVar2, context6, str6, str9, null, 3), h40.d.C, mVar);
                if (objJ2 == aVar3) {
                    obj = objJ2;
                }
            }
            if (obj != aVar3) {
                return aVar2;
            }
        }
        return aVar3;
    }

    public static ii.b j(String str, String str2) {
        qj.a aVar = new qj.a(str, str2);
        androidx.media3.common.o0 o0VarB = ii.b.b(qj.a.class);
        o0VarB.c = 1;
        o0VarB.f = new ii.a(aVar);
        return o0VarB.b();
    }

    public static final Object k(Class annotationClass, Map map, List methods) {
        kotlin.jvm.internal.m.e(annotationClass, "annotationClass");
        kotlin.jvm.internal.m.e(methods, "methods");
        g00.p pVarJ = rd.a.J(new a30.l(map, 26));
        Object objNewProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new e10.d(annotationClass, map, rd.a.J(new a20.a(annotationClass, map, 15)), pVarJ, methods));
        kotlin.jvm.internal.m.c(objNewProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return objNewProxyInstance;
    }

    public static Object l(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(h00.r.q0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return k(cls, map, arrayList);
    }

    public static final HashSet m(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setC = ((x20.n) it.next()).c();
            if (setC == null) {
                return null;
            }
            h00.v.u0(setC, hashSet);
        }
        return hashSet;
    }

    public static final String n(long j) {
        if (j < 0) {
            j = 0;
        }
        long j2 = 60;
        return String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2));
    }

    public static ii.b o(String str, a8.n nVar) {
        androidx.media3.common.o0 o0VarB = ii.b.b(qj.a.class);
        o0VarB.c = 1;
        o0VarB.a(ii.j.b(Context.class));
        o0VarB.f = new ak.a(str, nVar, 28);
        return o0VarB.b();
    }

    public static final a10.d p(a10.e eVar) {
        if (eVar instanceof a10.d) {
            return (a10.d) eVar;
        }
        if (!(eVar instanceof d10.r1)) {
            throw new a40.b0("Cannot calculate JVM erasure for type: " + eVar);
        }
        List list = ((d10.r1) eVar).F;
        Object obj = null;
        if (list == null) {
            kotlin.jvm.internal.m.k("upperBounds");
            throw null;
        }
        for (Object obj2 : list) {
            a10.e eVarS = ((a10.x) obj2).s();
            j1 j1Var = eVarS instanceof j1 ? (j1) eVarS : null;
            if (j1Var != null && j1Var.L() != s10.q.INTERFACE && j1Var.L() != s10.q.ANNOTATION_CLASS) {
                obj = obj2;
                break;
            }
        }
        a10.x xVar = (a10.x) obj;
        if (xVar == null) {
            xVar = (a10.x) h00.q.N0(list);
        }
        return xVar != null ? q(xVar) : a0.a.b(Object.class);
    }

    public static final a10.d q(a10.x xVar) {
        kotlin.jvm.internal.m.e(xVar, "<this>");
        a10.e eVarS = xVar.s();
        if (eVarS != null) {
            return p(eVarS);
        }
        throw new a40.b0("Cannot calculate JVM erasure for type: " + xVar);
    }

    public static final boolean r(m3.h hVar) {
        int length = hVar.B.length();
        List list = hVar.A;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m3.f fVar = (m3.f) list.get(i);
                if ((fVar.a instanceof m3.o) && m3.i.b(0, length, fVar.b, fVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final h00.a t(e60.a aVar, l1.j jVar) {
        ArrayList arrayListB = aVar.b(a0.a.b(u00.k.class));
        p9.d dVar = new p9.d();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            ((u00.k) it.next()).invoke(dVar);
        }
        return new h00.a(dVar, 27);
    }

    public static final cc.n u(Context context, gc.k kVar, String str) {
        cc.a aVar;
        if (!(kVar instanceof gc.k)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!kotlin.jvm.internal.m.a(str, "__LottieInternalDefaultCacheKey__")) {
            HashMap map = cc.d.a;
            ab.d dVar = new ab.d(new WeakReference(context), context.getApplicationContext(), str, 1);
            HashMap map2 = cc.d.a;
            aVar = str != null ? (cc.a) ic.e.b.a.c(str) : null;
            if (aVar != null) {
                return new cc.n(new cc.b(aVar, 0));
            }
            if (str != null && map2.containsKey(str)) {
                return (cc.n) map2.get(str);
            }
            cc.n nVar = new cc.n(dVar);
            if (str != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                nVar.b(new cc.c(str, atomicBoolean, 0));
                nVar.a(new cc.c(str, atomicBoolean, 1));
                if (!atomicBoolean.get()) {
                    map2.put(str, nVar);
                    if (map2.size() == 1) {
                        cc.d.c();
                    }
                }
            }
            return nVar;
        }
        HashMap map3 = cc.d.a;
        String strJ = x5.j(2131820549, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
        ab.d dVar2 = new ab.d(new WeakReference(context), context.getApplicationContext(), strJ, 1);
        HashMap map4 = cc.d.a;
        aVar = strJ != null ? (cc.a) ic.e.b.a.c(strJ) : null;
        if (aVar != null) {
            return new cc.n(new cc.b(aVar, 0));
        }
        if (strJ != null && map4.containsKey(strJ)) {
            return (cc.n) map4.get(strJ);
        }
        cc.n nVar2 = new cc.n(dVar2);
        if (strJ != null) {
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            nVar2.b(new cc.c(strJ, atomicBoolean2, 0));
            nVar2.a(new cc.c(strJ, atomicBoolean2, 1));
            if (!atomicBoolean2.get()) {
                map4.put(strJ, nVar2);
                if (map4.size() == 1) {
                    cc.d.c();
                }
            }
        }
        return nVar2;
    }

    public static final u30.b v(Locale locale) {
        kotlin.jvm.internal.m.e(locale, "locale");
        List listJ1 = h00.q.j1(dn.f.a, 7);
        ArrayList arrayList = new ArrayList(h00.r.q0(listJ1, 10));
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            arrayList.add(((DayOfWeek) it.next()).getDisplayName(TextStyle.NARROW_STANDALONE, locale));
        }
        return g4.d0(arrayList);
    }

    public static void w(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static ArrayList x(e7.u uVar) {
        char c;
        ArrayList arrayList;
        boolean z;
        int i;
        ArrayList eVar;
        e7.u uVar2 = uVar;
        ArrayList arrayList2 = null;
        if (uVar2.A() == 0) {
            char c2 = 7;
            uVar2.O(7);
            int iM = uVar2.m();
            boolean z2 = true;
            if (iM == 1684433976) {
                e7.u uVar3 = new e7.u();
                Inflater inflater = new Inflater(true);
                try {
                    if (!i0.C(uVar2, uVar3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    uVar2 = uVar3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i2 = uVar2.b;
            int i3 = uVar2.c;
            while (i2 < i3) {
                int iM2 = uVar2.m() + i2;
                if (iM2 > i2 && iM2 <= i3) {
                    if (uVar2.m() == 1835365224) {
                        int iM3 = uVar2.m();
                        if (iM3 > 10000) {
                            c = c2;
                            eVar = arrayList2;
                            arrayList = eVar;
                            z = z2;
                            i = i3;
                        } else {
                            float[] fArr = new float[iM3];
                            for (int i4 = 0; i4 < iM3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(uVar2.m());
                            }
                            int iM4 = uVar2.m();
                            if (iM4 > 32000) {
                                c = c2;
                                eVar = arrayList2;
                                arrayList = eVar;
                                z = z2;
                                i = i3;
                            } else {
                                double dLog = Math.log(2.0d);
                                c = c2;
                                ArrayList arrayList4 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM3) * 2.0d) / dLog);
                                z = z2;
                                byte[] bArr = uVar2.a;
                                n0 n0Var = new n0(bArr.length, bArr);
                                n0Var.q(uVar2.b * 8);
                                float[] fArr2 = new float[iM4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                arrayList = arrayList4;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < iM4) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 < i5) {
                                                int i9 = iArr[i8];
                                                int i11 = n0Var.i(iCeil);
                                                int i12 = ((i11 >> 1) ^ (-(i11 & 1))) + i9;
                                                if (i12 < iM3 && i12 >= 0) {
                                                    fArr2[i7] = fArr[i12];
                                                    iArr[i8] = i12;
                                                    i8++;
                                                    i7++;
                                                    i5 = 5;
                                                }
                                            } else {
                                                i6++;
                                                i5 = 5;
                                            }
                                        }
                                    } else {
                                        n0Var.q((n0Var.g() + 7) & (-8));
                                        int i13 = 32;
                                        int i14 = n0Var.i(32);
                                        q1[] q1VarArr = new q1[i14];
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int i16 = n0Var.i(8);
                                                int i17 = n0Var.i(8);
                                                int i18 = n0Var.i(i13);
                                                if (i18 <= 128000) {
                                                    int i19 = i14;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[i18 * 3];
                                                    float[] fArr5 = new float[i18 * 2];
                                                    i = i3;
                                                    int i21 = 0;
                                                    int i22 = 0;
                                                    while (true) {
                                                        if (i21 < i18) {
                                                            int i23 = n0Var.i(iCeil2);
                                                            n0 n0Var2 = n0Var;
                                                            int i24 = ((i23 >> 1) ^ (-(i23 & 1))) + i22;
                                                            if (i24 >= 0 && i24 < iM4) {
                                                                int i25 = i21 * 3;
                                                                int i26 = i24 * 5;
                                                                fArr4[i25] = fArr3[i26];
                                                                fArr4[i25 + 1] = fArr3[i26 + 1];
                                                                fArr4[i25 + 2] = fArr3[i26 + 2];
                                                                int i27 = i21 * 2;
                                                                fArr5[i27] = fArr3[i26 + 3];
                                                                fArr5[i27 + 1] = fArr3[i26 + 4];
                                                                i21++;
                                                                i22 = i24;
                                                                n0Var = n0Var2;
                                                            }
                                                        } else {
                                                            q1VarArr[i15] = new q1(i16, i17, fArr4, fArr5);
                                                            i15++;
                                                            i14 = i19;
                                                            fArr2 = fArr3;
                                                            i3 = i;
                                                            n0Var = n0Var;
                                                            i13 = 32;
                                                        }
                                                    }
                                                }
                                                eVar = arrayList;
                                            } else {
                                                i = i3;
                                                eVar = new z7.e(q1VarArr);
                                            }
                                        }
                                    }
                                    i = i3;
                                    eVar = arrayList;
                                }
                            }
                        }
                        if (eVar == null) {
                            return arrayList;
                        }
                        arrayList3.add(eVar);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                        i = i3;
                    }
                    uVar2.N(iM2);
                    i2 = iM2;
                    c2 = c;
                    z2 = z;
                    arrayList2 = arrayList;
                    i3 = i;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    public static final long y(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static rv.p z(String name, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, yi.a aVar, int i) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            aVar = s5.a.A;
        }
        h40.e eVar = a40.m0.a;
        h40.d dVar = h40.d.C;
        w1 w1VarE = c0.e();
        dVar.getClass();
        f40.c cVarC = c0.c(rd.a.P(dVar, w1VarE));
        kotlin.jvm.internal.m.e(name, "name");
        return new rv.p(name, replaceFileCorruptionHandler, (u00.k) aVar, (z) cVarC);
    }
}
