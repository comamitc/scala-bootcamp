# prog1

In this exercise we are going to complete a function that will tell us if we have balanced parens in a string.  We wil create an `object` called Parens that will have one function `isBalanced(s: String)`.  Additional functions and values are allowed to help calculate the result.

## test strings

```scala
  val paren1 = "("        // false
  val paren2 = "))(("      // false
  val paren3 = "(())"     // true
  val paren4 = "(()(())"  // false
```

Test your solution with the `sbt test` command

## hints

- There is a datatype in scala called `Char` for characters
- There is a method on a `String` that can be called `String.toList` that will result in `List[Char]`.
