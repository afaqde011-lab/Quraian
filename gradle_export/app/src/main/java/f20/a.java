package f20;

import e30.w;
import e7.l0;
import java.util.ArrayList;
import java.util.List;

public final class a implements u00.a {
    public final int A = 1;
    public final List B;

    public a(List list) {
        this.B = list;
    }

    public a(List list, l0 l0Var) {
        this.B = list;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (h30.g gVar : this.B) {
                    kotlin.jvm.internal.m.e(gVar, "<this>");
                    w wVarG = e30.c.g((w) gVar);
                    if (wVarG != null) {
                        arrayList.add(wVarG);
                    }
                }
                return arrayList;
            default:
                return this.B;
        }
    }
}
