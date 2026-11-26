package w;

import java.util.List;

public final class o implements z2.w0 {

    public final v f15798a;

    public o(v vVar) {
        this.f15798a = vVar;
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((z2.v0) list.get(0)).f0(i10));
            int iM = va.a.M(list);
            int i11 = 1;
            if (1 <= iM) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z2.v0) list.get(i11)).f0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((z2.v0) list.get(0)).s(i10));
            int iM = va.a.M(list);
            int i11 = 1;
            if (1 <= iM) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z2.v0) list.get(i11)).s(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((z2.v0) list.get(0)).d(i10));
            int iM = va.a.M(list);
            int i11 = 1;
            if (1 <= iM) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z2.v0) list.get(i11)).d(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((z2.v0) list.get(0)).D(i10));
            int iM = va.a.M(list);
            int i11 = 1;
            if (1 <= iM) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((z2.v0) list.get(i11)).D(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iM) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        z2.l1 l1Var;
        int i10;
        z2.l1 l1Var2;
        int i11;
        int i12;
        int size = list.size();
        z2.l1[] l1VarArr = new z2.l1[size];
        int size2 = list.size();
        long j10 = 0;
        int i13 = 0;
        while (true) {
            l1Var = null;
            i10 = 1;
            if (i13 >= size2) {
                break;
            }
            z2.v0 v0Var = (z2.v0) list.get(i13);
            Object objU = v0Var.U();
            q qVar = objU instanceof q ? (q) objU : null;
            if (qVar != null && ((Boolean) qVar.A.getValue()).booleanValue()) {
                z2.l1 l1VarO = v0Var.O(j9);
                long j11 = (((long) l1VarO.B) & 4294967295L) | (((long) l1VarO.A) << 32);
                l1VarArr[i13] = l1VarO;
                j10 = j11;
            }
            i13++;
        }
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            z2.v0 v0Var2 = (z2.v0) list.get(i14);
            if (l1VarArr[i14] == null) {
                l1VarArr[i14] = v0Var2.O(j9);
            }
        }
        if (y0Var.w0()) {
            i11 = (int) (j10 >> 32);
        } else {
            if (size != 0) {
                l1Var2 = l1VarArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = l1Var2 != null ? l1Var2.A : 0;
                    if (1 <= i15) {
                        int i17 = 1;
                        while (true) {
                            z2.l1 l1Var3 = l1VarArr[i17];
                            int i18 = l1Var3 != null ? l1Var3.A : 0;
                            if (i16 < i18) {
                                l1Var2 = l1Var3;
                                i16 = i18;
                            }
                            if (i17 == i15) {
                                break;
                            }
                            i17++;
                        }
                    }
                }
            } else {
                l1Var2 = null;
            }
            i11 = l1Var2 != null ? l1Var2.A : 0;
        }
        if (y0Var.w0()) {
            i12 = (int) (j10 & 4294967295L);
        } else {
            if (size != 0) {
                l1Var = l1VarArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    int i20 = l1Var != null ? l1Var.B : 0;
                    if (1 <= i19) {
                        while (true) {
                            z2.l1 l1Var4 = l1VarArr[i10];
                            int i21 = l1Var4 != null ? l1Var4.B : 0;
                            if (i20 < i21) {
                                l1Var = l1Var4;
                                i20 = i21;
                            }
                            if (i10 == i19) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            i12 = l1Var != null ? l1Var.B : 0;
        }
        if (!y0Var.w0()) {
            this.f15798a.f15814c.setValue(new y3.l((((long) i11) << 32) | (((long) i12) & 4294967295L)));
        }
        return y0Var.o0(i11, i12, h00.y.A, new n(l1VarArr, this, i11, i12));
    }
}
