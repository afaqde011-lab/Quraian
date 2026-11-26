package d40;

import kotlinx.coroutines.flow.internal.AbortFlowException;

public final class i0 implements j {
    public final int A;
    public final kotlin.jvm.internal.z B;

    public i0(kotlin.jvm.internal.z zVar, int i) {
        this.A = i;
        this.B = zVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                this.B.A = obj;
                throw new AbortFlowException(this);
            default:
                this.B.A = obj;
                throw new AbortFlowException(this);
        }
    }
}
