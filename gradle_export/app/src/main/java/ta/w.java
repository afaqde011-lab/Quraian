package ta;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public t A;
    public ViewGroup B;

    @Override
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i10;
        p10.a aVar;
        p10.a aVar2;
        u.e eVar;
        u.e eVar2;
        int i11;
        int[] iArr;
        boolean z10;
        int i12;
        int i13;
        u.e eVarS;
        ArrayList arrayList2;
        int i14;
        int i15;
        q qVar;
        int i16;
        t tVar;
        Animator animator;
        o oVar;
        a0 a0Var;
        a0 a0Var2;
        int i17;
        boolean z11;
        int i18;
        int i19;
        View view;
        a0 a0Var3;
        u.e eVar3;
        int i20;
        int i21;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i22;
        View view4;
        View view5;
        u.q qVar2;
        int iG;
        int i23;
        View view6;
        boolean z12;
        int i24;
        Iterator it;
        t tVar2 = this.A;
        ViewGroup viewGroup = this.B;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z13 = true;
        if (!x.f14501c.remove(viewGroup)) {
            return true;
        }
        u.e eVarB = x.b();
        ArrayList arrayList3 = (ArrayList) eVarB.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(tVar2);
            tVar2.a(new v(this, eVarB));
            i10 = 0;
            tVar2.h(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).F(viewGroup);
                }
            }
            tVar2.K = new ArrayList();
            tVar2.L = new ArrayList();
            aVar = tVar2.G;
            aVar2 = tVar2.H;
            eVar = new u.e((u.e) aVar.A);
            eVar2 = new u.e((u.e) aVar2.A);
            i11 = 0;
            while (true) {
                iArr = tVar2.J;
                if (i11 < iArr.length) {
                    break;
                }
                i17 = iArr[i11];
                if (i17 != z13) {
                    z11 = z13;
                    i18 = i11;
                    for (i19 = eVar.C - 1; i19 >= 0; i19--) {
                        view = (View) eVar.g(i19);
                        if (view == null && tVar2.y(view) && (a0Var3 = (a0) eVar2.remove(view)) != null && tVar2.y(a0Var3.f14426b)) {
                            tVar2.K.add((a0) eVar.h(i19));
                            tVar2.L.add(a0Var3);
                        }
                    }
                } else if (i17 != 2) {
                    z11 = z13;
                    i18 = i11;
                    eVar3 = (u.e) aVar.D;
                    u.e eVar4 = (u.e) aVar2.D;
                    i20 = eVar3.C;
                    for (i21 = 0; i21 < i20; i21++) {
                        view2 = (View) eVar3.j(i21);
                        if (view2 == null && tVar2.y(view2) && (view3 = (View) eVar4.get((String) eVar3.g(i21))) != null && tVar2.y(view3)) {
                            a0 a0Var4 = (a0) eVar.get(view2);
                            a0 a0Var5 = (a0) eVar2.get(view3);
                            if (a0Var4 != null && a0Var5 != null) {
                                tVar2.K.add(a0Var4);
                                tVar2.L.add(a0Var5);
                                eVar.remove(view2);
                                eVar2.remove(view3);
                            }
                        }
                    }
                } else if (i17 != 3) {
                    if (i17 == 4) {
                        qVar2 = (u.q) aVar.C;
                        u.q qVar3 = (u.q) aVar2.C;
                        iG = qVar2.g();
                        i23 = i10;
                        while (i23 < iG) {
                            view6 = (View) qVar2.h(i23);
                            if (view6 == null && tVar2.y(view6)) {
                                i24 = i11;
                                View view7 = (View) qVar3.b(qVar2.d(i23));
                                if (view7 == null || !tVar2.y(view7)) {
                                    z12 = z13;
                                } else {
                                    a0 a0Var6 = (a0) eVar.get(view6);
                                    z12 = z13;
                                    a0 a0Var7 = (a0) eVar2.get(view7);
                                    if (a0Var6 != null && a0Var7 != null) {
                                        tVar2.K.add(a0Var6);
                                        tVar2.L.add(a0Var7);
                                        eVar.remove(view6);
                                        eVar2.remove(view7);
                                    }
                                }
                            } else {
                                z12 = z13;
                                i24 = i11;
                            }
                            i23++;
                            i11 = i24;
                            z13 = z12;
                        }
                    }
                    z11 = z13;
                    i18 = i11;
                } else {
                    z11 = z13;
                    i18 = i11;
                    sparseArray = (SparseArray) aVar.B;
                    SparseArray sparseArray2 = (SparseArray) aVar2.B;
                    size = sparseArray.size();
                    for (i22 = 0; i22 < size; i22++) {
                        view4 = (View) sparseArray.valueAt(i22);
                        if (view4 == null && tVar2.y(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i22))) != null && tVar2.y(view5)) {
                            a0 a0Var8 = (a0) eVar.get(view4);
                            a0 a0Var9 = (a0) eVar2.get(view5);
                            if (a0Var8 != null && a0Var9 != null) {
                                tVar2.K.add(a0Var8);
                                tVar2.L.add(a0Var9);
                                eVar.remove(view4);
                                eVar2.remove(view5);
                            }
                        }
                    }
                }
                i11 = i18 + 1;
                z13 = z11;
                i10 = 0;
            }
            z10 = z13;
            for (i12 = 0; i12 < eVar.C; i12++) {
                a0Var2 = (a0) eVar.j(i12);
                if (tVar2.y(a0Var2.f14426b)) {
                    tVar2.K.add(a0Var2);
                    tVar2.L.add(null);
                }
            }
            for (i13 = 0; i13 < eVar2.C; i13++) {
                a0Var = (a0) eVar2.j(i13);
                if (tVar2.y(a0Var.f14426b)) {
                    tVar2.L.add(a0Var);
                    tVar2.K.add(null);
                }
            }
            eVarS = t.s();
            int i25 = eVarS.C;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i14 = i25 - 1;
            while (i14 >= 0) {
                animator = (Animator) eVarS.g(i14);
                if (animator == null && (oVar = (o) eVarS.get(animator)) != null) {
                    t tVar3 = oVar.f14477e;
                    View view8 = oVar.f14473a;
                    if (view8 != null && windowId.equals(oVar.f14476d)) {
                        a0 a0Var10 = oVar.f14475c;
                        boolean z14 = z10;
                        a0 a0VarU = tVar2.u(view8, z14);
                        a0 a0VarP = tVar2.p(view8, z14);
                        if (a0VarU == null && a0VarP == null) {
                            a0VarP = (a0) ((u.e) tVar2.H.A).get(view8);
                        }
                        if ((a0VarU != null || a0VarP != null) && tVar3.x(a0Var10, a0VarP)) {
                            t tVarQ = tVar3.q();
                            ArrayList arrayList4 = tVar3.N;
                            if (tVarQ.Y != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                eVarS.h(i14);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(tVar3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                eVarS.h(i14);
                            }
                        }
                    }
                }
                i14--;
                z10 = true;
            }
            for (i15 = 0; i15 < arrayList2.size(); i15++) {
                tVar = (t) arrayList2.get(i15);
                tVar.A(tVar, s.f14490u, false);
                if (!tVar.R) {
                    tVar.R = true;
                    tVar.A(tVar, s.f14489t, false);
                }
            }
            tVar2.n(viewGroup, tVar2.G, tVar2.H, tVar2.K, tVar2.L);
            if (tVar2.Y == null) {
                tVar2.G();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            tVar2.C();
            q qVar4 = tVar2.Y;
            z zVar = qVar4.f14487h;
            long j9 = zVar.X == 0 ? 1L : 0L;
            zVar.H(j9, qVar4.f14480a);
            qVar4.f14480a = j9;
            qVar = tVar2.Y;
            qVar.f14481b = true;
            i16 = qVar.f14483d;
            if (i16 == 1) {
                qVar.f14483d = 0;
                qVar.g();
                return true;
            }
            if (i16 == 2) {
                return true;
            }
            qVar.f14483d = 0;
            qVar.f14486g = qVar.f14486g;
            qVar.h();
            qVar.f14484e.a(0.0f);
            return true;
        }
        arrayList3 = new ArrayList();
        eVarB.put(viewGroup, arrayList3);
        arrayList3.add(tVar2);
        tVar2.a(new v(this, eVarB));
        i10 = 0;
        tVar2.h(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).F(viewGroup);
            }
        }
        tVar2.K = new ArrayList();
        tVar2.L = new ArrayList();
        aVar = tVar2.G;
        aVar2 = tVar2.H;
        eVar = new u.e((u.e) aVar.A);
        eVar2 = new u.e((u.e) aVar2.A);
        i11 = 0;
        while (true) {
            iArr = tVar2.J;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i17 = iArr[i11];
            if (i17 != z13) {
                z11 = z13;
                i18 = i11;
                while (i19 >= 0) {
                    view = (View) eVar.g(i19);
                    if (view == null) {
                    }
                }
            } else if (i17 != 2) {
                z11 = z13;
                i18 = i11;
                eVar3 = (u.e) aVar.D;
                u.e eVar5 = (u.e) aVar2.D;
                i20 = eVar3.C;
                while (i21 < i20) {
                    view2 = (View) eVar3.j(i21);
                    if (view2 == null) {
                    }
                }
            } else if (i17 != 3) {
                if (i17 == 4) {
                    qVar2 = (u.q) aVar.C;
                    u.q qVar5 = (u.q) aVar2.C;
                    iG = qVar2.g();
                    i23 = i10;
                    while (i23 < iG) {
                        view6 = (View) qVar2.h(i23);
                        if (view6 == null) {
                            z12 = z13;
                            i24 = i11;
                        } else {
                            z12 = z13;
                            i24 = i11;
                        }
                        i23++;
                        i11 = i24;
                        z13 = z12;
                    }
                }
                z11 = z13;
                i18 = i11;
            } else {
                z11 = z13;
                i18 = i11;
                sparseArray = (SparseArray) aVar.B;
                SparseArray sparseArray3 = (SparseArray) aVar2.B;
                size = sparseArray.size();
                while (i22 < size) {
                    view4 = (View) sparseArray.valueAt(i22);
                    if (view4 == null) {
                    }
                }
            }
            i11 = i18 + 1;
            z13 = z11;
            i10 = 0;
        }
        z10 = z13;
        while (i12 < eVar.C) {
            a0Var2 = (a0) eVar.j(i12);
            if (tVar2.y(a0Var2.f14426b)) {
                tVar2.K.add(a0Var2);
                tVar2.L.add(null);
            }
        }
        while (i13 < eVar2.C) {
            a0Var = (a0) eVar2.j(i13);
            if (tVar2.y(a0Var.f14426b)) {
                tVar2.L.add(a0Var);
                tVar2.K.add(null);
            }
        }
        eVarS = t.s();
        int i26 = eVarS.C;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i14 = i26 - 1;
        while (i14 >= 0) {
            animator = (Animator) eVarS.g(i14);
            if (animator == null) {
            }
            i14--;
            z10 = true;
        }
        while (i15 < arrayList2.size()) {
            tVar = (t) arrayList2.get(i15);
            tVar.A(tVar, s.f14490u, false);
            if (!tVar.R) {
                tVar.R = true;
                tVar.A(tVar, s.f14489t, false);
            }
        }
        tVar2.n(viewGroup, tVar2.G, tVar2.H, tVar2.K, tVar2.L);
        if (tVar2.Y == null) {
            tVar2.G();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        tVar2.C();
        q qVar6 = tVar2.Y;
        z zVar2 = qVar6.f14487h;
        if (zVar2.X == 0) {
        }
        zVar2.H(j9, qVar6.f14480a);
        qVar6.f14480a = j9;
        qVar = tVar2.Y;
        qVar.f14481b = true;
        i16 = qVar.f14483d;
        if (i16 == 1) {
            qVar.f14483d = 0;
            qVar.g();
            return true;
        }
        if (i16 == 2) {
            return true;
        }
        qVar.f14483d = 0;
        qVar.f14486g = qVar.f14486g;
        qVar.h();
        qVar.f14484e.a(0.0f);
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.B;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        x.f14501c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) x.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).F(viewGroup);
            }
        }
        this.A.j(true);
    }
}
