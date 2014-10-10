import org.scalatest._

class ParensSpec extends FlatSpec with Matchers {

  val paren1 = "("        // false
  val paren2 = "(()"      // false
  val paren3 = "(())"     // true
  val paren4 = "(()(())"  // false

  it should "return false with string '('" in {
    assert(Parens.isBalanced(paren1) == false)
  }

  it should "return false with string '(()'" in {
    assert(Parens.isBalanced(paren2) == false)
  }

  it should "return false with string '(())'" in {
    assert(Parens.isBalanced(paren3) == true)
  }

  it should "return false with string '(()(())'" in {
    assert(Parens.isBalanced(paren4) == false)
  }

}