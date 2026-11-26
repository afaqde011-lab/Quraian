package h00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ri.t1;

public final class k0 extends m00.h implements u00.n {
    public Object B;
    public Iterator C;
    public int D;
    public int E;
    public int F;
    public Object G;
    public final int H;
    public final int I;
    public final Iterator J;

    public k0(int i, int i2, Iterator it, k00.c cVar) {
        super(2, cVar);
        this.H = i;
        this.I = i2;
        this.J = it;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        k0 k0Var = new k0(this.H, this.I, this.J, cVar);
        k0Var.G = obj;
        return k0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((q30.k) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        i0 i0Var;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        i0 i0Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        q30.k kVar = (q30.k) this.G;
        l00.a aVar = l00.a.A;
        int i9 = this.F;
        int i11 = this.I;
        boolean z2 = true;
        int i12 = this.H;
        if (i9 == 0) {
            t1.O(obj);
            int i13 = i12 <= 1024 ? i12 : 1024;
            i = i11 - i12;
            Iterator it3 = this.J;
            if (i >= 0) {
                arrayList = new ArrayList(i13);
                i4 = i13;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i12) {
                            this.G = kVar;
                            this.B = arrayList;
                            this.C = it2;
                            this.D = i4;
                            this.E = i;
                            this.F = 1;
                            kVar.c(arrayList, this);
                            l00.a aVar2 = l00.a.A;
                            return aVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.G = null;
                    this.B = null;
                    this.C = null;
                    this.D = i4;
                    this.E = i;
                    this.F = 2;
                    kVar.c(arrayList, this);
                    l00.a aVar3 = l00.a.A;
                    return aVar;
                }
            } else {
                i0 i0Var3 = new i0(0, new Object[i13]);
                i2 = i13;
                i3 = i;
                it = it3;
                i0Var = i0Var3;
                while (true) {
                    i6 = i0Var.B;
                    objArr = i0Var.A;
                    if (it.hasNext()) {
                        i7 = i2;
                        i0Var2 = i0Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (i0Var.a() != i6) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i14 = i0Var.C;
                    int i15 = i0Var.D;
                    objArr[(i14 + i15) % i6] = next2;
                    i0Var.D = i15 + 1;
                    if (i0Var.a() != i6) {
                        if (i0Var.D < i12) {
                            ArrayList arrayList2 = new ArrayList(i0Var);
                            this.G = kVar;
                            this.B = i0Var;
                            this.C = it;
                            this.D = i2;
                            this.E = i3;
                            this.F = 3;
                            kVar.c(arrayList2, this);
                            l00.a aVar4 = l00.a.A;
                            return aVar;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i12) {
                            i8 = i12;
                        }
                        if (i0Var.C == 0) {
                            array = Arrays.copyOf(objArr, i8);
                            kotlin.jvm.internal.m.d(array, "copyOf(...)");
                        } else {
                            array = i0Var.toArray(new Object[i8]);
                        }
                        i0Var = new i0(i0Var.D, array);
                    }
                    z2 = z;
                }
                if (i0Var2.D > i11) {
                    ArrayList arrayList3 = new ArrayList(i0Var2);
                    this.G = kVar;
                    this.B = i0Var2;
                    this.C = null;
                    this.D = i7;
                    this.E = i3;
                    this.F = 4;
                    kVar.c(arrayList3, this);
                    l00.a aVar5 = l00.a.A;
                    return aVar;
                }
                if (!i0Var2.isEmpty()) {
                    this.G = null;
                    this.B = null;
                    this.C = null;
                    this.D = i7;
                    this.E = i3;
                    this.F = 5;
                    kVar.c(i0Var2, this);
                    l00.a aVar6 = l00.a.A;
                    return aVar;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.E;
                    i2 = this.D;
                    it = this.C;
                    i0Var = (i0) this.B;
                    t1.O(obj);
                    i0Var.c(i11);
                    while (true) {
                        i6 = i0Var.B;
                        objArr = i0Var.A;
                        if (it.hasNext()) {
                            i7 = i2;
                            i0Var2 = i0Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (i0Var.a() != i6) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i16 = i0Var.C;
                        int i17 = i0Var.D;
                        objArr[(i16 + i17) % i6] = next2;
                        i0Var.D = i17 + 1;
                        if (i0Var.a() != i6) {
                            if (i0Var.D < i12) {
                                ArrayList arrayList4 = new ArrayList(i0Var);
                                this.G = kVar;
                                this.B = i0Var;
                                this.C = it;
                                this.D = i2;
                                this.E = i3;
                                this.F = 3;
                                kVar.c(arrayList4, this);
                                l00.a aVar7 = l00.a.A;
                                return aVar;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i12) {
                                i8 = i12;
                            }
                            if (i0Var.C == 0) {
                                array = Arrays.copyOf(objArr, i8);
                                kotlin.jvm.internal.m.d(array, "copyOf(...)");
                            } else {
                                array = i0Var.toArray(new Object[i8]);
                            }
                            i0Var = new i0(i0Var.D, array);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.E;
                    i7 = this.D;
                    i0Var2 = (i0) this.B;
                    t1.O(obj);
                    i0Var2.c(i11);
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                if (i0Var2.D > i11) {
                    ArrayList arrayList5 = new ArrayList(i0Var2);
                    this.G = kVar;
                    this.B = i0Var2;
                    this.C = null;
                    this.D = i7;
                    this.E = i3;
                    this.F = 4;
                    kVar.c(arrayList5, this);
                    l00.a aVar8 = l00.a.A;
                    return aVar;
                }
                if (!i0Var2.isEmpty()) {
                    this.G = null;
                    this.B = null;
                    this.C = null;
                    this.D = i7;
                    this.E = i3;
                    this.F = 5;
                    kVar.c(i0Var2, this);
                    l00.a aVar9 = l00.a.A;
                    return aVar;
                }
            }
            t1.O(obj);
        } else {
            i5 = this.E;
            i4 = this.D;
            it2 = this.C;
            t1.O(obj);
            arrayList = new ArrayList(i12);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i12) {
                        this.G = kVar;
                        this.B = arrayList;
                        this.C = it2;
                        this.D = i4;
                        this.E = i;
                        this.F = 1;
                        kVar.c(arrayList, this);
                        l00.a aVar10 = l00.a.A;
                        return aVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.G = null;
                this.B = null;
                this.C = null;
                this.D = i4;
                this.E = i;
                this.F = 2;
                kVar.c(arrayList, this);
                l00.a aVar11 = l00.a.A;
                return aVar;
            }
        }
        return g00.b0.a;
    }
}
