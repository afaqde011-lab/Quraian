package w7;

import b3.c0;
import java.util.ArrayList;
import java.util.Collections;

public final class q {

    public static final c0 f15882g = new c0(23);

    public static final c0 f15883h = new c0(24);

    public int f15887d;

    public int f15888e;

    public int f15889f;

    public final p[] f15885b = new p[5];

    public final ArrayList f15884a = new ArrayList();

    public int f15886c = -1;

    public final void a(float f3, int i10) {
        p pVar;
        int i11 = this.f15886c;
        ArrayList arrayList = this.f15884a;
        if (i11 != 1) {
            Collections.sort(arrayList, f15882g);
            this.f15886c = 1;
        }
        int i12 = this.f15889f;
        p[] pVarArr = this.f15885b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f15889f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new p();
        }
        int i14 = this.f15887d;
        this.f15887d = i14 + 1;
        pVar.f15879a = i14;
        pVar.f15880b = i10;
        pVar.f15881c = f3;
        arrayList.add(pVar);
        this.f15888e += i10;
        while (true) {
            int i15 = this.f15888e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            p pVar2 = (p) arrayList.get(0);
            int i17 = pVar2.f15880b;
            if (i17 <= i16) {
                this.f15888e -= i17;
                arrayList.remove(0);
                int i18 = this.f15889f;
                if (i18 < 5) {
                    this.f15889f = i18 + 1;
                    pVarArr[i18] = pVar2;
                }
            } else {
                pVar2.f15880b = i17 - i16;
                this.f15888e -= i16;
            }
        }
    }

    public final float b() {
        int i10 = this.f15886c;
        ArrayList arrayList = this.f15884a;
        if (i10 != 0) {
            Collections.sort(arrayList, f15883h);
            this.f15886c = 0;
        }
        float f3 = 0.5f * this.f15888e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f15880b;
            if (i11 >= f3) {
                return pVar.f15881c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) g4.c.d(1, arrayList)).f15881c;
    }
}
