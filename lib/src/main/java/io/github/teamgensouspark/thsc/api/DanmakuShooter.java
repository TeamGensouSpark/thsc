package io.github.teamgensouspark.thsc.api;

import io.github.teamgensouspark.thsc.data.DanmakuData;

@SuppressWarnings("unused")
public abstract class DanmakuShooter<T> {
    // Please indicate your Converter here when extending.
    private DanmakuConverter<T> converter;

    public abstract void shotDanmaku(T danmaku);

    public void shotDanmakuData(DanmakuData data) {
        shotDanmaku(converter.convert(data));
    }

    // TODO Impl shot here

    public void createWideShot(DanmakuData data, double radius, int amount) {
        shotDanmaku(converter.convert(data));
    }


    public void createCircleShot(DanmakuData data, double radius, int amount) {
        for (int index = 0; index < amount; index++) {
            shotDanmaku(converter.convert(data));
        }
    }

    public void createRingShot(DanmakuData data, double radius, int amount) {

    }

    public void createSphereShot(DanmakuData data, double radius, int amount) {

    }
}
