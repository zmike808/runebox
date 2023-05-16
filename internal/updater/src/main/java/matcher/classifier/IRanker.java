package matcher.classifier;

import matcher.type.ClassEnvironment;

import java.util.List;

public interface IRanker<T> {
	List<RankResult<T>> rank(T src, T[] dsts, ClassifierLevel level, ClassEnvironment env, double maxMismatch);
}
