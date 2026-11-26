package u9;

import android.graphics.Color;
import android.util.SparseBooleanArray;
import ba.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public final class b {

    public static final m f15144f = new m(24);

    public static final c f15145g = new c();

    public final Object f15146a;

    public final Object f15147b;

    public final Object f15148c;

    public final Cloneable f15149d;

    public final Object f15150e;

    public b(ArrayList arrayList, List list) {
        this.f15146a = list;
        this.f15147b = arrayList;
        this.f15149d = new SparseBooleanArray();
        this.f15148c = new u.e(0);
        int size = list.size();
        int i10 = Integer.MIN_VALUE;
        d dVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar2 = (d) list.get(i11);
            int i12 = dVar2.f15155e;
            if (i12 > i10) {
                dVar = dVar2;
                i10 = i12;
            }
        }
        this.f15150e = dVar;
    }

    public b(int[] iArr, int i10, c[] cVarArr) {
        a aVar;
        this.f15150e = new float[3];
        this.f15149d = cVarArr;
        int[] iArr2 = new int[32768];
        this.f15147b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int iRgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                float[] fArr = (float[]) this.f15150e;
                ThreadLocal threadLocal = q4.a.f12753a;
                q4.a.a(Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb), fArr);
                if (c(fArr)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f15146a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i10) {
            this.f15148c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                ((ArrayList) this.f15148c).add(new d(Color.rgb(b((i18 >> 10) & 31, 5, 8), b((i18 >> 5) & 31, 5, 8), b(i18 & 31, 5, 8)), iArr2[i18]));
            }
            return;
        }
        PriorityQueue<a> priorityQueue = new PriorityQueue(i10, f15144f);
        priorityQueue.offer(new a(this, 0, ((int[]) this.f15146a).length - 1));
        while (priorityQueue.size() < i10 && (aVar = (a) priorityQueue.poll()) != null) {
            int i19 = aVar.f15135b;
            int iMin = aVar.f15134a;
            if ((i19 + 1) - iMin <= 1) {
                break;
            }
            b bVar = aVar.f15143j;
            if ((i19 + 1) - iMin <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i20 = aVar.f15138e - aVar.f15137d;
            int i21 = aVar.f15140g - aVar.f15139f;
            int i22 = aVar.f15142i - aVar.f15141h;
            int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) bVar.f15146a;
            int[] iArr5 = (int[]) bVar.f15147b;
            a(iArr4, i23, iMin, i19);
            Arrays.sort(iArr4, iMin, aVar.f15135b + 1);
            a(iArr4, i23, iMin, aVar.f15135b);
            int i24 = aVar.f15136c / 2;
            int i25 = 0;
            int i26 = iMin;
            while (true) {
                int i27 = aVar.f15135b;
                if (i26 > i27) {
                    break;
                }
                i25 += iArr5[iArr4[i26]];
                if (i25 >= i24) {
                    iMin = Math.min(i27 - 1, i26);
                    break;
                }
                i26++;
            }
            a aVar2 = new a(bVar, iMin + 1, aVar.f15135b);
            aVar.f15135b = iMin;
            aVar.a();
            priorityQueue.offer(aVar2);
            priorityQueue.offer(aVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (a aVar3 : priorityQueue) {
            b bVar2 = aVar3.f15143j;
            int[] iArr6 = (int[]) bVar2.f15146a;
            int[] iArr7 = (int[]) bVar2.f15147b;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = aVar3.f15134a; i32 <= aVar3.f15135b; i32++) {
                int i33 = iArr6[i32];
                int i34 = iArr7[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f3 = i29;
            d dVar = new d(Color.rgb(b(Math.round(i28 / f3), 5, 8), b(Math.round(i30 / f3), 5, 8), b(Math.round(i31 / f3), 5, 8)), i29);
            if (!c(dVar.b())) {
                arrayList.add(dVar);
            }
        }
        this.f15148c = arrayList;
    }

    public static void a(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    public static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public boolean c(float[] fArr) {
        c[] cVarArr = (c[]) this.f15149d;
        if (cVarArr != null && cVarArr.length > 0) {
            for (c cVar : cVarArr) {
                cVar.getClass();
                float f3 = fArr[2];
                if (f3 < 0.95f && f3 > 0.05f) {
                    float f10 = fArr[0];
                    if (f10 < 10.0f || f10 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
