package d10;

public final class z1 implements u00.k {
    public final boolean A;

    public z1(boolean z) {
        this.A = z;
    }

    @Override
    public final Object invoke(Object obj) {
        a10.z it = (a10.z) obj;
        kotlin.jvm.internal.m.e(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append(this.A ? "(raw) " : "");
        sb.append(it);
        return sb.toString();
    }
}
