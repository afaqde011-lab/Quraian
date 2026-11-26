package o9;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k9.x0;

public final class d {

    public int f11760a;

    public int f11761b;

    public int f11762c;

    public final Object f11763d;

    public Object f11764e;

    public Object f11765f;

    public d(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f11764e = arrayList;
        this.f11760a = 16;
        this.f11761b = 12544;
        this.f11762c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f11765f = arrayList2;
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(u9.b.f15145g);
        this.f11763d = bitmap;
        arrayList.add(u9.e.f15160d);
        arrayList.add(u9.e.f15161e);
        arrayList.add(u9.e.f15162f);
        arrayList.add(u9.e.f15163g);
        arrayList.add(u9.e.f15164h);
        arrayList.add(u9.e.f15165i);
    }

    public d(x0 x0Var, int i10, int i11, int i12, String str) {
        this.f11765f = x0Var;
        this.f11760a = i10;
        this.f11761b = i11;
        this.f11762c = i12;
        this.f11763d = str;
    }

    public d(v5.o oVar) {
        this.f11760a = 1;
        this.f11763d = oVar;
        this.f11764e = oVar;
    }

    public u9.b a() {
        int iMax;
        ArrayList arrayList;
        u9.b bVar;
        ArrayList arrayList2 = (ArrayList) this.f11765f;
        Bitmap bitmap = (Bitmap) this.f11763d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i10 = this.f11762c;
        int i11 = this.f11761b;
        double dSqrt = -1.0d;
        if (i11 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i11) {
                dSqrt = Math.sqrt(((double) i11) / ((double) height));
            }
        } else if (i10 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i10) {
            dSqrt = ((double) i10) / ((double) iMax);
        }
        int i12 = 0;
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        u9.b bVar2 = new u9.b(iArr, this.f11760a, arrayList2.isEmpty() ? null : (u9.c[]) arrayList2.toArray(new u9.c[arrayList2.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) bVar2.f15148c;
        ArrayList arrayList4 = (ArrayList) this.f11764e;
        u9.b bVar3 = new u9.b(arrayList4, arrayList3);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) bVar3.f15149d;
        int size = arrayList4.size();
        int i13 = 0;
        while (i13 < size) {
            u9.e eVar = (u9.e) arrayList4.get(i13);
            float[] fArr = eVar.f15168c;
            float[] fArr2 = eVar.f15166a;
            int length = fArr.length;
            float f3 = 0.0f;
            float f10 = 0.0f;
            for (int i14 = i12; i14 < length; i14++) {
                float f11 = fArr[i14];
                if (f11 > 0.0f) {
                    f10 += f11;
                }
            }
            if (f10 != 0.0f) {
                int length2 = fArr.length;
                for (int i15 = i12; i15 < length2; i15++) {
                    float f12 = fArr[i15];
                    if (f12 > 0.0f) {
                        fArr[i15] = f12 / f10;
                    }
                }
            }
            u.e eVar2 = (u.e) bVar3.f15148c;
            List list = (List) bVar3.f15146a;
            int size2 = list.size();
            int i16 = i12;
            float f13 = 0.0f;
            u9.d dVar = null;
            while (i16 < size2) {
                u9.d dVar2 = (u9.d) list.get(i16);
                float[] fArrB = dVar2.b();
                float f14 = fArrB[1];
                float f15 = f3;
                float[] fArr3 = eVar.f15167b;
                if (f14 < fArr2[i16] || f14 > fArr2[2]) {
                    arrayList = arrayList4;
                    bVar = bVar3;
                } else {
                    float f16 = fArrB[2];
                    if (f16 < fArr3[i16] || f16 > fArr3[2] || sparseBooleanArray.get(dVar2.f15154d)) {
                        arrayList = arrayList4;
                        bVar = bVar3;
                    } else {
                        float[] fArrB2 = dVar2.b();
                        arrayList = arrayList4;
                        u9.d dVar3 = (u9.d) bVar3.f15150e;
                        int i17 = dVar3 != null ? dVar3.f15155e : 1;
                        bVar = bVar3;
                        float[] fArr4 = eVar.f15168c;
                        float f17 = fArr4[i16];
                        float fAbs = f17 > f15 ? (1.0f - Math.abs(fArrB2[1] - fArr2[1])) * f17 : f15;
                        float f18 = fArr4[1];
                        float fAbs2 = f18 > f15 ? (1.0f - Math.abs(fArrB2[2] - fArr3[1])) * f18 : f15;
                        float f19 = fArr4[2];
                        float f20 = fAbs + fAbs2 + (f19 > f15 ? (dVar2.f15155e / i17) * f19 : f15);
                        if (dVar == null || f20 > f13) {
                            dVar = dVar2;
                            f13 = f20;
                        }
                    }
                }
                i16++;
                f3 = f15;
                arrayList4 = arrayList;
                bVar3 = bVar;
            }
            ArrayList arrayList5 = arrayList4;
            u9.b bVar4 = bVar3;
            if (dVar != null) {
                sparseBooleanArray.append(dVar.f15154d, true);
            }
            eVar2.put(eVar, dVar);
            i13++;
            i12 = i16;
            arrayList4 = arrayList5;
            bVar3 = bVar4;
        }
        u9.b bVar5 = bVar3;
        sparseBooleanArray.clear();
        return bVar5;
    }

    public void b() {
        this.f11760a = 1;
        this.f11764e = (v5.o) this.f11763d;
        this.f11762c = 0;
    }

    public boolean c() {
        w5.a aVarB = ((v5.o) this.f11764e).f15476b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) ((i00.e) aVarB).D).get(iA + ((i00.e) aVarB).A) == 0) || this.f11761b == 65039;
    }
}
