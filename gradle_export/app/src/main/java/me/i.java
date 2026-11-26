package me;

import a5.p;
import a8.r;
import ab.a0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import androidx.media3.common.v0;
import b3.k2;
import b3.l0;
import b3.m;
import ba.p0;
import ba.p1;
import ba.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d0.y1;
import d30.n;
import e7.u;
import eh.l;
import eh.v;
import eh.w;
import fh.r1;
import g00.b0;
import j10.t;
import j10.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import u.j0;
import u.r0;
import y3.o;

public class i implements p1, p, n, e0.b, w, eh.k, t {
    public static i C;
    public final int A;
    public Object B;

    public i(int i10) {
        this.A = i10;
        switch (i10) {
            case 5:
                this.B = Handler.createAsync(Looper.getMainLooper());
                break;
            case 7:
                this.B = new k2(m.f2071a);
                break;
            case 13:
                this.B = new HashMap();
                break;
            case 14:
                this.B = new LinkedHashMap();
                break;
            case 17:
                this.B = new m1.e(0, new d0.f[16]);
                break;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                j0 j0Var = r0.f14890a;
                this.B = new j0();
                break;
            default:
                this.B = new u(10);
                break;
        }
    }

    public i(int i10, boolean z10) {
        this.A = i10;
    }

    public i(Context context) {
        String strE;
        this.A = 0;
        b bVarA = b.a(context);
        this.B = bVarA;
        bVarA.b();
        String strE2 = bVarA.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = bVarA.e(b.f("googleSignInOptions", strE2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.a(strE);
        } catch (JSONException unused) {
        }
    }

    public i(Context context, cd.b bVar, wi.b bVar2) {
        this.A = 11;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.B = bVar2;
    }

    public i(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public i(y40.a aVar) {
        this.A = 3;
        this.B = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) aVar);
    }

    public static synchronized i K(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = C;
            if (iVar == null) {
                iVar = new i(applicationContext);
                C = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    public void A(StringBuilder sb2, Iterator it) {
        l lVar = (l) this.B;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(l.c(entry.getKey()));
            sb2.append("=");
            sb2.append(l.c(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.B);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(l.c(entry2.getKey()));
                sb2.append("=");
                sb2.append(l.c(entry2.getValue()));
            }
        }
    }

    public void B(CancellationException cancellationException) {
        m1.e eVar = (m1.e) this.B;
        int i10 = eVar.C;
        a40.j[] jVarArr = new a40.j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jVarArr[i11] = ((d0.f) eVar.A[i11]).f4428b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            jVarArr[i12].h(cancellationException);
        }
        if (eVar.C == 0) {
            return;
        }
        g0.a.c("uncancelled requests present");
    }

