/*
 * Copyright (c) 2013, 2014 Chris Newland.
 * Licensed under https://github.com/AdoptOpenJDK/jitwatch/blob/master/LICENSE-BSD
 * Instructions: https://github.com/AdoptOpenJDK/jitwatch/wiki
 */
package org.adoptopenjdk.jitwatch.model.bytecode;

public enum BCAnnotationType
{
	BRANCH, INLINE_SUCCESS, INLINE_FAIL, ELIMINATED_ALLOCATION, LOCK_ELISION, LOCK_COARSEN, INTRINSIC_USED, UNCOMMON_TRAP;
}