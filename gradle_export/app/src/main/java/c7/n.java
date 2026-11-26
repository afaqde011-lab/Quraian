package c7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class n implements m {

    public k f2926b;

    public k f2927c;

    public k f2928d;

    public k f2929e;

    public ByteBuffer f2930f;

    public ByteBuffer f2931g;

    public boolean f2932h;

    public n() {
        ByteBuffer byteBuffer = m.f2925a;
        this.f2930f = byteBuffer;
        this.f2931g = byteBuffer;
        k kVar = k.f2918e;
        this.f2928d = kVar;
        this.f2929e = kVar;
        this.f2926b = kVar;
        this.f2927c = kVar;
    }

    @Override
    public boolean a() {
        return this.f2929e != k.f2918e;
    }

    @Override
    public boolean b() {
        return this.f2932h && this.f2931g == m.f2925a;
    }

    @Override
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f2931g;
        this.f2931g = m.f2925a;
        return byteBuffer;
    }

    @Override
    public final k e(k kVar) {
        this.f2928d = kVar;
        this.f2929e = h(kVar);
        return a() ? this.f2929e : k.f2918e;
    }

    @Override
    public final void f() {
        this.f2932h = true;
        j();
    }

    @Override
    public final void flush() {
        this.f2931g = m.f2925a;
        this.f2932h = false;
        this.f2926b = this.f2928d;
        this.f2927c = this.f2929e;
        i();
    }

    public abstract k h(k kVar);

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i10) {
        if (this.f2930f.capacity() < i10) {
            this.f2930f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f2930f.clear();
        }
        ByteBuffer byteBuffer = this.f2930f;
        this.f2931g = byteBuffer;
        return byteBuffer;
    }

    @Override
    public final void reset() {
        ByteBuffer byteBuffer = m.f2925a;
        this.f2931g = byteBuffer;
        this.f2932h = false;
        this.f2930f = byteBuffer;
        k kVar = k.f2918e;
        this.f2928d = kVar;
        this.f2929e = kVar;
        this.f2926b = kVar;
        this.f2927c = kVar;
        k();
    }
}
