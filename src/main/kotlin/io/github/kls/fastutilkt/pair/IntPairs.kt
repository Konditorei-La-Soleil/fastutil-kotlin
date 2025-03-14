@file:JvmName("IntPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.ints.*

@JvmName("of")
inline fun pair(left: Int, right: Boolean) = IntBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Boolean) = IntBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Byte) = IntByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Byte) = IntByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Char) = IntCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Char) = IntCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Double) = IntDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Double) = IntDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Float) = IntFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Float) = IntFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Int) = IntIntImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Int, right: Int) = IntIntImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Int) = IntIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Long) = IntLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Long) = IntLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Int, right: R) = IntObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Int, value: R) = IntObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Int, right: R) = IntReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Int, value: R) = IntReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Int, right: Short) = IntShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Int, value: Short) = IntShortMutablePair(key, value)