    public String C(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            dj.d dVar = (dj.d) this.B;
            dj.e eVar = new dj.e(stringWriter, dVar.f4905a, dVar.f4906b, dVar.f4907c, dVar.f4908d);
            eVar.h(obj);
            eVar.j();
            eVar.f4910b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void D(byte b7) {
        ((Parcel) this.B).writeByte(b7);
    }

    public void E(float f3) {
        ((Parcel) this.B).writeFloat(f3);
    }

    public void F(long j9) {
        long jB = o.b(j9);
        byte b7 = 0;
        if (!y3.p.a(jB, 0L)) {
            if (y3.p.a(jB, 4294967296L)) {
                b7 = 1;
            } else if (y3.p.a(jB, 8589934592L)) {
                b7 = 2;
            }
        }
        D(b7);
        if (y3.p.a(o.b(j9), 0L)) {
            return;
        }
        E(o.c(j9));
    }

    public void G(View view, int i10, boolean z10) {
        ((AutofillManager) this.B).notifyViewVisibilityChanged(view, i10, z10);
    }

    public v0 H(r rVar, o8.g gVar, int i10) {
        int i11;
        u uVar = (u) this.B;
        v0 v0VarX = null;
        int i12 = 0;
        while (true) {
            int i13 = 0;
            while (true) {
                int i14 = i13 % 10;
                int i15 = i14 + 10;
                if (i14 == 0 && i13 != 0) {
                    byte[] bArr = uVar.f5182a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i16 = i13 == 0 ? 10 : 1;
                try {
                    rVar.a(i15 - i16, i16, uVar.f5182a);
                    uVar.N(i14);
                    uVar.M(i15);
                    if (uVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + uVar.f5183b + ", limit=" + uVar.f5184c);
                    }
                    int iD = uVar.D();
                    i11 = uVar.f5183b - 3;
                    uVar.f5183b = i11;
                    if (iD == 4801587) {
                        break;
                    }
                    if (a8.b.i(uVar.i()) == -1) {
                        if (i13 == 0) {
                            uVar.c(20);
                        }
                        i13++;
                        if (i13 > i10) {
                        }
                    }
                    rVar.t();
                    rVar.m(i12);
                    return v0VarX;
                } catch (EOFException unused) {
                }
            }
            uVar.O(6);
            int iZ = uVar.z();
            int i17 = iZ + 10;
            if (v0VarX == null) {
                byte[] bArr2 = new byte[i17];
                System.arraycopy(uVar.f5182a, i11, bArr2, 0, 10);
                rVar.a(10, iZ, bArr2);
                v0VarX = new o8.i(gVar).X(i17, bArr2);
            } else {
                rVar.m(iZ);
            }
            i12 += i17;
        }
    }

    public boolean I(l0 l0Var) {
        if (!l0Var.J()) {
            y2.a.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((k2) this.B).remove(l0Var);
    }

    public void J() {
        m1.e eVar = (m1.e) this.B;
        z00.e eVarI0 = a0.I0(0, eVar.C);
        int i10 = ((z00.c) eVarI0).A;
        int i11 = ((z00.c) eVarI0).B;
        if (i10 <= i11) {
            while (true) {
                ((d0.f) eVar.A[i10]).f4428b.resumeWith(b0.a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.g();
    }

    public synchronized void L() {
        b bVar = (b) this.B;
        ReentrantLock reentrantLock = bVar.f10879a;
        reentrantLock.lock();
        try {
            bVar.f10880b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public t a(j10.o oVar) {
        kotlin.jvm.internal.m.e(oVar, "visibility");
        return this;
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        r1 r1Var = (r1) this.B;
        r1Var.getClass();
        entry.getClass();
        return new fh.p1(entry, r1Var);
    }

    @Override
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.B;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        boolean z10 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f4102d;
        int width = (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = z4.j0.f17198a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    public j10.u build() {
        return (g30.c) this.B;
    }

    public t c(e30.w wVar) {
        kotlin.jvm.internal.m.e(wVar, "type");
        return this;
    }

    public t d(List list) {
        return this;
    }

    public t e(n20.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "name");
        return this;
    }

    public t f(m10.u uVar) {
        return this;
    }

    @Override
    public int g(View view) {
        return (view.getLeft() - ((q0) view.getLayoutParams()).f2393b.left) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
    }

    public t h(int i10) {
        g4.c.q(i10, "kind");
        return this;
    }

    public t i() {
        return this;
    }

    @Override
    public int j() {
        return ((p0) this.B).D();
    }

    @Override
    public Iterator k(c50.h hVar, CharSequence charSequence) {
        return new v(this, hVar, charSequence, 0);
    }

    @Override
    public Object l(y1 y1Var, Float f3, Float f10, u00.k kVar, e0.g gVar) {
        Object objA = e0.l.a(y1Var, f3.floatValue(), x.c.b(0.0f, f10.floatValue(), 28), (x.t) this.B, kVar, gVar);
        return objA == l00.a.A ? objA : (e0.a) objA;
    }

    public void lock() {
        ((ReentrantLock) this.B).lock();
    }

    public t m() {
        return this;
    }

    public t n() {
        return this;
    }

    public t o(j10.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "owner");
        return this;
    }

    public t p(k10.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "additionalAnnotations");
        return this;
    }

    public t q() {
        return this;
    }

    @Override
    public int r() {
        p0 p0Var = (p0) this.B;
        return p0Var.f2388n - p0Var.E();
    }

    public t s() {
        return this;
    }

    public t t() {
        return this;
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return ((k2) this.B).toString();
            default:
                return super.toString();
        }
    }

    public t u(y yVar) {
        return this;
    }

    public void unlock() {
        ((ReentrantLock) this.B).unlock();
    }

    public t v() {
        return this;
    }

    @Override
    public View w(int i10) {
        return ((p0) this.B).u(i10);
    }

    @Override
    public int x(View view) {
        return view.getRight() + ((q0) view.getLayoutParams()).f2393b.right + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
    }

    public void y(l0 l0Var) {
        if (!l0Var.J()) {
            y2.a.c("DepthSortedSet.add called on an unattached node");
        }
        ((k2) this.B).add(l0Var);
    }

    public void z(fa.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "migration");
        int i10 = aVar.f5578a;
        int i11 = aVar.f5579b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.B;
        Integer numValueOf = Integer.valueOf(i10);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i11))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
        }
        treeMap2.put(Integer.valueOf(i11), aVar);
    }
}
