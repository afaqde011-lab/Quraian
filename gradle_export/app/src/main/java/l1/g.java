package l1;

public final class g extends m00.h implements u00.n {
    public int B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final h G;

    public g(h hVar, k00.c cVar) {
        super(2, cVar);
        this.G = hVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        g gVar = new g(this.G, cVar);
        gVar.F = obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        q30.k kVar;
        int i10;
        int i11;
        int i12;
        String strF;
        int i13;
        int i14;
        String str;
        h hVar = this.G;
        u.d0 d0Var = hVar.A;
        u.v vVar = hVar.C;
        l00.a aVar = l00.a.A;
        int i15 = this.E;
        if (i15 == 0) {
            ri.t1.O(obj);
            kVar = (q30.k) this.F;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.D;
            i11 = this.C;
            i12 = this.B;
            kVar = (q30.k) this.F;
            ri.t1.O(obj);
        }
        if (i12 >= Math.min(hVar.D + 10, vVar.f14904b)) {
            return g00.b0.a;
        }
        int i16 = i12 + 1;
        int iC = vVar.c(i12);
        switch (iC) {
            case 0:
                strF = "up";
                break;
            case 1:
                String strH = g4.c.h(d0Var.f(i11), "down ");
                i11++;
                strF = strH;
                break;
            case 2:
                strF = "remove " + vVar.c(i16) + ' ' + vVar.c(i12 + 2);
                i16 = i12 + 3;
                break;
            case 3:
                strF = "move " + vVar.c(i16) + ' ' + vVar.c(i12 + 2) + ' ' + vVar.c(i12 + 3);
                i16 = i12 + 4;
                break;
            case 4:
                strF = "clear";
                break;
            case 5:
                i13 = i12 + 2;
                int iC2 = vVar.c(i16);
                i14 = i11 + 1;
                str = "insertBottomUp " + iC2 + ' ' + d0Var.f(i11);
                int i17 = i13;
                strF = str;
                i16 = i17;
                i11 = i14;
                break;
            case 6:
                i13 = i12 + 2;
                int iC3 = vVar.c(i16);
                i14 = i11 + 1;
                str = "insertTopDown " + iC3 + ' ' + d0Var.f(i11);
                int i18 = i13;
                strF = str;
                i16 = i18;
                i11 = i14;
                break;
            case 7:
                Object objF = d0Var.f(i11);
                kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                kotlin.jvm.internal.d0.d(2, objF);
                i11 += 2;
                strF = "apply " + ((u00.n) objF);
                break;
            case 8:
                strF = "reuse " + hVar.B.f(i10);
                i10++;
                break;
            case 9:
                strF = "recompose pending";
                break;
            default:
                strF = g4.c.f(iC, "unknown op: ");
                break;
        }
        this.F = kVar;
        this.B = i16;
        this.C = i11;
        this.D = i10;
        this.E = 1;
        kVar.c(i12 + ": " + strF, this);
        return aVar;
    }
}
