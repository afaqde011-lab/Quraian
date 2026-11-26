package v5;

import android.util.SparseArray;

public final class o {

    public final SparseArray f15475a;

    public r f15476b;

    public o(int i10) {
        this.f15475a = new SparseArray(i10);
    }

    public final void a(r rVar, int i10, int i11) {
        int iA = rVar.a(i10);
        SparseArray sparseArray = this.f15475a;
        o oVar = sparseArray == null ? null : (o) sparseArray.get(iA);
        if (oVar == null) {
            oVar = new o(1);
            sparseArray.put(rVar.a(i10), oVar);
        }
        if (i11 > i10) {
            oVar.a(rVar, i10 + 1, i11);
        } else {
            oVar.f15476b = rVar;
        }
    }
}
