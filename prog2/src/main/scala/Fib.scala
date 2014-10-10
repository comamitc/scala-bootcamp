object Fib {

	type ??? = Nothing

	def fib(n: Int): Int = {
		def fib(num: Int, nxt: Int, res: Int): Int = num match {
			case 0 => res
			case _ => fib(num-1, nxt+res, nxt)
		}
		fib(n, 1, 0)
	}
}