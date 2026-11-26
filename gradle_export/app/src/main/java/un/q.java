package un;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\bR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Lun/q;", "", "", "Lun/q$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "lines", "b", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    @ck.b("lines")
    private final List<a> lines;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0003\u0010\u0010R$\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lun/q$a;", "", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "paragraph", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "role", "", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "start", "end", "", "Lun/q$b;", "e", "Ljava/util/List;", "()Ljava/util/List;", "words", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        @ck.b("paragraph")
        private final Integer paragraph;

        @ck.b("role")
        private final String role;

        @ck.b("start")
        private final Double start;

        @ck.b("end")
        private final Double end;

        @ck.b("words")
        private final List<b> words;

        public final Double getEnd() {
            return this.end;
        }

        public final Integer getParagraph() {
            return this.paragraph;
        }

        public final String getRole() {
            return this.role;
        }

        public final Double getStart() {
            return this.start;
        }

        public final List getWords() {
            return this.words;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lun/q$b;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "word", "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "startTime", "endTime", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        @ck.b("word")
        private final String word;

        @ck.b("start_time")
        private final Double startTime;

        @ck.b("end_time")
        private final Double endTime;

        public final Double getEndTime() {
            return this.endTime;
        }

        public final Double getStartTime() {
            return this.startTime;
        }

        public final String getWord() {
            return this.word;
        }
    }

    public final List getLines() {
        return this.lines;
    }
}
