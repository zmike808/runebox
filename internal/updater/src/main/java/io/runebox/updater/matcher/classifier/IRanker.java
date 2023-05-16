package io.runebox.updater.matcher.classifier;

import io.runebox.updater.matcher.type.ClassEnvironment;

import java.util.List;

public interface IRanker<T> {
	List<RankResult<T>> rank(T src, T[] dsts, ClassifierLevel level, ClassEnvironment env, double maxMismatch);
}
