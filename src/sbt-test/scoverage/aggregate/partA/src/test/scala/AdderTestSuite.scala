import org.specs2.mutable._
import org.scoverage.issue53.part.a.AdderScala

/**
 * Created by Mikhail Kokho on 5/11/2019.
 */
class AdderTestSuite extends Specification {
  "Adder" should {
    "sum two numbers" in {
      AdderScala.add(1, 2) mustEqual 3
    }
  }
}
