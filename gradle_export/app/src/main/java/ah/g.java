package ah;

public final class g extends bh.a {

    public final bh.f f479f;

    public final xf.g f480g;

    public final h f481h;

    public g(h hVar, xf.g gVar) {
        bh.f fVar = new bh.f("OnRequestInstallCallback");
        this.f481h = hVar;
        super(0);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f479f = fVar;
        this.f480g = gVar;
    }
}
