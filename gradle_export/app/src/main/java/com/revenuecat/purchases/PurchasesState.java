package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import h00.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/PurchasesState;", "", "allowSharingPlayStoreAccount", "", "purchaseCallbacksByProductId", "", "", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "deprecatedProductChangeCallback", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "appInBackground", "firstTimeInForeground", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)V", "getAllowSharingPlayStoreAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAppInBackground", "()Z", "getDeprecatedProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "getFirstTimeInForeground", "getPurchaseCallbacksByProductId", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;ZZ)Lcom/revenuecat/purchases/PurchasesState;", "equals", "other", "hashCode", "", "toString", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesState {
    private final Boolean allowSharingPlayStoreAccount;
    private final boolean appInBackground;
    private final ProductChangeCallback deprecatedProductChangeCallback;
    private final boolean firstTimeInForeground;
    private final Map<String, PurchaseCallback> purchaseCallbacksByProductId;

    public PurchasesState() {
        this(null, null, null, false, false, 31, null);
    }

    public PurchasesState(Boolean bool, Map<String, ? extends PurchaseCallback> purchaseCallbacksByProductId, ProductChangeCallback productChangeCallback, boolean z, boolean z2) {
        m.e(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        this.allowSharingPlayStoreAccount = bool;
        this.purchaseCallbacksByProductId = purchaseCallbacksByProductId;
        this.deprecatedProductChangeCallback = productChangeCallback;
        this.appInBackground = z;
        this.firstTimeInForeground = z2;
    }

    public PurchasesState(Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, f fVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? y.A : map, (i & 4) != 0 ? null : productChangeCallback, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
    }

    public static PurchasesState copy$default(PurchasesState purchasesState, Boolean bool, Map map, ProductChangeCallback productChangeCallback, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = purchasesState.allowSharingPlayStoreAccount;
        }
        if ((i & 2) != 0) {
            map = purchasesState.purchaseCallbacksByProductId;
        }
        if ((i & 4) != 0) {
            productChangeCallback = purchasesState.deprecatedProductChangeCallback;
        }
        if ((i & 8) != 0) {
            z = purchasesState.appInBackground;
        }
        if ((i & 16) != 0) {
            z2 = purchasesState.firstTimeInForeground;
        }
        boolean z3 = z2;
        ProductChangeCallback productChangeCallback2 = productChangeCallback;
        return purchasesState.copy(bool, map, productChangeCallback2, z, z3);
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final Map<String, PurchaseCallback> component2() {
        return this.purchaseCallbacksByProductId;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final PurchasesState copy(Boolean allowSharingPlayStoreAccount, Map<String, ? extends PurchaseCallback> purchaseCallbacksByProductId, ProductChangeCallback deprecatedProductChangeCallback, boolean appInBackground, boolean firstTimeInForeground) {
        m.e(purchaseCallbacksByProductId, "purchaseCallbacksByProductId");
        return new PurchasesState(allowSharingPlayStoreAccount, purchaseCallbacksByProductId, deprecatedProductChangeCallback, appInBackground, firstTimeInForeground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasesState)) {
            return false;
        }
        PurchasesState purchasesState = (PurchasesState) other;
        return m.a(this.allowSharingPlayStoreAccount, purchasesState.allowSharingPlayStoreAccount) && m.a(this.purchaseCallbacksByProductId, purchasesState.purchaseCallbacksByProductId) && m.a(this.deprecatedProductChangeCallback, purchasesState.deprecatedProductChangeCallback) && this.appInBackground == purchasesState.appInBackground && this.firstTimeInForeground == purchasesState.firstTimeInForeground;
    }

    public final Boolean getAllowSharingPlayStoreAccount() {
        return this.allowSharingPlayStoreAccount;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final ProductChangeCallback getDeprecatedProductChangeCallback() {
        return this.deprecatedProductChangeCallback;
    }

    public final boolean getFirstTimeInForeground() {
        return this.firstTimeInForeground;
    }

    public final Map<String, PurchaseCallback> getPurchaseCallbacksByProductId() {
        return this.purchaseCallbacksByProductId;
    }

    public int hashCode() {
        Boolean bool = this.allowSharingPlayStoreAccount;
        int iHashCode = (this.purchaseCallbacksByProductId.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        ProductChangeCallback productChangeCallback = this.deprecatedProductChangeCallback;
        return Boolean.hashCode(this.firstTimeInForeground) + w.c.e((iHashCode + (productChangeCallback != null ? productChangeCallback.hashCode() : 0)) * 31, 31, this.appInBackground);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchasesState(allowSharingPlayStoreAccount=");
        sb.append(this.allowSharingPlayStoreAccount);
        sb.append(", purchaseCallbacksByProductId=");
        sb.append(this.purchaseCallbacksByProductId);
        sb.append(", deprecatedProductChangeCallback=");
        sb.append(this.deprecatedProductChangeCallback);
        sb.append(", appInBackground=");
        sb.append(this.appInBackground);
        sb.append(", firstTimeInForeground=");
        return x5.o(sb, this.firstTimeInForeground, ')');
    }
}
