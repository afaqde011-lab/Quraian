package k7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.x0;
import fh.d1;
import fh.d2;
import fh.e1;
import fh.q0;
import fh.s2;
import fh.t0;
import fh.w0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b {

    public static final b f8983c = new b(t0.s(a.f8975d));

    public static final d2 f8984d;

    public static final w0 f8985e;

    public final SparseArray f8986a = new SparseArray();

    public final int f8987b;

    static {
        Object[] objArr = {2, 5, 6};
        fh.w.e(3, objArr);
        f8984d = t0.l(3, objArr);
        c50.h hVar = new c50.h(4, 7);
        hVar.z(5, 6);
        hVar.z(17, 6);
        hVar.z(7, 6);
        hVar.z(30, 10);
        hVar.z(18, 6);
        hVar.z(6, 8);
        hVar.z(8, 8);
        hVar.z(14, 8);
        f8985e = hVar.c(true);
    }

    public b(d2 d2Var) {
        for (int i10 = 0; i10 < d2Var.D; i10++) {
            a aVar = (a) d2Var.get(i10);
            this.f8986a.put(aVar.f8976a, aVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f8986a.size(); i11++) {
            iMax = Math.max(iMax, ((a) this.f8986a.valueAt(i11)).f8977b);
        }
        this.f8987b = iMax;
    }

    public static d2 a(int[] iArr, int i10) {
        q0 q0VarM = t0.m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            q0VarM.c(new a(i11, i10));
        }
        return q0VarM.g();
    }

    public static b b(Context context, Intent intent, androidx.media3.common.d dVar, AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerC = c7.i.C(context);
        if (audioDeviceInfo == null) {
            List<AudioDeviceInfo> audioDevicesForAttributes = audioManagerC.getAudioDevicesForAttributes(dVar.b());
            audioDeviceInfo = audioDevicesForAttributes.isEmpty() ? null : audioDevicesForAttributes.get(0);
        }
        boolean zF = e7.i0.F(context);
        w0 w0Var = f8985e;
        if (zF || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            List<AudioProfile> directProfilesForAttributes = audioManagerC.getDirectProfilesForAttributes(dVar.b());
            HashMap map = new HashMap();
            map.put(2, new HashSet(bi.b.n(12)));
            for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i10);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (e7.i0.D(format) || w0Var.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(bi.b.n(audioProfile.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(bi.b.n(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            q0 q0VarM = t0.m();
            for (Map.Entry entry : map.entrySet()) {
                q0VarM.c(new a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new b(q0VarM.g());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerC.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        d1 d1Var = new d1(4);
        d1Var.d(8, 7);
        d1Var.d(26, 27);
        d1Var.c(30);
        e1 e1VarG = d1Var.g();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (e1VarG.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return f8983c;
            }
        }
        d1 d1Var2 = new d1(4);
        d1Var2.c(2);
        if (e7.i0.F(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            q0 q0VarM2 = t0.m();
            s2 it = w0Var.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= e7.i0.m(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), dVar.b())) {
                    q0VarM2.c(num);
                }
            }
            q0VarM2.c(2);
            d2 d2VarG = q0VarM2.g();
            d2VarG.getClass();
            d1Var2.e(d2VarG);
            return new b(a(bi.b.U(d1Var2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    d2 d2Var = f8984d;
                    d2Var.getClass();
                    d1Var2.e(d2Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            d2 d2Var2 = f8984d;
            d2Var2.getClass();
            d1Var2.e(d2Var2);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(bi.b.U(d1Var2.g()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listN = bi.b.n(intArrayExtra);
            listN.getClass();
            d1Var2.e(listN);
        }
        return new b(a(bi.b.U(d1Var2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static b c(Context context, androidx.media3.common.d dVar, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, audioDeviceInfo);
    }

    public final Pair d(androidx.media3.common.t tVar, androidx.media3.common.d dVar) {
        String str = tVar.f1594n;
        str.getClass();
        int iC = x0.c(str, tVar.f1593k);
        if (!f8985e.containsKey(Integer.valueOf(iC))) {
            return null;
        }
        SparseArray sparseArray = this.f8986a;
        if (iC == 18 && !e7.i0.j(sparseArray, 18)) {
            iC = 6;
        } else if ((iC == 8 && !e7.i0.j(sparseArray, 8)) || (iC == 30 && !e7.i0.j(sparseArray, 30))) {
            iC = 7;
        }
        if (!e7.i0.j(sparseArray, iC)) {
            return null;
        }
        a aVar = (a) sparseArray.get(iC);
        aVar.getClass();
        int i10 = aVar.f8977b;
        e1 e1Var = aVar.f8978c;
        int i11 = tVar.F;
        boolean zContains = false;
        if (i11 == -1 || iC == 18) {
            int i12 = tVar.G;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (e1Var == null) {
                int i13 = aVar.f8976a;
                i10 = 10;
                while (true) {
                    if (i10 <= 0) {
                        i10 = 0;
                        break;
                    }
                    int iN = e7.i0.n(i10);
                    if (iN != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i12).setChannelMask(iN).build(), dVar.b())) {
                        break;
                    }
                    i10--;
                }
            }
            i11 = i10;
        } else {
            tVar.f1594n.equals("audio/vnd.dts.uhd;profile=p2");
            if (e1Var != null) {
                int iN2 = e7.i0.n(i11);
                if (iN2 != 0) {
                    zContains = e1Var.contains(Integer.valueOf(iN2));
                }
            } else if (i11 <= i10) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        }
        int iN3 = e7.i0.n(i11);
        if (iN3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iC), Integer.valueOf(iN3));
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        SparseArray<?> sparseArray = bVar.f8986a;
        String str = e7.i0.f5136a;
        SparseArray sparseArray2 = this.f8986a;
        if (sparseArray2 == null) {
            if (sparseArray == null) {
                zContentEquals = true;
            } else {
                zContentEquals = false;
            }
        } else if (sparseArray == null) {
            zContentEquals = false;
        } else {
            zContentEquals = sparseArray2.contentEquals(sparseArray);
        }
        return zContentEquals && this.f8987b == bVar.f8987b;
    }

    public final int hashCode() {
        String str = e7.i0.f5136a;
        return (this.f8986a.contentHashCode() * 31) + this.f8987b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f8987b + ", audioProfiles=" + this.f8986a + "]";
    }
}
