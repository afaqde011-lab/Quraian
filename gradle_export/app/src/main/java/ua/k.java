package ua;

public abstract class k extends j {

    public q4.c[] f15201a;

    public String f15202b;

    public int f15203c;

    public k() {
        this.f15201a = null;
        this.f15203c = 0;
    }

    public k(k kVar) {
        this.f15201a = null;
        this.f15203c = 0;
        this.f15202b = kVar.f15202b;
        this.f15201a = va.a.F(kVar.f15201a);
    }

    public q4.c[] getPathData() {
        return this.f15201a;
    }

    public String getPathName() {
        return this.f15202b;
    }

    public void setPathData(q4.c[] cVarArr) {
        q4.c[] cVarArr2 = this.f15201a;
        boolean z10 = false;
        if (cVarArr2 != null && cVarArr != null && cVarArr2.length == cVarArr.length) {
            int i10 = 0;
            while (true) {
                if (i10 >= cVarArr2.length) {
                    z10 = true;
                    break;
                }
                q4.c cVar = cVarArr2[i10];
                char c10 = cVar.f12759a;
                q4.c cVar2 = cVarArr[i10];
                if (c10 != cVar2.f12759a || cVar.f12760b.length != cVar2.f12760b.length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!z10) {
            this.f15201a = va.a.F(cVarArr);
            return;
        }
        q4.c[] cVarArr3 = this.f15201a;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            cVarArr3[i11].f12759a = cVarArr[i11].f12759a;
            int i12 = 0;
            while (true) {
                float[] fArr = cVarArr[i11].f12760b;
                if (i12 < fArr.length) {
                    cVarArr3[i11].f12760b[i12] = fArr[i12];
                    i12++;
                }
            }
        }
    }
}
