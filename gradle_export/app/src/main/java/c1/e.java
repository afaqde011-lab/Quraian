package c1;

import java.util.List;
import z1.p;

public final class e {

    public final int f2607a;

    public final p f2608b;

    public final p f2609c;

    public e(List list, List list2, int i10) {
        this.f2607a = i10;
        if (!(i10 >= 0)) {
            g0.a.a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i10)) {
            g0.a.a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        p pVar = new p();
        pVar.addAll(list);
        this.f2608b = pVar;
        p pVar2 = new p();
        pVar2.addAll(list2);
        this.f2609c = pVar2;
    }
}
