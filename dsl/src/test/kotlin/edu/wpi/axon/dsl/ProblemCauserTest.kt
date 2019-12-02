package edu.wpi.axon.dsl

import io.kotest.assertions.arrow.either.shouldBeRight
import io.kotest.shouldBe
import org.junit.jupiter.api.Test

class ProblemCauserTest {

    @Test
    fun example() {
        val result = ProblemCauser().causeProblem()
        result.shouldBeRight {
            it.shouldBe(5)
        }
    }
}
