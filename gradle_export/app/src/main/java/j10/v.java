package j10;

public final class v extends s0 {
    public final n20.e a;
    public final h30.h b;

    public v(n20.e eVar, h30.h underlyingType) {
        kotlin.jvm.internal.m.e(underlyingType, "underlyingType");
        this.a = eVar;
        this.b = underlyingType;
    }

    @Override
    public final boolean a(n20.e eVar) {
        return this.a.equals(eVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}
