package vp;

import a40.m0;
import a40.w1;
import android.app.Activity;
import android.content.SharedPreferences;
import bt.g2;
import com.mchutov.quranify.billing.BillingException;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.StoreProduct;
import d40.d1;
import d40.g1;
import d40.p1;
import d40.u0;
import d40.z0;
import g00.b0;
import q3.e0;
import qd.s0;
import ri.t1;
import wo.c0;

public final class x {
    public final c0 a;
    public final p1 b;
    public final z0 c;
    public final p1 d;
    public final z0 e;
    public final p1 f;
    public final p1 g;
    public final p1 h;
    public final d1 i;
    public final p1 j;
    public final z0 k;

    public x(c0 c0Var, SharedPreferences sharedPreferences) {
        this.a = c0Var;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove("purchase_device_model");
        editorEdit.remove("purchase_device_product_id");
        editorEdit.remove("purchase_device_plan_id");
        editorEdit.apply();
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, f40.m.a.F));
        p1 p1VarC = d40.o.c(null);
        this.b = p1VarC;
        this.c = new z0(p1VarC);
        p1 p1VarC2 = d40.o.c(null);
        this.d = p1VarC2;
        this.e = new z0(p1VarC2);
        Boolean bool = Boolean.FALSE;
        this.f = d40.o.c(bool);
        this.g = d40.o.c(null);
        this.h = d40.o.c(null);
        this.i = d40.o.b(1, 5, null);
        p1 p1VarC3 = d40.o.c(bool);
        this.j = d40.o.c(null);
        this.k = d40.o.x(new u0(p1VarC, p1VarC3, new g2(this, null)), cVarC, g1.a, bool);
        Purchases.INSTANCE.getSharedInstance().setUpdatedCustomerInfoListener(new UpdatedCustomerInfoListener() {
            @Override
            public final void onReceived(CustomerInfo info) {
                kotlin.jvm.internal.m.e(info, "info");
                this.a.d(info);
            }
        });
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new b(this, null, 0), 31);
    }

    public static xp.a C(CustomerInfo customerInfo, boolean z) {
        xp.a aVar;
        EntitlementInfo entitlementInfoS = s(customerInfo);
        if (entitlementInfoS == null || r30.k.L0(entitlementInfoS.getProductIdentifier())) {
            entitlementInfoS = null;
        }
        if (entitlementInfoS == null) {
            aVar = null;
        } else if (entitlementInfoS.getIsActive()) {
            aVar = entitlementInfoS.getWillRenew() ? xp.a.A : xp.a.B;
        } else {
            aVar = xp.a.C;
        }
        if (z && (aVar == null || aVar == xp.a.C)) {
            return xp.a.A;
        }
        if (z) {
            return aVar;
        }
        xp.a aVar2 = xp.a.C;
        if (aVar == aVar2) {
            return aVar2;
        }
        return null;
    }

    public static final Object a(x xVar, m00.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.C = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(xVar, cVar);
            }
        } else {
            jVar = new j(xVar, cVar);
        }
        Object obj = jVar.A;
        Object obj2 = l00.a.A;
        int i2 = jVar.C;
        b0 b0Var = b0.a;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            ((g00.n) obj).getClass();
            return b0Var;
        }
        t1.O(obj);
        ep.g session = xVar.a.a.getSession();
        String str = session != null ? session.e.a : null;
        if (str == null) {
            str = "";
        }
        if (r30.k.L0(str)) {
            jVar.C = 2;
            if (xVar.y(jVar) == obj2) {
                return obj2;
            }
            return b0Var;
        }
        jVar.C = 1;
        if (xVar.n(str, jVar) == obj2) {
            return obj2;
        }
        return b0Var;
    }

    public static String b(String str) {
        String string = r30.k.j1(str).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    public static boolean l(CustomerInfo customerInfo) {
        EntitlementInfo entitlementInfo;
        return (customerInfo == null || (entitlementInfo = customerInfo.getEntitlements().get("Quranify Premium")) == null || !entitlementInfo.getIsActive()) ? false : true;
    }

    public static boolean r(String str, String str2) {
        if (kotlin.jvm.internal.m.a(str, str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        return r30.r.x0(str, sb.toString(), false);
    }

    public static EntitlementInfo s(CustomerInfo customerInfo) {
        if (customerInfo != null) {
            return customerInfo.getEntitlements().get("Quranify Premium");
        }
        return null;
    }

    public final Object A(m00.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.C = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objQ = wVar.A;
        l00.a aVar = l00.a.A;
        int i2 = wVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            wVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(wVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().restorePurchases(new f5.f(kVar, 4));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final void B(ep.h hVar) {
        String str = hVar.a;
        if (r30.k.L0(str)) {
            return;
        }
        Purchases.Companion companion = Purchases.INSTANCE;
        if (kotlin.jvm.internal.m.a(companion.getSharedInstance().getAppUserID(), str)) {
            String strB = b(hVar.b);
            if (strB != null) {
                companion.getSharedInstance().setEmail(strB);
            }
            String strB2 = b(hVar.d);
            if (strB2 != null) {
                companion.getSharedInstance().setDisplayName(strB2);
            }
            i00.f fVar = new i00.f();
            String strB3 = b(hVar.e);
            if (strB3 != null) {
            }
            String strB4 = b(hVar.f);
            if (strB4 != null) {
                fVar.put("birth_date", strB4);
            }
            i00.f fVarC = fVar.c();
            if (!fVarC.isEmpty()) {
                companion.getSharedInstance().setAttributes(fVarC);
            }
            companion.getSharedInstance().syncAttributesAndOfferingsIfNeeded(new o9.q(this, 27));
        }
    }

    public final Object c(long j, m00.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objL = cVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.C;
        boolean z = true;
        if (i2 == 0) {
            t1.O(objL);
            b bVar = new b(this, null, 1);
            cVar2.C = 1;
            objL = a40.c0.L(j, bVar, cVar2);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objL);
        }
        if (!l((CustomerInfo) objL) && !((Boolean) this.k.A.getValue()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void d(CustomerInfo customerInfo) {
        this.b.j(customerInfo);
        this.i.f(customerInfo);
    }

    public final Object e(m00.c cVar) {
        d dVar;
        Object objH;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.C = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.A;
        Object obj2 = l00.a.A;
        int i2 = dVar.C;
        if (i2 == 0) {
            t1.O(obj);
            dVar.C = 1;
            objH = h(dVar);
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objH = ((g00.n) obj).A;
        }
        if (!(objH instanceof g00.m)) {
            this.h.j((String) objH);
        }
        return objH;
    }

    public final Object f(m00.c cVar) {
        e eVar;
        Object objG;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.C = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.A;
        Object obj2 = l00.a.A;
        int i2 = eVar.C;
        p1 p1Var = this.g;
        if (i2 == 0) {
            t1.O(obj);
            p1Var.j(null);
            eVar.C = 1;
            objG = g(eVar);
            if (objG == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objG = ((g00.n) obj).A;
        }
        Throwable thA = g00.n.a(objG);
        if (thA != null) {
            thA.printStackTrace();
        }
        Throwable thA2 = g00.n.a(objG);
        if (thA2 == null) {
            this.d.j((Offerings) objG);
        } else if (thA2 instanceof BillingException) {
            p1Var.j(((BillingException) thA2).A);
        }
        Boolean bool = Boolean.FALSE;
        p1 p1Var2 = this.f;
        p1Var2.getClass();
        p1Var2.k(null, bool);
        return objG;
    }

    public final Object g(m00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.C = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objQ = fVar.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            fVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(fVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().getOfferings(new k40.b(kVar, 3));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object h(m00.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.C = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objQ = gVar.A;
        l00.a aVar = l00.a.A;
        int i2 = gVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            gVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(gVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode(new f5.f(kVar, 2));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object i(CacheFetchPolicy cacheFetchPolicy, m00.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.C = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objQ = hVar.A;
        l00.a aVar = l00.a.A;
        int i2 = hVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            hVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(hVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().getCustomerInfo(cacheFetchPolicy, new k40.b(kVar, 4));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object j(String str, m00.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.C = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objQ = iVar.A;
        l00.a aVar = l00.a.A;
        int i2 = iVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            iVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(iVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().getProducts(va.a.R(str), ProductType.SUBS, new e0(kVar, str, this));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final boolean k() {
        return ((Boolean) this.k.A.getValue()).booleanValue();
    }

    public final boolean m() {
        EntitlementInfo entitlementInfoS = s((CustomerInfo) this.b.getValue());
        return (entitlementInfoS == null || !entitlementInfoS.getIsActive() || entitlementInfoS.getOwnershipType() == OwnershipType.FAMILY_SHARED) ? false : true;
    }

    public final java.lang.Object n(java.lang.String r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: vp.x.n(java.lang.String, m00.c):java.lang.Object");
    }

    public final Object o(String str, m00.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.C = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objQ = lVar.A;
        l00.a aVar = l00.a.A;
        int i2 = lVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            lVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(lVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().logIn(str, new f5.f(kVar, 3));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object p(m00.c cVar) {
        m mVar;
        Object objQ;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i = mVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                mVar.D = i - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.B;
        Object obj2 = l00.a.A;
        int i2 = mVar.D;
        p1 p1Var = this.g;
        if (i2 == 0) {
            t1.O(obj);
            p1Var.j(null);
            mVar.D = 1;
            objQ = q(mVar);
            if (objQ != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = mVar.A;
            t1.O(obj);
            Object obj4 = ((g00.n) obj).A;
            return obj3;
        }
        t1.O(obj);
        objQ = ((g00.n) obj).A;
        Throwable thA = g00.n.a(objQ);
        if (thA == null) {
            d((CustomerInfo) objQ);
            return objQ;
        }
        if (thA instanceof BillingException) {
            p1Var.j(((BillingException) thA).A);
        }
        mVar.A = objQ;
        mVar.D = 2;
        return y(mVar) == obj2 ? obj2 : objQ;
    }

    public final Object q(m00.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.C = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objQ = nVar.A;
        l00.a aVar = l00.a.A;
        int i2 = nVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            nVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(nVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().logOut(new k40.b(kVar, 5));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object t(Activity activity, Package r9, m00.c cVar) throws PurchasesException {
        o oVar;
        Object objU;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i = oVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.C = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.A;
        Object obj2 = l00.a.A;
        int i2 = oVar.C;
        p1 p1Var = this.g;
        p1 p1Var2 = this.f;
        if (i2 == 0) {
            t1.O(obj);
            Boolean bool = Boolean.TRUE;
            p1Var2.getClass();
            p1Var2.k(null, bool);
            p1Var.j(null);
            oVar.C = 1;
            objU = u(activity, r9, oVar);
            if (objU == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objU = ((g00.n) obj).A;
        }
        Throwable thA = g00.n.a(objU);
        if (thA == null) {
            d((CustomerInfo) objU);
        } else if (thA instanceof BillingException) {
            p1Var.j(((BillingException) thA).A);
        }
        Boolean bool2 = Boolean.FALSE;
        p1Var2.getClass();
        p1Var2.k(null, bool2);
        return objU;
    }

    public final Object u(Activity activity, Package r6, m00.c cVar) throws PurchasesException {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.C = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objQ = qVar.A;
        l00.a aVar = l00.a.A;
        int i2 = qVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            qVar.C = 1;
            a40.k kVar = new a40.k(1, s0.j0(qVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().purchase(new PurchaseParams.Builder(activity, r6).build(), new p(kVar));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object v(Activity activity, StoreProduct storeProduct, m00.c cVar) throws PurchasesException {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i = rVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.D = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objQ = rVar.B;
        l00.a aVar = l00.a.A;
        int i2 = rVar.D;
        if (i2 == 0) {
            t1.O(objQ);
            rVar.A = storeProduct;
            rVar.D = 1;
            a40.k kVar = new a40.k(1, s0.j0(rVar));
            kVar.r();
            Purchases.INSTANCE.getSharedInstance().purchase(new PurchaseParams.Builder(activity, storeProduct).build(), new p(kVar));
            objQ = kVar.q();
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((g00.n) objQ).A;
    }

    public final Object w(MainActivity mainActivity, String str, m00.c cVar) throws PurchasesException {
        s sVar;
        Object objX;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i = sVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.C = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.A;
        Object obj2 = l00.a.A;
        int i2 = sVar.C;
        p1 p1Var = this.g;
        p1 p1Var2 = this.f;
        if (i2 == 0) {
            t1.O(obj);
            Boolean bool = Boolean.TRUE;
            p1Var2.getClass();
            p1Var2.k(null, bool);
            p1Var.j(null);
            sVar.C = 1;
            objX = x(mainActivity, str, sVar);
            if (objX == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objX = ((g00.n) obj).A;
        }
        Throwable thA = g00.n.a(objX);
        if (thA == null) {
            d((CustomerInfo) objX);
        } else if (thA instanceof BillingException) {
            p1Var.j(((BillingException) thA).A);
        }
        Boolean bool2 = Boolean.FALSE;
        p1Var2.getClass();
        p1Var2.k(null, bool2);
        return objX;
    }

    public final java.lang.Object x(android.app.Activity r9, java.lang.String r10, m00.c r11) throws com.revenuecat.purchases.PurchasesException {
        throw new UnsupportedOperationException("Method not decompiled: vp.x.x(android.app.Activity, java.lang.String, m00.c):java.lang.Object");
    }

    public final Object y(m00.c cVar) {
        u uVar;
        Object objI;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.C = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.A;
        Object obj2 = l00.a.A;
        int i2 = uVar.C;
        p1 p1Var = this.g;
        if (i2 == 0) {
            t1.O(obj);
            p1Var.j(null);
            CacheFetchPolicy cacheFetchPolicy = CacheFetchPolicy.FETCH_CURRENT;
            uVar.C = 1;
            objI = i(cacheFetchPolicy, uVar);
            if (objI == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objI = ((g00.n) obj).A;
        }
        Throwable thA = g00.n.a(objI);
        if (thA == null) {
            d((CustomerInfo) objI);
            return objI;
        }
        if (thA instanceof BillingException) {
            p1Var.j(((BillingException) thA).A);
        }
        return objI;
    }

    public final Object z(m00.c cVar) {
        v vVar;
        Object objA;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.C = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.A;
        Object obj2 = l00.a.A;
        int i2 = vVar.C;
        p1 p1Var = this.g;
        p1 p1Var2 = this.f;
        if (i2 == 0) {
            t1.O(obj);
            Boolean bool = Boolean.TRUE;
            p1Var2.getClass();
            p1Var2.k(null, bool);
            p1Var.j(null);
            vVar.C = 1;
            objA = A(vVar);
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objA = ((g00.n) obj).A;
        }
        Throwable thA = g00.n.a(objA);
        if (thA == null) {
            d((CustomerInfo) objA);
        } else if (thA instanceof BillingException) {
            p1Var.j(((BillingException) thA).A);
        }
        Boolean bool2 = Boolean.FALSE;
        p1Var2.getClass();
        p1Var2.k(null, bool2);
        return objA;
    }
}
