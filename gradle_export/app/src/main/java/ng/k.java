package ng;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class k implements Runnable {
    public final int A;
    public final View B;

    public k(View view, int i10) {
        this.A = i10;
        this.B = view;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                View view = this.B;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                View view2 = this.B;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                break;
        }
    }
}
