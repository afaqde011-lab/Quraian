package rm;

import a40.c0;
import a40.m0;
import a40.z;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.a1;
import androidx.media3.common.q0;
import com.google.android.gms.internal.measurement.b5;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d40.j;
import d6.d0;
import g00.b0;
import h00.q;
import h00.r;
import h00.v;
import ht.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.e1;
import l1.o1;
import l1.y0;
import lu.w;
import m00.i;
import ot.g;
import ot.h;
import ri.t1;
import sn.l;
import su.d;
import su.s;
import u00.k;
import u00.n;
import ut.p;
import vn.o;
import w.j1;
import wj.f0;
import wj.s0;
import wj.x0;
import x.b1;
import xu.f;

public final class c extends i implements n {
    public final int A;
    public int B;
    public Object C;
    public Object D;

    public c(int i, k00.c cVar) {
        super(i, cVar);
        this.A = 1;
    }

    public c(Object obj, Object obj2, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.C = obj2;
    }

    public c(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
    }

    public c(o oVar, k00.c cVar) {
        super(2, cVar);
        this.A = 17;
        this.C = oVar;
    }

    private final Object i(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.B;
        if (i == 0) {
            t1.O(obj);
            y9.b bVar = ((x9.a) this.D).a;
            Uri uri = (Uri) this.C;
            this.B = 1;
            if (bVar.i(uri, this) == aVar) {
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

    private final Object j(Object obj) {
        d dVar = ((tu.a) this.C).b;
        f fVar = (f) this.D;
        l00.a aVar = l00.a.A;
        int i = this.B;
        if (i == 0) {
            t1.O(obj);
            e eVar = fVar.b;
            long j = dVar.b;
            this.B = 1;
            obj = eVar.b(j, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        ot.i iVar = (ot.i) obj;
        s sVarD = fVar.d();
        boolean zA = m.a(sVarD != null ? sVarD.b : null, dVar);
        b0 b0Var = b0.a;
        if (zA) {
            if (iVar instanceof ot.f) {
                su.a aVarD = b5.D(((ot.f) iVar).a);
                if (aVarD != null) {
                    fVar.j(aVarD);
                    return b0Var;
                }
                fVar.c();
                return b0Var;
            }
            if (m.a(iVar, h.a)) {
                fVar.c();
                return b0Var;
            }
            if (!m.a(iVar, g.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b0Var;
    }

    private final Object k(Object obj) {
        xx.a aVar;
        cy.d dVar = (cy.d) this.C;
        xx.c cVar = (xx.c) this.D;
        l00.a aVar2 = l00.a.A;
        int i = this.B;
        int i2 = 23;
        if (i == 0) {
            t1.O(obj);
            this.B = 1;
            cVar.getClass();
            h40.e eVar = m0.a;
            obj = c0.J(new w(cVar, null, i2), h40.d.C, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        ArrayList arrayListO1 = q.o1((Collection) obj);
        v.x0(new q0.a(dVar, 23), arrayListO1);
        arrayListO1.add(0, dVar);
        List<cy.d> listJ1 = q.j1(arrayListO1, 20);
        SharedPreferences.Editor editorEdit = cVar.a.edit();
        bk.m mVar = cVar.b;
        ArrayList arrayList = new ArrayList(r.q0(listJ1, 10));
        for (cy.d item : listJ1) {
            m.e(item, "item");
            if (item instanceof cy.b) {
                aVar = new xx.a("reciter", Integer.valueOf(((cy.b) item).a), null, null, null, 28);
            } else if (item instanceof cy.a) {
                aVar = new xx.a("playlist", null, Integer.valueOf(((cy.a) item).a), null, null, 26);
            } else {
                if (!(item instanceof cy.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cy.c cVar2 = (cy.c) item;
                aVar = new xx.a("surah", null, null, Integer.valueOf(cVar2.a), cVar2.b, 6);
            }
            arrayList.add(aVar);
        }
        editorEdit.putString("globalSearch.recentItems", mVar.i(arrayList)).apply();
        return b0.a;
    }

    private final Object l(Object obj) {
        yi.b bVar = (yi.b) this.D;
        ThreadLocal threadLocal = bVar.b;
        l00.a aVar = l00.a.A;
        int i = this.B;
        try {
            if (i == 0) {
                t1.O(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (m.a(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                threadLocal.set(bool);
                DataStore dataStore = bVar.c;
                ha.a aVar2 = new ha.a((k) this.C, (k00.c) null);
                this.B = 1;
                obj = dataStore.updateData(new d0(aVar2, (k00.c) null, 1), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            t5.b bVar2 = (t5.b) obj;
            threadLocal.set(Boolean.FALSE);
            return bVar2;
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c((a1) this.D, this.C, cVar, 0);
            case 1:
                c cVar2 = new c(2, cVar);
                cVar2.C = obj;
                return cVar2;
            case 2:
                return new c((rp.o) this.D, (ol.b) this.C, cVar, 2);
            case 3:
                return new c((u00.a) this.D, (y0) this.C, cVar, 3);
            case 4:
                return new c((y0) this.D, (tm.e) this.C, cVar, 4);
            case 5:
                return new c((x.b) this.D, (h2.b) this.C, cVar, 5);
            case 6:
                return new c((u00.a) this.D, (tm.e) this.C, cVar, 6);
            case 7:
                return new c((e1) this.D, (tm.e) this.C, cVar, 7);
            case 8:
                return new c((sn.c) this.D, (l) this.C, cVar, 8);
            case 9:
                c cVar3 = new c((tm.e) this.D, cVar, 9);
                cVar3.C = obj;
                return cVar3;
            case 10:
                return new c((tm.i) this.D, (v2.s) this.C, cVar, 10);
            case 11:
                return new c((int[]) this.D, (y0) this.C, cVar, 11);
            case 12:
                c cVar4 = new c((tv.b) this.D, cVar, 12);
                cVar4.C = obj;
                return cVar4;
            case 13:
                c cVar5 = new c((p) this.D, cVar, 13);
                cVar5.C = obj;
                return cVar5;
            case 14:
                c cVar6 = new c((uu.w) this.D, cVar, 14);
                cVar6.C = obj;
                return cVar6;
            case 15:
                return new c((uu.w) this.D, (q0) this.C, cVar, 15);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return new c((uu.w) this.D, (List) this.C, cVar, 16);
            case 17:
                return new c((o) this.C, cVar);
            case 18:
                c cVar7 = new c((o) this.D, cVar, 18);
                cVar7.C = obj;
                return cVar7;
            case 19:
                c cVar8 = new c((vn.b0) this.D, cVar, 19);
                cVar8.C = obj;
                return cVar8;
            case 20:
                return new c((j1) this.D, (b1) this.C, cVar, 20);
            case 21:
                return new c((wj.o) this.D, (s0) this.C, cVar, 21);
            case 22:
                return new c((x0) this.D, (f0) this.C, cVar, 22);
            case 23:
                return new c((wy.p) this.D, (wy.o) this.C, cVar, 23);
            case 24:
                return new c((x9.a) this.D, (Uri) this.C, cVar, 24);
            case 25:
                return new c((f) this.D, (d) this.C, cVar, 25);
            case 26:
                return new c((f) this.D, (tu.a) this.C, cVar, 26);
            case 27:
                return new c((xx.c) this.D, (cy.d) this.C, cVar, 27);
            case 28:
                return new c((yi.b) this.D, (k) this.C, cVar, 28);
            default:
                return new c((yi.b) this.D, (t5.d) this.C, cVar, 29);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 1:
                return ((c) create((o1) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 2:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 3:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 4:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 5:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 6:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 7:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 8:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 9:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 10:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 11:
                ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
                return l00.a.A;
            case 12:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 13:
                return ((c) create((List) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 14:
                return ((c) create((u30.b) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 15:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 17:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 18:
                return ((c) create((j) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 19:
                return ((c) create((g00.k) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 20:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 21:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 22:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 23:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 24:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 25:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 26:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 27:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 28:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            default:
                return ((c) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: rm.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
