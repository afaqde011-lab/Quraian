package h0;

public abstract class p0 extends b2.q implements b3.o2 {
    public l2 O;
    public l2 P;

    public p0() {
        c0 c0Var = c.f6384c;
        this.O = c0Var;
        this.P = c0Var;
    }

    public abstract d2 B1(l2 l2Var);

    public void C1() {
        this.P = B1(this.O);
        b3.m.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new o0(this, 0));
    }

    @Override
    public final Object o() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override
    public void t1() {
        b3.m.B(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new o0(this, 1));
        C1();
    }

    @Override
    public void u1() {
        this.P = this.O;
        b3.m.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new o0(this, 0));
    }

    @Override
    public final void v1() {
        this.O = c.f6384c;
    }
}
