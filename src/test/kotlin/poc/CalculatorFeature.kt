package poc

import org.amshove.kluent.`should equal`
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import java.math.BigDecimal

object CalculatorFeature: Spek({
    Feature("Add 2 Big Decimal") {
        Scenario("1 + 1") {
            var result: BigDecimal = 0.toBigDecimal()

            When("adding 1 to 1") {
                result = add(1.toBigDecimal(), 1.toBigDecimal())
            }

            Then("it should be 2") {
                result `should equal` 2.toBigDecimal()
            }
        }
    }
})
