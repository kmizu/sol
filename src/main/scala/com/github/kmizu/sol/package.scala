package com.github.kmizu

import org.openjdk.jol.info._
import scala.collection.JavaConverters._

package object sol {
  implicit class RichClass[T](val self: Class[T]) extends AnyVal {
    def layout: ClassLayout = ClassLayout.parseClass(self)
    def printable: String = layout.toPrintable
    def fields: List[FieldLayout] = layout.fields().asScala.toList
    def apply(name: String): Option[FieldLayout] = {
      layout.fields().asScala.find(_.name() == name)
    }
  }
}
