package io.github.teamgensouspark.thsc.api;

import io.github.teamgensouspark.thsc.data.DanmakuData;

@SuppressWarnings("unused")
public abstract class DanmakuShooter {
    public abstract void shotDanmaku(DanmakuData data);

    // TODO Not sure if they will be used here, The paras will keep empty.
    public abstract void createWideShot();

    public abstract void createCircleShot();

    public abstract void createRingShot();

    public abstract void createSphereShot();
}
