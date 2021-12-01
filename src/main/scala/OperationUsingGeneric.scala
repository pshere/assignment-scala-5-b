
import scala.collection.mutable.ListBuffer


trait Stack [A]{
def push(x:A):Boolean
  def top:A
 def pop():Boolean
  def isEmpty:Boolean
}
class OperationUsingGeneric extends Stack[Int] {
  val stack1:ListBuffer[Int]= new ListBuffer[Int]()
  def isEmpty:Boolean={
    if(stack1==Nil) true
    else
      false
  }

  def push(x: Int): Boolean = {
    stack1 += x
    if (stack1.contains(x) ) true
    else false
  }

  def top:Int={
    //println(stack1.reverse.head )
    stack1.reverse.head //implementing LIFO,so the last element of the stack is the top of the stack

  }

  def pop(): Boolean = {
    if (stack1.isEmpty) {

      false
    }
    else {

      stack1 -= stack1.reverse.head
      true
    }
  }
}