package uu;

import a40.z;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d40.p1;
import g00.b0;
import java.util.List;
import ri.t1;

public final class m extends m00.i implements u00.n {
    public k9.u A;
    public List B;
    public int C;
    public int D;
    public final w E;
    public final PlayerItem F;
    public final List G;
    public final boolean H;

    public m(w wVar, PlayerItem playerItem, List list, boolean z, k00.c cVar) {
        super(2, cVar);
        this.E = wVar;
        this.F = playerItem;
        this.G = list;
        this.H = z;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new m(this.E, this.F, this.G, this.H, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        k9.u uVar;
        int i;
        List list;
        List list2;
        k9.u uVar2;
        List list3;
        k9.u uVar3;
        int i2;
        List list4;
        k9.u uVar4;
        l00.a aVar = l00.a.A;
        int i3 = this.D;
        PlayerItem playerItem = this.F;
        b0 b0Var = b0.a;
        w wVar = this.E;
        if (i3 == 0) {
            t1.O(obj);
            wVar.f();
            this.D = 1;
            obj = wVar.g(true, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            t1.O(obj);
        } else {
            if (i3 == 2) {
                i = this.C;
                list = this.B;
                k9.u uVar5 = this.A;
                t1.O(obj);
                uVar = uVar5;
                p1 p1Var = wVar.C;
                this.A = uVar;
                this.B = list;
                this.C = i;
                this.D = 3;
                p1Var.emit(playerItem, this);
                if (b0Var != aVar) {
                    list2 = list;
                    uVar2 = uVar;
                    p1 p1Var2 = wVar.K;
                    Boolean bool = Boolean.TRUE;
                    this.A = uVar2;
                    this.B = list2;
                    this.C = i;
                    this.D = 4;
                    p1Var2.emit(bool, this);
                    if (b0Var != aVar) {
                        list3 = list2;
                        uVar3 = uVar2;
                        p1 p1Var3 = wVar.L;
                        Boolean boolValueOf = Boolean.valueOf(this.H);
                        this.A = uVar3;
                        this.B = list3;
                        this.C = i;
                        this.D = 5;
                        p1Var3.emit(boolValueOf, this);
                        if (b0Var != aVar) {
                            i2 = i;
                            list4 = list3;
                            uVar4 = uVar3;
                        }
                    }
                }
                return aVar;
            }
            if (i3 == 3) {
                i = this.C;
                list2 = this.B;
                uVar2 = this.A;
                t1.O(obj);
                p1 p1Var4 = wVar.K;
                Boolean bool2 = Boolean.TRUE;
                this.A = uVar2;
                this.B = list2;
                this.C = i;
                this.D = 4;
                p1Var4.emit(bool2, this);
                if (b0Var != aVar) {
                    list3 = list2;
                    uVar3 = uVar2;
                    p1 p1Var5 = wVar.L;
                    Boolean boolValueOf2 = Boolean.valueOf(this.H);
                    this.A = uVar3;
                    this.B = list3;
                    this.C = i;
                    this.D = 5;
                    p1Var5.emit(boolValueOf2, this);
                    if (b0Var != aVar) {
                        i2 = i;
                        list4 = list3;
                        uVar4 = uVar3;
                    }
                }
                return aVar;
            }
            if (i3 == 4) {
                i = this.C;
                list3 = this.B;
                uVar3 = this.A;
                t1.O(obj);
                p1 p1Var6 = wVar.L;
                Boolean boolValueOf3 = Boolean.valueOf(this.H);
                this.A = uVar3;
                this.B = list3;
                this.C = i;
                this.D = 5;
                p1Var6.emit(boolValueOf3, this);
                if (b0Var != aVar) {
                    i2 = i;
                    list4 = list3;
                    uVar4 = uVar3;
                }
                return aVar;
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.C;
            list4 = this.B;
            uVar4 = this.A;
            t1.O(obj);
        }
        uVar4.setMediaItems(list4);
        uVar4.seekToDefaultPosition(i2);
        uVar4.prepare();
        uVar4.play();
        wVar.w();
        return b0Var;
        uVar = (k9.u) obj;
        if (uVar == null) {
            return b0Var;
        }
        wVar.n.h(new Integer(playerItem.getSurahNumber()));
        List list5 = this.G;
        int iIndexOf = list5.indexOf(playerItem);
        List listX = wVar.f.X(list5);
        p1 p1Var7 = wVar.P;
        u30.b bVarD0 = g4.d0(list5);
        this.A = uVar;
        this.B = listX;
        this.C = iIndexOf;
        this.D = 2;
        p1Var7.emit(bVarD0, this);
        if (b0Var != aVar) {
            i = iIndexOf;
            list = listX;
            p1 p1Var8 = wVar.C;
            this.A = uVar;
            this.B = list;
            this.C = i;
            this.D = 3;
            p1Var8.emit(playerItem, this);
            if (b0Var != aVar) {
                list2 = list;
                uVar2 = uVar;
                p1 p1Var9 = wVar.K;
                Boolean bool3 = Boolean.TRUE;
                this.A = uVar2;
                this.B = list2;
                this.C = i;
                this.D = 4;
                p1Var9.emit(bool3, this);
                if (b0Var != aVar) {
                    list3 = list2;
                    uVar3 = uVar2;
                    p1 p1Var10 = wVar.L;
                    Boolean boolValueOf4 = Boolean.valueOf(this.H);
                    this.A = uVar3;
                    this.B = list3;
                    this.C = i;
                    this.D = 5;
                    p1Var10.emit(boolValueOf4, this);
                    if (b0Var != aVar) {
                        i2 = i;
                        list4 = list3;
                        uVar4 = uVar3;
                        uVar4.setMediaItems(list4);
                        uVar4.seekToDefaultPosition(i2);
                        uVar4.prepare();
                        uVar4.play();
                        wVar.w();
                        return b0Var;
                    }
                }
            }
        }
        return aVar;
    }
}
