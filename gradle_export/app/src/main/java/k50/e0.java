package k50;

import java.util.concurrent.atomic.AtomicReference;

public abstract class e0 {
    public static final d0 a = new d0(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(d0 segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        d0 d0Var = a;
        d0 d0Var2 = (d0) atomicReference.getAndSet(d0Var);
        if (d0Var2 == d0Var) {
            return;
        }
        int i = d0Var2 != null ? d0Var2.c : 0;
        if (i >= 65536) {
            atomicReference.set(d0Var2);
            return;
        }
        segment.f = d0Var2;
        segment.b = 0;
        segment.c = i + 8192;
        atomicReference.set(segment);
    }

    public static final d0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        d0 d0Var = a;
        d0 d0Var2 = (d0) atomicReference.getAndSet(d0Var);
        if (d0Var2 == d0Var) {
            return new d0();
        }
        if (d0Var2 == null) {
            atomicReference.set(null);
            return new d0();
        }
        atomicReference.set(d0Var2.f);
        d0Var2.f = null;
        d0Var2.c = 0;
        return d0Var2;
    }
}
