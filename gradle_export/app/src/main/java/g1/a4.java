package g1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg1/a4;", "Lb3/e1;", "Lg1/c4;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a4 extends b3.e1 {
    public static final a4 B = new a4();

    private a4() {
    }

    @Override
    public final b2.q d() {
        return new c4();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "minimumInteractiveComponentSize";
        d2Var.f2646c.c("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public final void i(b2.q qVar) {
    }
}
