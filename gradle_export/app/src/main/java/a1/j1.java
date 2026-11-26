package a1;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class j1 extends InputConnectionWrapper {
    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return true;
    }
}
