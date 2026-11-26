package ej;

import com.google.firebase.encoders.EncodingException;

public final class h implements bj.f {

    public boolean f5393a = false;

    public boolean f5394b = false;

    public bj.b f5395c;

    public final f f5396d;

    public h(f fVar) {
        this.f5396d = fVar;
    }

    @Override
    public final bj.f a(String str) {
        if (this.f5393a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5393a = true;
        this.f5396d.h(this.f5395c, str, this.f5394b);
        return this;
    }

    @Override
    public final bj.f b(boolean z10) {
        if (this.f5393a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5393a = true;
        this.f5396d.b(this.f5395c, z10 ? 1 : 0, this.f5394b);
        return this;
    }
}
