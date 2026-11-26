package un;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0003\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001c\u0010$\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b%\u0010\u0006R$\u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b\b\u0010,¨\u0006."}, d2 = {"Lun/d;", "", "", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", DiagnosticsEntry.ID_KEY, "b", "h", "order", "", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "language", "d", "j", "title", "e", "audioUrl", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "durationMs", "coverUrl", "k", "transcriptUrl", "", "i", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "isFree", "freeDurationMs", "positionMs", "l", "m", "isCompleted", DiagnosticsEntry.VERSION_KEY, "", "Lun/i;", "Ljava/util/List;", "()Ljava/util/List;", "availableLanguages", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    @ck.b(DiagnosticsEntry.ID_KEY)
    private final Integer id;

    @ck.b("order")
    private final Integer order;

    @ck.b("language")
    private final String language;

    @ck.b("title")
    private final String title;

    @ck.b("audio_url")
    private final String audioUrl;

    @ck.b("duration_ms")
    private final Long durationMs;

    @ck.b("cover_url")
    private final String coverUrl;

    @ck.b("transcript_url")
    private final String transcriptUrl;

    @ck.b("is_free")
    private final Boolean isFree;

    @ck.b("free_duration_ms")
    private final Long freeDurationMs;

    @ck.b("position_ms")
    private final Long positionMs;

    @ck.b("is_completed")
    private final Boolean isCompleted;

    @ck.b(DiagnosticsEntry.VERSION_KEY)
    private final Integer version;

    @ck.b("available_languages")
    private final List<i> availableLanguages;

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final List getAvailableLanguages() {
        return this.availableLanguages;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final Long getFreeDurationMs() {
        return this.freeDurationMs;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final Long getPositionMs() {
        return this.positionMs;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTranscriptUrl() {
        return this.transcriptUrl;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final Boolean getIsFree() {
        return this.isFree;
    }
}
