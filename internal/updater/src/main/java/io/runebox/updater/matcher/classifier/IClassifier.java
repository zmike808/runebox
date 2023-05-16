package io.runebox.updater.matcher.classifier;

import io.runebox.updater.matcher.type.ClassEnvironment;

public interface IClassifier<T> {
	String getName();
	double getWeight();
	double getScore(T a, T b, ClassEnvironment env);
}
