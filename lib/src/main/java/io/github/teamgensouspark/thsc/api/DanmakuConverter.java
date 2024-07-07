package io.github.teamgensouspark.thsc.api;

import io.github.teamgensouspark.thsc.data.DanmakuData;

@SuppressWarnings("unused")
public abstract class DanmakuConverter<T> {
    public abstract T convert(DanmakuData data);
}
