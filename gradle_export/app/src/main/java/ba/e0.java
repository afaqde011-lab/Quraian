package ba;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

public final class e0 implements z4.e {
    public final RecyclerView A;

    public e0(RecyclerView recyclerView) {
        this.A = recyclerView;
    }

    @Override
    public void F() {
        this.A.o0();
    }

    public void a(a aVar) {
        int i10 = aVar.f2230a;
        RecyclerView recyclerView = this.A;
        if (i10 == 1) {
            recyclerView.N.Y(aVar.f2231b, aVar.f2233d);
            return;
        }
        if (i10 == 2) {
            recyclerView.N.b0(aVar.f2231b, aVar.f2233d);
        } else if (i10 == 4) {
            recyclerView.N.c0(aVar.f2231b, aVar.f2233d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.N.a0(aVar.f2231b, aVar.f2233d);
        }
    }

    public f1 b(int i10) {
        RecyclerView recyclerView = this.A;
        int iC = recyclerView.F.C();
        f1 f1Var = null;
        for (int i11 = 0; i11 < iC; i11++) {
            f1 f1VarM = RecyclerView.M(recyclerView.F.B(i11));
            if (f1VarM != null && !f1VarM.h() && f1VarM.f2277c == i10) {
                if (!((ArrayList) recyclerView.F.E).contains(f1VarM.f2275a)) {
                    f1Var = f1VarM;
                    break;
                }
                f1Var = f1VarM;
            }
        }
        if (f1Var != null) {
            if (!((ArrayList) recyclerView.F.E).contains(f1Var.f2275a)) {
                return f1Var;
            }
            if (RecyclerView.f1853c1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.A;
        int iC = recyclerView.F.C();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iC; i15++) {
            View viewB = recyclerView.F.B(i15);
            f1 f1VarM = RecyclerView.M(viewB);
            if (f1VarM != null && !f1VarM.o() && (i13 = f1VarM.f2277c) >= i10 && i13 < i14) {
                f1VarM.a(2);
                if (obj == null) {
                    f1VarM.a(1024);
                } else if ((1024 & f1VarM.f2284j) == 0) {
                    if (f1VarM.f2285k == null) {
                        ArrayList arrayList = new ArrayList();
                        f1VarM.f2285k = arrayList;
                        f1VarM.l = Collections.unmodifiableList(arrayList);
                    }
                    f1VarM.f2285k.add(obj);
                }
                ((q0) viewB.getLayoutParams()).f2394c = true;
            }
        }
        v0 v0Var = recyclerView.C;
        ArrayList arrayList2 = (ArrayList) v0Var.f2442f;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            f1 f1Var = (f1) arrayList2.get(size);
            if (f1Var != null && (i12 = f1Var.f2277c) >= i10 && i12 < i14) {
                f1Var.a(2);
                v0Var.k(size);
            }
        }
        recyclerView.K0 = true;
    }

    @Override
    public boolean d(float f3) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.A;
        if (recyclerView.N.e()) {
            i11 = (int) f3;
            i10 = 0;
        } else if (recyclerView.N.d()) {
            i10 = (int) f3;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        recyclerView.o0();
        return recyclerView.I(i10, i11, 0, Integer.MAX_VALUE);
    }

    public void e(int i10, int i11) {
        RecyclerView recyclerView = this.A;
        int iC = recyclerView.F.C();
        for (int i12 = 0; i12 < iC; i12++) {
            f1 f1VarM = RecyclerView.M(recyclerView.F.B(i12));
            if (f1VarM != null && !f1VarM.o() && f1VarM.f2277c >= i10) {
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + f1VarM + " now at position " + (f1VarM.f2277c + i11));
                }
                f1VarM.l(i11, false);
                recyclerView.G0.f2243f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.C.f2442f;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            f1 f1Var = (f1) arrayList.get(i13);
            if (f1Var != null && f1Var.f2277c >= i10) {
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + f1Var + " now at position " + (f1Var.f2277c + i11));
                }
                f1Var.l(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.J0 = true;
    }

    public void f(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.A;
        int iC = recyclerView.F.C();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iC; i20++) {
            f1 f1VarM = RecyclerView.M(recyclerView.F.B(i20));
            if (f1VarM != null && (i18 = f1VarM.f2277c) >= i13 && i18 <= i12) {
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + f1VarM);
                }
                if (f1VarM.f2277c == i10) {
                    f1VarM.l(i11 - i10, false);
                } else {
                    f1VarM.l(i14, false);
                }
                recyclerView.G0.f2243f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.C.f2442f;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            f1 f1Var = (f1) arrayList.get(i21);
            if (f1Var != null && (i17 = f1Var.f2277c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    f1Var.l(i11 - i10, false);
                } else {
                    f1Var.l(i19, false);
                }
                if (RecyclerView.f1853c1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + f1Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.J0 = true;
    }

    @Override
    public float t() {
        float f3;
        RecyclerView recyclerView = this.A;
        if (recyclerView.N.e()) {
            f3 = recyclerView.B0;
        } else {
            if (!recyclerView.N.d()) {
                return 0.0f;
            }
            f3 = recyclerView.A0;
        }
        return -f3;
    }
}
