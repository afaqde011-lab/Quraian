package r6;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.w;
import androidx.lifecycle.y;

public final class a implements w {
    public final y A = new y(this, true);
    public p B;
    public p C;

    public a() {
        p pVar = p.B;
        this.B = pVar;
        this.C = pVar;
    }

    public final void a() {
        p pVar = this.B.ordinal() < this.C.ordinal() ? this.B : this.C;
        y yVar = this.A;
        if (yVar.f1022d == p.B && pVar == p.A) {
            return;
        }
        yVar.i(pVar);
    }

    @Override
    public final q getLifecycle() {
        return this.A;
    }
}
