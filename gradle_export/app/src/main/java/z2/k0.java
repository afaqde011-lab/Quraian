package z2;

import java.util.Map;

public final class k0 implements x0 {

    public final int f17127a;

    public final int f17128b;

    public final Map f17129c;

    public final u00.k f17130d;

    public final l0 f17131e;

    public final q0 f17132f;

    public final u00.k f17133g;

    public k0(int i10, int i11, Map map, u00.k kVar, l0 l0Var, q0 q0Var, u00.k kVar2) {
        this.f17127a = i10;
        this.f17128b = i11;
        this.f17129c = map;
        this.f17130d = kVar;
        this.f17131e = l0Var;
        this.f17132f = q0Var;
        this.f17133g = kVar2;
    }

    @Override
    public final Map a() {
        return this.f17129c;
    }

    @Override
    public final void b() {
        b3.t tVar;
        b3.l0 l0Var = this.f17132f.A;
        boolean zW0 = this.f17131e.w0();
        u00.k kVar = this.f17133g;
        if (!zW0 || (tVar = ((b3.u) l0Var.f2059g0.D).f2134v0) == null) {
            kVar.invoke(((b3.u) l0Var.f2059g0.D).L);
        } else {
            kVar.invoke(tVar.L);
        }
    }

    @Override
    public final int c() {
        return this.f17128b;
    }

    @Override
    public final int d() {
        return this.f17127a;
    }

    @Override
    public final u00.k e() {
        return this.f17130d;
    }
}
