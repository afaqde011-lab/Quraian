package androidx.media3.common;

import java.util.Objects;

public final class x {

    public final a8.i0 f1676a;

    public final a8.i0 f1677b;

    public final a8.i0 f1678c;

    public final a8.i0 f1679d;

    public final a8.i0 f1680e;

    public x(final f1 f1Var) {
        Objects.requireNonNull(f1Var);
        final int i10 = 0;
        this.f1676a = new a8.i0(new z1() {
            @Override
            public final long get() {
                int i11 = i10;
                f1 f1Var2 = f1Var;
                switch (i11) {
                    case 0:
                        return f1Var2.getCurrentPosition();
                    case 1:
                        return f1Var2.getBufferedPosition();
                    case 2:
                        return f1Var2.getContentPosition();
                    case 3:
                        return f1Var2.getContentBufferedPosition();
                    default:
                        return f1Var2.getTotalBufferedDuration();
                }
            }
        });
        final int i11 = 1;
        this.f1677b = new a8.i0(new z1() {
            @Override
            public final long get() {
                int i12 = i11;
                f1 f1Var2 = f1Var;
                switch (i12) {
                    case 0:
                        return f1Var2.getCurrentPosition();
                    case 1:
                        return f1Var2.getBufferedPosition();
                    case 2:
                        return f1Var2.getContentPosition();
                    case 3:
                        return f1Var2.getContentBufferedPosition();
                    default:
                        return f1Var2.getTotalBufferedDuration();
                }
            }
        });
        final int i12 = 2;
        this.f1678c = new a8.i0(new z1() {
            @Override
            public final long get() {
                int i13 = i12;
                f1 f1Var2 = f1Var;
                switch (i13) {
                    case 0:
                        return f1Var2.getCurrentPosition();
                    case 1:
                        return f1Var2.getBufferedPosition();
                    case 2:
                        return f1Var2.getContentPosition();
                    case 3:
                        return f1Var2.getContentBufferedPosition();
                    default:
                        return f1Var2.getTotalBufferedDuration();
                }
            }
        });
        final int i13 = 3;
        this.f1679d = new a8.i0(new z1() {
            @Override
            public final long get() {
                int i14 = i13;
                f1 f1Var2 = f1Var;
                switch (i14) {
                    case 0:
                        return f1Var2.getCurrentPosition();
                    case 1:
                        return f1Var2.getBufferedPosition();
                    case 2:
                        return f1Var2.getContentPosition();
                    case 3:
                        return f1Var2.getContentBufferedPosition();
                    default:
                        return f1Var2.getTotalBufferedDuration();
                }
            }
        });
        final int i14 = 4;
        this.f1680e = new a8.i0(new z1() {
            @Override
            public final long get() {
                int i15 = i14;
                f1 f1Var2 = f1Var;
                switch (i15) {
                    case 0:
                        return f1Var2.getCurrentPosition();
                    case 1:
                        return f1Var2.getBufferedPosition();
                    case 2:
                        return f1Var2.getContentPosition();
                    case 3:
                        return f1Var2.getContentBufferedPosition();
                    default:
                        return f1Var2.getTotalBufferedDuration();
                }
            }
        });
    }
}
