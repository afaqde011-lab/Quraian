package f5;

import android.app.Activity;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.window.SurfaceSyncGroup;

public abstract class j {
    public static void C() {
    }

    public static void D() {
    }

    public static Activity.ScreenCaptureCallback b(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static CredentialManager d(Object obj) {
        return (CredentialManager) obj;
    }

    public static GetCredentialException h(Throwable th2) {
        return (GetCredentialException) th2;
    }

    public static GetCredentialResponse i(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static GraphemeClusterSegmentFinder k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static SegmentFinder l(Object obj) {
        return (SegmentFinder) obj;
    }

    public static SurfaceSyncGroup m() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static void n() {
    }

    public static boolean z(Object obj) {
        return obj instanceof Activity.ScreenCaptureCallback;
    }
}
