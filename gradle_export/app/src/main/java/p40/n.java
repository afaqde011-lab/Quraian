package p40;

import java.util.Iterator;

public abstract class n extends a {
    public final l40.a a;

    public n(l40.a aVar) {
        this.a = aVar;
    }

    @Override
    public void f(o40.a aVar, int i, Object obj) {
        i(i, obj, aVar.s(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override
    public void serialize(o40.d encoder, Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        int iD = d(obj);
        n40.e descriptor = getDescriptor();
        o40.b bVarA = encoder.A(descriptor, iD);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            bVarA.C(getDescriptor(), i, this.a, itC.next());
        }
        bVarA.a(descriptor);
    }
}
