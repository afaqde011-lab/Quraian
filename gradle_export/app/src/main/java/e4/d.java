package e4;

import kotlin.jvm.internal.m;

public class d {

    public final Object[] f5081a;

    public int f5082b;

    public d() {
        this.f5081a = new Object[256];
    }

    public d(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5081a = new Object[i10];
    }

    public Object a() {
        int i10 = this.f5082b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f5081a;
        Object obj = objArr[i11];
        m.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f5082b--;
        return obj;
    }

    public void b(b bVar) {
        int i10 = this.f5082b;
        Object[] objArr = this.f5081a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f5082b = i10 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z10;
        m.e(obj, "instance");
        int i10 = this.f5082b;
        int i11 = 0;
        while (true) {
            objArr = this.f5081a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == obj) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f5082b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = obj;
        this.f5082b = i12 + 1;
        return true;
    }
}
