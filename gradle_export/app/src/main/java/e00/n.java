package e00;

import i2.b0;
import java.util.NoSuchElementException;
import u.j0;

public abstract class n {
    public static final me.i a = new me.i(21);

    public static final i2.e a(me.i iVar) {
        Object obj;
        kotlin.jvm.internal.m.e(iVar, "<this>");
        j0 j0Var = (j0) iVar.B;
        if (j0Var.h()) {
            Object[] objArr = j0Var.b;
            long[] jArr = j0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                obj = objArr[(i << 3) + i3];
                                j0Var.l(obj);
                                break loop0;
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
            throw new NoSuchElementException("The ScatterSet is empty");
        }
        obj = null;
        i2.e eVar = (i2.e) obj;
        return eVar == null ? b0.g() : eVar;
    }
}
