package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

public final class k0 {

    public static final u f4282b = new u(1);

    public final Object f4283a;

    public k0() {
        o0 o0Var;
        try {
            o0Var = (o0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o0Var = f4282b;
        }
        o0[] o0VarArr = {u.f4329b, o0Var};
        j0 j0Var = new j0();
        j0Var.f4272a = o0VarArr;
        Charset charset = b0.f4244a;
        this.f4283a = j0Var;
    }

    public k0(m mVar) {
        b0.a(mVar, "output");
        this.f4283a = mVar;
        mVar.f4291b = this;
    }

    public void a(int i10, i iVar) {
        m mVar = (m) this.f4283a;
        mVar.f0(i10, 2);
        mVar.g0(iVar.size());
        h hVar = (h) iVar;
        mVar.Z(hVar.D, hVar.i(), hVar.size());
    }

    public void b(int i10, Object obj, a1 a1Var) throws CodedOutputStream$OutOfSpaceException {
        m mVar = (m) this.f4283a;
        mVar.f0(i10, 3);
        a1Var.f((a) obj, mVar.f4291b);
        mVar.f0(i10, 4);
    }

    public void c(int i10, Object obj, a1 a1Var) throws CodedOutputStream$OutOfSpaceException {
        m mVar = (m) this.f4283a;
        a aVar = (a) obj;
        mVar.f0(i10, 2);
        mVar.g0(aVar.a(a1Var));
        a1Var.f(aVar, mVar.f4291b);
    }
}
