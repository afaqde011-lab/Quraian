package dq;

import a40.c0;
import a40.z;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;
import g00.b0;
import ri.t1;

public final class t extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final boolean C;
    public final boolean D;
    public final Object E;

    public t(u uVar, boolean z, boolean z2, k00.c cVar) {
        super(2, cVar);
        this.E = uVar;
        this.C = z;
        this.D = z2;
    }

    public t(boolean z, boolean z2, u00.a aVar, k00.c cVar) {
        super(2, cVar);
        this.C = z;
        this.D = z2;
        this.E = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new t((u) this.E, this.C, this.D, cVar);
            default:
                return new t(this.C, this.D, (u00.a) this.E, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((t) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                b0 b0Var = b0.a;
                if (i == 0) {
                    t1.O(obj);
                    aq.a aVar2 = ((u) this.E).d;
                    this.B = 1;
                    Object objEmit = ((bq.a) aVar2).b.emit(this.C ? new FullScreenLauncher(this.D) : null, this);
                    if (objEmit != aVar) {
                        objEmit = b0Var;
                    }
                    if (objEmit == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                b0 b0Var2 = b0.a;
                if (i2 == 0) {
                    t1.O(obj);
                    if (this.C && this.D) {
                        this.B = 1;
                        if (c0.l(1000L, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return b0Var2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                ((u00.a) this.E).invoke();
                return b0Var2;
        }
    }
}
