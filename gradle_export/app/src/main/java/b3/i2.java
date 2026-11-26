package b3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

public final class i2 {

    public int f2044a;

    public Object f2045b;

    public Object f2046c;

    public Object f2047d;

    public Object f2048e;

    public Object f2049f;

    public i2() {
        this.f2045b = new z2.t[32];
        this.f2046c = new float[32];
        this.f2047d = new byte[32];
        u.j0 j0Var = u.r0.f14890a;
        this.f2048e = new u.j0();
        this.f2049f = new u.j0();
    }

    public i2(View view) {
        this.f2044a = -1;
        this.f2045b = view;
        this.f2046c = p.r.a();
    }

    public i2(f7.t tVar) {
        this.f2045b = tVar;
        this.f2046c = new ArrayDeque();
        this.f2047d = new ArrayDeque();
        this.f2048e = new PriorityQueue();
        this.f2044a = -1;
    }

    public void A(Object obj) {
        Object obj2 = this.f2048e;
        this.f2048e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        i7.z zVar = ((i7.q) this.f2047d).B;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        zVar.A();
        zVar.r(1, 10, num);
        zVar.r(2, 10, num);
        zVar.m.f(21, new androidx.media3.cast.n(iIntValue, 3));
    }

    public void a(long r10, e7.u r12) {
        throw new UnsupportedOperationException("Method not decompiled: b3.i2.a(long, e7.u):void");
    }

