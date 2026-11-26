package h00;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class u extends t {
    public static void s0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void t0(List list, Comparator comparator) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
