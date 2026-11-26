package gg;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class c extends f7.e {
    public final int C;
    public final CarouselLayoutManager D;

    public c(CarouselLayoutManager carouselLayoutManager, int i10) {
        super(1, 1);
        this.C = i10;
        switch (i10) {
            case 1:
                this.D = carouselLayoutManager;
                super(0, 1);
                break;
            default:
                this.D = carouselLayoutManager;
                break;
        }
    }

    @Override
    public final int f() {
        switch (this.C) {
            case 0:
                return this.D.f2389o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.D;
                return carouselLayoutManager.f2389o - carouselLayoutManager.C();
        }
    }

    @Override
    public final int h() {
        switch (this.C) {
            case 0:
                return this.D.D();
            default:
                return 0;
        }
    }

    @Override
    public final int j() {
        switch (this.C) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.D;
                return carouselLayoutManager.f2388n - carouselLayoutManager.E();
            default:
                return this.D.f2388n;
        }
    }

    @Override
    public final int k() {
        switch (this.C) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.D;
                if (carouselLayoutManager.F0()) {
                    return carouselLayoutManager.f2388n;
                }
                return 0;
        }
    }

    @Override
    public final int l() {
        switch (this.C) {
            case 0:
                return 0;
            default:
                return this.D.F();
        }
    }
}
