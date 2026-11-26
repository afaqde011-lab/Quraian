package cs;

import g00.b0;
import java.util.concurrent.atomic.AtomicReference;

public final class o implements d40.j, kotlin.jvm.internal.g {
    public final int A;
    public final Object B;

    public o(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final g00.e b() {
        switch (this.A) {
            case 0:
                return new kotlin.jvm.internal.a(2, 4, p.class, (p) this.B, "setState", "setState(Ljava/lang/Object;)V");
            case 1:
                return new kotlin.jvm.internal.a(2, 4, mb.j.class, (mb.j) this.B, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            default:
                return new kotlin.jvm.internal.a(2, 4, AtomicReference.class, (AtomicReference) this.B, "set", "set(Ljava/lang/Object;)V");
        }
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        int i = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ((p) obj2).i((m) obj);
                l00.a aVar = l00.a.A;
                break;
            case 1:
                ((mb.j) obj2).l((mb.h) obj);
                l00.a aVar2 = l00.a.A;
                break;
            default:
                ((AtomicReference) obj2).set((zj.g) obj);
                l00.a aVar3 = l00.a.A;
                break;
        }
        return b0Var;
    }

    public final boolean equals(Object obj) {
        switch (this.A) {
            case 0:
                if ((obj instanceof d40.j) && (obj instanceof kotlin.jvm.internal.g)) {
                    return b().equals(((kotlin.jvm.internal.g) obj).b());
                }
                return false;
            case 1:
                if ((obj instanceof d40.j) && (obj instanceof kotlin.jvm.internal.g)) {
                    return b().equals(((kotlin.jvm.internal.g) obj).b());
                }
                return false;
            default:
                if ((obj instanceof d40.j) && (obj instanceof kotlin.jvm.internal.g)) {
                    return b().equals(((kotlin.jvm.internal.g) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return b().hashCode();
    }
}
