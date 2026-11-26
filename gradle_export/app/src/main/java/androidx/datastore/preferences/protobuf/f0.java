package androidx.datastore.preferences.protobuf;

public final class f0 {

    public final e0 f604a;

    public f0(p1 p1Var, p1 p1Var2, s5.h hVar) {
        this.f604a = new e0(p1Var, p1Var2, hVar);
    }

    public static int a(e0 e0Var, Object obj, Object obj2) {
        int iX;
        int size;
        int iW;
        int i10;
        p1 p1Var;
        int iV;
        int size2;
        int iW2;
        p1 p1Var2 = e0Var.f600a;
        int i11 = q.f669c;
        int iX2 = 1;
        int iV2 = l.V(1);
        m1 m1Var = p1.D;
        if (p1Var2 == m1Var) {
            iV2 *= 2;
        }
        switch (p1Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iX = 8;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue >> 31) ^ (iIntValue << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue >> 63) ^ (jLongValue << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iX = 4;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iX = l.X(((Long) obj).longValue());
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iX = l.X(((Long) obj).longValue());
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iX = l.X(((Integer) obj).intValue());
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iX = 8;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iX = 4;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iX = 1;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof g) {
                    size = ((g) obj).size();
                    iW = l.W(size);
                    iX = size + iW;
                } else {
                    iX = l.U((String) obj);
                }
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iX = ((v) ((a) obj)).a(null);
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((v) ((a) obj)).a(null);
                iW = l.W(size);
                iX = size + iW;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof g) {
                    size = ((g) obj).size();
                    iW = l.W(size);
                } else {
                    size = ((byte[]) obj).length;
                    iW = l.W(size);
                }
                iX = size + iW;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iX = l.W(((Integer) obj).intValue());
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iX = l.X(((Integer) obj).intValue());
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iX = 4;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iX = 8;
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iX = l.W((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iX = l.X((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i10 = iX + iV2;
                p1Var = e0Var.f601b;
                iV = l.V(2);
                if (p1Var == m1Var) {
                    iV *= 2;
                }
                switch (p1Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 1:
                        ((Float) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 2:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 3:
                        iX2 = l.X(((Long) obj2).longValue());
                        return iX2 + iV + i10;
                    case 4:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 5:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 6:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iX2 + iV + i10;
                    case 8:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                            iX2 = iW2 + size2;
                        } else {
                            iX2 = l.U((String) obj2);
                        }
                        return iX2 + iV + i10;
                    case 9:
                        iX2 = ((v) ((a) obj2)).a(null);
                        return iX2 + iV + i10;
                    case 10:
                        size2 = ((v) ((a) obj2)).a(null);
                        iW2 = l.W(size2);
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 11:
                        if (obj2 instanceof g) {
                            size2 = ((g) obj2).size();
                            iW2 = l.W(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iW2 = l.W(size2);
                        }
                        iX2 = iW2 + size2;
                        return iX2 + iV + i10;
                    case 12:
                        iX2 = l.W(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 13:
                        iX2 = l.X(((Integer) obj2).intValue());
                        return iX2 + iV + i10;
                    case 14:
                        ((Integer) obj2).getClass();
                        iX2 = 4;
                        return iX2 + iV + i10;
                    case 15:
                        ((Long) obj2).getClass();
                        iX2 = 8;
                        return iX2 + iV + i10;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iX2 = l.W((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iX2 + iV + i10;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iX2 = l.X((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iX2 + iV + i10;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
