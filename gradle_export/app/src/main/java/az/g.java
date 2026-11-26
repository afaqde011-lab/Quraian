package az;

import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;

public final class g implements i {
    public final DeleteAccountCodeLauncher a;

    public g(DeleteAccountCodeLauncher deleteAccountCodeLauncher) {
        this.a = deleteAccountCodeLauncher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenCode(launcher=" + this.a + ")";
    }
}
