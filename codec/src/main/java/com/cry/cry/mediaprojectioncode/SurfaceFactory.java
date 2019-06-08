package com.cry.cry.mediaprojectioncode;

import androidx.annotation.Nullable;
import android.view.Surface;

public interface SurfaceFactory {

    @Nullable
    Surface createSurface(int width, int height);

    void stop();
}
