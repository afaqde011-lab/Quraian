package v5;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.w;
import com.google.android.gms.common.api.internal.m0;

public final class h implements DefaultLifecycleObserver {
    public final androidx.lifecycle.q A;

    public h(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.q qVar) {
        this.A = qVar;
    }

    @Override
    public final void onResume(w wVar) {
        a.a(Looper.getMainLooper()).postDelayed(new m0(3), 500L);
        this.A.d(this);
    }
}
