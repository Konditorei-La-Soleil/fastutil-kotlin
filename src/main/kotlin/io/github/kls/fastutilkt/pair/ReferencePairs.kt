@file:JvmName("ReferencePairs")
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.objects.*

@JvmName("of")
inline fun <L> refPair(left: L, right: Boolean) = ReferenceBooleanImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Boolean) = ReferenceBooleanMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Byte) = ReferenceByteImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Byte) = ReferenceByteMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Char) = ReferenceCharImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Char) = ReferenceCharMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Double) = ReferenceDoubleImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Double) = ReferenceDoubleMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Float) = ReferenceFloatImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Float) = ReferenceFloatMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Int) = ReferenceIntImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Int) = ReferenceIntMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Long) = ReferenceLongImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Long) = ReferenceLongMutablePair(key, value)

@JvmName("of")
inline fun <L, R> refObjPair(left: L, right: R) = ReferenceObjectImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L, R> mutableRefObjPair(key: L, value: R) = ReferenceObjectMutablePair(key, value)

@JvmName("ofRef")
inline fun <L, R> refRefPair(left: L, right: R) = ReferenceReferenceImmutablePair(left, right)

@JvmName("ofMutableRef")
inline fun <L, R> mutableRefRefPair(key: L, value: R) = ReferenceReferenceMutablePair(key, value)

@JvmName("of")
inline fun <L> refPair(left: L, right: Short) = ReferenceShortImmutablePair(left, right)

@JvmName("ofMutable")
inline fun <L> mutableRefPair(key: L, value: Short) = ReferenceShortMutablePair(key, value)
