package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class i1 {
    public final b1 A;
    public final gj.e B;
    public h.h C;
    public h.h D;
    public h.h E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public m1 O;
    public final t P;

    public boolean f750b;

    public ArrayList f753e;

    public d.e0 f755g;

    public final ArrayList f760n;

    public final p0 f761o;

    public final CopyOnWriteArrayList f762p;

    public final x0 f763q;

    public final x0 f764r;

    public final x0 f765s;

    public final x0 f766t;

    public final a1 f767u;

    public int f768v;

    public t0 f769w;

    public r0 f770x;

    public j0 f771y;

    public j0 f772z;

    public final ArrayList f749a = new ArrayList();

    public final r1 f751c = new r1();

    public ArrayList f752d = new ArrayList();

    public final v0 f754f = new v0(this);

    public a f756h = null;

    public boolean f757i = false;

    public final z0 f758j = new z0(this);

    public final AtomicInteger f759k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    public i1() {
        Collections.synchronizedMap(new HashMap());
        this.f760n = new ArrayList();
        this.f761o = new p0(this);
        this.f762p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f763q = new y4.a(this) {

            public final i1 f855b;

            {
                this.f855b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i1 i1Var = this.f855b;
                        if (i1Var.M()) {
                            i1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i1 i1Var2 = this.f855b;
                        if (i1Var2.M() && num.intValue() == 80) {
                            i1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.e eVar = (n4.e) obj;
                        i1 i1Var3 = this.f855b;
                        if (i1Var3.M()) {
                            i1Var3.n(eVar.f11056a, false);
                        }
                        break;
                    default:
                        n4.s sVar = (n4.s) obj;
                        i1 i1Var4 = this.f855b;
                        if (i1Var4.M()) {
                            i1Var4.s(sVar.f11106a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f764r = new y4.a(this) {

            public final i1 f855b;

            {
                this.f855b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i1 i1Var = this.f855b;
                        if (i1Var.M()) {
                            i1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i1 i1Var2 = this.f855b;
                        if (i1Var2.M() && num.intValue() == 80) {
                            i1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.e eVar = (n4.e) obj;
                        i1 i1Var3 = this.f855b;
                        if (i1Var3.M()) {
                            i1Var3.n(eVar.f11056a, false);
                        }
                        break;
                    default:
                        n4.s sVar = (n4.s) obj;
                        i1 i1Var4 = this.f855b;
                        if (i1Var4.M()) {
                            i1Var4.s(sVar.f11106a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f765s = new y4.a(this) {

            public final i1 f855b;

            {
                this.f855b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i1 i1Var = this.f855b;
                        if (i1Var.M()) {
                            i1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i1 i1Var2 = this.f855b;
                        if (i1Var2.M() && num.intValue() == 80) {
                            i1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.e eVar = (n4.e) obj;
                        i1 i1Var3 = this.f855b;
                        if (i1Var3.M()) {
                            i1Var3.n(eVar.f11056a, false);
                        }
                        break;
                    default:
                        n4.s sVar = (n4.s) obj;
                        i1 i1Var4 = this.f855b;
                        if (i1Var4.M()) {
                            i1Var4.s(sVar.f11106a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f766t = new y4.a(this) {

            public final i1 f855b;

            {
                this.f855b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i1 i1Var = this.f855b;
                        if (i1Var.M()) {
                            i1Var.i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i1 i1Var2 = this.f855b;
                        if (i1Var2.M() && num.intValue() == 80) {
                            i1Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        n4.e eVar = (n4.e) obj;
                        i1 i1Var3 = this.f855b;
                        if (i1Var3.M()) {
                            i1Var3.n(eVar.f11056a, false);
                        }
                        break;
                    default:
                        n4.s sVar = (n4.s) obj;
                        i1 i1Var4 = this.f855b;
                        if (i1Var4.M()) {
                            i1Var4.s(sVar.f11106a, false);
                        }
                        break;
                }
            }
        };
        this.f767u = new a1(this);
        this.f768v = -1;
        this.A = new b1(this);
        this.B = new gj.e(4);
        this.F = new ArrayDeque();
        this.P = new t(this, 2);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f832a.size(); i10++) {
            j0 j0Var = ((s1) aVar.f832a.get(i10)).f824b;
            if (j0Var != null && aVar.f838g) {
                hashSet.add(j0Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(j0 j0Var) {
        if (j0Var.mHasMenu && j0Var.mMenuVisible) {
            return true;
        }
        boolean zL = false;
        for (j0 j0Var2 : j0Var.mChildFragmentManager.f751c.e()) {
            if (j0Var2 != null) {
                zL = L(j0Var2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(j0 j0Var) {
        if (j0Var == null) {
            return true;
        }
        i1 i1Var = j0Var.mFragmentManager;
        return j0Var.equals(i1Var.f772z) && N(i1Var.f771y);
    }

    public static void d0(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + j0Var);
        }
        if (j0Var.mHidden) {
            j0Var.mHidden = false;
            j0Var.mHiddenChanged = !j0Var.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z10) {
        if (z10 && (this.f769w == null || this.J)) {
            return;
        }
        y(z10);
        a aVar2 = this.f756h;
        if (aVar2 != null) {
            aVar2.f687r = false;
            aVar2.e();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f756h + " as part of execSingleAction for action " + aVar);
            }
            this.f756h.f(false, false);
            this.f756h.a(this.L, this.M);
            Iterator it = this.f756h.f832a.iterator();
            while (it.hasNext()) {
                j0 j0Var = ((s1) it.next()).f824b;
                if (j0Var != null) {
                    j0Var.mTransitioning = false;
                }
            }
            this.f756h = null;
        }
        aVar.a(this.L, this.M);
        this.f750b = true;
        try {
            V(this.L, this.M);
            d();
            f0();
            boolean z11 = this.K;
            r1 r1Var = this.f751c;
            if (z11) {
                this.K = false;
                for (q1 q1Var : r1Var.d()) {
                    j0 j0Var2 = q1Var.f809c;
                    if (j0Var2.mDeferStart) {
                        if (this.f750b) {
                            this.K = true;
                        } else {
                            j0Var2.mDeferStart = false;
                            q1Var.k();
                        }
                    }
                }
            }
            r1Var.f813b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        boolean z12 = ((a) arrayList.get(i16)).f844o;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        r1 r1Var = this.f751c;
        arrayList4.addAll(r1Var.f());
        j0 j0Var = this.f772z;
        int i17 = i16;
        boolean z13 = false;
        while (true) {
            int i18 = 1;
            if (i17 >= i11) {
                boolean z14 = z12;
                boolean z15 = z13;
                this.N.clear();
                if (!z14 && this.f768v >= 1) {
                    for (int i19 = i16; i19 < i11; i19++) {
                        Iterator it = ((a) arrayList.get(i19)).f832a.iterator();
                        while (it.hasNext()) {
                            j0 j0Var2 = ((s1) it.next()).f824b;
                            if (j0Var2 != null && j0Var2.mFragmentManager != null) {
                                r1Var.g(g(j0Var2));
                            }
                        }
                    }
                }
                int i20 = i16;
                while (i20 < i11) {
                    a aVar = (a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        aVar.d(-1);
                        i1 i1Var = aVar.f686q;
                        ArrayList arrayList5 = aVar.f832a;
                        boolean z16 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            s1 s1Var = (s1) arrayList5.get(size);
                            j0 j0Var3 = s1Var.f824b;
                            if (j0Var3 != null) {
                                j0Var3.mBeingSaved = false;
                                j0Var3.setPopDirection(z16);
                                int i21 = aVar.f837f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        if (i21 != 8197) {
                                            i23 = 4099;
                                            if (i21 != 4099) {
                                                i22 = i21 != 4100 ? 0 : 8197;
                                            } else {
                                                i22 = i23;
                                            }
                                        }
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                j0Var3.setNextTransition(i22);
                                j0Var3.setSharedElementNames(aVar.f843n, aVar.m);
                            }
                            switch (s1Var.f823a) {
                                case 1:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    z16 = true;
                                    i1Var.Z(j0Var3, true);
                                    i1Var.U(j0Var3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + s1Var.f823a);
                                case 3:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    i1Var.a(j0Var3);
                                    z16 = true;
                                    break;
                                case 4:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    i1Var.getClass();
                                    d0(j0Var3);
                                    z16 = true;
                                    break;
                                case 5:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    i1Var.Z(j0Var3, true);
                                    i1Var.J(j0Var3);
                                    z16 = true;
                                    break;
                                case 6:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    i1Var.c(j0Var3);
                                    z16 = true;
                                    break;
                                case 7:
                                    j0Var3.setAnimations(s1Var.f826d, s1Var.f827e, s1Var.f828f, s1Var.f829g);
                                    i1Var.Z(j0Var3, true);
                                    i1Var.h(j0Var3);
                                    z16 = true;
                                    break;
                                case 8:
                                    i1Var.b0(null);
                                    z16 = true;
                                    break;
                                case 9:
                                    i1Var.b0(j0Var3);
                                    z16 = true;
                                    break;
                                case 10:
                                    s1Var.f831i = j0Var3.mMaxState;
                                    i1Var.a0(j0Var3, s1Var.f830h);
                                    z16 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.d(1);
                        i1 i1Var2 = aVar.f686q;
                        ArrayList arrayList6 = aVar.f832a;
                        int size2 = arrayList6.size();
                        int i24 = 0;
                        while (i24 < size2) {
                            s1 s1Var2 = (s1) arrayList6.get(i24);
                            j0 j0Var4 = s1Var2.f824b;
                            if (j0Var4 != null) {
                                j0Var4.mBeingSaved = false;
                                j0Var4.setPopDirection(false);
                                j0Var4.setNextTransition(aVar.f837f);
                                j0Var4.setSharedElementNames(aVar.m, aVar.f843n);
                            }
                            switch (s1Var2.f823a) {
                                case 1:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.Z(j0Var4, false);
                                    i1Var2.a(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + s1Var2.f823a);
                                case 3:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.U(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 4:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.J(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 5:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.Z(j0Var4, false);
                                    d0(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 6:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.h(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 7:
                                    j0Var4.setAnimations(s1Var2.f826d, s1Var2.f827e, s1Var2.f828f, s1Var2.f829g);
                                    i1Var2.Z(j0Var4, false);
                                    i1Var2.c(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 8:
                                    i1Var2.b0(j0Var4);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 9:
                                    i1Var2.b0(null);
                                    i24++;
                                    i20 = i20;
                                    break;
                                case 10:
                                    s1Var2.f830h = j0Var4.mMaxState;
                                    i1Var2.a0(j0Var4, s1Var2.f831i);
                                    i24++;
                                    i20 = i20;
                                    break;
                            }
                        }
                    }
                    i20++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                ArrayList arrayList7 = this.f760n;
                if (z15 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((a) it2.next()));
                    }
                    if (this.f756h == null) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i25 = i16; i25 < i11; i25++) {
                    a aVar2 = (a) arrayList.get(i25);
                    if (zBooleanValue) {
                        for (int size3 = aVar2.f832a.size() - 1; size3 >= 0; size3--) {
                            j0 j0Var5 = ((s1) aVar2.f832a.get(size3)).f824b;
                            if (j0Var5 != null) {
                                g(j0Var5).k();
                            }
                        }
                    } else {
                        Iterator it7 = aVar2.f832a.iterator();
                        while (it7.hasNext()) {
                            j0 j0Var6 = ((s1) it7.next()).f824b;
                            if (j0Var6 != null) {
                                g(j0Var6).k();
                            }
                        }
                    }
                }
                P(this.f768v, true);
                for (s sVar : f(arrayList, i16, i11)) {
                    sVar.f820e = zBooleanValue;
                    sVar.l();
                    sVar.e();
                }
                while (i16 < i11) {
                    a aVar3 = (a) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && aVar3.f688s >= 0) {
                        aVar3.f688s = -1;
                    }
                    if (aVar3.f845p != null) {
                        for (int i26 = 0; i26 < aVar3.f845p.size(); i26++) {
                            ((Runnable) aVar3.f845p.get(i26)).run();
                        }
                        aVar3.f845p = null;
                    }
                    i16++;
                }
                if (!z15 || arrayList7.size() <= 0) {
                    return;
                }
                arrayList7.get(0).getClass();
                throw new ClassCastException();
            }
            a aVar4 = (a) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                z10 = z12;
                i12 = i17;
                z11 = z13;
                int i27 = 1;
                ArrayList arrayList8 = this.N;
                ArrayList arrayList9 = aVar4.f832a;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    s1 s1Var3 = (s1) arrayList9.get(size4);
                    int i28 = s1Var3.f823a;
                    if (i28 != i27) {
                        if (i28 != 3) {
                            switch (i28) {
                                case 6:
                                    arrayList8.add(s1Var3.f824b);
                                    break;
                                case 8:
                                    j0Var = null;
                                    break;
                                case 9:
                                    j0Var = s1Var3.f824b;
                                    break;
                                case 10:
                                    s1Var3.f831i = s1Var3.f830h;
                                    break;
                            }
                        } else {
                            arrayList8.add(s1Var3.f824b);
                        }
                        size4--;
                        i27 = 1;
                    }
                    arrayList8.remove(s1Var3.f824b);
                    size4--;
                    i27 = 1;
                }
            } else {
                ArrayList arrayList10 = this.N;
                ArrayList arrayList11 = aVar4.f832a;
                int i29 = 0;
                while (i29 < arrayList11.size()) {
                    s1 s1Var4 = (s1) arrayList11.get(i29);
                    boolean z17 = z12;
                    int i30 = s1Var4.f823a;
                    if (i30 != i18) {
                        i13 = i17;
                        if (i30 != 2) {
                            if (i30 == 3 || i30 == 6) {
                                arrayList10.remove(s1Var4.f824b);
                                j0 j0Var7 = s1Var4.f824b;
                                if (j0Var7 == j0Var) {
                                    arrayList11.add(i29, new s1(j0Var7, 9));
                                    i29++;
                                    j0Var = null;
                                }
                                i14 = 1;
                            } else if (i30 == 7) {
                                i14 = 1;
                            } else if (i30 == 8) {
                                arrayList11.add(i29, new s1(9, j0Var, 0));
                                s1Var4.f825c = true;
                                i29++;
                                j0Var = s1Var4.f824b;
                            }
                            i14 = 1;
                        } else {
                            j0 j0Var8 = s1Var4.f824b;
                            int i31 = j0Var8.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z18 = false;
                            while (size5 >= 0) {
                                int i32 = size5;
                                j0 j0Var9 = (j0) arrayList10.get(size5);
                                boolean z19 = z13;
                                if (j0Var9.mContainerId != i31) {
                                    i31 = i31;
                                } else if (j0Var9 == j0Var8) {
                                    i31 = i31;
                                    z18 = true;
                                } else {
                                    if (j0Var9 == j0Var) {
                                        i15 = 0;
                                        arrayList11.add(i29, new s1(9, j0Var9, 0));
                                        i29++;
                                        j0Var = null;
                                    } else {
                                        i15 = 0;
                                    }
                                    s1 s1Var5 = new s1(3, j0Var9, i15);
                                    s1Var5.f826d = s1Var4.f826d;
                                    s1Var5.f828f = s1Var4.f828f;
                                    s1Var5.f827e = s1Var4.f827e;
                                    s1Var5.f829g = s1Var4.f829g;
                                    arrayList11.add(i29, s1Var5);
                                    arrayList10.remove(j0Var9);
                                    i29++;
                                    j0Var = j0Var;
                                }
                                size5 = i32 - 1;
                                i31 = i31;
                                z13 = z19;
                            }
                            z13 = z13;
                            i14 = 1;
                            if (z18) {
                                arrayList11.remove(i29);
                                i29--;
                            } else {
                                s1Var4.f823a = 1;
                                s1Var4.f825c = true;
                                arrayList10.add(j0Var8);
                            }
                        }
                        i29 += i14;
                        i18 = i14;
                        z12 = z17;
                        i17 = i13;
                        z13 = z13;
                    } else {
                        i13 = i17;
                        i14 = i18;
                    }
                    z13 = z13;
                    arrayList10.add(s1Var4.f824b);
                    i29 += i14;
                    i18 = i14;
                    z12 = z17;
                    i17 = i13;
                    z13 = z13;
                }
                z10 = z12;
                i12 = i17;
                z11 = z13;
            }
            z13 = z11 || aVar4.f838g;
            i17 = i12 + 1;
            z12 = z10;
        }
    }

    public final j0 C(int i10) {
        r1 r1Var = this.f751c;
        ArrayList arrayList = r1Var.f812a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && j0Var.mFragmentId == i10) {
                return j0Var;
            }
        }
        for (q1 q1Var : r1Var.f813b.values()) {
            if (q1Var != null) {
                j0 j0Var2 = q1Var.f809c;
                if (j0Var2.mFragmentId == i10) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    public final j0 D(String str) {
        r1 r1Var = this.f751c;
        ArrayList arrayList = r1Var.f812a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && str.equals(j0Var.mTag)) {
                return j0Var;
            }
        }
        for (q1 q1Var : r1Var.f813b.values()) {
            if (q1Var != null) {
                j0 j0Var2 = q1Var.f809c;
                if (str.equals(j0Var2.mTag)) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (s sVar : e()) {
            if (sVar.f821f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                sVar.f821f = false;
                sVar.e();
            }
        }
    }

    public final ViewGroup G(j0 j0Var) {
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (j0Var.mContainerId <= 0 || !this.f770x.c()) {
            return null;
        }
        View viewB = this.f770x.b(j0Var.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final b1 H() {
        j0 j0Var = this.f771y;
        return j0Var != null ? j0Var.mFragmentManager.H() : this.A;
    }

    public final gj.e I() {
        j0 j0Var = this.f771y;
        return j0Var != null ? j0Var.mFragmentManager.I() : this.B;
    }

    public final void J(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + j0Var);
        }
        if (j0Var.mHidden) {
            return;
        }
        j0Var.mHidden = true;
        j0Var.mHiddenChanged = true ^ j0Var.mHiddenChanged;
        c0(j0Var);
    }

    public final boolean M() {
        j0 j0Var = this.f771y;
        if (j0Var == null) {
            return true;
        }
        return j0Var.isAdded() && this.f771y.getParentFragmentManager().M();
    }

    public final boolean O() {
        return this.H || this.I;
    }

    public final void P(int i10, boolean z10) {
        t0 t0Var;
        if (this.f769w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f768v) {
            this.f768v = i10;
            r1 r1Var = this.f751c;
            HashMap map = r1Var.f813b;
            Iterator it = r1Var.f812a.iterator();
            while (it.hasNext()) {
                q1 q1Var = (q1) map.get(((j0) it.next()).mWho);
                if (q1Var != null) {
                    q1Var.k();
                }
            }
            for (q1 q1Var2 : map.values()) {
                if (q1Var2 != null) {
                    q1Var2.k();
                    j0 j0Var = q1Var2.f809c;
                    if (j0Var.mRemoving && !j0Var.isInBackStack()) {
                        if (j0Var.mBeingSaved && !r1Var.f814c.containsKey(j0Var.mWho)) {
                            r1Var.i(j0Var.mWho, q1Var2.n());
                        }
                        r1Var.h(q1Var2);
                    }
                }
            }
            for (q1 q1Var3 : r1Var.d()) {
                j0 j0Var2 = q1Var3.f809c;
                if (j0Var2.mDeferStart) {
                    if (this.f750b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        q1Var3.k();
                    }
                }
            }
            if (this.G && (t0Var = this.f769w) != null && this.f768v == 7) {
                ((n0) t0Var).E.invalidateMenu();
                this.G = false;
            }
        }
    }

    public final void Q() {
        if (this.f769w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f787h = false;
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.noteStateNotSaved();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        z(false);
        y(true);
        j0 j0Var = this.f772z;
        if (j0Var != null && i10 < 0 && j0Var.getChildFragmentManager().R()) {
            return true;
        }
        boolean zT = T(this.L, this.M, i10, i11);
        if (zT) {
            this.f750b = true;
            try {
                V(this.L, this.M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        f0();
        boolean z10 = this.K;
        r1 r1Var = this.f751c;
        if (z10) {
            this.K = false;
            for (q1 q1Var : r1Var.d()) {
                j0 j0Var2 = q1Var.f809c;
                if (j0Var2.mDeferStart) {
                    if (this.f750b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        q1Var.k();
                    }
                }
            }
        }
        r1Var.f813b.values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f752d.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f752d.size() - 1;
            } else {
                int size2 = this.f752d.size() - 1;
                while (size2 >= 0) {
                    a aVar = (a) this.f752d.get(size2);
                    if (i10 >= 0 && i10 == aVar.f688s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        a aVar2 = (a) this.f752d.get(size - 1);
                        if (i10 < 0 || i10 != aVar2.f688s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f752d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f752d.size() - 1; size3 >= size; size3--) {
            arrayList.add((a) this.f752d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + j0Var + " nesting=" + j0Var.mBackStackNesting);
        }
        boolean zIsInBackStack = j0Var.isInBackStack();
        if (j0Var.mDetached && zIsInBackStack) {
            return;
        }
        r1 r1Var = this.f751c;
        synchronized (r1Var.f812a) {
            r1Var.f812a.remove(j0Var);
        }
        j0Var.mAdded = false;
        if (L(j0Var)) {
            this.G = true;
        }
        j0Var.mRemoving = true;
        c0(j0Var);
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).f844o) {
                if (i11 != i10) {
                    B(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f844o) {
                        i11++;
                    }
                }
                B(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(arrayList, arrayList2, i11, size);
        }
    }

    public final void W(Bundle bundle) {
        p0 p0Var;
        int i10;
        boolean z10;
        int i11;
        q1 q1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f769w.B.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f769w.B.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        r1 r1Var = this.f751c;
        HashMap map2 = r1Var.f814c;
        HashMap map3 = r1Var.f813b;
        map2.clear();
        map2.putAll(map);
        k1 k1Var = (k1) bundle.getParcelable("state");
        if (k1Var == null) {
            return;
        }
        map3.clear();
        Iterator it = k1Var.A.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            p0Var = this.f761o;
            i10 = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = r1Var.i((String) it.next(), null);
            if (bundleI != null) {
                j0 j0Var = (j0) this.O.f782c.get(((o1) bundleI.getParcelable("state")).B);
                if (j0Var != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j0Var);
                    }
                    q1Var = new q1(p0Var, r1Var, j0Var, bundleI);
                } else {
                    q1Var = new q1(this.f761o, this.f751c, this.f769w.B.getClassLoader(), H(), bundleI);
                }
                j0 j0Var2 = q1Var.f809c;
                j0Var2.mSavedFragmentState = bundleI;
                j0Var2.mFragmentManager = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + j0Var2.mWho + "): " + j0Var2);
                }
                q1Var.l(this.f769w.B.getClassLoader());
                r1Var.g(q1Var);
                q1Var.f811e = this.f768v;
            }
        }
        m1 m1Var = this.O;
        m1Var.getClass();
        Iterator it2 = new ArrayList(m1Var.f782c.values()).iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            j0 j0Var3 = (j0) it2.next();
            if (map3.get(j0Var3.mWho) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + j0Var3 + " that was not found in the set of active Fragments " + k1Var.A);
                }
                this.O.l(j0Var3);
                j0Var3.mFragmentManager = this;
                q1 q1Var2 = new q1(p0Var, r1Var, j0Var3);
                q1Var2.f811e = 1;
                q1Var2.k();
                j0Var3.mRemoving = true;
                q1Var2.k();
            }
        }
        ArrayList<String> arrayList = k1Var.B;
        r1Var.f812a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                j0 j0VarB = r1Var.b(str3);
                if (j0VarB == null) {
                    throw new IllegalStateException(a1.b.p("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + j0VarB);
                }
                r1Var.a(j0VarB);
            }
        }
        if (k1Var.C != null) {
            this.f752d = new ArrayList(k1Var.C.length);
            int i12 = 0;
            while (true) {
                b[] bVarArr = k1Var.C;
                if (i12 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i12];
                ArrayList arrayList2 = bVar.B;
                a aVar = new a(this);
                int[] iArr = bVar.A;
                int i13 = 0;
                int i14 = 0;
                while (i13 < iArr.length) {
                    s1 s1Var = new s1();
                    int i15 = i13 + 1;
                    int i16 = i10;
                    s1Var.f823a = iArr[i13];
                    if (K(i16)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    s1Var.f830h = androidx.lifecycle.p.values()[bVar.C[i14]];
                    s1Var.f831i = androidx.lifecycle.p.values()[bVar.D[i14]];
                    int i17 = i13 + 2;
                    s1Var.f825c = iArr[i15] != 0 ? z10 : false;
                    int i18 = iArr[i17];
                    s1Var.f826d = i18;
                    int i19 = iArr[i13 + 3];
                    s1Var.f827e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    s1Var.f828f = i21;
                    i13 += 6;
                    int[] iArr2 = iArr;
                    int i22 = iArr2[i20];
                    s1Var.f829g = i22;
                    aVar.f833b = i18;
                    aVar.f834c = i19;
                    aVar.f835d = i21;
                    aVar.f836e = i22;
                    aVar.b(s1Var);
                    i14++;
                    i10 = i16;
                    iArr = iArr2;
                    z10 = true;
                }
                int i23 = i10;
                aVar.f837f = bVar.E;
                aVar.f839h = bVar.F;
                aVar.f838g = true;
                aVar.f840i = bVar.H;
                aVar.f841j = bVar.I;
                aVar.f842k = bVar.J;
                aVar.l = bVar.K;
                aVar.m = bVar.L;
                aVar.f843n = bVar.M;
                aVar.f844o = bVar.N;
                aVar.f688s = bVar.G;
                for (int i24 = 0; i24 < arrayList2.size(); i24++) {
                    String str4 = (String) arrayList2.get(i24);
                    if (str4 != null) {
                        ((s1) aVar.f832a.get(i24)).f824b = r1Var.b(str4);
                    }
                }
                aVar.d(1);
                if (K(i23)) {
                    StringBuilder sbQ = oi.k.q("restoreAllState: back stack #", i12, " (index ");
                    sbQ.append(aVar.f688s);
                    sbQ.append("): ");
                    sbQ.append(aVar);
                    Log.v("FragmentManager", sbQ.toString());
                    PrintWriter printWriter = new PrintWriter(new d2());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f752d.add(aVar);
                i12++;
                i10 = i23;
                z10 = true;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f752d = new ArrayList();
        }
        this.f759k.set(k1Var.D);
        String str5 = k1Var.E;
        if (str5 != null) {
            j0 j0VarB2 = r1Var.b(str5);
            this.f772z = j0VarB2;
            r(j0VarB2);
        }
        ArrayList arrayList3 = k1Var.F;
        if (arrayList3 != null) {
            for (int i25 = i11; i25 < arrayList3.size(); i25++) {
                this.l.put((String) arrayList3.get(i25), (c) k1Var.G.get(i25));
            }
        }
        this.F = new ArrayDeque(k1Var.H);
    }

    public final Bundle X() {
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.H = true;
        this.O.f787h = true;
        r1 r1Var = this.f751c;
        r1Var.getClass();
        HashMap map = r1Var.f813b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (q1 q1Var : map.values()) {
            if (q1Var != null) {
                j0 j0Var = q1Var.f809c;
                r1Var.i(j0Var.mWho, q1Var.n());
                arrayList2.add(j0Var.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + j0Var + ": " + j0Var.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f751c.f814c;
        if (!map2.isEmpty()) {
            r1 r1Var2 = this.f751c;
            synchronized (r1Var2.f812a) {
                try {
                    if (r1Var2.f812a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(r1Var2.f812a.size());
                        for (j0 j0Var2 : r1Var2.f812a) {
                            arrayList.add(j0Var2.mWho);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + j0Var2.mWho + "): " + j0Var2);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size = this.f752d.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new b((a) this.f752d.get(i10));
                    if (K(2)) {
                        StringBuilder sbQ = oi.k.q("saveAllState: adding back stack #", i10, ": ");
                        sbQ.append(this.f752d.get(i10));
                        Log.v("FragmentManager", sbQ.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            k1 k1Var = new k1();
            k1Var.E = null;
            ArrayList arrayList3 = new ArrayList();
            k1Var.F = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            k1Var.G = arrayList4;
            k1Var.A = arrayList2;
            k1Var.B = arrayList;
            k1Var.C = bVarArr;
            k1Var.D = this.f759k.get();
            j0 j0Var3 = this.f772z;
            if (j0Var3 != null) {
                k1Var.E = j0Var3.mWho;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            k1Var.H = new ArrayList(this.F);
            bundle.putParcelable("state", k1Var);
            for (String str : this.m.keySet()) {
                bundle.putBundle(a1.b.o("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(a1.b.o("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f749a) {
            try {
                if (this.f749a.size() == 1) {
                    this.f769w.C.removeCallbacks(this.P);
                    this.f769w.C.post(this.P);
                    f0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Z(j0 j0Var, boolean z10) {
        ViewGroup viewGroupG = G(j0Var);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z10);
    }

    public final q1 a(j0 j0Var) {
        String str = j0Var.mPreviousWho;
        if (str != null) {
            a6.b.c(j0Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + j0Var);
        }
        q1 q1VarG = g(j0Var);
        j0Var.mFragmentManager = this;
        r1 r1Var = this.f751c;
        r1Var.g(q1VarG);
        if (!j0Var.mDetached) {
            r1Var.a(j0Var);
            j0Var.mRemoving = false;
            if (j0Var.mView == null) {
                j0Var.mHiddenChanged = false;
            }
            if (L(j0Var)) {
                this.G = true;
            }
        }
        return q1VarG;
    }

    public final void a0(j0 j0Var, androidx.lifecycle.p pVar) {
        if (j0Var.equals(this.f751c.b(j0Var.mWho)) && (j0Var.mHost == null || j0Var.mFragmentManager == this)) {
            j0Var.mMaxState = pVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + j0Var + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(t0 t0Var, r0 r0Var, j0 j0Var) {
        if (this.f769w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f769w = t0Var;
        this.f770x = r0Var;
        this.f771y = j0Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f762p;
        if (j0Var != null) {
            copyOnWriteArrayList.add(new c1(j0Var));
        } else if (t0Var instanceof n1) {
            copyOnWriteArrayList.add((n1) t0Var);
        }
        if (this.f771y != null) {
            f0();
        }
        if (t0Var instanceof d.g0) {
            d.g0 g0Var = (d.g0) t0Var;
            d.e0 onBackPressedDispatcher = g0Var.getOnBackPressedDispatcher();
            this.f755g = onBackPressedDispatcher;
            androidx.lifecycle.w wVar = g0Var;
            if (j0Var != null) {
                wVar = j0Var;
            }
            onBackPressedDispatcher.a(wVar, this.f758j);
        }
        if (j0Var != null) {
            m1 m1Var = j0Var.mFragmentManager.O;
            HashMap map = m1Var.f783d;
            m1 m1Var2 = (m1) map.get(j0Var.mWho);
            if (m1Var2 == null) {
                m1Var2 = new m1(m1Var.f785f);
                map.put(j0Var.mWho, m1Var2);
            }
            this.O = m1Var2;
        } else if (t0Var instanceof androidx.lifecycle.f1) {
            androidx.lifecycle.e1 viewModelStore = ((androidx.lifecycle.f1) t0Var).getViewModelStore();
            kotlin.jvm.internal.m.e(viewModelStore, "store");
            t6.a aVar = t6.a.f14359b;
            kotlin.jvm.internal.m.e(aVar, "defaultCreationExtras");
            p10.a aVar2 = new p10.a(viewModelStore, m1.f781i, aVar);
            a10.d dVarI = k00.f.I(m1.class);
            String strM = dVarI.m();
            if (strM == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.O = (m1) aVar2.o(dVarI, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM));
        } else {
            this.O = new m1(false);
        }
        this.O.f787h = O();
        this.f751c.f815d = this.O;
        Object obj = this.f769w;
        if ((obj instanceof ia.g) && j0Var == null) {
            ia.e savedStateRegistry = ((ia.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new k0(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                W(bundleA);
            }
        }
        Object obj2 = this.f769w;
        if (obj2 instanceof h.j) {
            h.i activityResultRegistry = ((h.j) obj2).getActivityResultRegistry();
            String strO = a1.b.o("FragmentManager:", j0Var != null ? x5.n(new StringBuilder(), j0Var.mWho, ":") : RuntimeVersion.SUFFIX);
            this.C = activityResultRegistry.d(w.c.j(strO, "StartActivityForResult"), new d1(3), new y0(this, 1));
            this.D = activityResultRegistry.d(w.c.j(strO, "StartIntentSenderForResult"), new d1(0), new y0(this, 2));
            this.E = activityResultRegistry.d(w.c.j(strO, "RequestPermissions"), new d1(1), new y0(this, 0));
        }
        Object obj3 = this.f769w;
        if (obj3 instanceof o4.b) {
            ((o4.b) obj3).addOnConfigurationChangedListener(this.f763q);
        }
        Object obj4 = this.f769w;
        if (obj4 instanceof o4.c) {
            ((o4.c) obj4).addOnTrimMemoryListener(this.f764r);
        }
        Object obj5 = this.f769w;
        if (obj5 instanceof n4.q) {
            ((n4.q) obj5).addOnMultiWindowModeChangedListener(this.f765s);
        }
        Object obj6 = this.f769w;
        if (obj6 instanceof n4.r) {
            ((n4.r) obj6).addOnPictureInPictureModeChangedListener(this.f766t);
        }
        Object obj7 = this.f769w;
        if ((obj7 instanceof z4.k) && j0Var == null) {
            ((z4.k) obj7).addMenuProvider(this.f767u);
        }
    }

    public final void b0(j0 j0Var) {
        if (j0Var != null) {
            if (!j0Var.equals(this.f751c.b(j0Var.mWho)) || (j0Var.mHost != null && j0Var.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + j0Var + " is not an active fragment of FragmentManager " + this);
            }
        }
        j0 j0Var2 = this.f772z;
        this.f772z = j0Var;
        r(j0Var2);
        r(this.f772z);
    }

    public final void c(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + j0Var);
        }
        if (j0Var.mDetached) {
            j0Var.mDetached = false;
            if (j0Var.mAdded) {
                return;
            }
            this.f751c.a(j0Var);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + j0Var);
            }
            if (L(j0Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(j0 j0Var) {
        ViewGroup viewGroupG = G(j0Var);
        if (viewGroupG != null) {
            if (j0Var.getPopExitAnim() + j0Var.getPopEnterAnim() + j0Var.getExitAnim() + j0Var.getEnterAnim() > 0) {
                if (viewGroupG.getTag(2131363134) == null) {
                    viewGroupG.setTag(2131363134, j0Var);
                }
                ((j0) viewGroupG.getTag(2131363134)).setPopDirection(j0Var.getPopDirection());
            }
        }
    }

    public final void d() {
        this.f750b = false;
        this.M.clear();
        this.L.clear();
    }

    public final HashSet e() {
        s sVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f751c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((q1) it.next()).f809c.mContainer;
            if (viewGroup != null) {
                kotlin.jvm.internal.m.e(I(), "factory");
                Object tag = viewGroup.getTag(2131363022);
                if (tag instanceof s) {
                    sVar = (s) tag;
                } else {
                    sVar = new s(viewGroup);
                    viewGroup.setTag(2131363022, sVar);
                }
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new d2());
        t0 t0Var = this.f769w;
        if (t0Var == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            ((n0) t0Var).E.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((a) arrayList.get(i10)).f832a.iterator();
            while (it.hasNext()) {
                j0 j0Var = ((s1) it.next()).f824b;
                if (j0Var != null && (viewGroup = j0Var.mContainer) != null) {
                    hashSet.add(s.j(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0() {
        synchronized (this.f749a) {
            try {
                if (!this.f749a.isEmpty()) {
                    this.f758j.f(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = this.f752d.size() + (this.f756h != null ? 1 : 0) > 0 && N(this.f771y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f758j.f(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q1 g(j0 j0Var) {
        String str = j0Var.mWho;
        r1 r1Var = this.f751c;
        q1 q1Var = (q1) r1Var.f813b.get(str);
        if (q1Var != null) {
            return q1Var;
        }
        q1 q1Var2 = new q1(this.f761o, r1Var, j0Var);
        q1Var2.l(this.f769w.B.getClassLoader());
        q1Var2.f811e = this.f768v;
        return q1Var2;
    }

    public final void h(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + j0Var);
        }
        if (j0Var.mDetached) {
            return;
        }
        j0Var.mDetached = true;
        if (j0Var.mAdded) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + j0Var);
            }
            r1 r1Var = this.f751c;
            synchronized (r1Var.f812a) {
                r1Var.f812a.remove(j0Var);
            }
            j0Var.mAdded = false;
            if (L(j0Var)) {
                this.G = true;
            }
            c0(j0Var);
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f769w instanceof o4.b)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.performConfigurationChanged(configuration);
                if (z10) {
                    j0Var.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f768v < 1) {
            return false;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null && j0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f768v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j0Var);
                z10 = true;
            }
        }
        if (this.f753e != null) {
            for (int i10 = 0; i10 < this.f753e.size(); i10++) {
                j0 j0Var2 = (j0) this.f753e.get(i10);
                if (arrayList == null || !arrayList.contains(j0Var2)) {
                    j0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f753e = arrayList;
        return z10;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        z(true);
        w();
        t0 t0Var = this.f769w;
        boolean z10 = t0Var instanceof androidx.lifecycle.f1;
        r1 r1Var = this.f751c;
        if (z10) {
            zIsChangingConfigurations = r1Var.f815d.f786g;
        } else {
            o0 o0Var = t0Var.B;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((c) it.next()).A.iterator();
                while (it2.hasNext()) {
                    r1Var.f815d.j((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f769w;
        if (obj instanceof o4.c) {
            ((o4.c) obj).removeOnTrimMemoryListener(this.f764r);
        }
        Object obj2 = this.f769w;
        if (obj2 instanceof o4.b) {
            ((o4.b) obj2).removeOnConfigurationChangedListener(this.f763q);
        }
        Object obj3 = this.f769w;
        if (obj3 instanceof n4.q) {
            ((n4.q) obj3).removeOnMultiWindowModeChangedListener(this.f765s);
        }
        Object obj4 = this.f769w;
        if (obj4 instanceof n4.r) {
            ((n4.r) obj4).removeOnPictureInPictureModeChangedListener(this.f766t);
        }
        Object obj5 = this.f769w;
        if ((obj5 instanceof z4.k) && this.f771y == null) {
            ((z4.k) obj5).removeMenuProvider(this.f767u);
        }
        this.f769w = null;
        this.f770x = null;
        this.f771y = null;
        if (this.f755g != null) {
            this.f758j.e();
            this.f755g = null;
        }
        h.h hVar = this.C;
        if (hVar != null) {
            hVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f769w instanceof o4.c)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.performLowMemory();
                if (z10) {
                    j0Var.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f769w instanceof n4.q)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.performMultiWindowModeChanged(z10);
                if (z11) {
                    j0Var.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public final void o() {
        for (j0 j0Var : this.f751c.e()) {
            if (j0Var != null) {
                j0Var.onHiddenChanged(j0Var.isHidden());
                j0Var.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f768v < 1) {
            return false;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null && j0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f768v < 1) {
            return;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.equals(this.f751c.b(j0Var.mWho))) {
                j0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f769w instanceof n4.r)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null) {
                j0Var.performPictureInPictureModeChanged(z10);
                if (z11) {
                    j0Var.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f768v < 1) {
            return false;
        }
        for (j0 j0Var : this.f751c.f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        j0 j0Var = this.f771y;
        if (j0Var != null) {
            sb2.append(j0Var.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f771y)));
            sb2.append("}");
        } else {
            t0 t0Var = this.f769w;
            if (t0Var != null) {
                sb2.append(t0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f769w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f750b = true;
            for (q1 q1Var : this.f751c.f813b.values()) {
                if (q1Var != null) {
                    q1Var.f811e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((s) it.next()).i();
            }
            this.f750b = false;
            z(true);
        } catch (Throwable th2) {
            this.f750b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strJ = w.c.j(str, "    ");
        r1 r1Var = this.f751c;
        ArrayList arrayList = r1Var.f812a;
        String strJ2 = w.c.j(str, "    ");
        HashMap map = r1Var.f813b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q1 q1Var : map.values()) {
                printWriter.print(str);
                if (q1Var != null) {
                    j0 j0Var = q1Var.f809c;
                    printWriter.println(j0Var);
                    j0Var.dump(strJ2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                j0 j0Var2 = (j0) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(j0Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f753e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                j0 j0Var3 = (j0) this.f753e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(j0Var3.toString());
            }
        }
        int size3 = this.f752d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                a aVar = (a) this.f752d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(strJ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f759k.get());
        synchronized (this.f749a) {
            try {
                int size4 = this.f749a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (f1) this.f749a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f769w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f770x);
        if (this.f771y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f771y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f768v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((s) it.next()).i();
        }
    }

    public final void x(f1 f1Var, boolean z10) {
        if (!z10) {
            if (this.f769w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f749a) {
            try {
                if (this.f769w == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f749a.add(f1Var);
                    Y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z10) {
        if (this.f750b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f769w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f769w.C.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && O()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean z(boolean z10) {
        boolean zA;
        a aVar;
        y(z10);
        if (!this.f757i && (aVar = this.f756h) != null) {
            aVar.f687r = false;
            aVar.e();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f756h + " as part of execPendingActions for actions " + this.f749a);
            }
            this.f756h.f(false, false);
            this.f749a.add(0, this.f756h);
            Iterator it = this.f756h.f832a.iterator();
            while (it.hasNext()) {
                j0 j0Var = ((s1) it.next()).f824b;
                if (j0Var != null) {
                    j0Var.mTransitioning = false;
                }
            }
            this.f756h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.f749a) {
                if (this.f749a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f749a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= ((f1) this.f749a.get(i10)).a(arrayList, arrayList2);
                        }
                        this.f749a.clear();
                        this.f769w.C.removeCallbacks(this.P);
                    } catch (Throwable th2) {
                        this.f749a.clear();
                        this.f769w.C.removeCallbacks(this.P);
                        throw th2;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f750b = true;
            try {
                V(this.L, this.M);
                d();
                z11 = true;
            } catch (Throwable th3) {
                d();
                throw th3;
            }
        }
        f0();
        if (this.K) {
            this.K = false;
            for (q1 q1Var : this.f751c.d()) {
                j0 j0Var2 = q1Var.f809c;
                if (j0Var2.mDeferStart) {
                    if (this.f750b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        q1Var.k();
                    }
                }
            }
        }
        this.f751c.f813b.values().removeAll(Collections.singleton(null));
        return z11;
    }
}
