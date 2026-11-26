package l1;

import java.util.ArrayList;

public final class i0 {

    public final ArrayList f9869a;

    public final int f9870b;

    public int f9871c;

    public final ArrayList f9872d;

    public final u.w f9873e;

    public final g00.p f9874f;

    public i0(int i10, ArrayList arrayList) {
        this.f9869a = arrayList;
        this.f9870b = i10;
        if (i10 < 0) {
            n1.a("Invalid start index");
        }
        this.f9872d = new ArrayList();
        u.w wVar = new u.w();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            o1.e eVar = (o1.e) this.f9869a.get(i12);
            int i13 = eVar.f11474c;
            int i14 = eVar.f11475d;
            wVar.i(i13, new n1.a(i12, i11, i14));
            i11 += i14;
        }
        this.f9873e = wVar;
        this.f9874f = rd.a.J(new eo.p(this, 8));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        u.w wVar = this.f9873e;
        n1.a aVar = (n1.a) wVar.b(i10);
        if (aVar == null) {
            return false;
        }
        int i13 = aVar.f10999b;
        int i14 = i11 - aVar.f11000c;
        aVar.f11000c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = wVar.f14873c;
        long[] jArr = wVar.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j9 = jArr[i15];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j9) < 128) {
                        n1.a aVar2 = (n1.a) objArr[(i15 << 3) + i17];
                        if (aVar2.f10999b >= i13 && !aVar2.equals(aVar) && (i12 = aVar2.f10999b + i14) >= 0) {
                            aVar2.f10999b = i12;
                        }
                    }
                    j9 >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
