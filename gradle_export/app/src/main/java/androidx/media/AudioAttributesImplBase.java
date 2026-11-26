package androidx.media;

import g4.c;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    public int f1035a = 0;

    public int f1036b = 0;

    public int f1037c = 0;

    public int f1038d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1036b == audioAttributesImplBase.f1036b) {
            int i11 = this.f1037c;
            int i12 = audioAttributesImplBase.f1037c;
            int i13 = audioAttributesImplBase.f1038d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f1035a;
                int i15 = AudioAttributesCompat.f1031b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f1035a == audioAttributesImplBase.f1035a && this.f1038d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1036b), Integer.valueOf(this.f1037c), Integer.valueOf(this.f1035a), Integer.valueOf(this.f1038d)});
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1038d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1038d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f1035a;
        int i11 = AudioAttributesCompat.f1031b;
        switch (i10) {
            case 0:
                strF = "USAGE_UNKNOWN";
                break;
            case 1:
                strF = "USAGE_MEDIA";
                break;
            case 2:
                strF = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strF = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strF = "USAGE_ALARM";
                break;
            case 5:
                strF = "USAGE_NOTIFICATION";
                break;
            case 6:
                strF = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strF = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strF = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strF = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strF = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strF = "USAGE_GAME";
                break;
            case 15:
            default:
                strF = c.f(i10, "unknown usage ");
                break;
            case 16:
                strF = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strF);
        sb2.append(" content=");
        sb2.append(this.f1036b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1037c).toUpperCase());
        return sb2.toString();
    }
}
