package za;

import android.app.Notification;

public final class m {

    public final int f17391a;

    public final int f17392b;

    public final Notification f17393c;

    public m(int i10, Notification notification, int i11) {
        this.f17391a = i10;
        this.f17393c = notification;
        this.f17392b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f17391a == mVar.f17391a && this.f17392b == mVar.f17392b) {
            return this.f17393c.equals(mVar.f17393c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17393c.hashCode() + (((this.f17391a * 31) + this.f17392b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f17391a + ", mForegroundServiceType=" + this.f17392b + ", mNotification=" + this.f17393c + '}';
    }
}
