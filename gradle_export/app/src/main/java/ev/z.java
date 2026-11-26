package ev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class z extends m00.i implements u00.o {
    public final int A;
    public List B;
    public boolean C;

    public z(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z zVar = new z(3, (k00.c) obj3, 0);
                zVar.C = zBooleanValue;
                zVar.B = (List) obj2;
                return zVar.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                z zVar2 = new z(3, (k00.c) obj3, 1);
                zVar2.B = (List) obj;
                zVar2.C = zBooleanValue2;
                return zVar2.invokeSuspend(g00.b0.a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                z zVar3 = new z(3, (k00.c) obj3, 2);
                zVar3.C = zBooleanValue3;
                zVar3.B = (List) obj2;
                return zVar3.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                z zVar4 = new z(3, (k00.c) obj3, 3);
                zVar4.C = zBooleanValue4;
                zVar4.B = (List) obj2;
                return zVar4.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                boolean z = this.C;
                List list = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                boolean z2 = !z;
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(new Integer(((yt.b) it.next()).a));
                }
                return new u(z2, hashSet);
            case 1:
                List list2 = this.B;
                boolean z3 = this.C;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                return z3 ? list2 : h00.x.A;
            case 2:
                boolean z4 = this.C;
                List list3 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                Boolean boolValueOf = Boolean.valueOf(z4);
                ArrayList arrayList = new ArrayList(h00.r.q0(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new Integer(((yt.b) it2.next()).a));
                }
                return new g00.k(boolValueOf, h00.q.G0(arrayList));
            default:
                boolean z5 = this.C;
                List list4 = this.B;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                Boolean boolValueOf2 = Boolean.valueOf(z5);
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new Integer(((yt.b) it3.next()).a));
                }
                return new g00.k(boolValueOf2, h00.q.G0(arrayList2));
        }
    }
}
