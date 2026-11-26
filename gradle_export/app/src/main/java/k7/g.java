package k7;

public final class g {

    public static final g f9055d = new f().a();

    public final boolean f9056a;

    public final boolean f9057b;

    public final boolean f9058c;

    public g(f fVar) {
        this.f9056a = fVar.f9047a;
        this.f9057b = fVar.f9048b;
        this.f9058c = fVar.f9049c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9056a == gVar.f9056a && this.f9057b == gVar.f9057b && this.f9058c == gVar.f9058c;
    }

    public final int hashCode() {
        return ((this.f9056a ? 1 : 0) << 2) + ((this.f9057b ? 1 : 0) << 1) + (this.f9058c ? 1 : 0);
    }
}
