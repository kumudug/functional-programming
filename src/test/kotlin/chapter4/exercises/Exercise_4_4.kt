package chapter4.exercises

import chapter3.listings.Cons
import chapter3.listings.List
import chapter3.listings.Nil
import chapter4.Boilerplate.foldRight
import chapter4.None
import chapter4.Option
import chapter4.Some
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

fun <A> sequence(xs: List<Option<A>>): Option<List<A>> = TODO()

class Exercise_4_4 : WordSpec({

    "sequence" should {
        "turn a list of some options into an option of list" {
            val lo = List.of(Some(10), Some(20), Some(30))
            sequence(lo) shouldBe Some(List.of(10, 20, 30))
        }
        "turn a list of options containing none into a none" {
            val lo = List.of(Some(10), None, Some(30))
            sequence(lo) shouldBe None
        }
    }
})
