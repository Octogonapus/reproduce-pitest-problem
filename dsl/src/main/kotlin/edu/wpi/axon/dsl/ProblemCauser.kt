package edu.wpi.axon.dsl

import arrow.core.Either
import arrow.core.Right
import arrow.core.extensions.fx

class ProblemCauser {

    fun foo() = Right(1)

    fun bar() = Right(2)

    fun causeProblem(): Either<Nothing, Int> = Either.fx {
        val a = foo().bind()
        val b = bar().bind()
        a + b
    }
}
