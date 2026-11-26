package j3;

public final class g {

    public final boolean f7932a;

    public g(boolean z10) {
        this.f7932a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f7932a == ((g) obj).f7932a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7932a) * 31;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.f7932a;
    }
}
