package a1;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import c3.n3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import d0.k3;
import g1.a3;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class g extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public final Object F;

    public g(androidx.lifecycle.q qVar, androidx.lifecycle.p pVar, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 4;
        this.D = qVar;
        this.E = pVar;
        this.F = (m00.i) nVar;
    }

    public g(k3 k3Var, k00.c cVar) {
        super(2, cVar);
        this.A = 15;
        this.F = k3Var;
    }

    public g(d40.h1 h1Var, d40.i iVar, d40.w0 w0Var, Object obj, k00.c cVar) {
        super(2, cVar);
        this.A = 18;
        this.D = h1Var;
        this.E = iVar;
        this.F = (e40.a) w0Var;
        this.C = obj;
    }

    public g(d40.i iVar, d40.w0 w0Var, Object obj, k00.c cVar) {
        super(2, cVar);
        this.A = 17;
        this.D = iVar;
        this.E = (e40.a) w0Var;
        this.F = obj;
    }

    public g(e1.q qVar, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 23;
        this.E = qVar;
        this.F = (m00.i) nVar;
    }

    public g(j40.c cVar, u00.n nVar, k00.c cVar2) {
        super(2, cVar2);
        this.A = 3;
        this.E = cVar;
        this.F = (m00.i) nVar;
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }

    public g(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
        this.F = obj2;
    }

    public g(u00.k kVar, AtomicReference atomicReference, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        this.D = (kotlin.jvm.internal.n) kVar;
        this.E = atomicReference;
        this.F = nVar;
    }

    private final java.lang.Object i(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: a1.g.i(java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj) throws Throwable {
        e1.q qVar;
        j40.a aVar;
        j40.a aVar2;
        TextClassifier textClassifier;
        Object objL;
        l00.a aVar3 = l00.a.A;
        int i10 = this.B;
        try {
            if (i10 == 0) {
                ri.t1.O(obj);
                qVar = (e1.q) this.E;
                aVar = qVar.f4988e;
                this.C = aVar;
                this.D = qVar;
                this.B = 1;
                if (aVar.l(this) != aVar3) {
                }
                return aVar3;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                aVar2 = (j40.a) this.C;
                try {
                    ri.t1.O(obj);
                    textClassifier = (TextClassifier) obj;
                    aVar = aVar2;
                    aVar.i((Object) null);
                    d0.i2 i2Var = new d0.i2(textClassifier, (u00.n) this.F, (k00.c) null);
                    this.C = null;
                    this.D = null;
                    this.B = 3;
                    objL = a40.c0.L(200L, i2Var, this);
                    if (objL == aVar3) {
                        return aVar3;
                    }
                    return objL;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i((Object) null);
                    throw th;
                }
            }
            qVar = (e1.q) this.D;
            j40.a aVar4 = (j40.a) this.C;
            ri.t1.O(obj);
            aVar = aVar4;
            textClassifier = qVar.f4989f;
            if (textClassifier == null || textClassifier.isDestroyed()) {
                bt.y0 y0Var = new bt.y0(qVar, (k00.c) null, 3);
                this.C = aVar;
                this.D = null;
                this.B = 2;
                Object objL2 = a40.c0.L(300L, y0Var, this);
                if (objL2 != aVar3) {
                    aVar2 = aVar;
                    obj = objL2;
                    textClassifier = (TextClassifier) obj;
                    aVar = aVar2;
                    aVar.i((Object) null);
                    d0.i2 i2Var2 = new d0.i2(textClassifier, (u00.n) this.F, (k00.c) null);
                    this.C = null;
                    this.D = null;
                    this.B = 3;
                    objL = a40.c0.L(200L, i2Var2, this);
                    if (objL == aVar3) {
                        return objL;
                    }
                }
            } else {
                aVar.i((Object) null);
                d0.i2 i2Var3 = new d0.i2(textClassifier, (u00.n) this.F, (k00.c) null);
                this.C = null;
                this.D = null;
                this.B = 3;
                objL = a40.c0.L(200L, i2Var3, this);
                if (objL == aVar3) {
                    return objL;
                }
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i((Object) null);
            throw th;
        }
    }

    private final Object k(Object obj) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        g00.b0 b0Var = g00.b0.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return b0Var;
        }
        ri.t1.O(obj);
        String str = (String) this.D;
        c6.f fVar = (c6.f) this.F;
        this.B = 1;
        Class<?> cls = Class.forName(str);
        if (!e6.a.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("Provided class must implement ActionCallback.");
        }
        Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
        kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
        Object objA = ((e6.a) objNewInstance).a(fVar, this);
        if (objA != aVar) {
            objA = b0Var;
        }
        return objA == aVar ? aVar : b0Var;
    }

    private final java.lang.Object l(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: a1.g.l(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        g00.b0 b0Var = g00.b0.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return b0Var;
        }
        ri.t1.O(obj);
        j0.v vVar = (j0.v) this.C;
        u00.k kVar = (u00.k) this.D;
        h1.t tVar = (h1.t) this.E;
        z00.e eVar = (z00.e) this.F;
        this.B = 1;
        float f3 = a3.f5709a;
        Object objCollect = l1.q.J(new el.b(vVar, 3)).collect(new ca.e0(vVar, kVar, tVar, eVar, 2), this);
        if (objCollect != aVar) {
            objCollect = b0Var;
        }
        return objCollect == aVar ? aVar : b0Var;
    }

    private final Object n(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return g00.b0.a;
        }
        ri.t1.O(obj);
        d40.d1 d1Var = ((f0.i) this.C).f5476a;
        d40.g gVar = new d40.g((hv.w) this.D, (l1.z0) this.E, (l1.z0) this.F, 6);
        this.B = 1;
        d1Var.collect(gVar, this);
        return aVar;
    }

    private final Object q(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        if (i10 == 0) {
            ri.t1.O(obj);
            i3.c cVar = (i3.c) this.C;
            ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.D;
            Rect rect = (Rect) this.E;
            y3.k kVar = new y3.k(rect.left, rect.top, rect.right, rect.bottom);
            this.B = 1;
            obj = i3.c.a(cVar, scrollCaptureSession, kVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        ((Consumer) this.F).accept(i2.b0.z((y3.k) obj));
        return g00.b0.a;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                g gVar = new g((u00.k) this.D, (h) this.E, (w0) this.F, cVar, 0);
                gVar.C = obj;
                return gVar;
            case 1:
                return new g((j2) this.C, (b1.e0) this.D, (v2.v) this.E, (o1) this.F, cVar, 1);
            case 2:
                g gVar2 = new g((androidx.lifecycle.q) this.D, (androidx.lifecycle.p) this.E, (d40.z) this.F, cVar, 2);
                gVar2.C = obj;
                return gVar2;
            case 3:
                return new g((j40.c) this.E, (u00.n) this.F, cVar);
            case 4:
                g gVar3 = new g((androidx.lifecycle.q) this.D, (androidx.lifecycle.p) this.E, (u00.n) this.F, cVar);
                gVar3.C = obj;
                return gVar3;
            case 5:
                g gVar4 = new g((az.q) this.D, (g2.l) this.E, (g2.t) this.F, cVar, 5);
                gVar4.C = obj;
                return gVar4;
            case 6:
                return new g((az.r) this.C, (u00.a) this.D, (sy.c) this.E, (ol.b) this.F, cVar, 6);
            case 7:
                g gVar5 = new g((u00.k) this.D, (AtomicReference) this.E, (u00.n) this.F, cVar);
                gVar5.C = obj;
                return gVar5;
            case 8:
                return new g((u0) this.C, (fd.d) this.D, (String) this.E, (String) this.F, cVar, 8);
            case 9:
                return new g((bz.s) this.C, (u00.a) this.D, (ol.b) this.E, (Context) this.F, cVar, 9);
            case 10:
                return new g((zz.a) this.E, (c00.x) this.F, cVar, 10);
            case 11:
                return new g((kotlin.jvm.internal.z) this.C, (l1.x1) this.D, (androidx.lifecycle.w) this.E, (n3) this.F, cVar, 11);
            case 12:
                g gVar6 = new g((ca.t) this.D, (a40.k) this.E, (d) this.F, cVar, 12);
                gVar6.C = obj;
                return gVar6;
            case 13:
                g gVar7 = new g((ca.l0) this.D, (int[]) this.E, (String[]) this.F, cVar, 13);
                gVar7.C = obj;
                return gVar7;
            case 14:
                return new g((cs.p) this.C, (rr.b) this.D, (u00.a) this.E, (Context) this.F, cVar, 14);
            case 15:
                g gVar8 = new g((k3) this.F, cVar);
                gVar8.C = obj;
                return gVar8;
            case 16:
                g gVar9 = new g((kotlin.jvm.internal.z) this.E, (d40.j) this.F, cVar, 16);
                gVar9.C = obj;
                return gVar9;
            case 17:
                g gVar10 = new g((d40.i) this.D, (d40.w0) this.E, this.F, cVar);
                gVar10.C = obj;
                return gVar10;
            case TYPE_SINT64_VALUE:
                return new g((d40.h1) this.D, (d40.i) this.E, (d40.w0) this.F, this.C, cVar);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                g gVar11 = new g((d6.r) this.D, (Context) this.E, (l1.z0) this.F, cVar, 19);
                gVar11.C = obj;
                return gVar11;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                g gVar12 = new g((d6.p0) this.D, (Context) this.E, (d6.h) this.F, cVar, 20);
                gVar12.C = obj;
                return gVar12;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new g((ds.n) this.C, (rr.b) this.D, (u00.a) this.E, (Context) this.F, cVar, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new g((vp.x) this.C, (du.f0) this.D, (MainActivity) this.E, (du.t0) this.F, cVar, 22);
            case 23:
                return new g((e1.q) this.E, (u00.n) this.F, cVar);
            case 24:
                return new g((Context) this.C, (String) this.D, (d6.h) this.E, (c6.f) this.F, cVar, 24);
            case 25:
                return new g((ez.u) this.C, (ez.t) this.D, (ep.f) this.E, (LocalDate) this.F, cVar, 25);
            case RuntimeVersion.MINOR:
                return new g((j0.v) this.C, (u00.k) this.D, (h1.t) this.E, (z00.e) this.F, cVar, 26);
            case 27:
                return new g((f0.i) this.C, (hv.w) this.D, (l1.z0) this.E, (l1.z0) this.F, cVar, 27);
            case 28:
                return new g((i3.c) this.C, (ScrollCaptureSession) this.D, (Rect) this.E, (Consumer) this.F, cVar, 28);
            default:
                g gVar13 = new g((Context) this.D, (ea.q) this.E, (l6.r) this.F, cVar, 29);
                gVar13.C = obj;
                return gVar13;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.A) {
            case 0:
                create((c3.q0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 14:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 15:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 16:
                return create(new c40.o(((c40.o) obj).a), (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                return create((d40.f1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case TYPE_SINT64_VALUE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((l1.o1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 23:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 24:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 25:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: a1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
