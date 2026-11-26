package d;

public final class a0 extends s9.g {

    public final z f4373a;

    public final androidx.lifecycle.w f4374b;

    public a0(androidx.lifecycle.w wVar, z zVar) {
        kotlin.jvm.internal.m.e(zVar, "callback");
        this.f4373a = zVar;
        this.f4374b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f4373a, a0Var.f4373a) && kotlin.jvm.internal.m.a(this.f4374b, a0Var.f4374b);
    }

    public final int hashCode() {
        int iHashCode = this.f4373a.hashCode() * 31;
        androidx.lifecycle.w wVar = this.f4374b;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f4373a + ", owner=" + this.f4374b + ')';
    }
}
