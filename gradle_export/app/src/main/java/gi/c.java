package gi;

import android.app.Notification;
import android.content.res.Resources;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.x0;
import bk.a0;
import bt.t1;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.cast.r0;
import com.google.gson.JsonIOException;
import com.google.protobuf.RuntimeVersion;
import d40.p1;
import e30.w;
import e7.i0;
import fh.t0;
import g20.l;
import hf.e;
import hx.t;
import i10.o;
import j0.n;
import j0.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.WeakHashMap;
import k0.p;
import k0.y;
import k7.e0;
import kotlin.jvm.internal.x;
import l0.u0;
import l0.v0;
import l4.d;
import l60.m;
import m9.l0;
import mb.j;
import oi.s;
import org.json.JSONException;
import org.json.JSONObject;
import p.x1;
import s10.w0;
import u00.k;
import x40.c0;
import x40.d0;
import xb.h;
import xf.g;
import z1.f;
import z4.g1;
import z4.j0;
import z4.j1;
import z4.r;

public final class c implements l, q, SessionManagerListener, n30.a, r, m, l0, h, mi.b, ni.a, x1 {
    public final int A;
    public Object B;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 25:
                this.B = new HashSet();
                break;
            case RuntimeVersion.MINOR:
            default:
                this.B = new Region();
                break;
            case 27:
                this.B = t0.m();
                break;
            case 28:
                this.B = new ArrayDeque(16);
                break;
        }
    }

    public c(int i10, boolean z10) {
        this.A = i10;
    }

    public c(Notification notification) {
        this.A = 15;
        notification.getClass();
        this.B = notification;
    }

    public c(Resources resources) {
        this.A = 22;
        resources.getClass();
        this.B = resources;
    }

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public c(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj2;
    }

    public c(o10.b bVar, h7.b bVar2) {
        this.A = 0;
        this.B = bVar2;
        bVar.x(new b(this, 1));
    }

    public static u0 t(c cVar, int i10) {
        v vVar = (v) cVar.B;
        f fVarF = z1.q.f();
        k kVarE = fVarF != null ? fVarF.e() : null;
        f fVarK = z1.q.k(fVarF);
        try {
            n nVar = (n) vVar.f7822f.getValue();
            return vVar.f7831q.a(i10, nVar.f7780j, vVar.f7820d, new t(i10, nVar));
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public static String u(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        g1 g1Var = j1Var.f17202a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.B;
        if (!Objects.equals(coordinatorLayout.N, j1Var)) {
            coordinatorLayout.N = j1Var;
            boolean z10 = j1Var.d() > 0;
            coordinatorLayout.O = z10;
            coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
            if (!g1Var.s()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    WeakHashMap weakHashMap = j0.f17198a;
                    if (childAt.getFitsSystemWindows() && ((d) childAt.getLayoutParams()).f10017a != null && g1Var.s()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return j1Var;
    }

    public void a() {
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.A) {
            case 2:
                hf.a aVar = new hf.a(1, (g) obj2);
                hf.l lVar = (hf.l) ((e) obj).getService();
                ke.e eVar = (ke.e) this.B;
                Parcel parcelD = lVar.d();
                int i10 = hf.h.f7055a;
                parcelD.writeStrongBinder(aVar);
                hf.h.c(parcelD, eVar);
                lVar.f(1, parcelD);
                break;
            default:
                jf.f fVar = new jf.f(0, (g) obj2);
                jf.e eVar2 = (jf.e) ((jf.d) obj).getService();
                ne.f fVar2 = (ne.f) this.B;
                Parcel parcelD2 = eVar2.d();
                int i11 = jf.c.f8279a;
                parcelD2.writeStrongBinder(fVar);
                jf.c.b(parcelD2, fVar2);
                eVar2.f(10, parcelD2);
                break;
        }
    }

    public Iterable b(Object obj) {
        o oVar = (o) this.B;
        Collection collectionL = ((j10.e) obj).f().l();
        kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionL.iterator();
        while (it.hasNext()) {
            j10.h hVarG = ((w) it.next()).m0().g();
            j10.e eVarF = null;
            j10.h hVarA = hVarG != null ? hVarG.a() : null;
            j10.e eVar = hVarA instanceof j10.e ? (j10.e) hVarA : null;
            if (eVar != null && (eVarF = oVar.f(eVar)) == null) {
                eVarF = eVar;
            }
            if (eVarF != null) {
                arrayList.add(eVarF);
            }
        }
        return arrayList;
    }

    @Override
    public void c(o.l lVar, MenuItem menuItem) {
        ((o.f) this.B).F.removeCallbacksAndMessages(lVar);
    }

    public Object convert(Object obj) {
        switch (this.A) {
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return Optional.ofNullable(((m) this.B).convert((d0) obj));
            default:
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.A;
                if (c0Var == null) {
                    c0Var = new c0(d0Var.v(), d0Var.i());
                    d0Var.A = c0Var;
                }
                ik.a aVar = new ik.a(c0Var);
                aVar.O = 2;
                try {
                    Object objB = ((a0) this.B).b(aVar);
                    if (aVar.t0() != 10) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                    d0Var.close();
                    return objB;
                } catch (Throwable th2) {
                    d0Var.close();
                    throw th2;
                }
        }
    }

    @Override
    public Object d(lb.h hVar) {
        return d40.o.s(new t1(((j) this.B).F, 13), hVar);
    }

    @Override
    public void e(oi.q qVar) {
        this.B = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    public g20.m f(n20.e eVar) {
        if ("b".equals(eVar.b())) {
            return new h20.b(this, 2);
        }
        return null;
    }

    @Override
    public void g(o.l lVar, o.n nVar) {
        o.f fVar = (o.f) this.B;
        Handler handler = fVar.F;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.H;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((o.e) arrayList.get(i10)).f11399b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new r0(4, this, i11 < arrayList.size() ? (o.e) arrayList.get(i11) : null, nVar, lVar, false), lVar, SystemClock.uptimeMillis() + 200);
    }

    public l h(n20.b bVar, n20.e eVar) {
        return null;
    }

    @Override
    public void i(String str, Bundle bundle) {
        oi.q qVar = (oi.q) this.B;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + u(str, bundle);
                s sVar = qVar.f12032a;
                sVar.f12045o.f12529a.a(new oi.r(sVar, System.currentTimeMillis() - sVar.f12036d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public void j(n20.e eVar, s20.f fVar) {
    }

    public void k(n20.e eVar, Object obj) {
    }

    public String l(androidx.media3.common.t tVar) {
        String displayName;
        String str = tVar.f1586d;
        String str2 = tVar.f1584b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = RuntimeVersion.SUFFIX;
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = i0.f5136a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = RuntimeVersion.SUFFIX;
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strQ = q(displayName, m(tVar));
        if (!TextUtils.isEmpty(strQ)) {
            return strQ;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = RuntimeVersion.SUFFIX;
        }
        return str2;
    }

    public String m(androidx.media3.common.t tVar) {
        Resources resources = (Resources) this.B;
        int i10 = tVar.f1588f;
        int i11 = tVar.f1588f;
        String string = (i10 & 2) != 0 ? resources.getString(2131886488) : RuntimeVersion.SUFFIX;
        if ((i11 & 4) != 0) {
            string = q(string, resources.getString(2131886491));
        }
        if ((i11 & 8) != 0) {
            string = q(string, resources.getString(2131886490));
        }
        return (i11 & 1088) != 0 ? q(string, resources.getString(2131886489)) : string;
    }

    public void n(n20.e eVar, n20.b bVar, n20.e eVar2) {
    }

    public void o() {
        ((l1.n) this.B).getClass();
    }

    @Override
    public void onSessionEnded(Session session, int i10) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        p1 p1Var = ((hq.b) this.B).c;
        Boolean bool = Boolean.FALSE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    @Override
    public void onSessionEnding(Session session) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
    }

    @Override
    public void onSessionResumeFailed(Session session, int i10) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        p1 p1Var = ((hq.b) this.B).c;
        Boolean bool = Boolean.FALSE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    @Override
    public void onSessionResumed(Session session, boolean z10) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        hq.b bVar = (hq.b) this.B;
        if (!bVar.a.k()) {
            bVar.b();
            return;
        }
        p1 p1Var = bVar.c;
        Boolean bool = Boolean.TRUE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    @Override
    public void onSessionResuming(Session session, String str) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        kotlin.jvm.internal.m.e(str, "sessionId");
    }

    @Override
    public void onSessionStartFailed(Session session, int i10) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        p1 p1Var = ((hq.b) this.B).c;
        Boolean bool = Boolean.FALSE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    @Override
    public void onSessionStarted(Session session, String str) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        kotlin.jvm.internal.m.e(str, "sessionId");
        hq.b bVar = (hq.b) this.B;
        if (!bVar.a.k()) {
            bVar.b();
            return;
        }
        p1 p1Var = bVar.c;
        Boolean bool = Boolean.TRUE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    @Override
    public void onSessionStarting(Session session) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
    }

    @Override
    public void onSessionSuspended(Session session, int i10) {
        kotlin.jvm.internal.m.e((CastSession) session, "session");
        p1 p1Var = ((hq.b) this.B).c;
        Boolean bool = Boolean.FALSE;
        p1Var.getClass();
        p1Var.k((Object) null, bool);
    }

    public String p(androidx.media3.common.t tVar) {
        String strL;
        String string;
        Resources resources = (Resources) this.B;
        String str = tVar.f1594n;
        int i10 = tVar.f1592j;
        int i11 = tVar.F;
        int i12 = tVar.f1602v;
        int i13 = tVar.f1601u;
        String str2 = tVar.f1593k;
        int iH = x0.h(str);
        if (iH == -1) {
            if (x0.i(str2) != null) {
                iH = 2;
            } else if (x0.b(str2) != null) {
                iH = 1;
            } else if (i13 != -1 || i12 != -1) {
                iH = 2;
            } else if (i11 == -1 && tVar.G == -1) {
                iH = -1;
            } else {
                iH = 1;
            }
        }
        String string2 = RuntimeVersion.SUFFIX;
        if (iH == 2) {
            String strM = m(tVar);
            String string3 = (i13 == -1 || i12 == -1) ? RuntimeVersion.SUFFIX : resources.getString(2131886487, Integer.valueOf(i13), Integer.valueOf(i12));
            if (i10 != -1) {
                string2 = resources.getString(2131886485, Float.valueOf(i10 / 1000000.0f));
            }
            strL = q(strM, string3, string2);
        } else if (iH == 1) {
            String strL2 = l(tVar);
            if (i11 == -1 || i11 < 1) {
                string = RuntimeVersion.SUFFIX;
            } else if (i11 == 1) {
                string = resources.getString(2131886486);
            } else if (i11 == 2) {
                string = resources.getString(2131886495);
            } else if (i11 == 6 || i11 == 7) {
                string = resources.getString(2131886497);
            } else {
                string = i11 != 8 ? resources.getString(2131886496) : resources.getString(2131886498);
            }
            if (i10 != -1) {
                string2 = resources.getString(2131886485, Float.valueOf(i10 / 1000000.0f));
            }
            strL = q(strL2, string, string2);
        } else {
            strL = l(tVar);
        }
        if (!strL.isEmpty()) {
            return strL;
        }
        String str3 = tVar.f1586d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(2131886499) : resources.getString(2131886500, str3);
    }

    public String q(String... strArr) {
        String string = RuntimeVersion.SUFFIX;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.B).getString(2131886484, string, str);
            }
        }
        return string;
    }

    public void r(Exception exc) {
        e7.a.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        k7.n nVar = ((e0) this.B).f9033e1;
        Handler handler = nVar.f9111a;
        if (handler != null) {
            handler.post(new k7.l(nVar, exc, 8));
        }
    }

    public ArrayList s(int i10) {
        ArrayList arrayList = new ArrayList();
        y yVar = (y) this.B;
        f fVarF = z1.q.f();
        k kVarE = fVarF != null ? fVarF.e() : null;
        f fVarK = z1.q.k(fVarF);
        try {
            p pVar = yVar.f8544b ? yVar.f8545c : (p) yVar.f8547e.getValue();
            if (pVar != null) {
                x xVar = new x();
                xVar.A = 1;
                List list = (List) pVar.f8501k.invoke(Integer.valueOf(i10));
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g00.k kVar = (g00.k) list.get(i11);
                    v0 v0Var = yVar.f8555o;
                    int iIntValue = ((Number) kVar.A).intValue();
                    long j9 = ((y3.a) kVar.B).f16587a;
                    w0 w0Var = y.f8542w;
                    xVar = xVar;
                    arrayList.add(v0Var.a(iIntValue, j9, false, new az.k((ArrayList) null, xVar, list, i10, pVar)));
                }
            }
            return arrayList;
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public void v(y3.k kVar) {
        ((Region) this.B).set(kVar.f16592a, kVar.f16593b, kVar.f16594c, kVar.f16595d);
    }

    public void w() {
        ArrayDeque arrayDeque = (ArrayDeque) this.B;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + y());
    }

    public void x(long j9) throws IOException {
        long jY = y();
        if (jY != j9) {
            if (jY != -1) {
                if (jY != -2) {
                    return;
                } else {
                    jY = -2;
                }
            }
            StringBuilder sbN = w.c.n("expected non-string scope or scope ", j9, " but found ");
            sbN.append(jY);
            throw new IOException(sbN.toString());
        }
    }

    public long y() {
        ArrayDeque arrayDeque = (ArrayDeque) this.B;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
