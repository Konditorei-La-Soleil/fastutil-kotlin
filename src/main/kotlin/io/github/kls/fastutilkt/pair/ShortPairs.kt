@file:JvmName("ShortPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.shorts.*

@JvmName("of")
inline fun pair(left: Short, right: Boolean) = ShortBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Boolean) = ShortBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Byte) = ShortByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Byte) = ShortByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Char) = ShortCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Char) = ShortCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Double) = ShortDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Double) = ShortDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Float) = ShortFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Float) = ShortFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Int) = ShortIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Int) = ShortIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Long) = ShortLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Long) = ShortLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Short, right: R) = ShortObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Short, value: R) = ShortObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Short, right: R) = ShortReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Short, value: R) = ShortReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Short, right: Short) = ShortShortImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Short, right: Short) = ShortShortImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Short, value: Short) = ShortShortMutablePair(key, value)
