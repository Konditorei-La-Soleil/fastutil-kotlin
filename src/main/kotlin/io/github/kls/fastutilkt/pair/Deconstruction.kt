@file:JvmName("-Pairs") // hide in Java
@file:Suppress("NOTHING_TO_INLINE")

package io.github.kls.fastutilkt.pair

import it.unimi.dsi.fastutil.booleans.*
import it.unimi.dsi.fastutil.bytes.*
import it.unimi.dsi.fastutil.chars.*
import it.unimi.dsi.fastutil.doubles.*
import it.unimi.dsi.fastutil.floats.*
import it.unimi.dsi.fastutil.ints.*
import it.unimi.dsi.fastutil.longs.*
import it.unimi.dsi.fastutil.objects.*
import it.unimi.dsi.fastutil.shorts.*

inline operator fun BooleanBooleanPair.component1() = leftBoolean()
inline operator fun BooleanBooleanPair.component2() = rightBoolean()

inline operator fun BooleanBytePair.component1() = leftBoolean()
inline operator fun BooleanBytePair.component2() = rightByte()

inline operator fun BooleanCharPair.component1() = leftBoolean()
inline operator fun BooleanCharPair.component2() = rightChar()

inline operator fun BooleanDoublePair.component1() = leftBoolean()
inline operator fun BooleanDoublePair.component2() = rightDouble()

inline operator fun BooleanFloatPair.component1() = leftBoolean()
inline operator fun BooleanFloatPair.component2() = rightFloat()

inline operator fun BooleanIntPair.component1() = leftBoolean()
inline operator fun BooleanIntPair.component2() = rightInt()

inline operator fun BooleanLongPair.component1() = leftBoolean()
inline operator fun BooleanLongPair.component2() = rightLong()

inline operator fun <R> BooleanObjectPair<R>.component1() = leftBoolean()
inline operator fun <R> BooleanObjectPair<R>.component2() = right()

inline operator fun <R> BooleanReferencePair<R>.component1() = leftBoolean()
inline operator fun <R> BooleanReferencePair<R>.component2() = right()

inline operator fun BooleanShortPair.component1() = leftBoolean()
inline operator fun BooleanShortPair.component2() = rightShort()

inline operator fun ByteBooleanPair.component1() = leftByte()
inline operator fun ByteBooleanPair.component2() = rightBoolean()

inline operator fun ByteBytePair.component1() = leftByte()
inline operator fun ByteBytePair.component2() = rightByte()

inline operator fun ByteCharPair.component1() = leftByte()
inline operator fun ByteCharPair.component2() = rightChar()

inline operator fun ByteDoublePair.component1() = leftByte()
inline operator fun ByteDoublePair.component2() = rightDouble()

inline operator fun ByteFloatPair.component1() = leftByte()
inline operator fun ByteFloatPair.component2() = rightFloat()

inline operator fun ByteIntPair.component1() = leftByte()
inline operator fun ByteIntPair.component2() = rightInt()

inline operator fun ByteLongPair.component1() = leftByte()
inline operator fun ByteLongPair.component2() = rightLong()

inline operator fun <R> ByteObjectPair<R>.component1() = leftByte()
inline operator fun <R> ByteObjectPair<R>.component2() = right()

inline operator fun <R> ByteReferencePair<R>.component1() = leftByte()
inline operator fun <R> ByteReferencePair<R>.component2() = right()

inline operator fun ByteShortPair.component1() = leftByte()
inline operator fun ByteShortPair.component2() = rightShort()

inline operator fun CharBooleanPair.component1() = leftChar()
inline operator fun CharBooleanPair.component2() = rightBoolean()

inline operator fun CharBytePair.component1() = leftChar()
inline operator fun CharBytePair.component2() = rightByte()

inline operator fun CharCharPair.component1() = leftChar()
inline operator fun CharCharPair.component2() = rightChar()

inline operator fun CharDoublePair.component1() = leftChar()
inline operator fun CharDoublePair.component2() = rightDouble()

inline operator fun CharFloatPair.component1() = leftChar()
inline operator fun CharFloatPair.component2() = rightFloat()

inline operator fun CharIntPair.component1() = leftChar()
inline operator fun CharIntPair.component2() = rightInt()

inline operator fun CharLongPair.component1() = leftChar()
inline operator fun CharLongPair.component2() = rightLong()

inline operator fun <R> CharObjectPair<R>.component1() = leftChar()
inline operator fun <R> CharObjectPair<R>.component2() = right()

inline operator fun <R> CharReferencePair<R>.component1() = leftChar()
inline operator fun <R> CharReferencePair<R>.component2() = right()

inline operator fun CharShortPair.component1() = leftChar()
inline operator fun CharShortPair.component2() = rightShort()

