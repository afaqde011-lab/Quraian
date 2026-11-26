package c3;

public final class t3 implements g2, kotlin.jvm.internal.g {
    public final l1.n A;

    public t3(l1.n nVar) {
        this.A = nVar;
    }

    public final g00.e b() {
        return new kotlin.jvm.internal.j(1, 0, l1.n.class, this.A, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof g2) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
