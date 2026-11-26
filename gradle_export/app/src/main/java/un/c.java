package un;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001d"}, d2 = {"Lun/c;", "", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "language", "b", "e", "label", "", "c", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", DiagnosticsEntry.VERSION_KEY, "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "durationMs", "audioUrl", "audioSizeBytes", "g", "audioSha256", "h", "transcriptUrl", "transcriptSizeBytes", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    @ck.b("language")
    private final String language;

    @ck.b("label")
    private final String label;

    @ck.b(DiagnosticsEntry.VERSION_KEY)
    private final Integer version;

    @ck.b("duration_ms")
    private final Long durationMs;

    @ck.b("audio_url")
    private final String audioUrl;

    @ck.b("audio_size_bytes")
    private final Long audioSizeBytes;

    @ck.b("audio_sha256")
    private final String audioSha256;

    @ck.b("transcript_url")
    private final String transcriptUrl;

    @ck.b("transcript_size_bytes")
    private final Long transcriptSizeBytes;

    public final String getAudioSha256() {
        return this.audioSha256;
    }

    public final Long getAudioSizeBytes() {
        return this.audioSizeBytes;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getTranscriptSizeBytes() {
        return this.transcriptSizeBytes;
    }

    public final String getTranscriptUrl() {
        return this.transcriptUrl;
    }

    public final Integer getVersion() {
        return this.version;
    }
}
