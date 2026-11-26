package p40;

import java.util.Iterator;

public abstract class t0 extends n {
    public final s0 b;

    public t0(l40.a primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.m.e(primitiveSerializer, "primitiveSerializer");
        this.b = new s0(primitiveSerializer.getDescriptor());
    }

    @Override
    public final Object a() {
        return (r0) g(j());
    }

    @Override
    public final int b(Object obj) {
        r0 r0Var = (r0) obj;
        kotlin.jvm.internal.m.e(r0Var, "<this>");
        return r0Var.d();
    }

    @Override
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return e(decoder);
    }

    @Override
    public final n40.e getDescriptor() {
        return this.b;
    }

    @Override
    public final Object h(Object obj) {
        r0 r0Var = (r0) obj;
        kotlin.jvm.internal.m.e(r0Var, "<this>");
        return r0Var.a();
    }

    @Override
    public final void i(int i, Object obj, Object obj2) {
        kotlin.jvm.internal.m.e((r0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(o40.b bVar, Object obj, int i);

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        int iD = d(obj);
        s0 s0Var = this.b;
        o40.b bVarA = encoder.A(s0Var, iD);
        k(bVarA, obj, iD);
        bVarA.a(s0Var);
    }
}
