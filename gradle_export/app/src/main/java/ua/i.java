package ua;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

public final class i extends j {

    public final Matrix f15190a;

    public final ArrayList f15191b;

    public float f15192c;

    public float f15193d;

    public float f15194e;

    public float f15195f;

    public float f15196g;

    public float f15197h;

    public float f15198i;

    public final Matrix f15199j;

    public String f15200k;

    public i() {
        this.f15190a = new Matrix();
        this.f15191b = new ArrayList();
        this.f15192c = 0.0f;
        this.f15193d = 0.0f;
        this.f15194e = 0.0f;
        this.f15195f = 1.0f;
        this.f15196g = 1.0f;
        this.f15197h = 0.0f;
        this.f15198i = 0.0f;
        this.f15199j = new Matrix();
        this.f15200k = null;
    }

    public i(i iVar, u.e eVar) {
        k gVar;
        this.f15190a = new Matrix();
        this.f15191b = new ArrayList();
        this.f15192c = 0.0f;
        this.f15193d = 0.0f;
        this.f15194e = 0.0f;
        this.f15195f = 1.0f;
        this.f15196g = 1.0f;
        this.f15197h = 0.0f;
        this.f15198i = 0.0f;
        Matrix matrix = new Matrix();
        this.f15199j = matrix;
        this.f15200k = null;
        this.f15192c = iVar.f15192c;
        this.f15193d = iVar.f15193d;
        this.f15194e = iVar.f15194e;
        this.f15195f = iVar.f15195f;
        this.f15196g = iVar.f15196g;
        this.f15197h = iVar.f15197h;
        this.f15198i = iVar.f15198i;
        String str = iVar.f15200k;
        this.f15200k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(iVar.f15199j);
        ArrayList arrayList = iVar.f15191b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f15191b.add(new i((i) obj, eVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.f15182e = 0.0f;
                    hVar2.f15184g = 1.0f;
                    hVar2.f15185h = 1.0f;
                    hVar2.f15186i = 0.0f;
                    hVar2.f15187j = 1.0f;
                    hVar2.f15188k = 0.0f;
                    hVar2.l = Paint.Cap.BUTT;
                    hVar2.m = Paint.Join.MITER;
                    hVar2.f15189n = 4.0f;
                    hVar2.f15181d = hVar.f15181d;
                    hVar2.f15182e = hVar.f15182e;
                    hVar2.f15184g = hVar.f15184g;
                    hVar2.f15183f = hVar.f15183f;
                    hVar2.f15203c = hVar.f15203c;
                    hVar2.f15185h = hVar.f15185h;
                    hVar2.f15186i = hVar.f15186i;
                    hVar2.f15187j = hVar.f15187j;
                    hVar2.f15188k = hVar.f15188k;
                    hVar2.l = hVar.l;
                    hVar2.m = hVar.m;
                    hVar2.f15189n = hVar.f15189n;
                    gVar = hVar2;
                } else {
                    if (!(obj instanceof g)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    gVar = new g((g) obj);
                }
                this.f15191b.add(gVar);
                Object obj2 = gVar.f15202b;
                if (obj2 != null) {
                    eVar.put(obj2, gVar);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15191b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f15191b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((j) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.f15199j;
        matrix.reset();
        matrix.postTranslate(-this.f15193d, -this.f15194e);
        matrix.postScale(this.f15195f, this.f15196g);
        matrix.postRotate(this.f15192c, 0.0f, 0.0f);
        matrix.postTranslate(this.f15197h + this.f15193d, this.f15198i + this.f15194e);
    }

    public String getGroupName() {
        return this.f15200k;
    }

    public Matrix getLocalMatrix() {
        return this.f15199j;
    }

    public float getPivotX() {
        return this.f15193d;
    }

    public float getPivotY() {
        return this.f15194e;
    }

    public float getRotation() {
        return this.f15192c;
    }

    public float getScaleX() {
        return this.f15195f;
    }

    public float getScaleY() {
        return this.f15196g;
    }

    public float getTranslateX() {
        return this.f15197h;
    }

    public float getTranslateY() {
        return this.f15198i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f15193d) {
            this.f15193d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f15194e) {
            this.f15194e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f15192c) {
            this.f15192c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f15195f) {
            this.f15195f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f15196g) {
            this.f15196g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f15197h) {
            this.f15197h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f15198i) {
            this.f15198i = f3;
            c();
        }
    }
}
