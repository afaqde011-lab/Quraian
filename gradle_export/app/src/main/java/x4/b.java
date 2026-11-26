package x4;

import android.text.SpannableStringBuilder;
import androidx.media3.common.q;
import com.google.protobuf.RuntimeVersion;

public final class b {

    public static final String f16439b;

    public static final String f16440c;

    public static final b f16441d;

    public static final b f16442e;

    public final boolean f16443a;

    static {
        q qVar = f.f16451c;
        f16439b = Character.toString((char) 8206);
        f16440c = Character.toString((char) 8207);
        f16441d = new b(false);
        f16442e = new b(true);
    }

    public b(boolean z10) {
        q qVar = f.f16449a;
        this.f16443a = z10;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f16437c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f16437c;
            if (i13 < aVar.f16436b && i10 == 0) {
                CharSequence charSequence2 = aVar.f16435a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f16438d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f16437c);
                    aVar.f16437c = Character.charCount(iCodePointAt) + aVar.f16437c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f16437c++;
                    char c10 = aVar.f16438d;
                    directionality = c10 < 1792 ? a.f16434e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case TYPE_SINT64_VALUE:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 != 0) {
            if (i11 == 0) {
                while (aVar.f16437c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i10 == i12) {
                                return -1;
                            }
                            i12--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i12) {
                                return 1;
                            }
                            i12--;
                            break;
                        case TYPE_SINT64_VALUE:
                            i12++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i11;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f16437c = aVar.f16436b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (aVar.f16437c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case TYPE_SINT64_VALUE:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        q qVar = f.f16451c;
        if (charSequence == null) {
            return null;
        }
        boolean zI = qVar.i(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zI2 = (zI ? f.f16450b : f.f16449a).i(charSequence, charSequence.length());
        String str2 = RuntimeVersion.SUFFIX;
        String str3 = f16440c;
        String str4 = f16439b;
        boolean z10 = this.f16443a;
        if (z10 || !(zI2 || a(charSequence) == 1)) {
            str = (!z10 || (zI2 && a(charSequence) != -1)) ? RuntimeVersion.SUFFIX : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zI != z10) {
            spannableStringBuilder.append(zI ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zI3 = (zI ? f.f16450b : f.f16449a).i(charSequence, charSequence.length());
        if (!z10 && (zI3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!zI3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
