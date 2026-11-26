package qd;

import android.content.ComponentName;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k9.g1;
import k9.h1;
import l1.q1;
import ri.t1;

public final class j0 implements a5.p, a8.h0, ub.h {
    public final int A;
    public int B;
    public Object C;

    public j0(int i10, byte b7) {
        this.A = i10;
        switch (i10) {
            case 15:
                this.C = new LinkedHashMap();
                break;
            default:
                this.C = new e7.u(8);
                break;
        }
    }

    public j0(int i10, int i11) {
        this.A = i11;
        switch (i11) {
            case 7:
                this.B = i10;
                this.C = new AtomicInteger(0);
                break;
            default:
                this.B = i10;
                break;
        }
    }

    public j0(ca.p pVar, int i10) {
        this(i10, 1);
        this.A = 1;
        this.C = pVar;
    }

    public j0(Object obj, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
    }

    public j0(h1 h1Var) {
        this.A = 6;
        this.B = 0;
        this.C = h1Var;
    }

    public j0(q1 q1Var, a20.g gVar) {
        this.A = 11;
        this.C = gVar;
    }

    public j0(boolean z10, boolean z11, boolean z12) {
        this.A = 8;
        this.B = (z10 || z11 || z12) ? 1 : 0;
    }

    public j0(int[] iArr, int i10) {
        jh.a aVar;
        this.A = 14;
        this.B = i10;
        if (iArr != null) {
            jh.a aVar2 = jh.a.C;
            aVar = iArr.length == 0 ? jh.a.C : new jh.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = jh.a.C;
        }
        this.C = aVar;
    }

