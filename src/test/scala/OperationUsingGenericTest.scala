
import org.scalatest.flatspec.AnyFlatSpec



class OperationUsingGenericTest extends AnyFlatSpec {
  val obj=new OperationUsingGeneric
  "Condition" should "give true if stack is Empty" in{
    assert(obj.isEmpty)
  }
  "Condition" should " provide top element in stack" in {
    obj.push(15)
    obj.push(55)
    assert(obj.top==55)
  }
  "condition" should "Pop element from stack" in{
    obj.push(10)
    obj.push(25)
    obj.push(30)
    obj.push(45)
    //println(obj.toString)
    assert(obj.pop()==true)
    //println(obj.toString)
    println(obj.top)
    assert(obj.top==30)
  }
  "condition" should "pop element from empty stack"in{
    val temp=obj.isEmpty
    assert (!obj.pop==temp)
  }
}