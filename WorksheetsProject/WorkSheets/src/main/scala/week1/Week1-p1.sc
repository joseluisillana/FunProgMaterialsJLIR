object session {
  def abs(x: Double) =  if (x < 0) -x else x
  def sqrtIter(guess: Double, x: Double): Double =
  {
    if (isGoodEnough(guess,x))
      guess
    else
      sqrtIter(improve(guess,x),x)
  }
  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x< 0.001
  def improve(guess: Double, x: Double) =
    (guess + x / guess) /2
  def sqrt(x: Double) = sqrtIter(1.0, x)
  sqrt(2)
  sqrt(4)
  sqrt(9)
  sqrt(0.001)
  sqrt(1e-6)
  sqrt(0.000001)
  sqrt(0.1e-20)
  sqrt(1.0e20)
  sqrt(1.0e50)
  0.031260655525445276 *  0.031260655525445276
  val test = 9.772285838805523E-4
  val test2 = 0.000001
  val igetest3 = abs(1.0 * 1.0 - 2 ) / 2

  igetest3 < 0.001

  val impgetest3 = (1.0 + 2 / 1.0) / 2

  val igetest4 = abs(impgetest3 * impgetest3 - 2 ) / 2

  igetest4 < 0.001

  val impgetest4 = (impgetest3 + 2 / impgetest3) / 2

  val igetest5 = abs(impgetest4 * impgetest4 - 2 ) / 2

  igetest5 < 0.001

  val impgetest5 = (impgetest4 + 2 / impgetest4) / 2

  val igetest6 = abs(impgetest5 * impgetest5 - 2 ) / 2

  igetest6 < 0.001

}