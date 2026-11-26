package du;

import androidx.fragment.app.i1;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;

public final class z extends a10.h0 {
    public final MainActivity f;

    public z(MainActivity mainActivity) {
        this.f = mainActivity;
    }

    @Override
    public final void J(i1 i1Var, androidx.fragment.app.j0 fragment) {
        String tag;
        kotlin.jvm.internal.m.e(fragment, "fragment");
        ?? r2 = this.f;
        if (r2.isChangingConfigurations() || (tag = fragment.getTag()) == null) {
            return;
        }
        int iHashCode = tag.hashCode();
        if (iHashCode != -1506883236) {
            if (iHashCode != -595252828 || !tag.equals("AudioStoryPlayerBottomSheetFragment")) {
                return;
            } else {
                r2.O = false;
            }
        } else if (!tag.equals("BackgroundBottomSheetComposeFragment")) {
            return;
        } else {
            r2.N = false;
        }
        MainActivity.h(r2);
    }
}
