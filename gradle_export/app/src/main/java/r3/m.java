package r3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

public class m implements InputConnection {

    public final b3.a f13081a;

    public InputConnection f13082b;

    public m(InputConnection inputConnection, b3.a aVar) {
        this.f13081a = aVar;
        this.f13082b = inputConnection;
    }

    public final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override
    public final boolean clearMetaKeyStates(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override
    public final void closeConnection() throws Exception {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            if (inputConnection != null) {
                a(inputConnection);
                this.f13082b = null;
            }
            this.f13081a.invoke(this);
        }
    }

    @Override
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }

    @Override
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override
    public final boolean commitText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i10);
        }
        return false;
    }

    @Override
    public final boolean deleteSurroundingText(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override
    public final int getCursorCapsMode(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override
    public final Handler getHandler() {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override
    public final CharSequence getSelectedText(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i10);
        }
        return null;
    }

    @Override
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override
    public final boolean performContextMenuAction(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i10);
        }
        return false;
    }

    @Override
    public final boolean performEditorAction(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i10);
        }
        return false;
    }

    @Override
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override
    public final boolean reportFullscreenMode(boolean z10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z10);
        }
        return false;
    }

    @Override
    public final boolean requestCursorUpdates(int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override
    public final boolean setComposingRegion(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override
    public final boolean setSelection(int i10, int i11) {
        InputConnection inputConnection = this.f13082b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i10, i11);
        }
        return false;
    }
}
