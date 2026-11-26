package k7;

public final class f {

    public boolean f9047a;

    public boolean f9048b;

    public boolean f9049c;

    public f(boolean z10, boolean z11, boolean z12) {
        this.f9047a = z10;
        this.f9048b = z11;
        this.f9049c = z12;
    }

    public g a() {
        if (this.f9047a || !(this.f9048b || this.f9049c)) {
            return new g(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
