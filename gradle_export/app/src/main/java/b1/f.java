package b1;

public final class f extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final long C;
    public Object D;

    public f(long j9, Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = j9;
        this.D = obj;
    }

    public f(long j9, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.C = j9;
    }

    public f(Object obj, long j9, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.C = j9;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f((h) this.D, this.C, cVar, 0);
            case 1:
                return new f((b4.j) this.D, this.C, cVar, 1);
            case 2:
                return new f((x.b) this.D, this.C, cVar, 2);
            case 3:
                f fVar = new f(this.C, cVar);
                fVar.D = obj;
                return fVar;
            case 4:
                return new f(this.C, (no.n) this.D, cVar, 4);
            case 5:
                return new f((uu.w) this.D, this.C, cVar, 5);
            default:
                return new f(this.C, (v2.i0) this.D, cVar, 6);
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
                create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: b1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
