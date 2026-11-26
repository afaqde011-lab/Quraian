package am;

import a40.c0;
import a40.m0;
import a40.u1;
import a40.w1;
import a40.z;
import android.content.SharedPreferences;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import d40.d1;
import d40.o;
import d40.y0;
import f40.m;
import g00.b0;
import h40.e;
import java.util.ArrayList;
import java.util.Iterator;
import k00.i;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import u00.n;
import vl.f;
import vl.k;
import vl.r;
import ze.d;

public final class c {
    public final ul.a a;
    public final yl.a b;
    public final ArrayList c;
    public final nq.b d;
    public final DeepLinkAnalytics e;
    public final z f;
    public final d1 g;
    public final y0 h;
    public volatile boolean i;
    public u1 j;

    public c(ul.a aVar, yl.a aVar2, ArrayList arrayList, nq.b bVar, DeepLinkAnalytics deepLinkAnalytics) {
        w1 w1VarE = c0.e();
        e eVar = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, m.a.F));
        this.a = aVar;
        this.b = aVar2;
        this.c = arrayList;
        this.d = bVar;
        this.e = deepLinkAnalytics;
        this.f = cVarC;
        d1 d1VarB = o.b(1, 5, null);
        this.g = d1VarB;
        this.h = new y0(d1VarB);
    }

    public static final Object a(c cVar, String str, m00.c cVar2) {
        b bVar;
        vl.b bVarM;
        Object objC;
        k kVar;
        a aVar;
        Iterator it;
        Object next;
        bm.a aVar2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i = bVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.F = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar, cVar2);
            }
        } else {
            bVar = new b(cVar, cVar2);
        }
        Object obj = bVar.D;
        l00.a aVar3 = l00.a.A;
        int i2 = bVar.F;
        b0 b0Var = b0.a;
        if (i2 == 0) {
            t1.O(obj);
            bVarM = d.M(str);
            if (bVarM != null) {
                yl.a aVar4 = cVar.b;
                r rVar = bVarM.a;
                bVar.A = str;
                bVar.B = bVarM;
                bVar.F = 1;
                objC = ((jq.e) aVar4).c(rVar, bVar);
                if (objC != aVar3) {
                }
                return aVar3;
            }
            return b0Var;
        }
        if (i2 == 1) {
            vl.b bVar2 = bVar.B;
            String str2 = bVar.A;
            t1.O(obj);
            bVarM = bVar2;
            str = str2;
            objC = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            kVar = bVar.C;
            t1.O(obj);
        }
        it = cVar.c.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((bm.a) next).b(kVar));
        aVar2 = (bm.a) next;
        if (aVar2 != null) {
            bVar.A = null;
            bVar.B = null;
            bVar.C = null;
            bVar.F = 3;
            if (aVar2.a(kVar, bVar) == aVar3) {
                return aVar3;
            }
        }
        return b0Var;
        k kVar2 = (k) objC;
        cVar.e.logEvent(new DeepLinkEvent.DeeplinkOpened(str, kVar2.a(), kVar2.b(), bVarM.b.A));
        if (kVar2 instanceof f) {
            d1 d1Var = cVar.g;
            int iOrdinal = ((f) kVar2).b.ordinal();
            if (iOrdinal == 0) {
                aVar = a.CONTENT_NOT_FOUND;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = a.NEEDS_INTERNET;
            }
            d1Var.f(aVar);
            return b0Var;
        }
        nq.b bVar3 = cVar.d;
        bVar.A = null;
        bVar.B = null;
        bVar.C = kVar2;
        bVar.F = 2;
        if (bVar3.a(bVar) != aVar3) {
            kVar = kVar2;
            it = cVar.c.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((bm.a) next).b(kVar));
            aVar2 = (bm.a) next;
            if (aVar2 != null) {
                bVar.A = null;
                bVar.B = null;
                bVar.C = null;
                bVar.F = 3;
                if (aVar2.a(kVar, bVar) == aVar3) {
                }
            }
            return b0Var;
        }
        return aVar3;
    }

    public final void b() {
        if (this.i) {
            u1 u1Var = this.j;
            if (u1Var == null || !u1Var.a()) {
                ul.a aVar = this.a;
                String str = aVar.b;
                if (str == null) {
                    str = null;
                } else {
                    aVar.b = null;
                    SharedPreferences.Editor editorEdit = aVar.a.edit();
                    editorEdit.remove("pending_deep_link_url");
                    editorEdit.apply();
                }
                if (str == null) {
                    return;
                }
                this.j = ta.c0.M(this.f, (i) null, (n) null, (u00.k) null, new a1.d(this, str, (k00.c) null, 7), 31);
            }
        }
    }
}
