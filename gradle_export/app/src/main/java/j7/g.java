package j7;

import androidx.media3.common.j2;
import androidx.media3.common.k2;
import s7.a0;

public final class g {

    public final String f8208a;

    public int f8209b;

    public long f8210c;

    public final a0 f8211d;

    public boolean f8212e;

    public boolean f8213f;

    public final h f8214g;

    public g(h hVar, String str, int i10, a0 a0Var) {
        this.f8214g = hVar;
        this.f8208a = str;
        this.f8209b = i10;
        this.f8210c = a0Var == null ? -1L : a0Var.f13647d;
        if (a0Var == null || !a0Var.b()) {
            return;
        }
        this.f8211d = a0Var;
    }

    public final boolean a(a aVar) {
        a0 a0Var = aVar.f8201d;
        k2 k2Var = aVar.f8199b;
        if (a0Var == null) {
            return this.f8209b != aVar.f8200c;
        }
        long j9 = this.f8210c;
        if (j9 == -1) {
            return false;
        }
        if (a0Var.f13647d > j9) {
            return true;
        }
        a0 a0Var2 = this.f8211d;
        if (a0Var2 == null) {
            return false;
        }
        int i10 = a0Var2.f13645b;
        int indexOfPeriod = k2Var.getIndexOfPeriod(a0Var.f13644a);
        int indexOfPeriod2 = k2Var.getIndexOfPeriod(a0Var2.f13644a);
        if (a0Var.f13647d < a0Var2.f13647d || indexOfPeriod < indexOfPeriod2) {
            return false;
        }
        if (indexOfPeriod > indexOfPeriod2) {
            return true;
        }
        if (!a0Var.b()) {
            int i11 = a0Var.f13648e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = a0Var.f13645b;
        int i13 = a0Var.f13646c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > a0Var2.f13646c;
        }
        return true;
    }

    public final boolean b(k2 k2Var, k2 k2Var2) {
        int i10 = this.f8209b;
        if (i10 < k2Var.getWindowCount()) {
            h hVar = this.f8214g;
            j2 j2Var = hVar.f8217a;
            j2 j2Var2 = hVar.f8217a;
            k2Var.getWindow(i10, j2Var);
            int i11 = j2Var2.f1294n;
            while (true) {
                if (i11 > j2Var2.f1295o) {
                    i10 = -1;
                    break;
                }
                int indexOfPeriod = k2Var2.getIndexOfPeriod(k2Var.getUidOfPeriod(i11));
                if (indexOfPeriod != -1) {
                    i10 = k2Var2.getPeriod(indexOfPeriod, hVar.f8218b).f1233c;
                    break;
                }
                i11++;
            }
        } else if (i10 >= k2Var2.getWindowCount()) {
            i10 = -1;
            break;
        }
        this.f8209b = i10;
        if (i10 == -1) {
            return false;
        }
        a0 a0Var = this.f8211d;
        return a0Var == null || k2Var2.getIndexOfPeriod(a0Var.f13644a) != -1;
    }
}
