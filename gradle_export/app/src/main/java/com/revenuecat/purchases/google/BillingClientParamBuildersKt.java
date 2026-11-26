package com.revenuecat.purchases.google;

import bh.f;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.common.LogWrapperKt;
import gd.d;
import h00.r;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import o9.q;
import qd.v;
import qd.w;
import qd.y;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lcom/android/billingclient/api/QueryPurchaseHistoryParams;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchaseHistoryParams;", "Lqd/y;", "buildQueryPurchasesParams", "(Ljava/lang/String;)Lqd/y;", "", "productIds", "Lqd/w;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)Lqd/w;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingClientParamBuildersKt {
    public static final w buildQueryProductDetailsParams(String str, Set<String> productIds) throws QueryProductDetailsParamsBuilderException {
        m.e(str, "<this>");
        m.e(productIds, "productIds");
        Set<String> set = productIds;
        ArrayList arrayList = new ArrayList(r.q0(set, 10));
        for (String str2 : set) {
            d dVar = new d(4);
            dVar.b = str2;
            dVar.c = str;
            if ("first_party".equals(str)) {
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }
            if (dVar.b == null) {
                throw new IllegalArgumentException("Product id must be provided.");
            }
            arrayList.add(new v(dVar));
        }
        try {
            q qVar = new q(10, false);
            qVar.T(arrayList);
            if (((com.google.android.gms.internal.play_billing.r) qVar.B) != null) {
                return new w(qVar);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        } catch (ExceptionInInitializerError e) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            StringBuilder sb = new StringBuilder("Error while building QueryProductDetailsParams in Billing client: ");
            sb.append(e.getMessage());
            sb.append(". Caused by: ");
            Throwable cause = e.getCause();
            sb.append(cause != null ? cause.getMessage() : null);
            currentLogHandler.e("[Purchases] - ERROR", sb.toString(), e);
            throw new QueryProductDetailsParamsBuilderException("Error while building QueryProductDetailsParams in Billing client", e.getCause());
        }
    }

    public static final QueryPurchaseHistoryParams buildQueryPurchaseHistoryParams(String str) {
        m.e(str, "<this>");
        if (str.equals("inapp") ? true : str.equals("subs")) {
            return QueryPurchaseHistoryParams.newBuilder().setProductType(str).build();
        }
        return null;
    }

    public static final y buildQueryPurchasesParams(String str) {
        m.e(str, "<this>");
        if (!(str.equals("inapp") ? true : str.equals("subs"))) {
            return null;
        }
        f fVar = new f();
        fVar.A = str;
        return new y(fVar);
    }
}
