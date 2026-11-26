package k7;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

public final class c extends AudioDeviceCallback {

    public final e f8991a;

    public c(e eVar) {
        this.f8991a = eVar;
    }

    @Override
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f8991a;
        eVar.d(b.c((Context) eVar.f9024b, (androidx.media3.common.d) eVar.f9032j, (AudioDeviceInfo) eVar.f9031i));
    }

    @Override
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f8991a;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) eVar.f9031i;
        String str = e7.i0.f5136a;
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo2, audioDeviceInfo)) {
                eVar.f9031i = null;
                break;
            }
        }
        eVar.d(b.c((Context) eVar.f9024b, (androidx.media3.common.d) eVar.f9032j, (AudioDeviceInfo) eVar.f9031i));
    }
}
