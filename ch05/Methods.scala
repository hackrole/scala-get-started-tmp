// TODO not working
def printMethodInfo(methodName : String){
  println("The return type of " + methodName + " is " +
    getClass().getDeclareMethod(methodName, null).getReturnType().getName())
}

def method1(){6}
def method2() = {6}
def method3() = 6
def method4: Double = 6

printMethodInfo("method1")
printMethodInfo("method2")
printMethodInfo("method3")
printMethodInfo("method4")
