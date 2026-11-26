package d2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.i0;
import av.k;
import b3.l1;
import b3.p1;
import c3.m0;
import c3.s2;
import c3.z;
import c40.h;
import h00.q;
import j3.o;
import j3.s;
import j3.t;
import j3.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import l9.f0;
import m3.n0;
import m3.r0;
import me.i;
import ri.t1;
import u.l;
import u.m;
import u.w;
import u00.n;

public final class d implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final z A;
    public final k B;
    public f0 C;
    public final ArrayList D = new ArrayList();
    public final long E = 100;
    public a F = a.A;
    public boolean G = true;
    public final h H = t1.b(1, 6, null);
    public w I;
    public long J;
    public final w K;
    public s2 L;
    public boolean M;
    public final i0 N;

    public d(z zVar, k kVar) {
        this.A = zVar;
        this.B = kVar;
        new Handler(Looper.getMainLooper());
        w wVar = m.f14876a;
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.I = wVar;
        this.K = new w();
        s sVarA = zVar.getSemanticsOwner().a();
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.L = new s2(sVarA, wVar);
        this.N = new i0(this, 12);
    }

    public final java.lang.Object b(m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: d2.d.b(m00.c):java.lang.Object");
    }

    public final void c(l lVar) throws KotlinNothingValueException {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j9;
        char c10;
        long j10;
        int i10;
        int i11;
        long[] jArr3;
        s2 s2Var;
        int i12;
        String str;
        long j11;
        String str2;
        l lVar2 = lVar;
        int[] iArr3 = lVar2.f14872b;
        long[] jArr4 = lVar2.f14871a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr4[i13];
            char c11 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j12 & 255) < 128) {
                        int i17 = iArr3[(i13 << 3) + i16];
                        c10 = c11;
                        s2 s2Var2 = (s2) this.K.b(i17);
                        t tVar = (t) lVar2.b(i17);
                        s sVar = tVar != null ? tVar.f7971a : null;
                        if (sVar == null) {
                            throw a1.b.u("no value for specified key");
                        }
                        j10 = j13;
                        int i18 = sVar.f7970f;
                        u.i0 i0Var = sVar.f7968d.A;
                        String str3 = "Invalid content capture ID";
                        if (s2Var2 != null) {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j9 = j12;
                            i10 = i16;
                            Object[] objArr = i0Var.f14857b;
                            long[] jArr5 = i0Var.f14856a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j14 = jArr5[i19];
                                    Object[] objArr2 = objArr;
                                    long[] jArr6 = jArr5;
                                    if ((((~j14) << c10) & j14 & j10) != j10) {
                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j14 & 255) < 128) {
                                                j3.z zVar = (j3.z) objArr2[(i19 << 3) + i21];
                                                i12 = i21;
                                                j3.z zVar2 = j3.w.C;
                                                if (kotlin.jvm.internal.m.a(zVar, zVar2)) {
                                                    Object objG = s2Var2.f2760a.A.g(zVar2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    m3.h hVar = list != null ? (m3.h) q.N0(list) : null;
                                                    Object objG2 = i0Var.g(zVar2);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    m3.h hVar2 = list2 != null ? (m3.h) q.N0(list2) : null;
                                                    if (!kotlin.jvm.internal.m.a(hVar, hVar2)) {
                                                        String strValueOf = String.valueOf(hVar2);
                                                        f0 f0Var = this.C;
                                                        if (f0Var != null) {
                                                            AutofillId autofillIdO = f0Var.o(i18);
                                                            if (autofillIdO == null) {
                                                                throw a1.b.u("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) f0Var.B).notifyViewTextChanged(autofillIdO, strValueOf);
                                                        }
                                                    }
                                                }
                                                j14 >>= 8;
                                                i21 = i12 + 1;
                                                s2Var2 = s2Var2;
                                                jArr6 = jArr6;
                                            } else {
                                                i12 = i21;
                                            }
                                            j14 >>= 8;
                                            i21 = i12 + 1;
                                            s2Var2 = s2Var2;
                                            jArr6 = jArr6;
                                        }
                                        jArr3 = jArr6;
                                        s2Var = s2Var2;
                                        if (i20 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        s2Var = s2Var2;
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19++;
                                    objArr = objArr2;
                                    s2Var2 = s2Var;
                                    jArr5 = jArr3;
                                }
                            }
                        } else {
                            Object[] objArr3 = i0Var.f14857b;
                            long[] jArr7 = i0Var.f14856a;
                            int i22 = i14;
                            int length3 = jArr7.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            if (length3 >= 0) {
                                int i23 = 0;
                                while (true) {
                                    long j15 = jArr7[i23];
                                    j9 = j12;
                                    if ((((~j15) << c10) & j15 & j10) != j10) {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            if ((j15 & 255) < 128) {
                                                j11 = j15;
                                                j3.z zVar3 = (j3.z) objArr3[(i23 << 3) + i25];
                                                j3.z zVar4 = j3.w.C;
                                                if (kotlin.jvm.internal.m.a(zVar3, zVar4)) {
                                                    Object objG3 = i0Var.g(zVar4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    String strValueOf2 = String.valueOf(list3 != null ? (m3.h) q.N0(list3) : null);
                                                    f0 f0Var2 = this.C;
                                                    if (f0Var2 != null) {
                                                        str2 = str3;
                                                        AutofillId autofillIdO2 = f0Var2.o(i18);
                                                        if (autofillIdO2 == null) {
                                                            throw a1.b.u(str2);
                                                        }
                                                        ((ContentCaptureSession) f0Var2.B).notifyViewTextChanged(autofillIdO2, strValueOf2);
                                                    }
                                                }
                                                j15 = j11 >> i22;
                                                i25++;
                                                i16 = i16;
                                                str3 = str2;
                                            } else {
                                                j11 = j15;
                                            }
                                            str2 = str3;
                                            j15 = j11 >> i22;
                                            i25++;
                                            i16 = i16;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i10 = i16;
                                        if (i24 != i22) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i10 = i16;
                                    }
                                    if (i23 == length3) {
                                        break;
                                    }
                                    i23++;
                                    j12 = j9;
                                    i16 = i10;
                                    str3 = str;
                                    i22 = 8;
                                }
                            } else {
                                j9 = j12;
                                i10 = i16;
                            }
                        }
                        i11 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j9 = j12;
                        c10 = c11;
                        j10 = j13;
                        i10 = i16;
                        i11 = i14;
                    }
                    j12 = j9 >> i11;
                    i16 = i10 + 1;
                    lVar2 = lVar;
                    i14 = i11;
                    c11 = c10;
                    j13 = j10;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            lVar2 = lVar;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    public final void d(s sVar, n nVar) {
        sVar.getClass();
        List listJ = s.j(4, sVar);
        int size = listJ.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listJ.get(i11);
            if (e().a(((s) obj).f7970f)) {
                nVar.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    public final l e() {
        if (this.G) {
            this.G = false;
            this.I = v.b(this.A.getSemanticsOwner(), c.A);
            this.J = System.currentTimeMillis();
        }
        return this.I;
    }

    public final boolean f() {
        return this.C != null;
    }

    public final void g() throws NoWhenBranchMatchedException {
        f0 f0Var = this.C;
        if (f0Var == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) f0Var.B;
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            int iOrdinal = eVar.f4590c.ordinal();
            if (iOrdinal == 0) {
                i iVar = eVar.f4591d;
                if (iVar != null) {
                    contentCaptureSession.notifyViewAppeared((ViewStructure) iVar.B);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                AutofillId autofillIdO = f0Var.o(eVar.f4588a);
                if (autofillIdO != null) {
                    contentCaptureSession.notifyViewDisappeared(autofillIdO);
                }
            }
        }
        contentCaptureSession.notifyViewsDisappeared(((View) f0Var.C).getAutofillId(), new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    public final void h(s sVar, s2 s2Var) throws KotlinNothingValueException {
        d(sVar, new l1(s2Var, this, 1));
        List listJ = s.j(4, sVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar2 = (s) listJ.get(i10);
            l lVarE = e();
            int i11 = sVar2.f7970f;
            if (lVarE.a(i11)) {
                w wVar = this.K;
                if (wVar.a(i11)) {
                    Object objB = wVar.b(i11);
                    if (objB == null) {
                        throw a1.b.u("node not present in pruned tree before this change");
                    }
                    h(sVar2, (s2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void i(int i10, s sVar) {
        u00.k kVar;
        h2.c cVarA;
        i iVar;
        String strX;
        u00.k kVar2;
        if (f()) {
            u.i0 i0Var = sVar.f7968d.A;
            Object objG = i0Var.g(j3.w.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.F == a.A && kotlin.jvm.internal.m.a(bool, Boolean.TRUE)) {
                Object objG2 = i0Var.g(j3.n.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                j3.a aVar = (j3.a) objG2;
                if (aVar != null && (kVar2 = aVar.f7927b) != null) {
                }
            } else if (this.F == a.B && kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
                Object objG3 = i0Var.g(j3.n.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                j3.a aVar2 = (j3.a) objG3;
                if (aVar2 != null && (kVar = aVar2.f7927b) != null) {
                }
            }
            int i11 = sVar.f7970f;
            f0 f0Var = this.C;
            if (f0Var == null) {
                iVar = null;
            } else {
                AutofillId autofillId = this.A.getAutofillId();
                s sVarL = sVar.l();
                int i12 = sVar.f7970f;
                if (sVarL == null || (autofillId = f0Var.o(sVarL.f7970f)) != null) {
                    ViewStructure viewStructureNewVirtualViewStructure = ((ContentCaptureSession) f0Var.B).newVirtualViewStructure(autofillId, i12);
                    i iVar2 = new i(viewStructureNewVirtualViewStructure, 25);
                    o oVar = sVar.f7968d;
                    j3.z zVar = j3.w.N;
                    u.i0 i0Var2 = oVar.A;
                    if (i0Var2.c(zVar)) {
                        iVar = null;
                    } else {
                        Bundle extras = viewStructureNewVirtualViewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.J);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
                        }
                        Object objG4 = i0Var2.g(j3.w.A);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructureNewVirtualViewStructure.setId(i12, null, null, str);
                        }
                        Object objG5 = i0Var2.g(j3.w.f7989n);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = i0Var2.g(j3.w.C);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.TextView");
                            viewStructureNewVirtualViewStructure.setText(a4.a.a(list, "\n", null, 62));
                        }
                        Object objG7 = i0Var2.g(j3.w.G);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        m3.h hVar = (m3.h) objG7;
                        if (hVar != null) {
                            viewStructureNewVirtualViewStructure.setClassName("android.widget.EditText");
                            viewStructureNewVirtualViewStructure.setText(hVar);
                        }
                        Object objG8 = i0Var2.g(j3.w.f7978a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructureNewVirtualViewStructure.setContentDescription(a4.a.a(list2, "\n", null, 62));
                        }
                        Object objG9 = i0Var2.g(j3.w.f8001z);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        j3.k kVar3 = (j3.k) objG9;
                        if (kVar3 != null && (strX = m0.x(kVar3.f7937a)) != null) {
                            viewStructureNewVirtualViewStructure.setClassName(strX);
                        }
                        n0 n0VarQ = m0.q(oVar);
                        if (n0VarQ != null) {
                            m3.m0 m0Var = n0VarQ.f10496a;
                            r0 r0Var = m0Var.f10484b;
                            y3.c cVar = m0Var.f10489g;
                            viewStructureNewVirtualViewStructure.setTextStyle(cVar.t0() * cVar.c() * y3.o.c(r0Var.f10522a.f10458b), 0, 0, 0);
                        }
                        p1 p1VarD = sVar.d();
                        if (p1VarD == null) {
                            cVarA = h2.c.f6545e;
                        } else {
                            p1 p1Var = p1VarD.z1().N ? p1VarD : null;
                            if (p1Var != null) {
                                cVarA = sVar.a(p1Var);
                            } else {
                                cVarA = h2.c.f6545e;
                            }
                        }
                        float f3 = cVarA.f6546a;
                        float f10 = cVarA.f6547b;
                        viewStructureNewVirtualViewStructure.setDimens((int) f3, (int) f10, 0, 0, (int) (cVarA.f6548c - f3), (int) (cVarA.f6549d - f10));
                        iVar = iVar2;
                    }
                } else {
                    iVar = null;
                }
            }
            if (iVar != null) {
                this.D.add(new e(i11, this.J, f.A, iVar));
            }
            d(sVar, new b2.n(this, 6));
        }
    }

    public final void j(s sVar) {
        if (f()) {
            this.D.add(new e(sVar.f7970f, this.J, f.B, null));
            List listJ = s.j(4, sVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                j((s) listJ.get(i10));
            }
        }
    }

    public final void k() {
        w wVar = this.K;
        wVar.c();
        l lVarE = e();
        int[] iArr = lVarE.f14872b;
        Object[] objArr = lVarE.f14873c;
        long[] jArr = lVarE.f14871a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            wVar.i(iArr[i13], new s2(((t) objArr[i13]).f7971a, e()));
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.L = new s2(this.A.getSemanticsOwner().a(), e());
    }

    @Override
    public final void onStart(androidx.lifecycle.w wVar) throws NoWhenBranchMatchedException {
        this.C = (f0) this.B.invoke();
        i(-1, this.A.getSemanticsOwner().a());
        g();
    }

    @Override
    public final void onStop(androidx.lifecycle.w wVar) throws NoWhenBranchMatchedException {
        j(this.A.getSemanticsOwner().a());
        g();
        this.C = null;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A.getHandler();
        kotlin.jvm.internal.m.b(handler);
        handler.removeCallbacks(this.N);
        this.C = null;
    }
}
