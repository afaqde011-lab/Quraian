package h20;

public final class d extends a2.b {
    public final int B;
    public final c C;

    public d(c cVar, int i) {
        super(1);
        this.B = i;
        this.C = cVar;
    }

    public final void k(String[] strArr) {
        switch (this.B) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.C.B.D = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.C.B.E = strArr;
                return;
        }
    }
}
