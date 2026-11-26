package d10;

import java.util.Collection;

public final class d1 implements u00.a {
    public final int A;
    public final e1 B;

    public d1(e1 e1Var, int i) {
        this.A = i;
        this.B = e1Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                e1 e1Var = this.B;
                Collection collectionA = e1Var.a();
                x1 x1Var = e1Var.m;
                a10.w wVar = e1.r[12];
                Object objInvoke = x1Var.invoke();
                kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
                return h00.q.Y0((Collection) objInvoke, collectionA);
            case 1:
                e1 e1Var2 = this.B;
                x1 x1Var2 = e1Var2.l;
                a10.w[] wVarArr = e1.r;
                a10.w wVar2 = wVarArr[11];
                Object objInvoke2 = x1Var2.invoke();
                kotlin.jvm.internal.m.d(objInvoke2, "getValue(...)");
                x1 x1Var3 = e1Var2.n;
                a10.w wVar3 = wVarArr[13];
                Object objInvoke3 = x1Var3.invoke();
                kotlin.jvm.internal.m.d(objInvoke3, "getValue(...)");
                return h00.q.Y0((Collection) objInvoke3, (Collection) objInvoke2);
            case 2:
                e1 e1Var3 = this.B;
                Collection collectionA2 = e1Var3.a();
                x1 x1Var4 = e1Var3.l;
                a10.w wVar4 = e1.r[11];
                Object objInvoke4 = x1Var4.invoke();
                kotlin.jvm.internal.m.d(objInvoke4, "getValue(...)");
                return h00.q.Y0((Collection) objInvoke4, collectionA2);
            default:
                e1 e1Var4 = this.B;
                x1 x1Var5 = e1Var4.o;
                a10.w[] wVarArr2 = e1.r;
                a10.w wVar5 = wVarArr2[14];
                Object objInvoke5 = x1Var5.invoke();
                kotlin.jvm.internal.m.d(objInvoke5, "getValue(...)");
                x1 x1Var6 = e1Var4.p;
                a10.w wVar6 = wVarArr2[15];
                Object objInvoke6 = x1Var6.invoke();
                kotlin.jvm.internal.m.d(objInvoke6, "getValue(...)");
                return h00.q.Y0((Collection) objInvoke6, (Collection) objInvoke5);
        }
    }
}
