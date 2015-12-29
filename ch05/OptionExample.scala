def commentOnPractive(input: String){
  // rather than returning null
  if(input == "test") SOme("good") else None
}

for(input <- Set("test", "hack")){
  val comment = commentOnPractive(input)
  println("input " + input + " comment " + 
    comment.getOrElse("Found no comments"))
}
