@file:JvmName("DoublePairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.doubles.*

@JvmName("of")
inline fun pair(left: Double, right: Boolean) = DoubleBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Boolean) = DoubleBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Byte) = DoubleByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Byte) = DoubleByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Char) = DoubleCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Char) = DoubleCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Double) = DoubleDoubleImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Double, right: Double) = DoubleDoubleImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Double) = DoubleDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Float) = DoubleFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Float) = DoubleFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Int) = DoubleIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Int) = DoubleIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Long) = DoubleLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Long) = DoubleLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Double, right: R) = DoubleObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Double, value: R) = DoubleObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Double, right: R) = DoubleReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Double, value: R) = DoubleReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Double, right: Short) = DoubleShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Double, value: Short) = DoubleShortMutablePair(key, value)
