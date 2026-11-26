package ta;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import z4.j0;

public abstract class t implements Cloneable {

    public static final Animator[] f14493a0 = new Animator[0];

    public static final int[] f14494b0 = {2, 1, 3, 4};

    public static final rp.m f14495c0 = new rp.m(2);

    public static final ThreadLocal f14496d0 = new ThreadLocal();
    public ArrayList K;
    public ArrayList L;
    public r[] M;
    public w50.c V;
    public long X;
    public q Y;
    public long Z;
    public final String A = getClass().getName();
    public long B = -1;
    public long C = -1;
    public TimeInterpolator D = null;
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public p10.a G = new p10.a(9);
    public p10.a H = new p10.a(9);
    public z I = null;
    public final int[] J = f14494b0;
    public final ArrayList N = new ArrayList();
    public Animator[] O = f14493a0;
    public int P = 0;
    public boolean Q = false;
    public boolean R = false;
    public t S = null;
    public ArrayList T = null;
    public ArrayList U = new ArrayList();
    public rp.m W = f14495c0;

    public static void c(p10.a aVar, View view, a0 a0Var) {
        u.e eVar = (u.e) aVar.A;
        u.e eVar2 = (u.e) aVar.D;
        SparseArray sparseArray = (SparseArray) aVar.B;
        u.q qVar = (u.q) aVar.C;
        eVar.put(view, a0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = j0.f17198a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (eVar2.containsKey(transitionName)) {
                eVar2.put(transitionName, null);
            } else {
                eVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (qVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    qVar.e(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) qVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    qVar.e(null, itemIdAtPosition);
                }
            }
        }
    }

