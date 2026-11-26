package ix;

import a40.z;
import g00.b0;
import ri.t1;

public final class l extends m00.i implements u00.n {
    public final int A;
    public final String B;
    public final z0.g C;

    public l(String str, z0.g gVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = str;
        this.C = gVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l(this.B, this.C, cVar, 0);
            case 1:
                return new l(this.B, this.C, cVar, 1);
            default:
                return new l(this.B, this.C, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                l lVar = (l) create(zVar, cVar);
                b0 b0Var = b0.a;
                lVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                l lVar2 = (l) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                lVar2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                l lVar3 = (l) create(zVar, cVar);
                b0 b0Var3 = b0.a;
                lVar3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        z0.g gVar = this.C;
        String str = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (!kotlin.jvm.internal.m.a(str, gVar.d().C.toString())) {
                    z0.a aVarG = gVar.g();
                    try {
                        aVarG.c(0, aVarG.B.length(), str);
                        gVar.b(aVarG);
                    } finally {
                        gVar.c();
                    }
                }
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (!kotlin.jvm.internal.m.a(str, gVar.d().C.toString())) {
                    z0.a aVarG2 = gVar.g();
                    try {
                        aVarG2.c(0, aVarG2.B.length(), str);
                        gVar.b(aVarG2);
                    } finally {
                        gVar.c();
                    }
                }
                return b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (!kotlin.jvm.internal.m.a(str, gVar.d().C.toString())) {
                    z0.a aVarG3 = gVar.g();
                    try {
                        aVarG3.c(0, aVarG3.B.length(), str);
                        gVar.b(aVarG3);
                    } finally {
                        gVar.c();
                    }
                }
                return b0Var;
        }
    }
}
