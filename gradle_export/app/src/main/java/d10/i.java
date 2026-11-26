package d10;

import java.lang.reflect.Method;
import java.util.Comparator;

public final class i implements Comparator {
    public final int A;

    public i(int i) {
        this.A = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return p30.f.Z(((w) ((w1) obj)).getName(), ((w) ((w1) obj2)).getName());
            case 1:
                return p30.f.Z(((Method) obj).getName(), ((Method) obj2).getName());
            default:
                r30.j jVar = l1.A;
                Integer numB = j10.p.b((j10.o) obj, (j10.o) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
