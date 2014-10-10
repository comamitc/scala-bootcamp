object Main {

  val NewLine = "(^\\d{4}-\\d{2}-\\d{2}[ T]\\d{2}:\\d{2}:\\d{2}.*)".r
  val Comment = "(^\\s*\\t*\\r*)".r

  def lineFunc(line: String): String = line.toUpperCase()

 	def main(args: Array[String]): Unit = {
 		//val lines = new TxtFile("foo.log", NewLine, Comment)
 		//	.getLines(lineFunc)

 		val lines = new TxtFile("foo.log", "(.*)".r).getLines()

 		println(lines)
 	}

}

