@file:JvmName("CharPairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.chars.*

@JvmName("of")
inline fun pair(left: Char, right: Boolean) = CharBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Boolean) = CharBooleanMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Byte) = CharByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Byte) = CharByteMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Char) = CharCharImmutablePair(left, right)

@JvmName("ofSorted")
inline fun sortedPair(left: Char, right: Char) = CharCharImmutableSortedPair.of(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Char) = CharCharMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Double) = CharDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Double) = CharDoubleMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Float) = CharFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Float) = CharFloatMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Int) = CharIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Int) = CharIntMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Long) = CharLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Long) = CharLongMutablePair(key, value)

@JvmName("of")
inline fun <R> pair(left: Char, right: R) = CharObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <R> mutablePair(key: Char, value: R) = CharObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <R> refPair(left: Char, right: R) = CharReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <R> mutableRefPair(key: Char, value: R) = CharReferenceMutablePair(key, value)

@JvmName("of")
inline fun pair(left: Char, right: Short) = CharShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun mutablePair(key: Char, value: Short) = CharShortMutablePair(key, value)
