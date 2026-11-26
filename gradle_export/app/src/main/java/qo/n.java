package qo;

public final class n implements o {
    public final ho.e a;

    public n(ho.e error) {
        kotlin.jvm.internal.m.e(error, "error");
        this.a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowDownloadError(error=" + this.a + ")";
    }
}
