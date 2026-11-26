package kotlin.jvm.internal;

public abstract class i extends c implements h, a10.g {
    private final int arity;

    public i(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override
    public a10.c computeReflected() {
        return a0.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && m.a(getBoundReceiver(), iVar.getBoundReceiver()) && m.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof a10.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public a10.g getReflected() {
        a10.c cVarCompute = compute();
        if (cVarCompute != this) {
            return (a10.g) cVarCompute;
        }
        throw new a40.b0();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        a10.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
