package io.runebox.updater.matcher.type;

public enum MatchableKind {
	CLASS, FIELD, METHOD, METHOD_ARG, METHOD_VAR;

	public static final MatchableKind[] VALUES = values();
}
