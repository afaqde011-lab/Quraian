package az;

import com.google.android.gms.internal.measurement.x5;

public final class q {
    public final u30.b a;
    public final u30.c b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public q(u30.b reasons, u30.c selectedReasonIds, String str, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.m.e(reasons, "reasons");
        kotlin.jvm.internal.m.e(selectedReasonIds, "selectedReasonIds");
        this.a = reasons;
        this.b = selectedReasonIds;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static q a(q qVar, u30.c cVar, String otherText, boolean z, boolean z2, boolean z3, int i) {
        u30.c selectedReasonIds = cVar;
        u30.b reasons = qVar.a;
        if ((i & 2) != 0) {
            selectedReasonIds = qVar.b;
        }
        if ((i & 4) != 0) {
            otherText = qVar.c;
        }
        if ((i & 8) != 0) {
            z = qVar.d;
        }
        if ((i & 16) != 0) {
            z2 = qVar.e;
        }
        if ((i & 32) != 0) {
            z3 = qVar.f;
        }
        boolean z4 = z3;
        qVar.getClass();
        kotlin.jvm.internal.m.e(reasons, "reasons");
        kotlin.jvm.internal.m.e(selectedReasonIds, "selectedReasonIds");
        kotlin.jvm.internal.m.e(otherText, "otherText");
        boolean z5 = z2;
        boolean z6 = z;
        return new q(reasons, selectedReasonIds, otherText, z6, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.a, qVar.a) && kotlin.jvm.internal.m.a(this.b, qVar.b) && kotlin.jvm.internal.m.a(this.c, qVar.c) && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + w.c.e(w.c.e(x5.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "DeleteAccountQuestionnaireUiState(reasons=" + this.a + ", selectedReasonIds=" + this.b + ", otherText=" + this.c + ", isOtherSelected=" + this.d + ", isContinueButtonAvailable=" + this.e + ", isLoading=" + this.f + ")";
    }
}
