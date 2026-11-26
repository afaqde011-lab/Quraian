package vk;

import ck.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lvk/a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "message", "code", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "retryAfter", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @b("message")
    private final String message;

    @b("code")
    private final String code;

    @b("retry_after")
    private final Integer retryAfter;

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getRetryAfter() {
        return this.retryAfter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.message, aVar.message) && m.a(this.code, aVar.code) && m.a(this.retryAfter, aVar.retryAfter);
    }

    public final int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryAfter;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.message;
        String str2 = this.code;
        Integer num = this.retryAfter;
        StringBuilder sbS = a1.b.s("AuthErrorApiModel(message=", str, ", code=", str2, ", retryAfter=");
        sbS.append(num);
        sbS.append(")");
        return sbS.toString();
    }
}
