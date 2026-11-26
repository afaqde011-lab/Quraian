package ze;

import a10.w;
import a40.z;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.f1;
import ba.b1;
import ba.p0;
import ba.y;
import c3.o1;
import c3.t2;
import c7.i;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import d30.m;
import e30.a1;
import e7.i0;
import fh.i2;
import g00.b0;
import g1.d7;
import g2.t;
import h0.v1;
import h0.x1;
import h0.z1;
import h00.q;
import h00.r;
import h00.x;
import i2.t0;
import i20.j0;
import j10.n0;
import j10.r0;
import j6.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.d0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q1;
import l1.r1;
import l1.z0;
import m10.l0;
import q0.f2;
import r30.k;
import ri.t1;
import sm.u;
import ta.c0;
import tp.h;
import vl.l;
import vl.n;
import vl.o;
import vl.p;
import x40.f0;

public abstract class d {

    public static ClassLoader f17424a;

    public static Thread f17425b;

    public static final Object A(m mVar, w wVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        kotlin.jvm.internal.m.e(wVar, "p");
        return mVar.invoke();
    }

    public static final b6.m D(b6.m mVar, float f3) {
        return mVar.d(new j6.m(new o6.b(f3)));
    }

    public static final u30.b E(List list) {
        kotlin.jvm.internal.m.e(list, "elements");
        return g4.d0(list);
    }

