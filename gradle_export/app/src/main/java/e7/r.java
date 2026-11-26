package e7;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

public final class r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    public final t f5168a;

    public r(t tVar) {
        this.f5168a = tVar;
    }

    @Override
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.f5168a.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
