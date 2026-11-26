package lu;

import java.util.LinkedHashSet;
import java.util.Set;

public final class a0 {
    public final u30.b a;
    public final u30.f b;
    public final int c;
    public final boolean d;
    public final Set e;
    public final boolean f;

    public a0(u30.b bVar, u30.f stepStates, int i, boolean z, Set loadedStepIds, boolean z2) {
        kotlin.jvm.internal.m.e(stepStates, "stepStates");
        kotlin.jvm.internal.m.e(loadedStepIds, "loadedStepIds");
        this.a = bVar;
        this.b = stepStates;
        this.c = i;
        this.d = z;
        this.e = loadedStepIds;
        this.f = z2;
    }

    public static a0 a(a0 a0Var, u30.f fVar, int i, boolean z, LinkedHashSet linkedHashSet, boolean z2, int i2) {
        u30.f stepStates = fVar;
        u30.b bVar = a0Var.a;
        if ((i2 & 2) != 0) {
            stepStates = a0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = a0Var.c;
        }
        if ((i2 & 8) != 0) {
            z = a0Var.d;
        }
        Set loadedStepIds = linkedHashSet;
        if ((i2 & 16) != 0) {
            loadedStepIds = a0Var.e;
        }
        if ((i2 & 32) != 0) {
            z2 = a0Var.f;
        }
        boolean z3 = z2;
        a0Var.getClass();
        kotlin.jvm.internal.m.e(stepStates, "stepStates");
        kotlin.jvm.internal.m.e(loadedStepIds, "loadedStepIds");
        Set set = loadedStepIds;
        boolean z4 = z;
        return new a0(bVar, stepStates, i, z4, set, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.a, a0Var.a) && kotlin.jvm.internal.m.a(this.b, a0Var.b) && this.c == a0Var.c && this.d == a0Var.d && kotlin.jvm.internal.m.a(this.e, a0Var.e) && this.f == a0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + w.c.e(w.c.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31);
    }

    public final String toString() {
        return "OnboardingUiState(pages=" + this.a + ", stepStates=" + this.b + ", currentPage=" + this.c + ", isLastPage=" + this.d + ", loadedStepIds=" + this.e + ", isNotificationPermissionGranted=" + this.f + ")";
    }
}
