package d6;

import android.content.Context;
import android.os.Bundle;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProviderKt;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;

public final class d1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final Object D;
    public final Object E;
    public int F;
    public final Object G;

    public d1(f1 f1Var, Context context, int i10, Object obj, k00.c cVar, int i11) {
        super(2, cVar);
        this.A = i11;
        this.D = f1Var;
        this.E = context;
        this.F = i10;
        this.G = obj;
    }

    public d1(jp.e0 e0Var, jp.x xVar, ep.f fVar, LocalDate localDate, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.C = e0Var;
        this.D = xVar;
        this.E = fVar;
        this.G = localDate;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                d1 d1Var = new d1((f1) this.D, (Context) this.E, this.F, (Bundle) this.G, cVar, 0);
                d1Var.C = obj;
                return d1Var;
            case 1:
                d1 d1Var2 = new d1((f1) this.D, (Context) this.E, this.F, (String) this.G, cVar, 1);
                d1Var2.C = obj;
                return d1Var2;
            default:
                return new d1((jp.e0) this.C, (jp.x) this.D, (ep.f) this.E, (LocalDate) this.G, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        int i10;
        Object objU;
        String strAnalyticsProvider;
        d1 d1Var = this;
        switch (d1Var.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i11 = d1Var.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    a40.z zVar = (a40.z) d1Var.C;
                    f1 f1Var = (f1) d1Var.D;
                    Context context = (Context) d1Var.E;
                    int i12 = d1Var.F;
                    Bundle bundle = (Bundle) d1Var.G;
                    d1Var.B = 1;
                    if (f1Var.c(zVar, context, i12, bundle, d1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i13 = d1Var.B;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    a40.z zVar2 = (a40.z) d1Var.C;
                    f1 f1Var2 = (f1) d1Var.D;
                    Context context2 = (Context) d1Var.E;
                    int i14 = d1Var.F;
                    String str = (String) d1Var.G;
                    d1Var.B = 1;
                    if (f1Var2.b(zVar2, context2, i14, str, d1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                jp.x xVar = (jp.x) d1Var.D;
                String str2 = xVar.u;
                jp.e0 e0Var = (jp.e0) d1Var.C;
                l00.a aVar3 = l00.a.A;
                int i15 = d1Var.F;
                g00.b0 b0Var = g00.b0.a;
                if (i15 != 0) {
                    if (i15 == 1 || i15 == 2) {
                        i10 = d1Var.B;
                        ri.t1.O(obj);
                    } else {
                        if (i15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    return b0Var;
                }
                ri.t1.O(obj);
                pm.b bVar = ((vm.a) e0Var).c;
                wo.b0 b0Var2 = e0Var.e;
                e0Var.i(jp.x.b((jp.x) bVar.d.getValue(), true, (v30.a) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 0, 0, false, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (ep.f) null, (LocalDate) null, false, 1069547518));
                ep.e eVar = xVar.B;
                String str3 = xVar.C;
                String str4 = xVar.D;
                boolean z10 = !xVar.A;
                if (eVar == null || str3.length() <= 0) {
                    ep.r rVar = new ep.r(xVar.c, xVar.r, r30.k.j1(str2).toString(), (ep.f) d1Var.E, (LocalDate) d1Var.G, z10);
                    String str5 = xVar.i;
                    d1Var.B = z10 ? 1 : 0;
                    d1Var.F = 2;
                    if (b0Var2.l(str5, rVar, d1Var) == aVar3) {
                        return aVar3;
                    }
                    i10 = z10 ? 1 : 0;
                } else {
                    String string = r30.k.j1(str2).toString();
                    ep.f fVar = (ep.f) d1Var.E;
                    LocalDate localDate = (LocalDate) d1Var.G;
                    d1Var.B = z10 ? 1 : 0;
                    d1Var.F = 1;
                    int iOrdinal = eVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            objU = b0Var2.v(str3, string, fVar, localDate, Boolean.valueOf(z10), this);
                            d1Var = this;
                            if (objU != aVar3) {
                            }
                        } else if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objU = b0Var;
                    } else {
                        objU = b0Var2.u(fVar, Boolean.valueOf(z10), str3, str4, string, localDate, this);
                        d1Var = this;
                        if (objU != aVar3) {
                            objU = b0Var;
                        }
                    }
                    if (objU == aVar3) {
                        return aVar3;
                    }
                    i10 = z10 ? 1 : 0;
                }
                AuthAnalytics authAnalytics = e0Var.f;
                pm.b bVar2 = ((vm.a) e0Var).c;
                ep.e eVar2 = ((jp.x) bVar2.d.getValue()).B;
                if (eVar2 == null || (strAnalyticsProvider = AuthAnalyticsProviderKt.analyticsProvider(eVar2)) == null) {
                    strAnalyticsProvider = "email";
                }
                authAnalytics.signUpCompleted(strAnalyticsProvider);
                jp.v vVar = new jp.v(e0Var.d.a(2131886222, new Object[0]));
                d1Var.B = i10;
                d1Var.F = 3;
                if (bVar2.a(vVar, d1Var) == aVar3) {
                    return aVar3;
                }
                return b0Var;
        }
    }
}
