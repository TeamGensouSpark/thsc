package io.github.teamgensouspark.thsc.api;

import io.github.teamgensouspark.thsc.data.DanmakuData;

@SuppressWarnings("unused")
public abstract class DanmakuConverter<T> {
    public abstract DanmakuData convert(T input);
}
