package gv;

import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerAction$OnCloseScreen;

public final class i implements u00.a {
    public final int A;
    public final c00.x B;

    public i(c00.x xVar, int i) {
        this.A = i;
        this.B = xVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        c00.x xVar = this.B;
        switch (i) {
            case 0:
                xVar.k(SoundEffectPickerAction$OnCloseScreen.INSTANCE);
                break;
            default:
                xVar.k(SoundEffectPickerAction$OnCloseScreen.INSTANCE);
                break;
        }
        return g00.b0.a;
    }
}
