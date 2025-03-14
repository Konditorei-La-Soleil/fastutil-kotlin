@file:JvmName("BytePairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.bytes.*

@JvmName("of")
inline fun pair(left: Byte, right: Boolean) = ByteBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Boolean) = ByteBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Byte) = ByteByteImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Byte, right: Byte) = ByteByteImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Byte) = ByteByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Char) = ByteCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Char) = ByteCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Double) = ByteDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Double) = ByteDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Float) = ByteFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Float) = ByteFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Int) = ByteIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Int) = ByteIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Long) = ByteLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Long) = ByteLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Byte, right: R) = ByteObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Byte, value: R) = ByteObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Byte, right: R) = ByteReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Byte, value: R) = ByteReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Byte, right: Short) = ByteShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Byte, value: Short) = ByteShortMutablePair(key, value)
