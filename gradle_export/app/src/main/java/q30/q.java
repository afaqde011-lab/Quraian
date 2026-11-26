package q30;

import android.view.View;
import android.view.ViewGroup;
import g00.s;
import h00.v;
import java.util.ArrayList;
import java.util.Iterator;

public final class q implements Iterator, v00.a {
    public final int A;
    public Iterator B;
    public final Object C;

    public q(s sVar) {
        this.A = 1;
        this.C = new ArrayList();
        this.B = sVar;
    }

    public q(r rVar) {
        this.A = 0;
        this.C = rVar;
        this.B = rVar.a.iterator();
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                return ((r) this.C).b.invoke(this.B.next());
            default:
                Object next = this.B.next();
                ArrayList arrayList = (ArrayList) this.C;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                s sVar = viewGroup != null ? new s(viewGroup, 7) : null;
                if (sVar == null || !sVar.hasNext()) {
                    while (!this.B.hasNext() && !arrayList.isEmpty()) {
                        this.B = (Iterator) h00.q.T0(arrayList);
                        v.y0(arrayList);
                    }
                } else {
                    arrayList.add(this.B);
                    this.B = sVar;
                }
                return next;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
