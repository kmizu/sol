package com.github.kmizu

import org.openjdk.jol.info._

package object sol {
  implicit class RichClass[T](self: Class[T]) {
    def layout: ClassLayout = ClassLayout.parseClass(self)
    def printable: String = layout.toPrintable
  }
}
