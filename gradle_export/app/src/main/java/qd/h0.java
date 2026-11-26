package qd;

import java.util.ArrayList;
import s10.w0;

public final class h0 implements y4.a {

    public final int f12895a;

    public final Object f12896b;

    public h0(Object obj, int i10) {
        this.f12895a = i10;
        this.f12896b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f12895a) {
            case 0:
                x xVar = new x(new ArrayList(), new ArrayList());
                ((com.revenuecat.purchases.google.usecase.c) this.f12896b).b((h) obj, xVar);
                return;
            case 1:
                ((com.revenuecat.purchases.google.usecase.a) this.f12896b).c((h) obj);
                return;
            case 2:
                v4.e eVar = (v4.e) obj;
                if (eVar == null) {
                    eVar = new v4.e(-3);
                }
                ((w0) this.f12896b).p(eVar);
                return;
            default:
                v4.e eVar2 = (v4.e) obj;
                synchronized (v4.f.f15450c) {
                    try {
                        u.s0 s0Var = v4.f.f15451d;
                        ArrayList arrayList = (ArrayList) s0Var.get((String) this.f12896b);
                        if (arrayList == null) {
                            return;
                        }
                        s0Var.remove((String) this.f12896b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((y4.a) arrayList.get(i10)).accept(eVar2);
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
