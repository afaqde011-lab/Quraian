package l0;

import java.util.List;

public final class i1 {

    public final List f9751a;

    public final List[] f9752b;

    public int f9753c;

    public int f9754d;

    public boolean f9755e;

    public final j1 f9756f;

    public i1(j1 j1Var, List list) {
        this.f9756f = j1Var;
        this.f9751a = list;
        this.f9752b = new List[list.size()];
        if (list.isEmpty()) {
            g0.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
