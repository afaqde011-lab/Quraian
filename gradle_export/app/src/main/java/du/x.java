package du;

import android.os.Bundle;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.TafsirPickerLauncher;

public final class x implements d40.j {
    public final int A;
    public final MainActivity B;

    public x(MainActivity mainActivity, int i) {
        this.A = i;
        this.B = mainActivity;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        av.p pVar;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MainActivity mainActivity = this.B;
                oo.c0 c0VarD = mainActivity.getSupportFragmentManager().D("AudioStoryPlayerBottomSheetFragment");
                oo.c0 c0Var = c0VarD instanceof oo.c0 ? c0VarD : null;
                if (zBooleanValue && !mainActivity.M && c0Var == null) {
                    new oo.c0().show(mainActivity.getSupportFragmentManager(), "AudioStoryPlayerBottomSheetFragment");
                } else if (!zBooleanValue && c0Var != null) {
                    c0Var.dismiss();
                }
                mainActivity.O = zBooleanValue && !(c0Var == null && mainActivity.M);
                MainActivity.h(mainActivity);
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                MainActivity mainActivity2 = this.B;
                av.q qVarD = mainActivity2.getSupportFragmentManager().D("BackgroundSoundPickerBottomSheetComposeFragment");
                av.q qVar = qVarD instanceof av.q ? qVarD : null;
                if (zBooleanValue2) {
                    if (qVar == null) {
                        new av.q().show(mainActivity2.getSupportFragmentManager(), "BackgroundSoundPickerBottomSheetComposeFragment");
                    }
                } else if (qVar != null) {
                    qVar.dismiss();
                }
                break;
            case 2:
                FullScreenLauncher fullScreenLauncher = (FullScreenLauncher) obj;
                MainActivity mainActivity3 = this.B;
                av.i iVar = null;
                if (mainActivity3.M) {
                    androidx.fragment.app.j0 j0VarD = mainActivity3.getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment");
                    iVar = j0VarD instanceof av.i ? (av.i) j0VarD : null;
                    if (iVar != null) {
                        iVar.dismiss();
                    }
                    mainActivity3.N = false;
                    MainActivity.h(mainActivity3);
                } else {
                    av.i iVarD = mainActivity3.getSupportFragmentManager().D("BackgroundBottomSheetComposeFragment");
                    av.i iVar2 = iVarD instanceof av.i ? iVarD : null;
                    if (iVar2 != null) {
                        iVar2.setArguments(f50.c.n(new g00.k("launcher", fullScreenLauncher)));
                        iVar = iVar2;
                    }
                    if (fullScreenLauncher != null) {
                        if (iVar == null) {
                            av.i iVar3 = new av.i();
                            iVar3.setArguments(f50.c.n(new g00.k("launcher", fullScreenLauncher)));
                            iVar3.show(mainActivity3.getSupportFragmentManager(), "BackgroundBottomSheetComposeFragment");
                        }
                    } else if (iVar != null) {
                        iVar.dismiss();
                    }
                    mainActivity3.N = fullScreenLauncher != null;
                    MainActivity.h(mainActivity3);
                }
                break;
            case 3:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                MainActivity mainActivity4 = this.B;
                if (mainActivity4.M) {
                    androidx.fragment.app.j0 j0VarD2 = mainActivity4.getSupportFragmentManager().D("ReciterPickerBottomSheetComposeFragment");
                    pVar = j0VarD2 instanceof av.p ? (av.p) j0VarD2 : null;
                    if (pVar != null) {
                        pVar.dismiss();
                    }
                } else {
                    androidx.fragment.app.j0 j0VarD3 = mainActivity4.getSupportFragmentManager().D("ReciterPickerBottomSheetComposeFragment");
                    pVar = j0VarD3 instanceof av.p ? (av.p) j0VarD3 : null;
                    if (zBooleanValue3) {
                        if (pVar == null) {
                            new av.p().show(mainActivity4.getSupportFragmentManager(), "ReciterPickerBottomSheetComposeFragment");
                        }
                    } else if (pVar != null) {
                        pVar.dismiss();
                    }
                }
                break;
            default:
                TafsirPickerLauncher tafsirPickerLauncher = (TafsirPickerLauncher) obj;
                MainActivity mainActivity5 = this.B;
                av.t tVarD = mainActivity5.getSupportFragmentManager().D("TafsirPickerBottomSheetComposeFragment");
                av.t tVar = tVarD instanceof av.t ? tVarD : null;
                if (tafsirPickerLauncher != null) {
                    if (tVar == null) {
                        av.t tVar2 = new av.t();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("launcher", tafsirPickerLauncher);
                        tVar2.setArguments(bundle);
                        tVar2.show(mainActivity5.getSupportFragmentManager(), "TafsirPickerBottomSheetComposeFragment");
                    }
                } else if (tVar != null) {
                    tVar.dismiss();
                }
                break;
        }
        return g00.b0.a;
    }
}
