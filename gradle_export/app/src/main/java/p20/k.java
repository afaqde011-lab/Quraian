package p20;

import a10.w;

public final class k {
    public Object a;
    public final l b;

    public k(Object obj, l lVar) {
        this.b = lVar;
        this.a = obj;
    }

    public final Object a(w property, Object obj) {
        kotlin.jvm.internal.m.e(property, "property");
        return this.a;
    }

    public final void b(w property, Object obj) {
        kotlin.jvm.internal.m.e(property, "property");
        if (this.b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.a = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
