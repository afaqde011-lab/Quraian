package b5;

import a1.i1;
import a1.j1;
import android.content.ClipData;
import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.internal.m;
import me.i;
import qj.c;

public final class b extends InputConnectionWrapper {

    public final i1 f2161a;

    public b(j1 j1Var, i1 i1Var) {
        super(j1Var, false);
        this.f2161a = i1Var;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Bundle bundle2;
        i iVar = inputContentInfo == null ? null : new i(new c(inputContentInfo, 6), 8);
        this.f2161a.getClass();
        if ((i10 & 1) != 0) {
            try {
                ((InputContentInfo) ((c) iVar.B).B).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((c) iVar.B).B;
                m.c(inputContentInfo2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e3) {
                e3.toString();
            }
        } else {
            bundle2 = bundle;
        }
        c cVar = (c) iVar.B;
        c cVar2 = (c) iVar.B;
        new ClipData(((InputContentInfo) cVar.B).getDescription(), new ClipData.Item(((InputContentInfo) cVar2.B).getContentUri()));
        ((InputContentInfo) cVar2.B).getDescription();
        ((InputContentInfo) cVar2.B).getLinkUri();
        if (bundle2 == null) {
            Bundle bundle3 = Bundle.EMPTY;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
