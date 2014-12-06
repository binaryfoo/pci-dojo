package io.github.binaryfoo.pci.dojo.examples

import java.io.FileOutputStream

import io.github.binaryfoo.pci.dojo.faker.CardData

import scala.util.Random

object NeedleInAHayStack extends App {
 
   def makeHay: Array[Byte] = {
     val bytes = new Array[Byte](1024)
     Random.nextBytes(bytes)
     bytes
   }
 
   val out = new FileOutputStream("haystack")
   out.write(makeHay)
   out.write(CardData.track2().getBytes)
   out.write(makeHay)
 
   out.close()
 }
