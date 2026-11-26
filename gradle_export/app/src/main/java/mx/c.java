package mx;

import bx.e;
import c3.w2;
import g00.b0;
import java.util.Locale;
import kotlin.jvm.internal.m;
import r30.r;
import u00.k;

public final class c implements k {
    public final int A;
    public final w2 B;

    public c(rm.a aVar, int i) {
        this.A = i;
        this.B = aVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                e link = (e) obj;
                m.e(link, "link");
                String string = r30.k.j1(link.b).toString();
                if (string.length() == 0) {
                    string = null;
                } else if (!r30.k.A0(string, "://", false)) {
                    String lowerCase = link.a.toLowerCase(Locale.ROOT);
                    m.d(lowerCase, "toLowerCase(...)");
                    switch (lowerCase.hashCode()) {
                        case -1360467711:
                            if (!lowerCase.equals("telegram")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://t.me/".concat(string);
                            }
                            break;
                        case -991745245:
                            if (!lowerCase.equals("youtube")) {
                                string = "https://".concat(string);
                            } else {
                                string = "https://youtube.com/".concat(string);
                            }
                            break;
                        case -916346253:
                            if (!lowerCase.equals("twitter")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://twitter.com/".concat(string);
                            }
                            break;
                        case 120:
                            if (!lowerCase.equals("x")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://twitter.com/".concat(string);
                            }
                            break;
                        case 3358:
                            if (!lowerCase.equals("ig")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://instagram.com/".concat(string);
                            }
                            break;
                        case 3699:
                            if (!lowerCase.equals("tg")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://t.me/".concat(string);
                            }
                            break;
                        case 3867:
                            if (!lowerCase.equals("yt")) {
                                string = "https://".concat(string);
                            } else {
                                string = "https://youtube.com/".concat(string);
                            }
                            break;
                        case 3343799:
                            if (!lowerCase.equals("mail")) {
                                string = "https://".concat(string);
                            } else {
                                string = "mailto:".concat(string);
                            }
                            break;
                        case 28903346:
                            if (!lowerCase.equals("instagram")) {
                                string = "https://".concat(string);
                            } else {
                                if (r.x0(string, "@", false)) {
                                    string = r30.k.C0(1, string);
                                }
                                string = "https://instagram.com/".concat(string);
                            }
                            break;
                        case 96619420:
                            if (!lowerCase.equals("email")) {
                                string = "https://".concat(string);
                            } else {
                                string = "mailto:".concat(string);
                            }
                            break;
                        default:
                            string = "https://".concat(string);
                            break;
                    }
                }
                if (string != null) {
                    this.B.a(string);
                }
                return b0.a;
            case 1:
                String it = (String) obj;
                m.e(it, "it");
                this.B.a(it);
                break;
            case 2:
                String it2 = (String) obj;
                m.e(it2, "it");
                this.B.a(it2);
                break;
            case 3:
                String it3 = (String) obj;
                m.e(it3, "it");
                this.B.a(it3);
                break;
            default:
                String it4 = (String) obj;
                m.e(it4, "it");
                this.B.a(it4);
                break;
        }
        return b0.a;
    }
}
