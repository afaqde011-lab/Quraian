package i00;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;
import tf.y;
import z4.h0;
import z4.j0;

public abstract class e {
    public int A;
    public int B;
    public int C;
    public Object D;

    public e() {
        if (y.N == null) {
            y.N = new y(16);
        }
    }

    public int a(int i) {
        if (i < this.C) {
            return ((ByteBuffer) this.D).getShort(this.B + i);
        }
        return 0;
    }

    public void c() {
        if (((f) this.D).H != this.C) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object e(View view);

    public abstract void g(View view, Object obj);

    public void h() {
        while (true) {
            int i = this.A;
            f fVar = (f) this.D;
            if (i >= fVar.F || fVar.C[i] >= 0) {
                return;
            } else {
                this.A = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.A < ((f) this.D).F;
    }

    public void i(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.B) {
            g(view, obj);
            return;
        }
        z4.b bVar = null;
        if (Build.VERSION.SDK_INT >= this.B) {
            tag = e(view);
        } else {
            tag = view.getTag(this.A);
            if (!((Class) this.D).isInstance(tag)) {
                tag = null;
            }
        }
        if (j(tag, obj)) {
            WeakHashMap weakHashMap = j0.a;
            z4.a aVarA = h0.a(view);
            if (aVarA != null) {
                bVar = aVarA instanceof z4.a ? aVarA.a : new z4.b(aVarA);
            }
            if (bVar == null) {
                bVar = new z4.b();
            }
            j0.g(view, bVar);
            view.setTag(this.A, obj);
            j0.d(view, this.C);
        }
    }

    public abstract boolean j(Object obj, Object obj2);

    public void remove() {
        f fVar = (f) this.D;
        c();
        if (this.B == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.e();
        fVar.o(this.B);
        this.B = -1;
        this.C = fVar.H;
    }
}
