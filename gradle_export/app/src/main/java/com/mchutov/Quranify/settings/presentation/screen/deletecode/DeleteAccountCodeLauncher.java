package com.mchutov.quranify.settings.presentation.screen.deletecode;

import com.google.android.gms.internal.measurement.x5;
import g4.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;
import zy.i;
import zy.j;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/screen/deletecode/DeleteAccountCodeLauncher;", "", "", "reason", "reasonSpecification", "", "resendIn", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lp40/x0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$app_release", "(Lcom/mchutov/quranify/settings/presentation/screen/deletecode/DeleteAccountCodeLauncher;Lo40/b;Ln40/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/mchutov/quranify/settings/presentation/screen/deletecode/DeleteAccountCodeLauncher;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReason", "getReasonSpecification", "I", "getResendIn", "Companion", "zy/i", "zy/j", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeleteAccountCodeLauncher {
    public static final int $stable = 0;
    public static final j Companion = new j();
    private final String reason;
    private final String reasonSpecification;
    private final int resendIn;

    public DeleteAccountCodeLauncher(int i, String str, String str2, int i2, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, i.a.getDescriptor());
            throw null;
        }
        this.reason = str;
        this.reasonSpecification = str2;
        if ((i & 4) == 0) {
            this.resendIn = 0;
        } else {
            this.resendIn = i2;
        }
    }

    public DeleteAccountCodeLauncher(String reason, String reasonSpecification, int i) {
        m.e(reason, "reason");
        m.e(reasonSpecification, "reasonSpecification");
        this.reason = reason;
        this.reasonSpecification = reasonSpecification;
        this.resendIn = i;
    }

    public DeleteAccountCodeLauncher(String str, String str2, int i, int i2, f fVar) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i);
    }

    public static DeleteAccountCodeLauncher copy$default(DeleteAccountCodeLauncher deleteAccountCodeLauncher, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deleteAccountCodeLauncher.reason;
        }
        if ((i2 & 2) != 0) {
            str2 = deleteAccountCodeLauncher.reasonSpecification;
        }
        if ((i2 & 4) != 0) {
            i = deleteAccountCodeLauncher.resendIn;
        }
        return deleteAccountCodeLauncher.copy(str, str2, i);
    }

    public static final void write$Self$app_release(DeleteAccountCodeLauncher self, b output, e serialDesc) {
        output.i(serialDesc, 0, self.reason);
        output.i(serialDesc, 1, self.reasonSpecification);
        if (!output.k(serialDesc) && self.resendIn == 0) {
            return;
        }
        output.w(2, self.resendIn, serialDesc);
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonSpecification() {
        return this.reasonSpecification;
    }

    public final int getResendIn() {
        return this.resendIn;
    }

    public final DeleteAccountCodeLauncher copy(String reason, String reasonSpecification, int resendIn) {
        m.e(reason, "reason");
        m.e(reasonSpecification, "reasonSpecification");
        return new DeleteAccountCodeLauncher(reason, reasonSpecification, resendIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountCodeLauncher)) {
            return false;
        }
        DeleteAccountCodeLauncher deleteAccountCodeLauncher = (DeleteAccountCodeLauncher) other;
        return m.a(this.reason, deleteAccountCodeLauncher.reason) && m.a(this.reasonSpecification, deleteAccountCodeLauncher.reasonSpecification) && this.resendIn == deleteAccountCodeLauncher.resendIn;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonSpecification() {
        return this.reasonSpecification;
    }

    public final int getResendIn() {
        return this.resendIn;
    }

    public int hashCode() {
        return Integer.hashCode(this.resendIn) + x5.e(this.reason.hashCode() * 31, this.reasonSpecification, 31);
    }

    public String toString() {
        return c.g(this.resendIn, ")", a1.b.s("DeleteAccountCodeLauncher(reason=", this.reason, ", reasonSpecification=", this.reasonSpecification, ", resendIn="));
    }
}