    public static boolean F(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String H(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e3) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e3);
                    StringBuilder sbN = g4.c.n("<", str2, " threw ");
                    sbN.append(e3.getClass().getName());
                    sbN.append(">");
                    string = sbN.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static vl.b M(String str) {
        URI uriS;
        vl.a aVar;
        l pVar;
        Object next;
        String strS;
        String str2;
        l pVar2;
        String scheme;
        String host;
        kotlin.jvm.internal.m.e(str, "url");
        try {
            uriS = new URI(str);
        } catch (Throwable th2) {
            uriS = t1.s(th2);
        }
        if (uriS instanceof g00.m) {
            uriS = null;
        }
        URI uri = uriS;
        if (uri == null || (scheme = uri.getScheme()) == null || (host = uri.getHost()) == null) {
            aVar = null;
        } else if (scheme.equalsIgnoreCase("https") && host.equalsIgnoreCase("quranify.pro")) {
            aVar = vl.a.B;
        } else if (scheme.equalsIgnoreCase("quranify") && host.equalsIgnoreCase("open")) {
            aVar = vl.a.C;
        } else {
            aVar = null;
        }
        String path = uri != null ? uri.getPath() : null;
        String str3 = RuntimeVersion.SUFFIX;
        if (path == null) {
            path = RuntimeVersion.SUFFIX;
        }
        List listX0 = k.X0(path, new char[]{'/'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 3) {
            arrayList = null;
        }
        if (arrayList != null) {
            List listH0 = q.H0(arrayList, 1);
            String rawQuery = uri != null ? uri.getRawQuery() : null;
            if (rawQuery != null) {
                str3 = rawQuery;
            }
            List listX1 = k.X0(str3, new char[]{'&'}, 6);
            ArrayList arrayList2 = new ArrayList(r.q0(listX1, 10));
            Iterator it = listX1.iterator();
            while (it.hasNext()) {
                arrayList2.add(k.X0((String) it.next(), new char[]{'='}, 2));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                List list = (List) next;
                if (list.size() == 2 && kotlin.jvm.internal.m.a(list.get(0), "play")) {
                    break;
                }
            }
            List list2 = (List) next;
            String str4 = list2 != null ? (String) list2.get(1) : null;
            if (str4 != null) {
                try {
                    strS = URLDecoder.decode(str4, r30.a.a.name());
                } catch (Throwable th3) {
                    strS = t1.s(th3);
                }
                if (strS instanceof g00.m) {
                    strS = null;
                }
                str2 = strS;
                if (str2 == null || str2.length() <= 0) {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            String str5 = (String) q.L0(listH0);
            int iHashCode = str5.hashCode();
            if (iHashCode != -804714037) {
                if (iHashCode != 1530702172) {
                    if (iHashCode == 1853891989 && str5.equals("collections")) {
                        if (listH0.size() != 2) {
                            listH0 = null;
                        }
                        if (listH0 != null) {
                            pVar = new l((String) listH0.get(1));
                        } else {
                            pVar = null;
                        }
                    } else {
                        pVar = null;
                    }
                } else if (str5.equals("audio-stories")) {
                    int size = listH0.size();
                    if (size == 2) {
                        pVar = new vl.q((String) listH0.get(1));
                    } else if (size != 3) {
                        pVar = null;
                    } else {
                        Integer numY0 = r30.r.y0((String) listH0.get(2));
                        if (numY0 != null) {
                            pVar2 = new vl.m((String) listH0.get(1), numY0.intValue());
                            pVar = pVar2;
                        } else {
                            pVar = new vl.q((String) listH0.get(1));
                        }
                    }
                } else {
                    pVar = null;
                }
            } else if (!str5.equals("reciters")) {
                pVar = null;
            } else if (listH0.size() == 3 && kotlin.jvm.internal.m.a(listH0.get(1), "collections")) {
                pVar = new o((String) listH0.get(2));
            } else if (listH0.size() == 2) {
                if (str2 != null) {
                    pVar2 = new p((String) listH0.get(1), str2);
                    pVar = pVar2;
                } else {
                    pVar = new n((String) listH0.get(1));
                }
            } else if (listH0.size() == 3) {
                pVar = new p((String) listH0.get(1), (String) listH0.get(2));
            } else {
                pVar = null;
            }
        } else {
            pVar = null;
        }
        if (aVar == null || pVar == null) {
            return null;
        }
        return new vl.b(pVar, aVar);
    }

    public static final void O(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static int P(Context context, int i10, int i11) {
        TypedValue typedValueN = z3.N(context, i10);
        return (typedValueN == null || typedValueN.type != 16) ? i11 : typedValueN.data;
    }

    public static TimeInterpolator Q(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!F(strValueOf, "cubic-bezier") && !F(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (F(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(x(strArrSplit, 0), x(strArrSplit, 1), x(strArrSplit, 2), x(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!F(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            q4.c.b(va.a.t(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e3);
        }
    }

    public static final b6.m R(float f3) {
        return D(U(f3), f3);
    }

    public static String S(int i10) {
        Object[] objArr = {Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d)};
        String str = i0.f5136a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final b6.m U(float f3) {
        return new s(new o6.b(f3));
    }

    public static final Bundle V(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static synchronized ClassLoader W() {
        SecurityException e3;
        Thread thread;
        ThreadGroup threadGroup;
        if (f17424a == null) {
            Thread thread2 = f17425b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f17425b.getContextClassLoader();
                    } catch (SecurityException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f17424a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        Thread bVar = new k50.b(threadGroup, "GmsDynamite");
                                        try {
                                            bVar.setContextClassLoader(null);
                                            bVar.start();
                                            thread = bVar;
                                        } catch (SecurityException e11) {
                                            e3 = e11;
                                            thread = bVar;
                                            String message2 = e3.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb3.append("Failed to enumerate thread/threadgroup ");
                                            sb3.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb3.toString());
                                        }
                                    } catch (SecurityException e12) {
                                        e3 = e12;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (SecurityException e13) {
                            e3 = e13;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f17425b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f17425b.getContextClassLoader();
                    }
                }
                f17424a = contextClassLoader;
            }
        }
        return f17424a;
    }

    public static final void a(zy.l lVar, u00.k kVar, j jVar, int i10) {
        u00.k kVar2;
        String strT;
        boolean z10;
        xk.d dVar;
        t2 t2Var;
        zy.l lVar2 = lVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1904633453);
        int i11 = (g0Var.g(lVar2) ? 4 : 2) | i10 | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            xk.d dVarR = i.R(g0Var);
            q2.a aVar = (q2.a) g0Var.k(o1.l);
            t2 t2Var2 = (t2) g0Var.k(o1.f2741q);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = new t();
                g0Var.n0(objN);
            }
            t tVar = (t) objN;
            boolean zBooleanValue = ((Boolean) g0Var.k(h.a)).booleanValue();
            boolean z11 = lVar2.g;
            boolean z12 = lVar2.h;
            boolean z13 = lVar2.j;
            if (z11) {
                strT = oi.k.o(g0Var, -121818570, 2131886215, g0Var, false);
            } else {
                g0Var.c0(-121753408);
                strT = z3.T(2131886216, new Object[]{String.format("00:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(lVar2.f)}, 1))}, g0Var);
                g0Var.r(false);
            }
            String str = strT;
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new lu.w(tVar, (k00.c) null, 27);
                g0Var.n0(objN2);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN2);
            Boolean boolValueOf = Boolean.valueOf(lVar2.i);
            int i12 = i11 & 14;
            boolean zI = (i12 == 4) | g0Var.i(aVar) | g0Var.i(dVarR);
            Object objN3 = g0Var.N();
            if (zI || objN3 == cVar) {
                z10 = z12;
                objN3 = new pz.k(lVar2, aVar, dVarR, (k00.c) null, 27);
                dVar = dVarR;
                g0Var.n0(objN3);
            } else {
                dVar = dVarR;
                z10 = z12;
            }
            l1.q.i(boolValueOf, g0Var, (u00.n) objN3);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            String strU = z3.U(g0Var, 2131887205);
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            boolean zG = (i12 == 4) | g0Var.g(t2Var2) | g0Var.g(bVar) | g0Var.g(strU);
            Object objN4 = g0Var.N();
            if (zG || objN4 == cVar) {
                t2Var = t2Var2;
                az.p pVar = new az.p(lVar, t2Var, bVar, strU, (k00.c) null);
                g0Var.n0(pVar);
                objN4 = pVar;
            } else {
                t2Var = t2Var2;
            }
            l1.q.i(boolValueOf2, g0Var, (u00.n) objN4);
            int i13 = i11 & 112;
            boolean zG2 = g0Var.g(t2Var) | (i13 == 32);
            Object objN5 = g0Var.N();
            if (zG2 || objN5 == cVar) {
                objN5 = new ez.m(t2Var, kVar, 10);
                g0Var.n0(objN5);
            }
            u00.a aVar2 = (u00.a) objN5;
            String strU2 = z3.U(g0Var, 2131887215);
            boolean z14 = z13 && !z10;
            boolean z15 = i13 == 32;
            Object objN6 = g0Var.N();
            if (z15 || objN6 == cVar) {
                objN6 = new wy.l(7, kVar);
                g0Var.n0(objN6);
            }
            ip.a aVar3 = new ip.a(strU2, z14, z10, (u00.a) objN6);
            kVar2 = kVar;
            lVar2 = lVar;
            up.f.a(aVar2, (b2.r) null, (b2.r) null, aVar3, false, v1.d.d(-1285788161, new ez.n(zBooleanValue, dVar, lVar, kVar2, tVar, str, 5), g0Var), g0Var, 196608, 22);
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new yr.c(lVar2, kVar2, i10, 2);
        }
    }

    public static final void b(DeleteAccountCodeLauncher deleteAccountCodeLauncher, j jVar, int i10) {
        kotlin.jvm.internal.m.e(deleteAccountCodeLauncher, "launcher");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1690061692);
        int i11 = (g0Var.g(deleteAccountCodeLauncher) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(a0.a, sy.c.class, aVarA, null, g0Var);
            }
            sy.c cVar2 = (sy.c) objN;
            u00.a aVarA2 = cq.l.a(g0Var);
            boolean z10 = (i11 & 14) == 4;
            Object objN2 = g0Var.N();
            if (z10 || objN2 == cVar) {
                objN2 = new f2(deleteAccountCodeLauncher, 26);
                g0Var.n0(objN2);
            }
            u00.a aVar = (u00.a) objN2;
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            zy.p pVarS = i.S(a0.a.b(zy.p.class), f1VarA.getViewModelStore(), null, bi.b.z(f1VarA), q50.c.a(g0Var), aVar);
            z0 z0VarQ = k00.f.q(((vm.a) pVarS).c.d, g0Var, 0);
            boolean zG2 = g0Var.g(pVarS) | g0Var.g(aVarA2) | g0Var.i(cVar2);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                pz.k kVar = new pz.k(pVarS, aVarA2, cVar2, (k00.c) null, 28);
                g0Var.n0(kVar);
                objN3 = kVar;
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN3);
            if (g0Var.k(dl.e.a) == gm.a.B) {
                g0Var.c0(-1272980546);
                l1.q.a(h.a.a(Boolean.TRUE), v1.d.d(935175255, new zy.k(pVarS, z0VarQ, 0), g0Var), g0Var, 56);
                g0Var.r(false);
            } else {
                g0Var.c0(-1272440278);
                zy.l lVar = (zy.l) z0VarQ.getValue();
                boolean zG3 = g0Var.g(pVarS);
                Object objN4 = g0Var.N();
                if (zG3 || objN4 == cVar) {
                    objN4 = new z.c(1, pVarS, zy.p.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/deletecode/DeleteAccountCodeAction;)V", 0, 2);
                    g0Var.n0(objN4);
                }
                a(lVar, (a10.g) objN4, g0Var, 0);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m3.a(deleteAccountCodeLauncher, i10, 25);
        }
    }

    public static q40.q c(u00.k kVar) throws NoWhenBranchMatchedException {
        q40.b bVar = q40.c.d;
        kotlin.jvm.internal.m.e(bVar, "from");
        kotlin.jvm.internal.m.e(kVar, "builderAction");
        q40.h hVar = new q40.h();
        q1 q1Var = ((q40.c) bVar).a;
        hVar.a = q1Var.f9911c;
        hVar.b = q1Var.f9910b;
        String str = (String) q1Var.f9913e;
        hVar.c = (String) q1Var.f9914f;
        q40.a aVar = (q40.a) q1Var.f9915g;
        boolean z10 = q1Var.f9912d;
        hVar.d = ((q40.c) bVar).b;
        kVar.invoke(hVar);
        if (!kotlin.jvm.internal.m.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z11 = hVar.b;
        boolean z12 = hVar.a;
        String str2 = hVar.c;
        q1 q1Var2 = new q1(z11, z12, str, str2, z10, aVar);
        ce.c cVar = hVar.d;
        kotlin.jvm.internal.m.e(cVar, "module");
        q40.q qVar = new q40.q(q1Var2, cVar);
        if (!cVar.equals(s40.e.a)) {
            for (Map.Entry entry : ((Map) cVar.B).entrySet()) {
                a10.d dVar = (a10.d) entry.getKey();
                s40.c cVar2 = (s40.c) entry.getValue();
                if (cVar2 instanceof s40.a) {
                    kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    throw null;
                }
                if (!(cVar2 instanceof s40.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                kotlin.jvm.internal.m.e(dVar, "kClass");
            }
            for (Map.Entry entry2 : ((Map) cVar.C).entrySet()) {
                a10.d dVar2 = (a10.d) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    a10.d dVar3 = (a10.d) entry3.getKey();
                    l40.a aVar2 = (l40.a) entry3.getValue();
                    kotlin.jvm.internal.m.c(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    kotlin.jvm.internal.m.c(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    kotlin.jvm.internal.m.c(aVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    n40.e descriptor = aVar2.getDescriptor();
                    va.a kind = descriptor.getKind();
                    if ((kind instanceof n40.b) || kotlin.jvm.internal.m.a(kind, n40.g.c)) {
                        throw new IllegalArgumentException("Serializer for " + dVar3.n() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (kotlin.jvm.internal.m.a(kind, n40.i.d) || kotlin.jvm.internal.m.a(kind, n40.i.e) || (kind instanceof n40.d) || (kind instanceof n40.h)) {
                        throw new IllegalArgumentException("Serializer for " + dVar3.n() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                    }
                    int iE = descriptor.e();
                    for (int i10 = 0; i10 < iE; i10++) {
                        String strF = descriptor.f(i10);
                        if (kotlin.jvm.internal.m.a(strF, str2)) {
                            throw new IllegalArgumentException("Polymorphic serializer for " + dVar3 + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        }
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) cVar.D).entrySet()) {
                a10.d dVar4 = (a10.d) entry4.getKey();
                u00.k kVar2 = (u00.k) entry4.getValue();
                kotlin.jvm.internal.m.c(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.m.c(kVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                d0.d(1, kVar2);
            }
            for (Map.Entry entry5 : ((Map) cVar.F).entrySet()) {
                a10.d dVar5 = (a10.d) entry5.getKey();
                u00.k kVar3 = (u00.k) entry5.getValue();
                kotlin.jvm.internal.m.c(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.m.c(kVar3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                d0.d(1, kVar3);
            }
        }
        return qVar;
    }

    public static final void d(u00.a aVar, jk.a aVar2, b2.r rVar, boolean z10, long j9, long j10, float f3, t0 t0Var, v1.c cVar, j jVar, int i10, int i11) {
        int i12;
        b2.r rVar2;
        int i13;
        int i14;
        boolean z11;
        v1.c cVar2;
        boolean z12;
        long j11;
        float f10;
        g0 g0Var;
        t0 t0Var2;
        r1 r1VarT;
        long j12;
        float f11;
        ok.c cVar3;
        Object objN;
        Object obj;
        z zVar;
        boolean zG;
        Object objN2;
        tm.i iVar;
        boolean z13;
        Object objN3;
        boolean z14;
        Object objN4;
        boolean zI;
        Object objN5;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objN6;
        ?? r4;
        b3.g gVar;
        int i15;
        kotlin.jvm.internal.m.e(aVar, "onClick");
        kotlin.jvm.internal.m.e(aVar2, "backdrop");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1283770474);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.i(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            rVar2 = rVar;
            i12 |= g0Var2.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            rVar2 = rVar;
        }
        int i16 = i12 | 27648;
        if ((196608 & i10) == 0) {
            i16 |= g0Var2.f(j10) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i16 |= g0Var2.d(2.0f) ? 1048576 : 524288;
        }
        int i17 = i11 & Cast.MAX_NAMESPACE_LENGTH;
        if (i17 == 0) {
            if ((12582912 & i10) == 0) {
                i16 |= g0Var2.d(f3) ? 8388608 : 4194304;
            }
            i13 = i16 | 100663296;
            if ((805306368 & i10) == 0) {
                if (g0Var2.i(cVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var2.S(i14 & 1, z11)) {
                j12 = i2.t.f7167g;
                if (i17 != 0) {
                    f11 = 52;
                } else {
                    f11 = f3;
                }
                cVar3 = ok.e.f12137b;
                objN = g0Var2.N();
                obj = l1.i.f9868a;
                if (objN == obj) {
                    objN = l1.q.o(g0Var2);
                    g0Var2.n0(objN);
                }
                zVar = (z) objN;
                zG = g0Var2.g(zVar);
                objN2 = g0Var2.N();
                if (zG || objN2 == obj) {
                    objN2 = new tm.i(zVar);
                    g0Var2.n0(objN2);
                }
                iVar = (tm.i) objN2;
                if ((i14 & 234881024) == 67108864) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN3 = g0Var2.N();
                if (z13 || objN3 == obj) {
                    objN3 = new sm.l(cVar3, 1);
                    g0Var2.n0(objN3);
                }
                u00.a aVar3 = (u00.a) objN3;
                if ((i14 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN4 = g0Var2.N();
                if (z14 || objN4 == obj) {
                    objN4 = new r9.e(11);
                    g0Var2.n0(objN4);
                }
                u00.k kVar = (u00.k) objN4;
                g0Var2.c0(1878720407);
                zI = g0Var2.i(iVar);
                objN5 = g0Var2.N();
                if (zI || objN5 == obj) {
                    objN5 = new sm.p(iVar, 1);
                    g0Var2.n0(objN5);
                }
                u00.k kVar2 = (u00.k) objN5;
                g0Var2.r(false);
                if ((i14 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i14 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objN6 = g0Var2.N();
                if (!z17 || objN6 == obj) {
                    r4 = 0;
                    objN6 = new sm.q(1, j12, j10);
                    g0Var2.n0(objN6);
                } else {
                    r4 = 0;
                }
                b2.r rVarB = jk.d.b(rVar2, aVar2, aVar3, kVar, null, null, null, kVar2, (u00.k) objN6, 3000);
                g0Var2.c0(1880541191);
                g0Var2.r(r4);
                float f12 = f11;
                v1.c cVar4 = cVar;
                b2.r rVarE = h0.c.E(z1.e(androidx.compose.foundation.b.b(rVarB, null, null, false, new j3.k(r4), aVar, 12).V(iVar.i.V(iVar.j)), f12), 16.0f, 0.0f, 2);
                h0.b bVar = h0.i.f6406a;
                int i18 = ((i14 >> 18) & 7168) | 432;
                v1 v1VarA = h0.t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var2, 54);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarE, g0Var2);
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(v1VarA, g0Var2, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.f2040g);
                l1.q.E(g0Var2, b3.h.f2041h);
                l1.q.I(rVarC, g0Var2, b3.h.f2037d);
                cVar4.invoke(x1.f6475a, g0Var2, Integer.valueOf(((i18 >> 6) & 112) | 6));
                g0Var2.r(true);
                z12 = true;
                g0Var = g0Var2;
                j11 = j12;
                t0Var2 = cVar3;
                f10 = f12;
                cVar2 = cVar4;
            } else {
                cVar2 = cVar;
                g0Var2.V();
                z12 = z10;
                j11 = j9;
                f10 = f3;
                g0Var = g0Var2;
                t0Var2 = t0Var;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u(aVar, aVar2, rVar, z12, j11, j10, f10, t0Var2, cVar2, i10, i11);
            }
        }
        i16 |= 12582912;
        i13 = i16 | 100663296;
        if ((805306368 & i10) == 0) {
            if (g0Var2.i(cVar)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        i14 = i13;
        if ((i14 & 306783379) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var2.S(i14 & 1, z11)) {
            j12 = i2.t.f7167g;
            if (i17 != 0) {
                f11 = 52;
            } else {
                f11 = f3;
            }
            cVar3 = ok.e.f12137b;
            objN = g0Var2.N();
            obj = l1.i.f9868a;
            if (objN == obj) {
                objN = l1.q.o(g0Var2);
                g0Var2.n0(objN);
            }
            zVar = (z) objN;
            zG = g0Var2.g(zVar);
            objN2 = g0Var2.N();
            if (zG) {
                objN2 = new tm.i(zVar);
                g0Var2.n0(objN2);
            } else {
                objN2 = new tm.i(zVar);
                g0Var2.n0(objN2);
            }
            iVar = (tm.i) objN2;
            if ((i14 & 234881024) == 67108864) {
                z13 = true;
            } else {
                z13 = false;
            }
            objN3 = g0Var2.N();
            if (z13) {
                objN3 = new sm.l(cVar3, 1);
                g0Var2.n0(objN3);
            } else {
                objN3 = new sm.l(cVar3, 1);
                g0Var2.n0(objN3);
            }
            u00.a aVar4 = (u00.a) objN3;
            if ((i14 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN4 = g0Var2.N();
            if (z14) {
                objN4 = new r9.e(11);
                g0Var2.n0(objN4);
            } else {
                objN4 = new r9.e(11);
                g0Var2.n0(objN4);
            }
            u00.k kVar3 = (u00.k) objN4;
            g0Var2.c0(1878720407);
            zI = g0Var2.i(iVar);
            objN5 = g0Var2.N();
            if (zI) {
                objN5 = new sm.p(iVar, 1);
                g0Var2.n0(objN5);
            } else {
                objN5 = new sm.p(iVar, 1);
                g0Var2.n0(objN5);
            }
            u00.k kVar4 = (u00.k) objN5;
            g0Var2.r(false);
            if ((i14 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i14 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objN6 = g0Var2.N();
            if (z17) {
                r4 = 0;
                objN6 = new sm.q(1, j12, j10);
                g0Var2.n0(objN6);
            } else {
                r4 = 0;
                objN6 = new sm.q(1, j12, j10);
                g0Var2.n0(objN6);
            }
            b2.r rVarB2 = jk.d.b(rVar2, aVar2, aVar4, kVar3, null, null, null, kVar4, (u00.k) objN6, 3000);
            g0Var2.c0(1880541191);
            g0Var2.r(r4);
            float f13 = f11;
            v1.c cVar5 = cVar;
            b2.r rVarE2 = h0.c.E(z1.e(androidx.compose.foundation.b.b(rVarB2, null, null, false, new j3.k(r4), aVar, 12).V(iVar.i.V(iVar.j)), f13), 16.0f, 0.0f, 2);
            h0.b bVar2 = h0.i.f6406a;
            int i19 = ((i14 >> 18) & 7168) | 432;
            v1 v1VarA2 = h0.t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var2, 54);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarE2, g0Var2);
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA2, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM2, g0Var2, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.f2040g);
            l1.q.E(g0Var2, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var2, b3.h.f2037d);
            cVar5.invoke(x1.f6475a, g0Var2, Integer.valueOf(((i19 >> 6) & 112) | 6));
            g0Var2.r(true);
            z12 = true;
            g0Var = g0Var2;
            j11 = j12;
            t0Var2 = cVar3;
            f10 = f13;
            cVar2 = cVar5;
        } else {
            cVar2 = cVar;
            g0Var2.V();
            z12 = z10;
            j11 = j9;
            f10 = f3;
            g0Var = g0Var2;
            t0Var2 = t0Var;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u(aVar, aVar2, rVar, z12, j11, j10, f10, t0Var2, cVar2, i10, i11);
        }
    }

    public static final void e(String str, b6.m mVar, n6.e eVar, int i10, j jVar, int i11, int i12) {
        int i13;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-192911377);
        if ((i11 & 6) == 0) {
            i13 = (g0Var.g(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= g0Var.g(mVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= g0Var.g(eVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i15 = i12 & 8;
        if (i15 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= g0Var.e(i10) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && g0Var.C()) {
            g0Var.V();
        } else {
            g0Var.X();
            if ((i11 & 1) == 0 || g0Var.A()) {
                if (i14 != 0) {
                    mVar = b6.k.f2179a;
                }
                if (i15 != 0) {
                    i10 = Integer.MAX_VALUE;
                }
            } else {
                g0Var.V();
            }
            g0Var.s();
            g0Var.d0(1849434622);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = n6.d.A;
                g0Var.n0(objN);
            }
            g0Var.r(false);
            u00.a aVar = (a10.g) objN;
            g0Var.d0(-1115894518);
            g0Var.d0(1886828752);
            if (!(g0Var.f9842a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(new b6.n(0, aVar));
            } else {
                g0Var.q0();
            }
            l1.q.I(str, g0Var, new m3.b0(21));
            l1.q.I(mVar, g0Var, new m3.b0(22));
            l1.q.I(eVar, g0Var, new m3.b0(23));
            m3.b0 b0Var = new m3.b0(24);
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(i10))) {
                g0Var.n0(Integer.valueOf(i10));
                g0Var.b(Integer.valueOf(i10), b0Var);
            }
            x5.z(g0Var, true, false, false);
        }
        b6.m mVar2 = mVar;
        int i16 = i10;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new d7(str, mVar2, eVar, i16, i11, i12, 1);
        }
    }

    public static final void f(Surface surface, l2.b bVar, y3.c cVar, k2.b bVar2) {
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            kotlin.jvm.internal.m.b(canvasLockHardwareCanvas);
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            k2.a aVar = bVar2.A;
            y3.m mVar = aVar.f8917b;
            Canvas canvas = i2.b.f7109a;
            i2.a aVar2 = new i2.a();
            aVar2.f7106a = canvasLockHardwareCanvas;
            float width = canvasLockHardwareCanvas.getWidth();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(canvasLockHardwareCanvas.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            y3.c cVar2 = aVar.f8916a;
            y3.m mVar2 = aVar.f8917b;
            i2.s sVar = aVar.f8918c;
            long j9 = aVar.f8919d;
            aVar.f8916a = cVar;
            aVar.f8917b = mVar;
            aVar.f8918c = aVar2;
            aVar.f8919d = jFloatToRawIntBits;
            aVar2.i();
            rd.a.x(bVar2, bVar);
            aVar2.q();
            aVar.f8916a = cVar2;
            aVar.f8917b = mVar2;
            aVar.f8918c = sVar;
            aVar.f8919d = j9;
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public static final String g(Object[] objArr, int i10, int i11, h00.h hVar) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == hVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static final void h(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    public static g7.j i(m7.m mVar, String str, m7.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriJ = e7.d.j(str, jVar.f10617c);
        long j9 = jVar.f10615a;
        long j10 = jVar.f10616b;
        String strA = mVar.a();
        if (strA == null) {
            strA = e7.d.j(((m7.b) mVar.B.get(0)).f10576a, jVar.f10617c).toString();
        }
        String str2 = strA;
        c0.w(uriJ, "The uri must be set.");
        return new g7.j(uriJ, 1, null, i2.G, j9, j10, str2, i10);
    }

    public static final Map j(tc.c cVar, Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        return h00.d0.R(new g00.k[]{new g00.k("[Amplitude] Action", "touch"), new g00.k("[Amplitude] Target Class", cVar.f14512b), new g00.k("[Amplitude] Target Resource", cVar.f14513c), new g00.k("[Amplitude] Target Tag", cVar.f14514d), new g00.k("[Amplitude] Target Text", cVar.f14515e), new g00.k("[Amplitude] Target Source", q.R0(k.W0(r30.r.v0(cVar.f14516f, "_", " "), new String[]{" "}, 6), " ", (String) null, (String) null, tc.d.A, 30)), new g00.k("[Amplitude] Hierarchy", cVar.f14517g), new g00.k("[Amplitude] Screen Name", y3.I(activity))});
    }

    public static final b6.m m(b6.m mVar, c6.a aVar) {
        return mVar.d(new c6.b(aVar));
    }

    public static int n(b1 b1Var, y yVar, View view, View view2, p0 p0Var, boolean z10) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(p0.G(view) - p0.G(view2)) + 1;
        }
        return Math.min(yVar.n(), yVar.d(view2) - yVar.g(view));
    }

    public static int o(b1 b1Var, y yVar, View view, View view2, p0 p0Var, boolean z10, boolean z11) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b1Var.b() - Math.max(p0.G(view), p0.G(view2))) - 1) : Math.max(0, Math.min(p0.G(view), p0.G(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(yVar.d(view2) - yVar.g(view)) / (Math.abs(p0.G(view) - p0.G(view2)) + 1))) + (yVar.m() - yVar.g(view)));
        }
        return iMax;
    }

    public static int p(b1 b1Var, y yVar, View view, View view2, p0 p0Var, boolean z10) {
        if (p0Var.v() == 0 || b1Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b1Var.b();
        }
        return (int) (((yVar.d(view2) - yVar.g(view)) / (Math.abs(p0.G(view) - p0.G(view2)) + 1)) * b1Var.b());
    }

    public static h10.f q(h10.c cVar, boolean z10) {
        String lowerCase;
        kotlin.jvm.internal.m.e(cVar, "functionClass");
        List list = cVar.K;
        l0 fVar = new h10.f(cVar, (h10.f) null, 1, z10);
        m10.u uVarX0 = cVar.x0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r0) obj).F() != a1.D) {
                break;
            }
            arrayList.add(obj);
        }
        h00.p pVarS1 = q.s1(arrayList);
        ArrayList arrayList2 = new ArrayList(r.q0(pVarS1, 10));
        h00.b0 it = pVarS1.iterator();
        while (true) {
            h00.b0 b0Var = it;
            if (!b0Var.B.hasNext()) {
                e30.a0 a0VarN = ((r0) q.T0(list)).n();
                j10.y yVar = j10.y.E;
                j10.o oVar = j10.p.e;
                x xVar = x.A;
                fVar.l1((m10.u) null, uVarX0, xVar, xVar, arrayList2, a0VarN, yVar, oVar);
                l0 l0Var = fVar;
                ((m10.t) l0Var).X = true;
                return l0Var;
            }
            h00.a0 a0Var = (h00.a0) b0Var.next();
            int i10 = a0Var.a;
            r0 r0Var = (r0) a0Var.b;
            String strB = r0Var.getName().b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            }
            l0 l0Var2 = fVar;
            n20.e eVarE = n20.e.e(lowerCase);
            e30.a0 a0VarN2 = r0Var.n();
            kotlin.jvm.internal.m.d(a0VarN2, "getDefaultType(...)");
            arrayList2.add(new m10.r0(l0Var2, (m10.r0) null, i10, k10.g.a, eVarE, a0VarN2, false, false, false, (e30.w) null, n0.n));
            fVar = l0Var2;
        }
    }

    public static androidx.lifecycle.a1 r(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                kotlin.jvm.internal.m.b(objNewInstance);
                return (androidx.lifecycle.a1) objNewInstance;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            }
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static final b6.m u(b6.m mVar) {
        return v(mVar).d(new j6.m(o6.d.f11663a));
    }

    public static final b6.m v(b6.m mVar) {
        return mVar.d(new s(o6.d.f11663a));
    }

    public static f0 w(String str) {
        kotlin.jvm.internal.m.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return f0.D;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return f0.C;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return f0.B;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return f0.E;
            }
        } else if (str.equals("SSLv3")) {
            return f0.F;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static float x(String[] strArr, int i10) {
        float f3 = Float.parseFloat(strArr[i10]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    public static final g20.p y(j0 j0Var, k20.g gVar, h9.f fVar, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.e(j0Var, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        o20.n nVar = l20.j.d;
        kotlin.jvm.internal.m.d(nVar, "propertySignature");
        l20.d dVar = (l20.d) w00.a.u(j0Var, nVar);
        if (dVar != null) {
            if (z10) {
                o20.h hVar = m20.g.a;
                m20.d dVarB = m20.g.b(j0Var, gVar, fVar, z12);
                if (dVarB != null) {
                    return ab.a0.b0(dVarB);
                }
            } else if (z11 && (dVar.B & 2) == 2) {
                l20.c cVar = dVar.D;
                kotlin.jvm.internal.m.d(cVar, "getSyntheticMethod(...)");
                return new g20.p(gVar.getString(cVar.C).concat(gVar.getString(cVar.D)));
            }
        }
        return null;
    }

    public int B(View view) {
        return 0;
    }

    public int C() {
        return 0;
    }

    public boolean G(byte[] bArr, int i10, int i11) {
        return N(bArr, i10, i11) == 0;
    }

    public void I(View view, int i10) {
    }

    public abstract void J(int i10);

    public abstract void K(View view, int i10, int i11);

    public abstract void L(View view, float f3, float f10);

    public abstract int N(byte[] bArr, int i10, int i11);

    public abstract boolean T(View view, int i10);

    public abstract int k(View view, int i10);

    public abstract int l(View view, int i10);

    public abstract String s(byte[] bArr, int i10, int i11);

    public abstract int t(String str, byte[] bArr, int i10, int i11);
}
