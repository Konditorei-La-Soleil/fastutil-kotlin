@file:JvmName("FloatPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.floats.*

@JvmName("of")
inline fun pair(left: Float, right: Boolean) = FloatBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Boolean) = FloatBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Byte) = FloatByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Byte) = FloatByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Char) = FloatCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Char) = FloatCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Double) = FloatDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Double) = FloatDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Float) = FloatFloatImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Float, right: Float) = FloatFloatImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Float) = FloatFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Int) = FloatIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Int) = FloatIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Long) = FloatLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Long) = FloatLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Float, right: R) = FloatObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Float, value: R) = FloatObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Float, right: R) = FloatReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Float, value: R) = FloatReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Float, right: Short) = FloatShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Float, value: Short) = FloatShortMutablePair(key, value)
