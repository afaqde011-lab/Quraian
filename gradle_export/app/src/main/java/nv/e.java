package nv;

import a40.z;
import bt.i2;
import bv.h2;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import d40.p1;
import d40.u0;
import d40.z0;
import d6.n0;
import g00.b0;
import ri.t1;
import uu.w;

public final class e extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final AudioPlayerService C;

    public e(AudioPlayerService audioPlayerService, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = audioPlayerService;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e(this.C, cVar, 0);
            case 1:
                return new e(this.C, cVar, 1);
            case 2:
                return new e(this.C, cVar, 2);
            case 3:
                return new e(this.C, cVar, 3);
            case 4:
                return new e(this.C, cVar, 4);
            case 5:
                return new e(this.C, cVar, 5);
            case 6:
                return new e(this.C, cVar, 6);
            case 7:
                return new e(this.C, cVar, 7);
            case 8:
                return new e(this.C, cVar, 8);
            case 9:
                return new e(this.C, cVar, 9);
            case 10:
                return new e(this.C, cVar, 10);
            case 11:
                return new e(this.C, cVar, 11);
            default:
                return new e(this.C, cVar, 12);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
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
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return ((e) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        int i2 = 4;
        int i3 = 3;
        int i4 = 0;
        k00.c cVar = null;
        b0 b0Var = b0.a;
        AudioPlayerService audioPlayerService = this.C;
        int i5 = 1;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i7 = AudioPlayerService.j0;
                bt.t1 t1Var = new bt.t1(audioPlayerService.z().c(), 11);
                d dVar = new d(audioPlayerService, cVar, i4);
                this.B = 1;
                return d40.o.i(t1Var, dVar, this) == aVar ? aVar : b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i8 = this.B;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i9 = AudioPlayerService.j0;
                bt.t1 t1Var2 = new bt.t1(audioPlayerService.z().c, 11);
                d dVar2 = new d(audioPlayerService, cVar, i5);
                this.B = 1;
                return d40.o.i(t1Var2, dVar2, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i12 = AudioPlayerService.j0;
                bt.t1 t1Var3 = new bt.t1(((b00.c) audioPlayerService.S.getValue()).h, 11);
                f fVar = new f(audioPlayerService, cVar, i4);
                this.B = 1;
                return d40.o.i(t1Var3, fVar, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i14 = AudioPlayerService.j0;
                bt.t1 t1Var4 = new bt.t1(((b00.c) audioPlayerService.S.getValue()).d, 11);
                f fVar2 = new f(audioPlayerService, cVar, i5);
                this.B = 1;
                return d40.o.i(t1Var4, fVar2, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i15 = this.B;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                bt.t1 t1Var5 = new bt.t1(((ut.p) ((zt.a) audioPlayerService.Q.getValue())).k(), 11);
                d dVar3 = new d(audioPlayerService, cVar, 2);
                this.B = 1;
                return d40.o.i(t1Var5, dVar3, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i16 = this.B;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                bt.t1 t1Var6 = new bt.t1(((jo.d) audioPlayerService.a0.getValue()).a(), 11);
                d dVar4 = new d(audioPlayerService, cVar, i3);
                this.B = 1;
                return d40.o.i(t1Var6, dVar4, this) == aVar6 ? aVar6 : b0Var;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i17 = this.B;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                bt.t1 t1Var7 = new bt.t1(((xv.c) audioPlayerService.R.getValue()).c.c, 11);
                d dVar5 = new d(audioPlayerService, cVar, i2);
                this.B = 1;
                return d40.o.i(t1Var7, dVar5, this) == aVar7 ? aVar7 : b0Var;
            case 7:
                l00.a aVar8 = l00.a.A;
                int i18 = this.B;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i19 = AudioPlayerService.j0;
                d40.i iVarO = d40.o.o(d40.o.l(((w) audioPlayerService.w()).C, ((w) audioPlayerService.w()).J, audioPlayerService.z().c(), new n0(4, (k00.c) null)));
                d dVar6 = new d(audioPlayerService, cVar, 5);
                this.B = 1;
                return d40.o.i(iVarO, dVar6, this) == aVar8 ? aVar8 : b0Var;
            case 8:
                l00.a aVar9 = l00.a.A;
                int i21 = this.B;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i22 = AudioPlayerService.j0;
                d40.i iVarO2 = d40.o.o(new dq.k(new z0(((xu.f) audioPlayerService.b0.getValue()).f), i5));
                g gVar = new g(audioPlayerService, i4);
                this.B = 1;
                return iVarO2.collect(gVar, this) == aVar9 ? aVar9 : b0Var;
            case 9:
                l00.a aVar10 = l00.a.A;
                int i23 = this.B;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i24 = AudioPlayerService.j0;
                z0 z0Var = audioPlayerService.x().k;
                i iVar = new i(audioPlayerService, cVar, i4);
                this.B = 1;
                return d40.o.i(z0Var, iVar, this) == aVar10 ? aVar10 : b0Var;
            case 10:
                l00.a aVar11 = l00.a.A;
                int i25 = this.B;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i26 = AudioPlayerService.j0;
                p1 p1Var = ((hq.b) audioPlayerService.v()).c;
                i iVar2 = new i(audioPlayerService, cVar, i5);
                this.B = 1;
                return d40.o.i(p1Var, iVar2, this) == aVar11 ? aVar11 : b0Var;
            case 11:
                l00.a aVar12 = l00.a.A;
                int i27 = this.B;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i28 = AudioPlayerService.j0;
                p1 p1Var2 = ((w) audioPlayerService.w()).G;
                h2 h2Var = new h2(audioPlayerService, cVar, i3);
                this.B = 1;
                return d40.o.i(p1Var2, h2Var, this) == aVar12 ? aVar12 : b0Var;
            default:
                l00.a aVar13 = l00.a.A;
                int i29 = this.B;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                int i31 = AudioPlayerService.j0;
                d40.i iVarO3 = d40.o.o(new u0(((w) audioPlayerService.w()).C, ((w) audioPlayerService.w()).G, new i2(3, null, 1)));
                g gVar2 = new g(audioPlayerService, i5);
                this.B = 1;
                return iVarO3.collect(gVar2, this) == aVar13 ? aVar13 : b0Var;
        }
    }
}
