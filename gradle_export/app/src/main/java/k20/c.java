package k20;

import o20.p;

public final class c extends d {
    public final p[] d;

    public c(int i, p[] pVarArr) {
        if (pVarArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int i2 = 1;
        int length = pVarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            throw new IllegalStateException("Empty enum: " + pVarArr.getClass());
        }
        super(i, i2, 0, (byte) 0);
        this.d = pVarArr;
    }

    @Override
    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (p pVar : this.d) {
            if (pVar.getNumber() == i4) {
                return pVar;
            }
        }
        return null;
    }
}
