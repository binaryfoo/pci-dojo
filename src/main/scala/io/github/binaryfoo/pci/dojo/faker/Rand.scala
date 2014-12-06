package io.github.binaryfoo.pci.dojo.faker

import scala.util.Random

object Rand {

   def digits(range: Range = 0 to 9): Stream[Int] = {
     Stream continually Random.nextInt(range.max) filter range.contains
   }

   def integer(range: Range): Int = {
     range.min + Random.nextInt(range.size)
   }
 }
