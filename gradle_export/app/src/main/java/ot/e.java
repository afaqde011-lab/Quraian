package ot;

public final class e {
    TAFSIR("Downloads/TafsirTranslations", "tafsir.translation.materializedContentVersionById.v1", "tafsir.catalog.translationVersionsSnapshot.v1", "tafsir.catalog.persistedOptions.v1"),
    TRANSCRIPTION("Downloads/QuranTranscriptions", "transcription.materializedContentVersionById.v1", "transcription.catalog.versionsSnapshot.v1", "transcription.catalog.persistedOptions.v1");

    public final String A;
    public final String B;
    public final String C;
    public final String D;

    static {
        f50.c.v(eVarArr);
    }

    public e(String str, String str2, String str3, String str4) {
        super(str, i);
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) G.clone();
    }
}
