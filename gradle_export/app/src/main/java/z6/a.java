package z6;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

public final class a {

    public final b f17249a;

    public a(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        b bVar = new b();
        bVar.f17250a = str;
        bVar.f17251b = i10;
        bVar.f17252c = i11;
        new MediaSessionManager.RemoteUserInfo(str, i10, i11);
        this.f17249a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f17249a.equals(((a) obj).f17249a);
    }

    public final int hashCode() {
        return this.f17249a.hashCode();
    }
}
