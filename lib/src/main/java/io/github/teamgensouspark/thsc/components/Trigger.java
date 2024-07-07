package io.github.teamgensouspark.thsc.components;

import java.util.function.Predicate;

public abstract class Trigger<T> {
    ShotComponent shot;
    Predicate<T> makeShot;
}
