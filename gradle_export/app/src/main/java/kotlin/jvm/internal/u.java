package kotlin.jvm.internal;

public abstract class u extends c implements a10.w {
    public final boolean A;

    public u(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.A = (i & 2) == 2;
    }

    @Override
    public final a10.c compute() {
        return this.A ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return getOwner().equals(uVar.getOwner()) && getName().equals(uVar.getName()) && getSignature().equals(uVar.getSignature()) && m.a(getBoundReceiver(), uVar.getBoundReceiver());
        }
        if (obj instanceof a10.w) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override
    public final a10.w getReflected() {
        if (this.A) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        a10.c cVarCompute = compute();
        if (cVarCompute != this) {
            return (a10.w) cVarCompute;
        }
        throw new a40.b0();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        a10.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
