package u02lab
import Es3.*
import org.junit.*
import org.junit.Assert.*

class Part02Test {

  val n1: Boolean = notEmpty("foo")
  val n2: Boolean = notEmpty("")
  val n3: Boolean = negInt(1)
  val n4: Boolean = negInt(4)

  @Test def testNeg() =
    assertTrue(n1)
    assertFalse(n2)

  @Test def testNegGenerics() =
    assertFalse(n3)
    assertTrue(n4)
}

