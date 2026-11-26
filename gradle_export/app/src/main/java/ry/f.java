package ry;

import com.google.android.gms.internal.measurement.g4;
import h00.n;

public final class f {
    EF0("SUBSCRIPTION", g4.d0(n.V0(new String[]{"get_premium", "premium_status", "redeem", "collaboration"}))),
    C("HELP", g4.d0(n.V0(new String[]{"free_membership"}))),
    D("SUPPORT", g4.d0(n.V0(new String[]{"request_feature", "report_bug"}))),
    EF3("GENERAL", g4.d0(n.V0(new String[]{"language", "download_manager", "notification", "video_quality"}))),
    EF4("ABOUT", g4.d0(n.V0(new String[]{"community"}))),
    E("ABOUT_2", g4.d0(n.V0(new String[]{"follow_us", "rate_us", "what_new"}))),
    EF195("LEGAL", g4.d0(n.V0(new String[]{"term_of_service", "privacy_policy"}))),
    EF220("CONTACT", g4.d0(n.V0(new String[]{"contact_us"}))),
    EF246("DEVELOPER", g4.d0(n.V0(new String[]{"debug_controls"})));

    public static final n00.b G;
    public final int A;
    public final u30.b B;

    static {
        G = f50.c.v(fVarArr);
    }

    public f(String str, u30.b bVar) {
        super(str, i);
        this.A = i;
        this.B = bVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) F.clone();
    }
}
