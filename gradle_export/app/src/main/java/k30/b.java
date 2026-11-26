package k30;

public final class b extends h00.c {
    public int C = -1;
    public final c D;

    public b(c cVar) {
        this.D = cVar;
    }

    @Override
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.C + 1;
            this.C = i;
            objArr = this.D.A;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.A = 2;
            return;
        }
        Object obj = objArr[i];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.B = obj;
        this.A = 1;
    }
}
