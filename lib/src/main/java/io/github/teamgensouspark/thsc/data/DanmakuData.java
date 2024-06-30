package io.github.teamgensouspark.thsc.data;

import javax.annotation.Nullable;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("unused")
public class DanmakuData {
    public double size = 1;
    public double speed = 1;
    public double hurt = 1;

    // Horizontal
    public float wideAngle;
    // Vertical
    public float baseAngle;

    // Life (tick)
    public int lifeTime;

    public Vector3Data shotPos;

    @Nullable
    public Vector3Data targetPos;

    public Color color;

    public Map<String, Object> extraProperties = new HashMap<>();
}