inline operator fun DoubleBooleanPair.component1() = leftDouble()
inline operator fun DoubleBooleanPair.component2() = rightBoolean()

inline operator fun DoubleBytePair.component1() = leftDouble()
inline operator fun DoubleBytePair.component2() = rightByte()

inline operator fun DoubleCharPair.component1() = leftDouble()
inline operator fun DoubleCharPair.component2() = rightChar()

inline operator fun DoubleDoublePair.component1() = leftDouble()
inline operator fun DoubleDoublePair.component2() = rightDouble()

inline operator fun DoubleFloatPair.component1() = leftDouble()
inline operator fun DoubleFloatPair.component2() = rightFloat()

inline operator fun DoubleIntPair.component1() = leftDouble()
inline operator fun DoubleIntPair.component2() = rightInt()

inline operator fun DoubleLongPair.component1() = leftDouble()
inline operator fun DoubleLongPair.component2() = rightLong()

inline operator fun <R> DoubleObjectPair<R>.component1() = leftDouble()
inline operator fun <R> DoubleObjectPair<R>.component2() = right()

inline operator fun <R> DoubleReferencePair<R>.component1() = leftDouble()
inline operator fun <R> DoubleReferencePair<R>.component2() = right()

inline operator fun DoubleShortPair.component1() = leftDouble()
inline operator fun DoubleShortPair.component2() = rightShort()

inline operator fun FloatBooleanPair.component1() = leftFloat()
inline operator fun FloatBooleanPair.component2() = rightBoolean()

inline operator fun FloatBytePair.component1() = leftFloat()
inline operator fun FloatBytePair.component2() = rightByte()

inline operator fun FloatCharPair.component1() = leftFloat()
inline operator fun FloatCharPair.component2() = rightChar()

inline operator fun FloatDoublePair.component1() = leftFloat()
inline operator fun FloatDoublePair.component2() = rightDouble()

inline operator fun FloatFloatPair.component1() = leftFloat()
inline operator fun FloatFloatPair.component2() = rightFloat()

inline operator fun FloatIntPair.component1() = leftFloat()
inline operator fun FloatIntPair.component2() = rightInt()

inline operator fun FloatLongPair.component1() = leftFloat()
inline operator fun FloatLongPair.component2() = rightLong()

inline operator fun <R> FloatObjectPair<R>.component1() = leftFloat()
inline operator fun <R> FloatObjectPair<R>.component2() = right()

inline operator fun <R> FloatReferencePair<R>.component1() = leftFloat()
inline operator fun <R> FloatReferencePair<R>.component2() = right()

inline operator fun FloatShortPair.component1() = leftFloat()
inline operator fun FloatShortPair.component2() = rightShort()

inline operator fun IntBooleanPair.component1() = leftInt()
inline operator fun IntBooleanPair.component2() = rightBoolean()

inline operator fun IntBytePair.component1() = leftInt()
inline operator fun IntBytePair.component2() = rightByte()

inline operator fun IntCharPair.component1() = leftInt()
inline operator fun IntCharPair.component2() = rightChar()

inline operator fun IntDoublePair.component1() = leftInt()
inline operator fun IntDoublePair.component2() = rightDouble()

inline operator fun IntFloatPair.component1() = leftInt()
inline operator fun IntFloatPair.component2() = rightFloat()

inline operator fun IntIntPair.component1() = leftInt()
inline operator fun IntIntPair.component2() = rightInt()

inline operator fun IntLongPair.component1() = leftInt()
inline operator fun IntLongPair.component2() = rightLong()

inline operator fun <R> IntObjectPair<R>.component1() = leftInt()
inline operator fun <R> IntObjectPair<R>.component2() = right()

inline operator fun <R> IntReferencePair<R>.component1() = leftInt()
inline operator fun <R> IntReferencePair<R>.component2() = right()

inline operator fun IntShortPair.component1() = leftInt()
inline operator fun IntShortPair.component2() = rightShort()

inline operator fun LongBooleanPair.component1() = leftLong()
inline operator fun LongBooleanPair.component2() = rightBoolean()

inline operator fun LongBytePair.component1() = leftLong()
inline operator fun LongBytePair.component2() = rightByte()

inline operator fun LongCharPair.component1() = leftLong()
inline operator fun LongCharPair.component2() = rightChar()

inline operator fun LongDoublePair.component1() = leftLong()
inline operator fun LongDoublePair.component2() = rightDouble()

inline operator fun LongFloatPair.component1() = leftLong()
inline operator fun LongFloatPair.component2() = rightFloat()

inline operator fun LongIntPair.component1() = leftLong()
inline operator fun LongIntPair.component2() = rightInt()

inline operator fun LongLongPair.component1() = leftLong()
inline operator fun LongLongPair.component2() = rightLong()

