package z;

import org.json.JSONObject;

public final class b extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final Object D;

    public b(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
    }

    public b(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b((f0.i) this.C, (f0.f) this.D, cVar, 0);
            case 1:
                return new b((f0.i) this.C, (f0.g) this.D, cVar, 1);
            case 2:
                return new b((zc.c) this.D, cVar, 2);
            case 3:
                b bVar = new b((zj.c) this.D, cVar, 3);
                bVar.C = obj;
                return bVar;
            default:
                return new b((zy.p) this.C, (Throwable) this.D, cVar, 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((JSONObject) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: z.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
