package c7;

import fh.t0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ta.c0;

public final class j {

    public final t0 f2914a;

    public final ArrayList f2915b = new ArrayList();

    public ByteBuffer[] f2916c = new ByteBuffer[0];

    public boolean f2917d;

    public j(t0 t0Var) {
        this.f2914a = t0Var;
        k kVar = k.f2918e;
        this.f2917d = false;
    }

    public final void a() {
        l lVar = l.f2923b;
        ArrayList arrayList = this.f2915b;
        arrayList.clear();
        this.f2917d = false;
        long jG = lVar.f2924a;
        int i10 = 0;
        while (true) {
            t0 t0Var = this.f2914a;
            if (i10 >= t0Var.size()) {
                break;
            }
            m mVar = (m) t0Var.get(i10);
            new l(jG);
            mVar.flush();
            if (mVar.a()) {
                jG = mVar.g(jG);
                c0.A(jG >= 0);
                arrayList.add(mVar);
            }
            i10++;
        }
        this.f2916c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f2916c[i11] = ((m) arrayList.get(i11)).c();
        }
    }

    public final int b() {
        return this.f2916c.length - 1;
    }

    public final boolean c() {
        return this.f2917d && ((m) this.f2915b.get(b())).b() && !this.f2916c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f2915b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f2916c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f2915b;
                    m mVar = (m) arrayList.get(i10);
                    if (!mVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f2916c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : m.f2925a;
                        long jRemaining = byteBuffer2.remaining();
                        mVar.d(byteBuffer2);
                        this.f2916c[i10] = mVar.c();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f2916c[i10].hasRemaining();
                    } else if (!this.f2916c[i10].hasRemaining() && i10 < b()) {
                        ((m) arrayList.get(i10 + 1)).f();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        t0 t0Var = ((j) obj).f2914a;
        t0 t0Var2 = this.f2914a;
        if (t0Var2.size() != t0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < t0Var2.size(); i10++) {
            if (t0Var2.get(i10) != t0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2914a.hashCode();
    }
}
