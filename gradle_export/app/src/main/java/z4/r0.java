package z4;

import android.view.WindowInsets;

public abstract class r0 extends x0 {

    public final WindowInsets.Builder f17222d;

    public r0() {
        this.f17222d = new WindowInsets.Builder();
    }

    public r0(j1 j1Var) {
        super(j1Var);
        WindowInsets windowInsetsF = j1Var.f();
        this.f17222d = windowInsetsF != null ? new WindowInsets.Builder(windowInsetsF) : new WindowInsets.Builder();
    }

    @Override
    public j1 b() {
        a();
        j1 j1VarG = j1.g(null, this.f17222d.build());
        g1 g1Var = j1VarG.f17202a;
        g1Var.w(null);
        g1Var.v(null);
        g1Var.A(this.f17229b);
        g1Var.B(this.f17230c);
        return j1VarG;
    }

    @Override
    public void d(q4.b bVar) {
        this.f17222d.setMandatorySystemGestureInsets(bVar.e());
    }

    @Override
    public void e(q4.b bVar) {
        this.f17222d.setStableInsets(bVar.e());
    }

    @Override
    public void f(q4.b bVar) {
        this.f17222d.setSystemGestureInsets(bVar.e());
    }

    @Override
    public void g(q4.b bVar) {
        this.f17222d.setSystemWindowInsets(bVar.e());
    }

    @Override
    public void h(q4.b bVar) {
        this.f17222d.setTappableElementInsets(bVar.e());
    }
}
