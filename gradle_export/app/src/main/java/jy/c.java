package jy;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Ljy/c;", "", "", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "b", "getReasonSpecification", "reasonSpecification", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    @ck.b("reason")
    private final String reason;

    @ck.b("reason_specification")
    private final String reasonSpecification;

    public c(String reason, String reasonSpecification) {
        m.e(reason, "reason");
        m.e(reasonSpecification, "reasonSpecification");
        this.reason = reason;
        this.reasonSpecification = reasonSpecification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.reason, cVar.reason) && m.a(this.reasonSpecification, cVar.reasonSpecification);
    }

    public final int hashCode() {
        return this.reasonSpecification.hashCode() + (this.reason.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("SubscriptionCancelRequestApiModel(reason=", this.reason, ", reasonSpecification=", this.reasonSpecification, ")");
    }
}
