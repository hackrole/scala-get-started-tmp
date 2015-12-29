import java.util._

var list1 = new ArrayList[Int]
var list2 = new ArrayList[Any]

var ref1 : Int = 1
var ref2 : Any = null

// ok
ref2 = ref1
// error
//list2 = list1

def madMethod() = {
  throw new IllegalArgumentException()
}

// TODO not working
//println(getClass().getDeclaredMethod("madMethod", null)).getReturnType().getName()
