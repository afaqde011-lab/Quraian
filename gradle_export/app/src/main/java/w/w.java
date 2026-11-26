package w;

import java.util.ArrayList;
import java.util.List;

public final class w implements z2.w0 {

    public final e0 f15816a;

    public boolean f15817b;

    public w(e0 e0Var) {
        this.f15816a = e0Var;
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF0 = ((z2.v0) list.get(0)).f0(i10);
        int iM = va.a.M(list);
        int i11 = 1;
        if (1 <= iM) {
            while (true) {
                int iF1 = ((z2.v0) list.get(i11)).f0(i10);
                if (iF1 > iF0) {
                    iF0 = iF1;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        }
        return iF0;
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iS = ((z2.v0) list.get(0)).s(i10);
        int iM = va.a.M(list);
        int i11 = 1;
        if (1 <= iM) {
            while (true) {
                int iS2 = ((z2.v0) list.get(i11)).s(i10);
                if (iS2 > iS) {
                    iS = iS2;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        }
        return iS;
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((z2.v0) list.get(0)).d(i10);
        int iM = va.a.M(list);
        int i11 = 1;
        if (1 <= iM) {
            while (true) {
                int iD2 = ((z2.v0) list.get(i11)).d(i10);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        }
        return iD;
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((z2.v0) list.get(0)).D(i10);
        int iM = va.a.M(list);
        int i11 = 1;
        if (1 <= iM) {
            while (true) {
                int iD2 = ((z2.v0) list.get(i11)).D(i10);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        }
        return iD;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            z2.l1 l1VarO = ((z2.v0) list.get(i10)).O(j9);
            iMax = Math.max(iMax, l1VarO.A);
            iMax2 = Math.max(iMax2, l1VarO.B);
            arrayList.add(l1VarO);
        }
        boolean zW0 = y0Var.w0();
        e0 e0Var = this.f15816a;
        if (zW0) {
            this.f15817b = true;
            e0Var.f15755b.setValue(new y3.l((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f15817b) {
            e0Var.f15755b.setValue(new y3.l((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return y0Var.o0(iMax, iMax2, h00.y.A, new g(arrayList, 1));
    }
}
