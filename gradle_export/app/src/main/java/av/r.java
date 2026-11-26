package av;

import android.os.Bundle;
import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerAction$OnCloseScreen;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.TafsirPickerLauncher;
import g00.b0;

public final class r implements u00.a {
    public final int A;
    public final t B;

    public r(t tVar, int i) {
        this.A = i;
        this.B = tVar;
    }

    @Override
    public final Object invoke() {
        ot.e kind;
        int i = this.A;
        t tVar = this.B;
        switch (i) {
            case 0:
                Bundle arguments = tVar.getArguments();
                TafsirPickerLauncher tafsirPickerLauncher = arguments != null ? (TafsirPickerLauncher) arguments.getParcelable("launcher", TafsirPickerLauncher.class) : null;
                if (tafsirPickerLauncher == null || (kind = tafsirPickerLauncher.getKind()) == null) {
                    kind = ot.e.TAFSIR;
                }
                return kh.n.T(new Object[]{kind});
            default:
                ((qt.k) tVar.C.getValue()).k(TafsirPickerAction$OnCloseScreen.INSTANCE);
                return b0.a;
        }
    }
}
