package a1;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g1.k8;
import k9.d4;

public final class q1 extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final Object C;

    public q1(Object obj, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.C = obj;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new q1((t1) this.C, cVar, 0);
            case 1:
                return new q1((e1.v0) this.C, cVar, 1);
            case 2:
                return new q1((e60.a) this.C, cVar, 2);
            case 3:
                return new q1((k8) this.C, cVar, 3);
            case 4:
                return new q1((kt.b) this.C, cVar, 4);
            case 5:
                return new q1((AudioPlayerService) this.C, cVar, 5);
            default:
                return new q1((uu.w) this.C, cVar, 6);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return create(cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                t1 t1Var = (t1) this.C;
                g00.b0 b0Var = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    t1Var.U.f1958u.setValue(Boolean.TRUE);
                    return b0Var2;
                }
                ri.t1.O(obj);
                b1.e0 e0Var = t1Var.U;
                this.B = 1;
                e0Var.z();
                if (b0Var2 == b0Var) {
                    return b0Var;
                }
                e1.q qVar = t1Var.f123a0;
                if (qVar != null) {
                    CharSequence charSequence = t1Var.U.f1940a.d().C;
                    long j9 = t1Var.U.f1940a.d().D;
                    this.B = 2;
                    Object objC = qVar.c(charSequence, j9, this);
                    if (objC != b0Var) {
                        objC = b0Var2;
                    }
                    if (objC == b0Var) {
                        return b0Var;
                    }
                }
                t1Var.U.f1958u.setValue(Boolean.TRUE);
                return b0Var2;
            case 1:
                e1.v0 v0Var = (e1.v0) this.C;
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var3 = g00.b0.a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    v0Var.B = true;
                    return b0Var3;
                }
                ri.t1.O(obj);
                this.B = 1;
                if (v0Var.s(this) == aVar) {
                    return aVar;
                }
                g00.k kVarA = e1.v0.a(v0Var);
                if (kVarA != null) {
                    String str = (String) kVarA.A;
                    long j10 = ((m3.q0) kVarA.B).f10520a;
                    e1.q qVar2 = v0Var.f5024j;
                    if (qVar2 != null) {
                        this.B = 2;
                        Object objC2 = qVar2.c(str, j10, this);
                        if (objC2 != aVar) {
                            objC2 = b0Var3;
                        }
                        if (objC2 == aVar) {
                            return aVar;
                        }
                    }
                }
                v0Var.B = true;
                return b0Var3;
            case 2:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    jo.o oVar = (jo.o) x5.i(kotlin.jvm.internal.a0.a, jo.o.class, (e60.a) this.C, null, null);
                    this.B = 1;
                    if (oVar.a(true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    ((g00.n) obj).getClass();
                }
                return g00.b0.a;
            case 3:
                l00.a aVar3 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    k8 k8Var = (k8) this.C;
                    this.B = 1;
                    a40.k kVar = new a40.k(1, qd.s0.j0(this));
                    kVar.r();
                    k8Var.f5850b.W0(Boolean.TRUE);
                    k8Var.f5851c = kVar;
                    if (kVar.q() == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar4 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    kt.b bVar = (kt.b) this.C;
                    this.B = 1;
                    obj = bVar.a(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return ((ft.c) obj).a();
            case 5:
                l00.a aVar5 = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    ri.t1.O(obj);
                    AudioPlayerService audioPlayerService = (AudioPlayerService) this.C;
                    this.B = 1;
                    if (AudioPlayerService.r(audioPlayerService, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return new d4(0);
            default:
                g00.b0 b0Var4 = l00.a.A;
                int i16 = this.B;
                g00.b0 b0Var5 = g00.b0.a;
                if (i16 == 0) {
                    ri.t1.O(obj);
                    d40.p1 p1Var = ((uu.w) this.C).O;
                    Boolean bool = Boolean.FALSE;
                    this.B = 1;
                    p1Var.emit(bool, this);
                    if (b0Var5 == b0Var4) {
                        return b0Var4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var5;
        }
    }
}
