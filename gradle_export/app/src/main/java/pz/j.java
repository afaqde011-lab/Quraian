package pz;

import com.google.android.gms.internal.measurement.x5;

public final class j {
    public final boolean a;
    public final u30.b b;
    public final u30.c c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public j(boolean z, u30.b reasons, u30.c selectedReasonIds, String str, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.m.e(reasons, "reasons");
        kotlin.jvm.internal.m.e(selectedReasonIds, "selectedReasonIds");
        this.a = z;
        this.b = reasons;
        this.c = selectedReasonIds;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static j a(j jVar, boolean z, u30.c cVar, String str, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = jVar.a;
        }
        boolean z5 = z;
        u30.b reasons = jVar.b;
        if ((i & 4) != 0) {
            cVar = jVar.c;
        }
        u30.c selectedReasonIds = cVar;
        if ((i & 8) != 0) {
            str = jVar.d;
        }
        String otherText = str;
        if ((i & 16) != 0) {
            z2 = jVar.e;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = jVar.f;
        }
        boolean z7 = z3;
        if ((i & 64) != 0) {
            z4 = jVar.g;
        }
        jVar.getClass();
        kotlin.jvm.internal.m.e(reasons, "reasons");
        kotlin.jvm.internal.m.e(selectedReasonIds, "selectedReasonIds");
        kotlin.jvm.internal.m.e(otherText, "otherText");
        return new j(z5, reasons, selectedReasonIds, otherText, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && kotlin.jvm.internal.m.a(this.b, jVar.b) && kotlin.jvm.internal.m.a(this.c, jVar.c) && kotlin.jvm.internal.m.a(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && this.g == jVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + w.c.e(w.c.e(x5.e((this.c.hashCode() + g4.c.c(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, this.d, 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellationQuestionnaireUiState(isLoading=");
        sb.append(this.a);
        sb.append(", reasons=");
        sb.append(this.b);
        sb.append(", selectedReasonIds=");
        sb.append(this.c);
        sb.append(", otherText=");
        sb.append(this.d);
        sb.append(", isOtherSelected=");
        oi.k.y(sb, this.e, ", isContinueButtonAvailable=", this.f, ", isManageInStoreSheetVisible=");
        return g4.c.l(sb, this.g, ")");
    }
}
