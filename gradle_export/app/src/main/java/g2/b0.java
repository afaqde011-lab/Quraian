package g2;

import b3.l0;
import java.util.Comparator;

public final class b0 implements Comparator {
    public static final b0 A = new b0();

    @Override
    public final int compare(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        a0 a0Var2 = (a0) obj2;
        int i10 = 0;
        if (d.r(a0Var) && d.r(a0Var2)) {
            l0 l0VarY = b3.m.y(a0Var);
            l0 l0VarY2 = b3.m.y(a0Var2);
            if (!kotlin.jvm.internal.m.a(l0VarY, l0VarY2)) {
                Object[] objArr = new l0[16];
                int i11 = 0;
                while (l0VarY != null) {
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i11 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i11 + 0);
                    }
                    objArr[0] = l0VarY;
                    i11++;
                    l0VarY = l0VarY.x();
                }
                Object[] objArr3 = new l0[16];
                int i13 = 0;
                while (l0VarY2 != null) {
                    int i14 = i13 + 1;
                    if (objArr3.length < i14) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i13 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i13 + 0);
                    }
                    objArr3[0] = l0VarY2;
                    i13++;
                    l0VarY2 = l0VarY2.x();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.m.a(objArr[i10], objArr3[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return kotlin.jvm.internal.m.f(((l0) objArr[i10]).y(), ((l0) objArr3[i10]).y());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.r(a0Var)) {
                return -1;
            }
            if (d.r(a0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
