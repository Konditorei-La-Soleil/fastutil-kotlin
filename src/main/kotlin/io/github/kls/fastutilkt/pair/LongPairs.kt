@file:JvmName("LongPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.longs.*

@JvmName("of")
inline fun pair(left: Long, right: Boolean) = LongBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Boolean) = LongBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Byte) = LongByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Byte) = LongByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Char) = LongCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Char) = LongCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Double) = LongDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Double) = LongDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Float) = LongFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Float) = LongFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Int) = LongIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Int) = LongIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Long) = LongLongImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Long, right: Long) = LongLongImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Long) = LongLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Long, right: R) = LongObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Long, value: R) = LongObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Long, right: R) = LongReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Long, value: R) = LongReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Long, right: Short) = LongShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Long, value: Short) = LongShortMutablePair(key, value)