inline operator fun <R> LongObjectPair<R>.component1() = leftLong()
inline operator fun <R> LongObjectPair<R>.component2() = right()

inline operator fun <R> LongReferencePair<R>.component1() = leftLong()
inline operator fun <R> LongReferencePair<R>.component2() = right()

inline operator fun LongShortPair.component1() = leftLong()
inline operator fun LongShortPair.component2() = rightShort()

inline operator fun <L> ObjectBooleanPair<L>.component1() = left()
inline operator fun <L> ObjectBooleanPair<L>.component2() = rightBoolean()

inline operator fun <L> ObjectBytePair<L>.component1() = left()
inline operator fun <L> ObjectBytePair<L>.component2() = rightByte()

inline operator fun <L> ObjectCharPair<L>.component1() = left()
inline operator fun <L> ObjectCharPair<L>.component2() = rightChar()

inline operator fun <L> ObjectDoublePair<L>.component1() = left()
inline operator fun <L> ObjectDoublePair<L>.component2() = rightDouble()

inline operator fun <L> ObjectFloatPair<L>.component1() = left()
inline operator fun <L> ObjectFloatPair<L>.component2() = rightFloat()

inline operator fun <L> ObjectIntPair<L>.component1() = left()
inline operator fun <L> ObjectIntPair<L>.component2() = rightInt()

inline operator fun <L> ObjectLongPair<L>.component1() = left()
inline operator fun <L> ObjectLongPair<L>.component2() = rightLong()

inline operator fun <L, R> ObjectReferencePair<L, R>.component1() = left()
inline operator fun <L, R> ObjectReferencePair<L, R>.component2() = right()

inline operator fun <L> ObjectShortPair<L>.component1() = left()
inline operator fun <L> ObjectShortPair<L>.component2() = rightShort()

inline operator fun <L> ReferenceBooleanPair<L>.component1() = left()
inline operator fun <L> ReferenceBooleanPair<L>.component2() = rightBoolean()

inline operator fun <L> ReferenceBytePair<L>.component1() = left()
inline operator fun <L> ReferenceBytePair<L>.component2() = rightByte()

inline operator fun <L> ReferenceCharPair<L>.component1() = left()
inline operator fun <L> ReferenceCharPair<L>.component2() = rightChar()

inline operator fun <L> ReferenceDoublePair<L>.component1() = left()
inline operator fun <L> ReferenceDoublePair<L>.component2() = rightDouble()

inline operator fun <L> ReferenceFloatPair<L>.component1() = left()
inline operator fun <L> ReferenceFloatPair<L>.component2() = rightFloat()

inline operator fun <L> ReferenceIntPair<L>.component1() = left()
inline operator fun <L> ReferenceIntPair<L>.component2() = rightInt()

inline operator fun <L> ReferenceLongPair<L>.component1() = left()
inline operator fun <L> ReferenceLongPair<L>.component2() = rightLong()

inline operator fun <L, R> ReferenceObjectPair<L, R>.component1() = left()
inline operator fun <L, R> ReferenceObjectPair<L, R>.component2() = right()

inline operator fun <L, R> ReferenceReferencePair<L, R>.component1() = left()
inline operator fun <L, R> ReferenceReferencePair<L, R>.component2() = right()

inline operator fun <L> ReferenceShortPair<L>.component1() = left()
inline operator fun <L> ReferenceShortPair<L>.component2() = rightShort()

inline operator fun ShortBooleanPair.component1() = leftShort()
inline operator fun ShortBooleanPair.component2() = rightBoolean()

inline operator fun ShortBytePair.component1() = leftShort()
inline operator fun ShortBytePair.component2() = rightByte()

inline operator fun ShortCharPair.component1() = leftShort()
inline operator fun ShortCharPair.component2() = rightChar()

inline operator fun ShortDoublePair.component1() = leftShort()
inline operator fun ShortDoublePair.component2() = rightDouble()

inline operator fun ShortFloatPair.component1() = leftShort()
inline operator fun ShortFloatPair.component2() = rightFloat()

inline operator fun ShortIntPair.component1() = leftShort()
inline operator fun ShortIntPair.component2() = rightInt()

inline operator fun ShortLongPair.component1() = leftShort()
inline operator fun ShortLongPair.component2() = rightLong()

inline operator fun <R> ShortObjectPair<R>.component1() = leftShort()
inline operator fun <R> ShortObjectPair<R>.component2() = right()

inline operator fun <R> ShortReferencePair<R>.component1() = leftShort()
inline operator fun <R> ShortReferencePair<R>.component2() = right()

inline operator fun ShortShortPair.component1() = leftShort()
inline operator fun ShortShortPair.component2() = rightShort()
