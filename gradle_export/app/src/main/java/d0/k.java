package d0;

import g00.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.w;

public final class k extends m00.i implements u00.n {
    public final int A = 0;
    public kotlin.jvm.internal.w B;
    public int C;
    public final float D;
    public Object E;
    public final Object F;
    public final y1 G;

    public k(float f3, l lVar, q2 q2Var, k00.c cVar) {
        super(2, cVar);
        this.D = f3;
        this.F = lVar;
        this.G = q2Var;
    }

    public k(e0.h hVar, float f3, u00.k kVar, y1 y1Var, k00.c cVar) {
        super(2, cVar);
        this.E = hVar;
        this.D = f3;
        this.F = kVar;
        this.G = y1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k(this.D, (l) this.F, (q2) this.G, cVar);
            default:
                return new k((e0.h) this.E, this.D, (u00.k) this.F, this.G, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f3;
        x.j jVar;
        kotlin.jvm.internal.w wVar;
        final kotlin.jvm.internal.w wVar2;
        Object objB;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.C;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (x.j) this.E;
                    wVar = this.B;
                    try {
                        ri.t1.O(obj);
                    } catch (CancellationException unused) {
                        wVar.A = ((Number) jVar.a()).floatValue();
                    }
                    f3 = wVar.A;
                    break;
                } else {
                    ri.t1.O(obj);
                    f3 = this.D;
                    if (Math.abs(f3) > 1.0f) {
                        kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                        wVar3.A = f3;
                        kotlin.jvm.internal.w wVar4 = new kotlin.jvm.internal.w();
                        x.j jVarB = x.c.b(0.0f, f3, 28);
                        try {
                            l lVar = (l) this.F;
                            x.t tVar = lVar.f4444a;
                            b1.l lVar2 = new b1.l(wVar4, (q2) this.G, wVar3, lVar);
                            this.B = wVar3;
                            this.E = jVarB;
                            this.C = 1;
                            if (x.c.g(jVarB, tVar, false, lVar2, this) == aVar) {
                                return aVar;
                            }
                            wVar = wVar3;
                            f3 = wVar.A;
                        } catch (CancellationException unused2) {
                            jVar = jVarB;
                            wVar = wVar3;
                            wVar.A = ((Number) jVar.a()).floatValue();
                        }
                    }
                }
                return new Float(f3);
            default:
                final u00.k kVar = (u00.k) this.F;
                e0.h hVar = (e0.h) this.E;
                e0.m mVar = hVar.f4946a;
                l00.a aVar2 = l00.a.A;
                int i11 = this.C;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    x.a0 a0Var = hVar.f4947b.f16373a;
                    float f10 = this.D;
                    float fA = mVar.a(f10, a0Var.j(0.0f, f10));
                    if (Float.isNaN(fA)) {
                        g0.a.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    wVar2 = new kotlin.jvm.internal.w();
                    float fSignum = Math.signum(f10) * Math.abs(fA);
                    wVar2.A = fSignum;
                    kVar.invoke(new Float(fSignum));
                    float f11 = wVar2.A;
                    final int i12 = 0;
                    ?? r4 = new u00.k() {
                        public final Object invoke(Object obj2) {
                            int i13 = i12;
                            float fFloatValue = ((Float) obj2).floatValue();
                            switch (i13) {
                                case 0:
                                    w wVar5 = wVar2;
                                    float f12 = wVar5.A - fFloatValue;
                                    wVar5.A = f12;
                                    kVar.invoke(Float.valueOf(f12));
                                    break;
                                default:
                                    w wVar6 = wVar2;
                                    float f13 = wVar6.A - fFloatValue;
                                    wVar6.A = f13;
                                    kVar.invoke(Float.valueOf(f13));
                                    break;
                            }
                            return b0.a;
                        }
                    };
                    this.B = wVar2;
                    this.C = 1;
                    objB = e0.h.b(hVar, this.G, f11, this.D, r4, this);
                    if (objB != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                kotlin.jvm.internal.w wVar5 = this.B;
                ri.t1.O(obj);
                wVar2 = wVar5;
                objB = obj;
                x.j jVar2 = (x.j) objB;
                float fB = mVar.b(((Number) jVar2.a()).floatValue());
                if (Float.isNaN(fB)) {
                    g0.a.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                wVar2.A = fB;
                x.j jVarL = x.c.l(jVar2, 0.0f, 0.0f, 30);
                x.b1 b1Var = hVar.f4948c;
                final int i13 = 1;
                u00.k kVar2 = new u00.k() {
                    public final Object invoke(Object obj2) {
                        int i14 = i13;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i14) {
                            case 0:
                                w wVar6 = wVar2;
                                float f12 = wVar6.A - fFloatValue;
                                wVar6.A = f12;
                                kVar.invoke(Float.valueOf(f12));
                                break;
                            default:
                                w wVar7 = wVar2;
                                float f13 = wVar7.A - fFloatValue;
                                wVar7.A = f13;
                                kVar.invoke(Float.valueOf(f13));
                                break;
                        }
                        return b0.a;
                    }
                };
                this.B = null;
                this.C = 2;
                Object objB2 = e0.l.b(this.G, fB, fB, jVarL, b1Var, kVar2, this);
                if (objB2 != aVar2) {
                    return objB2;
                }
                return aVar2;
        }
    }
}
