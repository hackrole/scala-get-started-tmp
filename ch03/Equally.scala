val str1 = "hello"
val str2 = "hello"
val str3 = new String("hello")

// compare the values. true cause string intern
println(str1 == str2)
// compare the ref while obj. true
println(str1 eq str2)
// true
println(str1 == str3)
// false
println(str1 eq str3)
