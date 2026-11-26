package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvo/x;", "", "", "a", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "email", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    @ck.b("email")
    private final String email;

    public x(String email) {
        kotlin.jvm.internal.m.e(email, "email");
        this.email = email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && kotlin.jvm.internal.m.a(this.email, ((x) obj).email);
    }

    public final int hashCode() {
        return this.email.hashCode();
    }

    public final String toString() {
        return a1.b.p("StartAuthRequestApiModel(email=", this.email, ")");
    }
}
