package com.github.kmizu.sol

import org.scalatest.{DiagrammedAssertions, FlatSpec}

class PackageObjectSpec extends FlatSpec with DiagrammedAssertions {
  behavior of "SOL package object"

  it should ("be able to parse BooleanBox") in {
    val valueField = classOf[BooleanBox]("value").get
    assert(1 === valueField.size())
  }

  it should ("be able to parse ByteBox") in {
    val valueField = classOf[ByteBox]("value").get
    assert(1 === valueField.size())
  }

  it should ("be able to parse ShortBox") in {
    val valueField = classOf[ShortBox]("value").get
    assert(2 === valueField.size())
  }

  it should ("be able to parse CharBox") in {
    val valueField = classOf[CharBox]("value").get
    assert(2 === valueField.size())
  }

  it should ("be able to parse IntBox") in {
    val valueField = classOf[IntBox]("value").get
    assert(4 === valueField.size())
  }

  it should ("be able to parse FloatBox") in {
    val valueField = classOf[FloatBox]("value").get
    assert(4 === valueField.size())
  }

  it should ("be able to parse LongBox") in {
    val valueField = classOf[LongBox]("value").get
    assert(8 === valueField.size())
  }

  it should ("be able to parse DoubleBox") in {
    val valueField = classOf[DoubleBox]("value").get
    assert(8 === valueField.size())
  }
}