    public static u.e s() {
        ThreadLocal threadLocal = f14496d0;
        u.e eVar = (u.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        u.e eVar2 = new u.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean z(a0 a0Var, a0 a0Var2, String str) {
        Object obj = a0Var.f14425a.get(str);
        Object obj2 = a0Var2.f14425a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(t tVar, s sVar, boolean z10) {
        t tVar2 = this.S;
        if (tVar2 != null) {
            tVar2.A(tVar, sVar, z10);
        }
        ArrayList arrayList = this.T;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.T.size();
        r[] rVarArr = this.M;
        if (rVarArr == null) {
            rVarArr = new r[size];
        }
        this.M = null;
        r[] rVarArr2 = (r[]) this.T.toArray(rVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            sVar.c(rVarArr2[i10], tVar, z10);
            rVarArr2[i10] = null;
        }
        this.M = rVarArr2;
    }

    public void B(View view) {
        if (this.R) {
            return;
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = f14493a0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.O = animatorArr;
        A(this, s.f14491v, false);
        this.Q = true;
    }

    public void C() {
        u.e eVarS = s();
        this.X = 0L;
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            Animator animator = (Animator) this.U.get(i10);
            o oVar = (o) eVarS.get(animator);
            if (animator != null && oVar != null) {
                Animator animator2 = oVar.f14478f;
                long j9 = this.C;
                if (j9 >= 0) {
                    animator2.setDuration(j9);
                }
                long j10 = this.B;
                if (j10 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j10);
                }
                TimeInterpolator timeInterpolator = this.D;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.N.add(animator);
                this.X = Math.max(this.X, animator.getTotalDuration());
            }
        }
        this.U.clear();
    }

    public t D(r rVar) {
        t tVar;
        ArrayList arrayList = this.T;
        if (arrayList != null) {
            if (!arrayList.remove(rVar) && (tVar = this.S) != null) {
                tVar.D(rVar);
            }
            if (this.T.size() == 0) {
                this.T = null;
            }
        }
        return this;
    }

    public void E(View view) {
        this.F.remove(view);
    }

    public void F(View view) {
        if (this.Q) {
            if (!this.R) {
                ArrayList arrayList = this.N;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
                this.O = f14493a0;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.O = animatorArr;
                A(this, s.f14492w, false);
            }
            this.Q = false;
        }
    }

    public void G() {
        O();
        u.e eVarS = s();
        for (Animator animator : this.U) {
            if (eVarS.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new n(this, eVarS));
                    long j9 = this.C;
                    if (j9 >= 0) {
                        animator.setDuration(j9);
                    }
                    long j10 = this.B;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.D;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new cg.b(this, 5));
                    animator.start();
                }
            }
        }
        this.U.clear();
        o();
    }

    public void H(long j9, long j10) {
        long j11 = this.X;
        int i10 = 0;
        boolean z10 = j9 < j10;
        if ((j10 < 0 && j9 >= 0) || (j10 > j11 && j9 <= j11)) {
            this.R = false;
            A(this, s.f14488s, z10);
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = f14493a0;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j9), animator.getTotalDuration()));
            i10++;
            j11 = j11;
        }
        long j12 = j11;
        this.O = animatorArr;
        if ((j9 <= j12 || j10 > j12) && (j9 >= 0 || j10 < 0)) {
            return;
        }
        if (j9 > j12) {
            this.R = true;
        }
        A(this, s.f14489t, z10);
    }

    public void I(long j9) {
        this.C = j9;
    }

    public void J(w50.c cVar) {
        this.V = cVar;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.D = timeInterpolator;
    }

    public void L(rp.m mVar) {
        if (mVar == null) {
            this.W = f14495c0;
        } else {
            this.W = mVar;
        }
    }

    public void M() {
    }

    public void N(long j9) {
        this.B = j9;
    }

    public final void O() {
        if (this.P == 0) {
            A(this, s.f14488s, false);
            this.R = false;
        }
        this.P++;
    }

    public String P(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.C != -1) {
            sb2.append("dur(");
            sb2.append(this.C);
            sb2.append(") ");
        }
        if (this.B != -1) {
            sb2.append("dly(");
            sb2.append(this.B);
            sb2.append(") ");
        }
        if (this.D != null) {
            sb2.append("interp(");
            sb2.append(this.D);
            sb2.append(") ");
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.F;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(r rVar) {
        if (this.T == null) {
            this.T = new ArrayList();
        }
        this.T.add(rVar);
    }

    public void b(View view) {
        this.F.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.O);
        this.O = f14493a0;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.O = animatorArr;
        A(this, s.f14490u, false);
    }

    public abstract void d(a0 a0Var);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            a0 a0Var = new a0(view);
            if (z10) {
                g(a0Var);
            } else {
                d(a0Var);
            }
            a0Var.f14427c.add(this);
            f(a0Var);
            if (z10) {
                c(this.G, view, a0Var);
            } else {
                c(this.H, view, a0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void f(a0 a0Var) {
    }

    public abstract void g(a0 a0Var);

    public final void h(ViewGroup viewGroup, boolean z10) {
        j(z10);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.F;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                a0 a0Var = new a0(viewFindViewById);
                if (z10) {
                    g(a0Var);
                } else {
                    d(a0Var);
                }
                a0Var.f14427c.add(this);
                f(a0Var);
                if (z10) {
                    c(this.G, viewFindViewById, a0Var);
                } else {
                    c(this.H, viewFindViewById, a0Var);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            a0 a0Var2 = new a0(view);
            if (z10) {
                g(a0Var2);
            } else {
                d(a0Var2);
            }
            a0Var2.f14427c.add(this);
            f(a0Var2);
            if (z10) {
                c(this.G, view, a0Var2);
            } else {
                c(this.H, view, a0Var2);
            }
        }
    }

    public final void j(boolean z10) {
        if (z10) {
            ((u.e) this.G.A).clear();
            ((SparseArray) this.G.B).clear();
            ((u.q) this.G.C).a();
        } else {
            ((u.e) this.H.A).clear();
            ((SparseArray) this.H.B).clear();
            ((u.q) this.H.C).a();
        }
    }

    @Override
    public t clone() {
        try {
            t tVar = (t) super.clone();
            tVar.U = new ArrayList();
            tVar.G = new p10.a(9);
            tVar.H = new p10.a(9);
            tVar.K = null;
            tVar.L = null;
            tVar.Y = null;
            tVar.S = this;
            tVar.T = null;
            return tVar;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Animator m(ViewGroup viewGroup, a0 a0Var, a0 a0Var2) {
        return null;
    }

    public void n(ViewGroup viewGroup, p10.a aVar, p10.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        boolean z10;
        View view;
        a0 a0Var;
        Animator animator;
        Animator animator2;
        a0 a0Var2;
        u.e eVarS = s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = q().Y != null;
        int i11 = 0;
        while (i11 < size) {
            a0 a0Var3 = (a0) arrayList.get(i11);
            a0 a0Var4 = (a0) arrayList2.get(i11);
            if (a0Var3 != null && !a0Var3.f14427c.contains(this)) {
                a0Var3 = null;
            }
            if (a0Var4 != null && !a0Var4.f14427c.contains(this)) {
                a0Var4 = null;
            }
            if ((a0Var3 != null || a0Var4 != null) && (a0Var3 == null || a0Var4 == null || x(a0Var3, a0Var4))) {
                Animator animatorM = m(viewGroup, a0Var3, a0Var4);
                if (animatorM != null) {
                    String str = this.A;
                    if (a0Var4 != null) {
                        view = a0Var4.f14426b;
                        String[] strArrT = t();
                        if (strArrT != null && strArrT.length > 0) {
                            a0Var2 = new a0(view);
                            a0 a0Var5 = (a0) ((u.e) aVar2.A).get(view);
                            i10 = size;
                            z10 = z11;
                            if (a0Var5 != null) {
                                for (String str2 : strArrT) {
                                    a0Var2.f14425a.put(str2, a0Var5.f14425a.get(str2));
                                }
                            }
                            int i12 = eVarS.C;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= i12) {
                                    animator2 = animatorM;
                                    break;
                                }
                                o oVar = (o) eVarS.get((Animator) eVarS.g(i13));
                                if (oVar.f14475c != null && oVar.f14473a == view && oVar.f14474b.equals(str) && oVar.f14475c.equals(a0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i10 = size;
                            z10 = z11;
                            animator2 = animatorM;
                            a0Var2 = null;
                        }
                        animator = animator2;
                        a0Var = a0Var2;
                    } else {
                        i10 = size;
                        z10 = z11;
                        view = a0Var3.f14426b;
                        a0Var = null;
                        animator = animatorM;
                    }
                    if (animator != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        o oVar2 = new o();
                        oVar2.f14473a = view;
                        oVar2.f14474b = str;
                        oVar2.f14475c = a0Var;
                        oVar2.f14476d = windowId;
                        oVar2.f14477e = this;
                        oVar2.f14478f = animator;
                        Object obj = animator;
                        if (z10) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        }
                        eVarS.put(obj, oVar2);
                        this.U.add(obj);
                    }
                }
                i11++;
                size = i10;
                z11 = z10;
            }
            i10 = size;
            z10 = z11;
            i11++;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                o oVar3 = (o) eVarS.get((Animator) this.U.get(sparseIntArray.keyAt(i14)));
                oVar3.f14478f.setStartDelay(oVar3.f14478f.getStartDelay() + (((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i10 = this.P - 1;
        this.P = i10;
        if (i10 == 0) {
            A(this, s.f14489t, false);
            for (int i11 = 0; i11 < ((u.q) this.G.C).g(); i11++) {
                View view = (View) ((u.q) this.G.C).h(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((u.q) this.H.C).g(); i12++) {
                View view2 = (View) ((u.q) this.H.C).h(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.R = true;
        }
    }

    public final a0 p(View view, boolean z10) {
        z zVar = this.I;
        if (zVar != null) {
            return zVar.p(view, z10);
        }
        ArrayList arrayList = z10 ? this.K : this.L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            a0 a0Var = (a0) arrayList.get(i10);
            if (a0Var == null) {
                return null;
            }
            if (a0Var.f14426b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (a0) (z10 ? this.L : this.K).get(i10);
        }
        return null;
    }

    public final t q() {
        z zVar = this.I;
        return zVar != null ? zVar.q() : this;
    }

    public String[] t() {
        return null;
    }

    public final String toString() {
        return P(RuntimeVersion.SUFFIX);
    }

    public final a0 u(View view, boolean z10) {
        z zVar = this.I;
        if (zVar != null) {
            return zVar.u(view, z10);
        }
        return (a0) ((u.e) (z10 ? this.G : this.H).A).get(view);
    }

    public boolean v() {
        return !this.N.isEmpty();
    }

    public abstract boolean w();

    public boolean x(a0 a0Var, a0 a0Var2) {
        if (a0Var != null && a0Var2 != null) {
            String[] strArrT = t();
            if (strArrT != null) {
                for (String str : strArrT) {
                    if (z(a0Var, a0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = a0Var.f14425a.keySet().iterator();
                while (it.hasNext()) {
                    if (z(a0Var, a0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        ArrayList arrayList2 = this.F;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }
}
