package zp;

import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import f50.c;

public final class b {
    GENERAL("general"),
    HOME("home"),
    SETTINGS(AuthAnalyticsSource.SETTINGS),
    AIRPLAY("airplay"),
    INSIGHTS(AuthAnalyticsSource.INSIGHTS),
    ONBOARDING("onboarding"),
    DOWNLOADS("downloads"),
    LYRICS("lyrics"),
    MEMORIZATION("memorization"),
    AUDIO_STORIES("audio_stories"),
    AUDIO_STORY_DOWNLOADS("audio_story_downloads");

    public final String A;

    static {
        c.v(bVarArr);
    }

    public b(String str) {
        super(str, i);
        this.A = str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) M.clone();
    }
}
