package a1;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c3.c3;
import kotlin.KotlinNothingValueException;

public final class o extends m00.i implements u00.n {
    public int A;
    public Object B;
    public final d40.w0 C;
    public final w2 D;
    public final s2 E;
    public final l9.f0 F;
    public final c3.q0 G;
    public final r3.j H;
    public final u00.k I;
    public final u00.a J;
    public final c3 K;
    public final u00.k L;

    public o(d40.w0 w0Var, w2 w2Var, s2 s2Var, l9.f0 f0Var, c3.q0 q0Var, r3.j jVar, u00.k kVar, u00.a aVar, c3 c3Var, u00.k kVar2, k00.c cVar) {
        super(2, cVar);
        this.C = w0Var;
        this.D = w2Var;
        this.E = s2Var;
        this.F = f0Var;
        this.G = q0Var;
        this.H = jVar;
        this.I = kVar;
        this.J = aVar;
        this.K = c3Var;
        this.L = kVar2;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        o oVar = new o(this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, cVar);
        oVar.B = obj;
        return oVar;
    }

    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        return l00.a.A;
    }

    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw b.t(obj);
        }
        ri.t1.O(obj);
        a40.z zVar = (a40.z) this.B;
        a40.a0 a0Var = a40.a0.D;
        w2 w2Var = this.D;
        l9.f0 f0Var = this.F;
        k00.c cVar = null;
        a40.c0.y(zVar, (k00.i) null, a0Var, new d(w2Var, f0Var, cVar, 1), 1);
        d40.w0 w0Var = this.C;
        if (w0Var != null) {
            a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d(w0Var, f0Var, cVar, 2), 3);
        }
        final b0 b0Var = new b0(w2Var, this.E, f0Var, zVar);
        final w2 w2Var2 = this.D;
        final r3.j jVar = this.H;
        final l9.f0 f0Var2 = this.F;
        final u00.k kVar = this.I;
        final s2 s2Var = this.E;
        final u00.a aVar2 = this.J;
        final c3 c3Var = this.K;
        final u00.k kVar2 = this.L;
        c3.m2 m2Var = new c3.m2() {
            @Override
            public final InputConnection a(EditorInfo editorInfo) {
                w2 w2Var3 = w2Var2;
                n nVar = new n(new oe.o(w2Var3), w2Var3, f0Var2, kVar, b0Var, s2Var, aVar2, c3Var, kVar2);
                x0.F(editorInfo, w2Var3.d(), w2Var3.d().D, jVar);
                return new k1(nVar, editorInfo);
            }
        };
        this.A = 1;
        this.G.a(m2Var, this);
        return aVar;
    }
}
