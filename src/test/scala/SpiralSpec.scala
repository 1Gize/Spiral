import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Spiral._
class SpiralSpec extends AnyFlatSpec with should.Matchers{
//  def spiral(n: Int)={
//    n match {
//      case 5 => Array(Array(1,2,3,4,5),Array(16,17,18,19,6),Array(15,24,25,20,7),Array(14,23,22,21,8),Array(13,12,11,10,9))
//      case 4 =>Array(Array(1,2,3,4),Array(12,13,14,5),Array(11,16,15,6),Array(10,9,8,7))
//    }
//  }
  it should "return spieraled array 5x5 for input 5 " in {
    spiral(5) shouldBe Array(Array(1,2,3,4,5),Array(16,17,18,19,6),Array(15,24,25,20,7),Array(14,23,22,21,8),Array(13,12,11,10,9))
  }
  it should "return spiraled array 4x4 for input 4" in {
    spiral(4) shouldBe Array(Array(1,2,3,4),Array(12,13,14,5),Array(11,16,15,6),Array(10,9,8,7))
  }
}
