@file:JvmName("ObjectPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.objects.*

@JvmName("of")
inline fun <L> pair(left: L, right: Boolean) = ObjectBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Boolean) = ObjectBooleanMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Byte) = ObjectByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Byte) = ObjectByteMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Char) = ObjectCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Char) = ObjectCharMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Double) = ObjectDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Double) = ObjectDoubleMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Float) = ObjectFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Float) = ObjectFloatMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Int) = ObjectIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Int) = ObjectIntMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Long) = ObjectLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Long) = ObjectLongMutablePair(key, value)

@JvmName("of")
inline fun <L, R> pair(left: L, right: R) = ObjectObjectImmutablePair(left, right)

@JvmName("ofSorted")
inline fun <K : Comparable<K>> sortedPair(left: K, right: K) = ObjectObjectImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun <L, R> mutablePair(key: L, value: R) = ObjectObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <L, R> refPair(left: L, right: R) = ObjectReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <L, R> mutableRefPair(key: L, value: R) = ObjectReferenceMutablePair(key, value)

@JvmName("of")
inline fun <L> pair(left: L, right: Short) = ObjectShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutablePair(key: L, value: Short) = ObjectShortMutablePair(key, value)
