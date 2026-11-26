package jy;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Ljy/a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "status", "productId", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @ck.b("status")
    private final String status;

    @ck.b(DiagnosticsTracker.PRODUCT_ID_KEY)
    private final String productId;

    public final String getProductId() {
        return this.productId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.status, aVar.status) && m.a(this.productId, aVar.productId);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a1.b.q("PromoCodeCheckResponseApiModel(status=", this.status, ", productId=", this.productId, ")");
    }
}
