@file:JvmName("BooleanPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.booleans.*

@JvmName("of")
inline fun pair(left: Boolean, right: Boolean) = BooleanBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Boolean) = BooleanBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Byte) = BooleanByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Byte) = BooleanByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Char) = BooleanCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Char) = BooleanCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Double) = BooleanDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Double) = BooleanDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Float) = BooleanFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Float) = BooleanFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Int) = BooleanIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Int) = BooleanIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Long) = BooleanLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Long) = BooleanLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Boolean, right: R) = BooleanObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Boolean, value: R) = BooleanObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Boolean, right: R) = BooleanReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Boolean, value: R) = BooleanReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Boolean, right: Short) = BooleanShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Boolean, value: Short) = BooleanShortMutablePair(key, value)
