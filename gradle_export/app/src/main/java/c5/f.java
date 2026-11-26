package c5;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l9.f0;
import q3.e0;
import z4.j1;
import z4.q0;

public final class f extends f7.e {
    public final HashMap C;
    public final g D;

    public f(g gVar) {
        super(0, 3);
        this.D = gVar;
        this.C = new HashMap();
    }

    @Override
    public final void m(q0 q0Var) {
        ArrayList arrayList = this.D.f2883b;
        if ((((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask() & 519) != 0) {
            this.C.remove(q0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i10 = cVar.f2880e;
                boolean z10 = i10 > 0;
                int i11 = i10 - 1;
                cVar.f2880e = i11;
                if (z10 && i11 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override
    public final void n(q0 q0Var) {
        ArrayList arrayList = this.D.f2883b;
        if ((((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f2880e++;
            }
        }
    }

    @Override
    public final j1 o(j1 j1Var, List list) {
        ArrayList arrayList = this.D.f2883b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i10 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            q0 q0Var = (q0) list.get(size);
            Integer num = (Integer) this.C.get(q0Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float alpha = ((WindowInsetsAnimation) q0Var.f17221a.B).getAlpha();
                if ((iIntValue & 1) != 0) {
                    rectF.left = alpha;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = alpha;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = alpha;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = alpha;
                }
                i10 |= iIntValue;
            }
        }
        q4.b bVarB = q4.b.b(j1Var.f17202a.i(519), j1Var.f17202a.i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            q4.b bVar = cVar.f2879d;
            ArrayList arrayList2 = cVar.f2876a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i11 = aVar.f2859a;
                if ((i11 & i10) != 0) {
                    b bVar2 = aVar.f2860b;
                    if (!bVar2.f2870d) {
                        bVar2.f2870d = true;
                        f0 f0Var = bVar2.f2875i;
                        if (f0Var != null) {
                            ((View) f0Var.C).setVisibility(0);
                        }
                    }
                    if (i11 == 1) {
                        int i12 = bVar.f12755a;
                        if (i12 > 0) {
                            aVar.b(bVarB.f12755a / i12);
                        }
                        aVar.a(rectF.left);
                    } else if (i11 == 2) {
                        int i13 = bVar.f12756b;
                        if (i13 > 0) {
                            aVar.b(bVarB.f12756b / i13);
                        }
                        aVar.a(rectF.top);
                    } else if (i11 == 4) {
                        int i14 = bVar.f12757c;
                        if (i14 > 0) {
                            aVar.b(bVarB.f12757c / i14);
                        }
                        aVar.a(rectF.right);
                    } else if (i11 == 8) {
                        int i15 = bVar.f12758d;
                        if (i15 > 0) {
                            aVar.b(bVarB.f12758d / i15);
                        }
                        aVar.a(rectF.bottom);
                    }
                }
            }
        }
        return j1Var;
    }

    @Override
    public final e0 p(q0 q0Var, e0 e0Var) {
        if ((((WindowInsetsAnimation) q0Var.f17221a.B).getTypeMask() & 519) != 0) {
            q4.b bVar = (q4.b) e0Var.C;
            q4.b bVar2 = (q4.b) e0Var.B;
            int i10 = bVar.f12755a != bVar2.f12755a ? 1 : 0;
            if (bVar.f12756b != bVar2.f12756b) {
                i10 |= 2;
            }
            if (bVar.f12757c != bVar2.f12757c) {
                i10 |= 4;
            }
            if (bVar.f12758d != bVar2.f12758d) {
                i10 |= 8;
            }
            this.C.put(q0Var, Integer.valueOf(i10));
        }
        return e0Var;
    }
}
