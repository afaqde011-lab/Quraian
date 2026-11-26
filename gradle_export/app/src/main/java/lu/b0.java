package lu;

import bt.g2;
import d40.g0;
import d40.p1;
import d40.v0;
import java.util.ArrayList;
import java.util.Iterator;
import ri.t1;

public final class b0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e0 C;

    public b0(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b0(this.C, cVar, 0);
            case 1:
                return new b0(this.C, cVar, 1);
            default:
                return new b0(this.C, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        u30.b bVar;
        int i = this.A;
        k00.c cVar = null;
        g00.b0 b0Var = g00.b0.a;
        e0 e0Var = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (e0.j(e0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                oi.k.v(e0Var.g.a, "skipReciterEventCelebrationAfterOnboardingOnce", true);
                oi.k.v(e0Var.d.a, "onboarding_finished_key", true);
                e0Var.k.onboardingCompleted();
                if (!e0Var.m.k()) {
                    ((bq.a) e0Var.l).f(true, zp.b.ONBOARDING);
                }
                ab.a0.A0(e0Var, new r() {
                    public static final int $stable = 0;

                    public boolean equals(Object other) {
                        return this == other || (other instanceof OnboardingEffect$CloseScreen);
                    }

                    @Override
                    public long getDebounce() {
                        return 300L;
                    }

                    public int hashCode() {
                        return -24687271;
                    }

                    public String toString() {
                        return "CloseScreen";
                    }
                });
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                uu.w wVar = (uu.w) e0Var.h;
                p1 p1Var = wVar.A;
                p1 p1Var2 = wVar.N;
                g2 g2Var = new g2(3, cVar, 2);
                a1.c cVar2 = new a1.c(e0Var, 13);
                this.B = 1;
                Object objA = e40.b.a(cVar2, this, v0.A, new g0((Object) g2Var, (k00.c) null, 1), new d40.i[]{p1Var, p1Var2});
                if (objA != aVar2) {
                    objA = b0Var;
                }
                return objA == aVar2 ? aVar2 : b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    z zVar = (z) ((a0) e0Var.c.d.getValue()).b.get("reciters");
                    if (zVar == null || (bVar = zVar.d) == null) {
                        return b0Var;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : bVar) {
                        if (((ju.h) obj2).d) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new Integer(((ju.h) it.next()).a));
                    }
                    Integer num = (Integer) h00.q.N0(arrayList2);
                    if (num == null) {
                        return b0Var;
                    }
                    int iIntValue = num.intValue();
                    xw.k kVar = e0Var.f;
                    this.B = 1;
                    obj = kVar.d(iIntValue, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                bx.c cVar3 = (bx.c) obj;
                if (cVar3 == null) {
                    return b0Var;
                }
                uu.w wVar2 = (uu.w) e0Var.h;
                ta.c0.M(wVar2.q, (k00.i) null, (u00.n) null, (u00.k) null, new pz.k(wVar2, cVar3, cVar, 12), 31);
                return b0Var;
        }
    }
}
