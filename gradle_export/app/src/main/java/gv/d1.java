package gv;

import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerAction$OnCloseScreen;

public final class d1 implements u00.a {
    public final int A;
    public final qt.k B;

    public d1(qt.k kVar, int i) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        qt.k kVar = this.B;
        switch (i) {
            case 0:
                kVar.k(TafsirPickerAction$OnCloseScreen.INSTANCE);
                break;
            default:
                kVar.k(TafsirPickerAction$OnCloseScreen.INSTANCE);
                break;
        }
        return g00.b0.a;
    }
}
