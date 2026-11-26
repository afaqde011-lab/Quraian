package bc;

import kotlin.NoWhenBranchMatchedException;

public abstract class c {

    public static final wb.c f2479a = new wb.c();

    public static final boolean a(wb.i iVar) throws NoWhenBranchMatchedException {
        int iOrdinal = iVar.f15941g.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return iVar.A.f15905a == null && (iVar.f15956x instanceof xb.c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