    public static final Object c(j0 j0Var, g00.b bVar, m00.a aVar) {
        r40.s sVar;
        byte bM;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        j0 j0Var2;
        byte bL;
        a20.g gVar;
        a20.g gVar2 = (a20.g) j0Var.C;
        if (aVar instanceof r40.s) {
            sVar = (r40.s) aVar;
            int i10 = sVar.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.G = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new r40.s(j0Var, aVar);
            }
        } else {
            sVar = new r40.s(j0Var, aVar);
        }
        Object obj = sVar.E;
        l00.a aVar2 = l00.a.A;
        int i11 = sVar.G;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = sVar.D;
            linkedHashMap2 = sVar.C;
            j0Var2 = sVar.B;
            g00.b bVar2 = sVar.A;
            t1.O(obj);
            linkedHashMap2.put(str, (q40.l) obj);
            bL = ((a20.g) j0Var2.C).l();
            if (bL == 4) {
                bM = bL;
                j0Var = j0Var2;
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
            } else if (bL != 7) {
                a20.g.u((a20.g) j0Var2.C, "Expected end of the object or comma", 0, (String) null, 6);
                throw null;
            }
            gVar = (a20.g) j0Var2.C;
            if (bL == 6) {
                gVar.m((byte) 7);
            } else if (bL == 4) {
                r40.j.l(gVar, "object");
                throw null;
            }
            return new q40.x(linkedHashMap2);
        }
        t1.O(obj);
        bM = gVar2.m((byte) 6);
        if (gVar2.F() == 4) {
            a20.g.u(gVar2, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        a20.g gVar3 = (a20.g) j0Var.C;
        if (gVar3.i()) {
            String strP = gVar3.p();
            gVar3.m((byte) 5);
            sVar.A = bVar;
            sVar.B = j0Var;
            sVar.C = linkedHashMap;
            sVar.D = strP;
            sVar.G = 1;
            bVar.getClass();
            bVar.B = sVar;
            return aVar2;
        }
        linkedHashMap2 = linkedHashMap;
        j0Var2 = j0Var;
        bL = bM;
        gVar = (a20.g) j0Var2.C;
        if (bL == 6) {
            gVar.m((byte) 7);
        } else if (bL == 4) {
            r40.j.l(gVar, "object");
            throw null;
        }
        return new q40.x(linkedHashMap2);
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.m.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    @Override
    public synchronized ub.c a(ub.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.C).get(bVar);
            ub.c cVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ub.f fVar = (ub.f) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) fVar.f15242b.get();
                ub.c cVar2 = bitmap != null ? new ub.c(bitmap, fVar.f15243c) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
            }
            int i11 = this.B;
            this.B = i11 + 1;
            if (i11 >= 10) {
                f();
            }
            return cVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public boolean b(View view) {
        ((BottomSheetBehavior) this.C).K(this.B);
        return true;
    }

    @Override
    public synchronized void d(int i10) {
        if (i10 >= 10 && i10 != 20) {
            f();
        }
    }

    public Object e(b3.a aVar, m00.c cVar) throws Exception {
        ld.i iVar;
        AtomicInteger atomicInteger = (AtomicInteger) this.C;
        if (cVar instanceof ld.i) {
            iVar = (ld.i) cVar;
            int i10 = iVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.E = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new ld.i(this, cVar);
            }
        } else {
            iVar = new ld.i(this, cVar);
        }
        Object obj = iVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = iVar.E;
        g00.b0 b0Var = g00.b0.a;
        if (i11 == 0) {
            t1.O(obj);
            if (atomicInteger.get() >= this.B) {
                aVar.invoke(Boolean.FALSE);
                return b0Var;
            }
            double dPow = Math.pow(2.0d, atomicInteger.get());
            iVar.A = this;
            iVar.B = aVar;
            iVar.E = 1;
            if (a40.c0.l((long) (dPow * ((double) 1000)), iVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = iVar.B;
            this = iVar.A;
            t1.O(obj);
        }
        aVar.invoke(Boolean.TRUE);
        ((AtomicInteger) this.C).incrementAndGet();
        return b0Var;
    }

    public void f() {
        WeakReference weakReference;
        this.B = 0;
        Iterator it = ((LinkedHashMap) this.C).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                ub.f fVar = (ub.f) h00.q.N0(arrayList);
                if (((fVar == null || (weakReference = fVar.f15242b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((ub.f) arrayList.get(i12)).f15242b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void h(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.C;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.C = cArrCopyOf;
        }
    }

    @Override
    public synchronized void i(ub.b bVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.C;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            ub.f fVar = new ub.f(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(fVar);
                    break;
                }
                ub.f fVar2 = (ub.f) arrayList2.get(i11);
                if (i10 >= fVar2.f15244d) {
                    if (fVar2.f15241a != iIdentityHashCode || fVar2.f15242b.get() != bitmap) {
                        arrayList2.add(i11, fVar);
                        break;
                    } else {
                        arrayList2.set(i11, fVar);
                        break;
                    }
                }
                i11++;
            }
            int i12 = this.B;
            this.B = i12 + 1;
            if (i12 >= 10) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Intent j(g1 g1Var, int i10) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(g1Var.f9307a.f9414b);
        h1 h1Var = (h1) this.C;
        intent.setComponent(new ComponentName(h1Var, h1Var.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i10));
        return intent;
    }

    public void k(oa.b bVar, int i10, int i11) {
        ((ca.p) this.C).k(new pa.a(bVar), i10, i11);
    }

    public q40.l l() {
        q40.l xVar;
        Object obj;
        a20.g gVar = (a20.g) this.C;
        byte bF = gVar.F();
        if (bF == 1) {
            return o(true);
        }
        if (bF == 0) {
            return o(false);
        }
        if (bF != 6) {
            if (bF == 8) {
                return m();
            }
            a20.g.u(gVar, "Cannot read Json element because of unexpected ".concat(r40.j.r(bF)), 0, (String) null, 6);
            throw null;
        }
        int i10 = this.B + 1;
        this.B = i10;
        if (i10 == 200) {
            r40.r rVar = new r40.r(this, (k00.c) null);
            l00.a aVar = g00.a.a;
            g00.b bVar = new g00.b();
            bVar.A = rVar;
            bVar.B = bVar;
            l00.a aVar2 = g00.a.a;
            bVar.C = aVar2;
            while (true) {
                obj = bVar.C;
                k00.c cVar = bVar.B;
                if (cVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.m.a(aVar2, obj)) {
                    try {
                        r40.r rVar2 = bVar.A;
                        kotlin.jvm.internal.d0.d(3, rVar2);
                        r40.r rVar3 = new r40.r(rVar2.D, cVar);
                        rVar3.C = bVar;
                        Object objInvokeSuspend = rVar3.invokeSuspend(g00.b0.a);
                        if (objInvokeSuspend != l00.a.A) {
                            cVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th2) {
                        cVar.resumeWith(t1.s(th2));
                    }
                } else {
                    bVar.C = aVar2;
                    cVar.resumeWith(obj);
                }
            }
            t1.O(obj);
            xVar = (q40.l) obj;
        } else {
            byte bM = gVar.m((byte) 6);
            if (gVar.F() == 4) {
                a20.g.u(gVar, "Unexpected leading comma", 0, (String) null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (gVar.i()) {
                String strP = gVar.p();
                gVar.m((byte) 5);
                linkedHashMap.put(strP, l());
                bM = gVar.l();
                if (bM != 4) {
                    if (bM == 7) {
                        break;
                    }
                    a20.g.u(gVar, "Expected end of the object or comma", 0, (String) null, 6);
                    throw null;
                }
            }
            if (bM == 6) {
                gVar.m((byte) 7);
            } else if (bM == 4) {
                r40.j.l(gVar, "object");
                throw null;
            }
            xVar = new q40.x(linkedHashMap);
        }
        this.B--;
        return xVar;
    }

    public q40.e m() {
        a20.g gVar = (a20.g) this.C;
        byte bL = gVar.l();
        if (gVar.F() == 4) {
            a20.g.u(gVar, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (gVar.i()) {
            arrayList.add(l());
            bL = gVar.l();
            if (bL != 4) {
                boolean z10 = bL == 9;
                int i10 = gVar.B;
                if (!z10) {
                    a20.g.u(gVar, "Expected end of the array or comma", i10, (String) null, 4);
                    throw null;
                }
            }
        }
        if (bL == 8) {
            gVar.m((byte) 9);
        } else if (bL == 4) {
            r40.j.l(gVar, "array");
            throw null;
        }
        return new q40.e(arrayList);
    }

    public long n(a8.m mVar) {
        e7.u uVar = (e7.u) this.C;
        int i10 = 0;
        mVar.i(uVar.f5182a, 0, 1, false);
        int i11 = uVar.f5182a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = Cast.MAX_NAMESPACE_LENGTH;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        mVar.i(uVar.f5182a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (uVar.f5182a[i10] & 255) + (i14 << 8);
        }
        this.B = i13 + 1 + this.B;
        return i14;
    }

    public q40.b0 o(boolean z10) {
        a20.g gVar = (a20.g) this.C;
        String strQ = !z10 ? gVar.q() : gVar.p();
        return (z10 || !kotlin.jvm.internal.m.a(strQ, "null")) ? new q40.r(strQ, z10, (n40.e) null) : q40.u.INSTANCE;
    }

    public void p() {
        r40.d dVar = r40.d.c;
        char[] cArr = (char[]) this.C;
        dVar.getClass();
        kotlin.jvm.internal.m.e(cArr, "array");
        synchronized (dVar) {
            int i10 = dVar.f631a;
            if (cArr.length + i10 < r40.c.a) {
                dVar.f631a = i10 + cArr.length;
                ((h00.m) dVar.f632b).addLast(cArr);
            }
        }
    }

    public void q(String str) {
        kotlin.jvm.internal.m.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.B, length);
        str.getChars(0, str.length(), (char[]) this.C, this.B);
        this.B += length;
    }

    public String r(q4 q4Var) {
        String str;
        l0 l0Var = (l0) this.C;
        int i10 = this.B;
        try {
            if (l0Var.K == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.h hVar = l0Var.K;
            String packageName = l0Var.I.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            k0 k0Var = new k0(q4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) hVar;
            Parcel parcelL2 = eVar.l2();
            parcelL2.writeString(packageName);
            parcelL2.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.f3950a;
            parcelL2.writeStrongBinder(k0Var);
            eVar.o2(1, parcelL2);
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e3) {
            l0Var.U(95, 28, o0.F);
            com.google.android.gms.internal.play_billing.q.i("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            q4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.A) {
            case 10:
                return new String((char[]) this.C, 0, this.B);
            case 14:
                jh.a aVar = (jh.a) this.C;
                ArrayList arrayList = new ArrayList(aVar.B);
                for (int i10 = 0; i10 < aVar.B; i10++) {
                    arrayList.add(e7.i0.U(aVar.a(i10)));
                }
                return "UnsupportedBrands{major=" + e7.i0.U(this.B) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }
}
