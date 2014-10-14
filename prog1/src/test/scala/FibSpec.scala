import org.scalatest._

class ParensSpec extends FlatSpec with Matchers {

  it should "return 0 when number is 0" in {
    assert(Fib.fib(0) == 0)
  }

  it should "return 55 when number is 10" in {
    assert(Fib.fib(10) == 55)
  }

  it should "return 610 when number is 15" in {
    assert(Fib.fib(15) == 610 )
  }

}