    public void b() {
        View view = (View) this.f2045b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((bd.f) this.f2047d) != null) {
                if (((bd.f) this.f2049f) == null) {
                    this.f2049f = new bd.f();
                }
                bd.f fVar = (bd.f) this.f2049f;
                fVar.C = null;
                fVar.B = false;
                fVar.D = null;
                fVar.A = false;
                WeakHashMap weakHashMap = z4.j0.f17198a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    fVar.B = true;
                    fVar.C = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    fVar.A = true;
                    fVar.D = backgroundTintMode;
                }
                if (fVar.B || fVar.A) {
                    p.r.e(background, fVar, view.getDrawableState());
                    return;
                }
            }
            bd.f fVar2 = (bd.f) this.f2048e;
            if (fVar2 != null) {
                p.r.e(background, fVar2, view.getDrawableState());
                return;
            }
            bd.f fVar3 = (bd.f) this.f2047d;
            if (fVar3 != null) {
                p.r.e(background, fVar3, view.getDrawableState());
            }
        }
    }

    public boolean c(int i10) {
        ArrayList arrayList = (ArrayList) this.f2047d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ba.a aVar = (ba.a) arrayList.get(i11);
            int i12 = aVar.f2230a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.f2231b;
                    int i14 = aVar.f2233d + i13;
                    while (i13 < i14) {
                        if (h(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (h(aVar.f2233d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f2047d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ba.e0) this.f2048e).a((ba.a) arrayList.get(i10));
        }
        t(arrayList);
        this.f2044a = 0;
    }

    public void e() {
        ba.e0 e0Var = (ba.e0) this.f2048e;
        d();
        ArrayList arrayList = (ArrayList) this.f2046c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ba.a aVar = (ba.a) arrayList.get(i10);
            int i11 = aVar.f2230a;
            if (i11 == 1) {
                e0Var.a(aVar);
                e0Var.e(aVar.f2231b, aVar.f2233d);
            } else if (i11 == 2) {
                e0Var.a(aVar);
                int i12 = aVar.f2231b;
                int i13 = aVar.f2233d;
                RecyclerView recyclerView = e0Var.A;
                recyclerView.S(i12, i13, true);
                recyclerView.J0 = true;
                recyclerView.G0.f2240c += i13;
            } else if (i11 == 4) {
                e0Var.a(aVar);
                e0Var.c(aVar.f2231b, aVar.f2233d, aVar.f2232c);
            } else if (i11 == 8) {
                e0Var.a(aVar);
                e0Var.f(aVar.f2231b, aVar.f2233d);
            }
        }
        t(arrayList);
        this.f2044a = 0;
    }

    public void f(ba.a aVar) {
        int i10;
        e4.d dVar = (e4.d) this.f2045b;
        int i11 = aVar.f2230a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(aVar.f2231b, i11);
        int i12 = aVar.f2231b;
        int i13 = aVar.f2230a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.f2233d; i15++) {
            int iZ2 = z((i10 * i15) + aVar.f2231b, aVar.f2230a);
            int i16 = aVar.f2230a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                ba.a aVarO = o(aVar.f2232c, i16, iZ, i14);
                g(aVarO, i12);
                aVarO.f2232c = null;
                dVar.c(aVarO);
                if (aVar.f2230a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = aVar.f2232c;
        aVar.f2232c = null;
        dVar.c(aVar);
        if (i14 > 0) {
            ba.a aVarO2 = o(obj, aVar.f2230a, iZ, i14);
            g(aVarO2, i12);
            aVarO2.f2232c = null;
            dVar.c(aVarO2);
        }
    }

    public void g(ba.a aVar, int i10) {
        ba.e0 e0Var = (ba.e0) this.f2048e;
        e0Var.a(aVar);
        int i11 = aVar.f2230a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            e0Var.c(i10, aVar.f2233d, aVar.f2232c);
        } else {
            int i12 = aVar.f2233d;
            RecyclerView recyclerView = e0Var.A;
            recyclerView.S(i10, i12, true);
            recyclerView.J0 = true;
            recyclerView.G0.f2240c += i12;
        }
    }

    public int h(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f2047d;
        int size = arrayList.size();
        while (i11 < size) {
            ba.a aVar = (ba.a) arrayList.get(i11);
            int i12 = aVar.f2230a;
            if (i12 == 8) {
                int i13 = aVar.f2231b;
                if (i13 == i10) {
                    i10 = aVar.f2233d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f2233d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f2231b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f2233d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f2233d;
                }
            }
            i11++;
        }
        return i10;
    }

    public void i(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f2048e;
        while (priorityQueue.size() > i10) {
            f7.s sVar = (f7.s) priorityQueue.poll();
            String str = e7.i0.f5136a;
            int i11 = 0;
            while (true) {
                arrayList = sVar.A;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f7.t) this.f2045b).d(sVar.B, (e7.u) arrayList.get(i11));
                ((ArrayDeque) this.f2046c).push((e7.u) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f7.s sVar2 = (f7.s) this.f2049f;
            if (sVar2 != null && sVar2.B == sVar.B) {
                this.f2049f = null;
            }
            ((ArrayDeque) this.f2047d).push(sVar);
        }
    }

    public ColorStateList j() {
        bd.f fVar = (bd.f) this.f2048e;
        if (fVar != null) {
            return (ColorStateList) fVar.C;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        bd.f fVar = (bd.f) this.f2048e;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.D;
        }
        return null;
    }

    public boolean l() {
        return this.f2044a < ((List) this.f2047d).size() || !((ArrayList) this.f2049f).isEmpty();
    }

    public boolean m() {
        return ((ArrayList) this.f2046c).size() > 0;
    }

    public void n(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = (View) this.f2045b;
        Context context = view.getContext();
        int[] iArr = j.a.f7738y;
        k9.x0 x0VarK = k9.x0.K(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) x0VarK.C;
        View view2 = (View) this.f2045b;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) x0VarK.C;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        z4.h0.b(view2, context2, iArr, attributeSet, typedArray2, i10, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f2044a = typedArray.getResourceId(0, -1);
                p.r rVar = (p.r) this.f2046c;
                Context context3 = view.getContext();
                int i11 = this.f2044a;
                synchronized (rVar) {
                    colorStateListF = rVar.f12195a.f(context3, i11);
                }
                if (colorStateListF != null) {
                    v(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(x0VarK.t(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(p.e1.a(typedArray.getInt(2, -1), null));
            }
            x0VarK.O();
        } catch (Throwable th2) {
            x0VarK.O();
            throw th2;
        }
    }

    public ba.a o(Object obj, int i10, int i11, int i12) {
        ba.a aVar = (ba.a) ((e4.d) this.f2045b).a();
        if (aVar != null) {
            aVar.f2230a = i10;
            aVar.f2231b = i11;
            aVar.f2233d = i12;
            aVar.f2232c = obj;
            return aVar;
        }
        ba.a aVar2 = new ba.a();
        aVar2.f2230a = i10;
        aVar2.f2231b = i11;
        aVar2.f2233d = i12;
        aVar2.f2232c = obj;
        return aVar2;
    }

    public void p() {
        this.f2044a = -1;
        v(null);
        b();
    }

    public void q(int i10) {
        ColorStateList colorStateListF;
        this.f2044a = i10;
        p.r rVar = (p.r) this.f2046c;
        if (rVar != null) {
            Context context = ((View) this.f2045b).getContext();
            synchronized (rVar) {
                colorStateListF = rVar.f12195a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        v(colorStateListF);
        b();
    }

    public void r(ba.a aVar) {
        ba.e0 e0Var = (ba.e0) this.f2048e;
        ((ArrayList) this.f2047d).add(aVar);
        int i10 = aVar.f2230a;
        if (i10 == 1) {
            e0Var.e(aVar.f2231b, aVar.f2233d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.f2231b;
            int i12 = aVar.f2233d;
            RecyclerView recyclerView = e0Var.A;
            recyclerView.S(i11, i12, false);
            recyclerView.J0 = true;
            return;
        }
        if (i10 == 4) {
            e0Var.c(aVar.f2231b, aVar.f2233d, aVar.f2232c);
        } else if (i10 == 8) {
            e0Var.f(aVar.f2231b, aVar.f2233d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void s() {
        boolean z10;
        byte b7;
        ba.a aVarO;
        int i10;
        int i11;
        int i12;
        ba.a aVarO2;
        boolean z11;
        boolean z12;
        Object obj;
        ba.a aVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        e4.d dVar = (e4.d) this.f2045b;
        ba.e0 e0Var = (ba.e0) this.f2048e;
        me.i iVar = (me.i) this.f2049f;
        ArrayList arrayList = (ArrayList) this.f2046c;
        iVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((ba.a) arrayList.get(size)).f2230a == 8) {
                    if (z13) {
                        break;
                    }
                } else {
                    z13 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i21 = size + 1;
            i2 i2Var = (i2) iVar.B;
            e4.d dVar2 = (e4.d) i2Var.f2045b;
            ba.a aVar2 = (ba.a) arrayList.get(size);
            ba.a aVar3 = (ba.a) arrayList.get(i21);
            int i22 = aVar3.f2230a;
            if (i22 == 1) {
                int i23 = aVar2.f2233d;
                int i24 = aVar3.f2231b;
                int i25 = i23 < i24 ? -1 : 0;
                int i26 = aVar2.f2231b;
                if (i26 < i24) {
                    i25++;
                }
                if (i24 <= i26) {
                    aVar2.f2231b = i26 + aVar3.f2233d;
                }
                int i27 = aVar3.f2231b;
                if (i27 <= i23) {
                    aVar2.f2233d = i23 + aVar3.f2233d;
                }
                aVar3.f2231b = i27 + i25;
                arrayList.set(size, aVar3);
                arrayList.set(i21, aVar2);
            } else if (i22 == 2) {
                int i28 = aVar2.f2231b;
                int i29 = aVar2.f2233d;
                if (i28 < i29) {
                    if (aVar3.f2231b == i28 && aVar3.f2233d == i29 - i28) {
                        z12 = true;
                        z11 = false;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (aVar3.f2231b == i29 + 1 && aVar3.f2233d == i28 - i29) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i30 = aVar3.f2231b;
                if (i29 < i30) {
                    aVar3.f2231b = i30 - 1;
                } else {
                    int i31 = aVar3.f2233d;
                    if (i29 < i30 + i31) {
                        aVar3.f2233d = i31 - 1;
                        aVar2.f2230a = 2;
                        aVar2.f2233d = 1;
                        if (aVar3.f2233d == 0) {
                            arrayList.remove(i21);
                            aVar3.f2232c = null;
                            dVar2.c(aVar3);
                        }
                    }
                }
                int i32 = aVar2.f2231b;
                int i33 = aVar3.f2231b;
                if (i32 <= i33) {
                    aVar3.f2231b = i33 + 1;
                } else {
                    int i34 = i33 + aVar3.f2233d;
                    if (i32 < i34) {
                        obj = null;
                        ba.a aVarO3 = i2Var.o(null, 2, i32 + 1, i34 - i32);
                        aVar3.f2233d = aVar2.f2231b - aVar3.f2231b;
                        aVar = aVarO3;
                    }
                    if (z12) {
                        arrayList.set(size, aVar3);
                        arrayList.remove(i21);
                        aVar2.f2232c = obj;
                        dVar2.c(aVar2);
                    } else {
                        if (z11) {
                            if (aVar != null) {
                                i19 = aVar2.f2231b;
                                if (i19 > aVar.f2231b) {
                                    aVar2.f2231b = i19 - aVar.f2233d;
                                }
                                i20 = aVar2.f2233d;
                                if (i20 > aVar.f2231b) {
                                    aVar2.f2233d = i20 - aVar.f2233d;
                                }
                            }
                            i17 = aVar2.f2231b;
                            if (i17 > aVar3.f2231b) {
                                aVar2.f2231b = i17 - aVar3.f2233d;
                            }
                            i18 = aVar2.f2233d;
                            if (i18 > aVar3.f2231b) {
                                aVar2.f2233d = i18 - aVar3.f2233d;
                            }
                        } else {
                            if (aVar != null) {
                                i15 = aVar2.f2231b;
                                if (i15 >= aVar.f2231b) {
                                    aVar2.f2231b = i15 - aVar.f2233d;
                                }
                                i16 = aVar2.f2233d;
                                if (i16 >= aVar.f2231b) {
                                    aVar2.f2233d = i16 - aVar.f2233d;
                                }
                            }
                            i13 = aVar2.f2231b;
                            if (i13 >= aVar3.f2231b) {
                                aVar2.f2231b = i13 - aVar3.f2233d;
                            }
                            i14 = aVar2.f2233d;
                            if (i14 >= aVar3.f2231b) {
                                aVar2.f2233d = i14 - aVar3.f2233d;
                            }
                        }
                        arrayList.set(size, aVar3);
                        if (aVar2.f2231b != aVar2.f2233d) {
                            arrayList.set(i21, aVar2);
                        } else {
                            arrayList.remove(i21);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                    arrayList.set(size, aVar3);
                    arrayList.remove(i21);
                    aVar2.f2232c = obj;
                    dVar2.c(aVar2);
                } else {
                    if (z11) {
                        if (aVar != null) {
                            i19 = aVar2.f2231b;
                            if (i19 > aVar.f2231b) {
                                aVar2.f2231b = i19 - aVar.f2233d;
                            }
                            i20 = aVar2.f2233d;
                            if (i20 > aVar.f2231b) {
                                aVar2.f2233d = i20 - aVar.f2233d;
                            }
                        }
                        i17 = aVar2.f2231b;
                        if (i17 > aVar3.f2231b) {
                            aVar2.f2231b = i17 - aVar3.f2233d;
                        }
                        i18 = aVar2.f2233d;
                        if (i18 > aVar3.f2231b) {
                            aVar2.f2233d = i18 - aVar3.f2233d;
                        }
                    } else {
                        if (aVar != null) {
                            i15 = aVar2.f2231b;
                            if (i15 >= aVar.f2231b) {
                                aVar2.f2231b = i15 - aVar.f2233d;
                            }
                            i16 = aVar2.f2233d;
                            if (i16 >= aVar.f2231b) {
                                aVar2.f2233d = i16 - aVar.f2233d;
                            }
                        }
                        i13 = aVar2.f2231b;
                        if (i13 >= aVar3.f2231b) {
                            aVar2.f2231b = i13 - aVar3.f2233d;
                        }
                        i14 = aVar2.f2233d;
                        if (i14 >= aVar3.f2231b) {
                            aVar2.f2233d = i14 - aVar3.f2233d;
                        }
                    }
                    arrayList.set(size, aVar3);
                    if (aVar2.f2231b != aVar2.f2233d) {
                        arrayList.set(i21, aVar2);
                    } else {
                        arrayList.remove(i21);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i22 == 4) {
                int i35 = aVar2.f2233d;
                int i36 = aVar3.f2231b;
                if (i35 < i36) {
                    aVar3.f2231b = i36 - 1;
                } else {
                    int i37 = aVar3.f2233d;
                    if (i35 < i36 + i37) {
                        aVar3.f2233d = i37 - 1;
                        aVarO = i2Var.o(aVar3.f2232c, 4, aVar2.f2231b, 1);
                    }
                    i10 = aVar2.f2231b;
                    i11 = aVar3.f2231b;
                    if (i10 <= i11) {
                        aVar3.f2231b = i11 + 1;
                    } else {
                        i12 = i11 + aVar3.f2233d;
                        if (i10 < i12) {
                            int i38 = i12 - i10;
                            aVarO2 = i2Var.o(aVar3.f2232c, 4, i10 + 1, i38);
                            aVar3.f2233d -= i38;
                        }
                        arrayList.set(i21, aVar2);
                        if (aVar3.f2233d > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            aVar3.f2232c = null;
                            dVar2.c(aVar3);
                        }
                        if (aVarO != null) {
                            arrayList.add(size, aVarO);
                        }
                        if (aVarO2 != null) {
                            arrayList.add(size, aVarO2);
                        }
                    }
                    aVarO2 = null;
                    arrayList.set(i21, aVar2);
                    if (aVar3.f2233d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2232c = null;
                        dVar2.c(aVar3);
                    }
                    if (aVarO != null) {
                        arrayList.add(size, aVarO);
                    }
                    if (aVarO2 != null) {
                        arrayList.add(size, aVarO2);
                    }
                }
                aVarO = null;
                i10 = aVar2.f2231b;
                i11 = aVar3.f2231b;
                if (i10 <= i11) {
                    aVar3.f2231b = i11 + 1;
                } else {
                    i12 = i11 + aVar3.f2233d;
                    if (i10 < i12) {
                        int i39 = i12 - i10;
                        aVarO2 = i2Var.o(aVar3.f2232c, 4, i10 + 1, i39);
                        aVar3.f2233d -= i39;
                    }
                    arrayList.set(i21, aVar2);
                    if (aVar3.f2233d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2232c = null;
                        dVar2.c(aVar3);
                    }
                    if (aVarO != null) {
                        arrayList.add(size, aVarO);
                    }
                    if (aVarO2 != null) {
                        arrayList.add(size, aVarO2);
                    }
                }
                aVarO2 = null;
                arrayList.set(i21, aVar2);
                if (aVar3.f2233d > 0) {
                    arrayList.set(size, aVar3);
                } else {
                    arrayList.remove(size);
                    aVar3.f2232c = null;
                    dVar2.c(aVar3);
                }
                if (aVarO != null) {
                    arrayList.add(size, aVarO);
                }
                if (aVarO2 != null) {
                    arrayList.add(size, aVarO2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i40 = 0; i40 < size2; i40++) {
            ba.a aVarO4 = (ba.a) arrayList.get(i40);
            int i41 = aVarO4.f2230a;
            if (i41 == 1) {
                r(aVarO4);
            } else if (i41 == 2) {
                int i42 = aVarO4.f2231b;
                int i43 = aVarO4.f2233d + i42;
                int i44 = i42;
                int i45 = 0;
                byte b10 = -1;
                while (i44 < i43) {
                    if (e0Var.b(i44) != null || c(i44)) {
                        if (b10 == 0) {
                            f(o(null, 2, i42, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b7 = 1;
                    } else {
                        if (b10 == 1) {
                            r(o(null, 2, i42, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b7 = 0;
                    }
                    if (z10) {
                        i44 -= i45;
                        i43 -= i45;
                        i45 = 1;
                    } else {
                        i45++;
                    }
                    i44++;
                    b10 = b7;
                }
                if (i45 != aVarO4.f2233d) {
                    aVarO4.f2232c = null;
                    dVar.c(aVarO4);
                    aVarO4 = o(null, 2, i42, i45);
                }
                if (b10 == 0) {
                    f(aVarO4);
                } else {
                    r(aVarO4);
                }
            } else if (i41 == 4) {
                int i46 = aVarO4.f2231b;
                int i47 = aVarO4.f2233d + i46;
                int i48 = i46;
                int i49 = 0;
                byte b11 = -1;
                while (i46 < i47) {
                    if (e0Var.b(i46) != null || c(i46)) {
                        if (b11 == 0) {
                            f(o(aVarO4.f2232c, 4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b11 = 1;
                    } else {
                        if (b11 == 1) {
                            r(o(aVarO4.f2232c, 4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b11 = 0;
                    }
                    i49++;
                    i46++;
                }
                if (i49 != aVarO4.f2233d) {
                    Object obj2 = aVarO4.f2232c;
                    aVarO4.f2232c = null;
                    dVar.c(aVarO4);
                    aVarO4 = o(obj2, 4, i48, i49);
                }
                if (b11 == 0) {
                    f(aVarO4);
                } else {
                    r(aVarO4);
                }
            } else if (i41 == 8) {
                r(aVarO4);
            }
        }
        arrayList.clear();
    }

    public void t(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ba.a aVar = (ba.a) arrayList.get(i10);
            aVar.f2232c = null;
            ((e4.d) this.f2045b).c(aVar);
        }
        arrayList.clear();
    }

    public void u(Runnable runnable) {
        e7.d0 d0Var = (e7.d0) this.f2045b;
        if (d0Var.f5120a.getLooper().getThread().isAlive()) {
            d0Var.d(runnable);
        }
    }

    public void v(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((bd.f) this.f2047d) == null) {
                this.f2047d = new bd.f();
            }
            bd.f fVar = (bd.f) this.f2047d;
            fVar.C = colorStateList;
            fVar.B = true;
        } else {
            this.f2047d = null;
        }
        b();
    }

    public void w(int i10) {
        ta.c0.A(i10 >= 0);
        this.f2044a = i10;
        i(i10);
    }

    public void x(ColorStateList colorStateList) {
        if (((bd.f) this.f2048e) == null) {
            this.f2048e = new bd.f();
        }
        bd.f fVar = (bd.f) this.f2048e;
        fVar.C = colorStateList;
        fVar.B = true;
        b();
    }

    public void y(PorterDuff.Mode mode) {
        if (((bd.f) this.f2048e) == null) {
            this.f2048e = new bd.f();
        }
        bd.f fVar = (bd.f) this.f2048e;
        fVar.D = mode;
        fVar.A = true;
        b();
    }

    public int z(int i10, int i11) {
        int i12;
        int i13;
        e4.d dVar = (e4.d) this.f2045b;
        ArrayList arrayList = (ArrayList) this.f2047d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ba.a aVar = (ba.a) arrayList.get(size);
            int i14 = aVar.f2230a;
            if (i14 == 8) {
                int i15 = aVar.f2231b;
                int i16 = aVar.f2233d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f2231b = i15 + 1;
                            aVar.f2233d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f2231b = i15 - 1;
                            aVar.f2233d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.f2233d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f2233d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f2231b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f2231b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f2231b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f2233d;
                    } else if (i14 == 2) {
                        i10 += aVar.f2233d;
                    }
                } else if (i11 == 1) {
                    aVar.f2231b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f2231b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ba.a aVar2 = (ba.a) arrayList.get(size2);
            if (aVar2.f2230a == 8) {
                int i18 = aVar2.f2233d;
                if (i18 == aVar2.f2231b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f2232c = null;
                    dVar.c(aVar2);
                }
            } else if (aVar2.f2233d <= 0) {
                arrayList.remove(size2);
                aVar2.f2232c = null;
                dVar.c(aVar2);
            }
        }
        return i10;
    }
}
