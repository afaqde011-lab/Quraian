package pz;

import a40.o0;
import a40.z;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.w;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d40.o;
import g00.b0;
import java.util.List;
import java.util.concurrent.CancellationException;
import l1.e1;
import l1.o1;
import l1.z0;
import qo.y;
import qx.t;
import rc.a0;
import ri.t1;
import ur.r1;
import x.n1;
import z1.s;

public final class k extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public final Object E;

    public k(q qVar, d40.i iVar, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        p pVar = p.A;
        this.D = qVar;
        this.E = iVar;
    }

    public k(Object obj, Object obj2, Object obj3, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public k(Object obj, Object obj2, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.E = obj2;
    }

    public k(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.E = obj;
    }

    public k(String str, String str2, k00.c cVar, vn.f fVar) {
        super(2, cVar);
        this.A = 16;
        this.D = str;
        this.C = fVar;
        this.E = str2;
    }

    public k(u00.n nVar, d4.h hVar, k00.c cVar) {
        super(2, cVar);
        this.A = 26;
        this.D = (m00.i) nVar;
        this.E = hVar;
    }

    public k(zy.p pVar, zy.l lVar, String str, k00.c cVar) {
        super(2, cVar);
        this.A = 29;
        this.C = pVar;
        this.E = lVar;
        this.D = str;
    }

    private final Object i(Object obj) {
        d4.h hVar = (d4.h) this.E;
        l00.a aVar = l00.a.A;
        int i = this.B;
        try {
            if (i == 0) {
                t1.O(obj);
                z zVar = (z) this.C;
                ?? r2 = (m00.i) this.D;
                this.B = 1;
                obj = r2.invoke(zVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            hVar.a(obj);
        } catch (CancellationException unused) {
            hVar.b();
        } catch (Throwable th) {
            hVar.c(th);
        }
        return b0.a;
    }

    private final Object j(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.B;
        if (i == 0) {
            t1.O(obj);
            d40.i iVarH = ((zy.p) this.C).h();
            uy.j jVar = new uy.j((u00.a) this.D, (sy.c) this.E, null, 1);
            this.B = 1;
            if (o.i(iVarH, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        int i = this.A;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                return new k((l) this.C, (String) this.D, (String) obj2, cVar, 0);
            case 1:
                return new k((y) this.C, (u00.a) this.D, (Context) obj2, cVar, 1);
            case 2:
                return new k((t) this.C, (u00.a) this.D, (cq.a) obj2, cVar, 2);
            case 3:
                q qVar = (q) this.D;
                p pVar = p.A;
                k kVar = new k(qVar, (d40.i) obj2, cVar);
                kVar.C = obj;
                return kVar;
            case 4:
                return new k((n1) this.C, (s) this.D, (u.b0) obj2, cVar, 4);
            case 5:
                return new k((rc.c) this.D, (a0) obj2, cVar, 5);
            case 6:
                return new k((d40.z) this.C, (w) this.D, (p) obj2, cVar, 6);
            case 7:
                return new k((rp.o) this.D, (ep.a) obj2, cVar, 7);
            case 8:
                return new k((rp.o) this.D, (ep.m) obj2, cVar, 8);
            case 9:
                return new k((u00.a) this.C, (tm.e) this.D, (e1) obj2, cVar, 9);
            case 10:
                return new k((r1) this.D, (ep.a) obj2, cVar, 10);
            case 11:
                return new k((r1) this.D, (ep.m) obj2, cVar, 11);
            case 12:
                return new k((uu.w) this.D, (bx.c) obj2, cVar, 12);
            case 13:
                k kVar2 = new k((uu.w) this.D, (kotlin.jvm.internal.z) obj2, cVar, 13);
                kVar2.C = obj;
                return kVar2;
            case 14:
                return new k((uu.w) this.C, (List) this.D, (List) obj2, cVar, 14);
            case 15:
                return new k((uy.l) this.C, (u00.a) this.D, (sy.c) obj2, cVar, 15);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return new k((String) this.D, (String) obj2, cVar, (vn.f) this.C);
            case 17:
                k kVar3 = new k((vn.s) obj2, cVar, 17);
                kVar3.D = obj;
                return kVar3;
            case 18:
                k kVar4 = new k((n1) this.D, (z0) obj2, cVar, 18);
                kVar4.C = obj;
                return kVar4;
            case 19:
                return new k((w0.j) this.D, (x0.f) obj2, cVar, 19);
            case 20:
                return new k((wy.o) this.C, (q2.a) this.D, (xk.d) obj2, cVar, 20);
            case 21:
                return new k((f5.c) obj2, cVar, 21);
            case 22:
                return new k((x9.a) this.C, (Uri) this.D, (InputEvent) obj2, cVar, 22);
            case 23:
                return new k((yi.b) this.C, (t5.d) this.D, (Long) obj2, cVar, 23);
            case 24:
                return new k((f0.i) this.C, (f0.j) this.D, (o0) obj2, cVar, 24);
            case 25:
                return new k((f0.i) this.C, (f0.h) this.D, (o0) obj2, cVar, 25);
            case 26:
                k kVar5 = new k((u00.n) this.D, (d4.h) obj2, cVar);
                kVar5.C = obj;
                return kVar5;
            case 27:
                return new k((zy.l) this.C, (q2.a) this.D, (xk.d) obj2, cVar, 27);
            case 28:
                return new k((zy.p) this.C, (u00.a) this.D, (sy.c) obj2, cVar, 28);
            default:
                return new k((zy.p) this.C, (zy.l) obj2, (String) this.D, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 2:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 3:
                return ((k) create((o1) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 4:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 5:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 6:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 7:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 8:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 9:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 10:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 11:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 12:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 13:
                return ((k) create((Throwable) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 14:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 15:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 17:
                return ((k) create((g00.k) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 18:
                return ((k) create((o1) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 19:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 20:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 21:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 22:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 23:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 24:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 25:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 26:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 27:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 28:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: pz.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
