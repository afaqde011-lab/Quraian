package c50;

import b50.j;
import h00.x;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import k0.t;
import k0.u;
import k0.v;
import kotlin.jvm.internal.m;
import l0.k;
import qd.s0;
import th.o;
import x40.b0;
import x40.q;
import x40.r;

public final class f {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public f(j jVar, ArrayList arrayList, int i, b50.e eVar, o request, int i2, int i3, int i4) {
        m.e(request, "request");
        this.g = jVar;
        this.a = arrayList;
        this.b = i;
        this.h = eVar;
        this.i = request;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public f(i iVar) {
        this.g = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = x.A;
    }

    public static f a(f fVar, int i, b50.e eVar, o oVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = (b50.e) fVar.h;
        }
        b50.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            oVar = (o) fVar.i;
        }
        o request = oVar;
        int i4 = fVar.c;
        int i5 = fVar.d;
        int i6 = fVar.e;
        m.e(request, "request");
        return new f((j) fVar.g, fVar.a, i3, eVar2, request, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((((double) e()) * 1.0d) / ((double) this.f))) + 1;
    }

    public v c(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ?? r12;
        ArrayList arrayList = (ArrayList) this.h;
        if (!((i) this.g).e) {
            int i5 = this.f;
            int i6 = i * i5;
            int iE = e() - i6;
            if (i5 > iE) {
                i5 = iE;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.i.size()) {
                r12 = this.i;
            } else {
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList2.add(new k0.d(s0.H(1)));
                }
                this.i = arrayList2;
                r12 = arrayList2;
            }
            return new v(i6, (List) r12);
        }
        int iB = i / b();
        ArrayList arrayList3 = this.a;
        int iMin = Math.min(iB, arrayList3.size() - 1);
        int iB2 = b() * iMin;
        int iIntValue = ((t) arrayList3.get(iMin)).a;
        int iG = ((t) arrayList3.get(iMin)).b;
        int i8 = this.b;
        if (iB2 <= i8 && i8 <= i) {
            iIntValue = this.c;
            iG = this.d;
            iB2 = i8;
        } else if (iMin == this.e && (i2 = i - iB2) < arrayList.size()) {
            iIntValue = ((Number) arrayList.get(i2)).intValue();
            iB2 = i;
            iG = 0;
        }
        if (iB2 % b() == 0) {
            int i9 = i - iB2;
            z = 2 <= i9 && i9 < b();
        }
        if (z) {
            this.e = iMin;
            arrayList.clear();
        }
        if (iB2 > i) {
            g0.a.c("currentLine (" + iB2 + ") > lineIndex (" + i + ')');
        }
        while (iB2 < i && iIntValue < e()) {
            if (z) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
            int i11 = 0;
            while (i11 < this.f && iIntValue < e()) {
                if (iG == 0) {
                    i4 = iG;
                    iG = g(iIntValue);
                } else {
                    i4 = 0;
                }
                i11 += iG;
                if (i11 > this.f) {
                    break;
                }
                iIntValue++;
                iG = i4;
            }
            iB2++;
            if (iB2 % b() == 0 && iIntValue < e()) {
                if (arrayList3.size() != iB2 / b()) {
                    g0.a.c("invalid starting point");
                }
                arrayList3.add(new t(iIntValue, iG));
            }
        }
        this.b = i;
        this.c = iIntValue;
        this.d = iG;
        ArrayList arrayList4 = new ArrayList();
        int i12 = 0;
        int i13 = iIntValue;
        while (i12 < this.f && i13 < e()) {
            if (iG == 0) {
                int i14 = iG;
                iG = g(i13);
                i3 = i14;
            } else {
                i3 = 0;
            }
            i12 += iG;
            if (i12 > this.f) {
                break;
            }
            i13++;
            arrayList4.add(new k0.d(s0.H(iG)));
            iG = i3;
        }
        return new v(iIntValue, arrayList4);
    }

    public int d(int i) {
        int i2;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            g0.a.a("ItemIndex > total count");
        }
        if (!((i) this.g).e) {
            return i / this.f;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        va.a.Z(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((t) arrayList.get(i2)).a - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int iB = b() * i2;
        int i6 = ((t) arrayList.get(i2)).a;
        if (i6 > i) {
            g0.a.a("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int iG = g(i6);
            i7 += iG;
            int i9 = this.f;
            if (i7 >= i9) {
                if (i7 == i9) {
                    iB++;
                    i7 = 0;
                } else {
                    iB++;
                    i7 = iG;
                }
            }
            if (iB % b() == 0 && iB / b() >= arrayList.size()) {
                arrayList.add(new t(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return g(i) + i7 > this.f ? iB + 1 : iB;
    }

    public int e() {
        return ((i) this.g).d.B;
    }

    public b0 f(o request) {
        b50.e eVar = (b50.e) this.h;
        m.e(request, "request");
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f++;
        if (eVar != null) {
            if (!((b50.f) eVar.c).b((q) request.C)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f fVarA = a(this, i2, null, request, 58);
        r rVar = (r) arrayList.get(i);
        b0 b0VarA = rVar.a(fVarA);
        if (b0VarA == null) {
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        if (eVar != null && i2 < arrayList.size() && fVarA.f != 1) {
            throw new IllegalStateException(("network interceptor " + rVar + " must call proceed() exactly once").toString());
        }
        if (b0VarA.G != null) {
            return b0VarA;
        }
        throw new IllegalStateException(("interceptor " + rVar + " returned a response with no body").toString());
    }

    public int g(int i) {
        u.b = this.f;
        k kVarK = ((i) this.g).d.k(i);
        int i2 = i - kVarK.a;
        return (int) ((k0.d) kVarK.c.b.invoke(u.a, Integer.valueOf(i2))).a;
    }
}
