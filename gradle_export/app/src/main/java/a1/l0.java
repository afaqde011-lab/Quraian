package a1;

import com.google.protobuf.RuntimeVersion;

public final class l0 implements u00.k {
    public final int A;
    public final kotlin.jvm.internal.x B;
    public final kotlin.jvm.internal.x C;

    public l0(kotlin.jvm.internal.x xVar, kotlin.jvm.internal.x xVar2, int i10) {
        this.A = i10;
        this.B = xVar;
        this.C = xVar2;
    }

    public final Object invoke(Object obj) {
        r30.h hVar = (r30.h) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.x xVar = this.B;
                if (xVar.A == -1) {
                    xVar.A = ((z00.c) hVar.b()).A;
                }
                this.C.A = ((z00.c) hVar.b()).B + 1;
                break;
            default:
                kotlin.jvm.internal.x xVar2 = this.B;
                if (xVar2.A == -1) {
                    xVar2.A = ((z00.c) hVar.b()).A;
                }
                this.C.A = ((z00.c) hVar.b()).B + 1;
                break;
        }
        return RuntimeVersion.SUFFIX;
    }
}
