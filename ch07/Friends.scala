class Human(val name:String){
  def listen() = println("Your friend " + name + " is listening.")
}

class Man(override val name:String) extends Human(name)

class Woman(override val name:String) extends Human(name)


trait Friend {
  val name: String
  def listen() = println("Your friends " + name + " is listening.")
}

class Man2(val name:String) extends Friend

class Woman2(val name:String) extends Friend

class Animal

class Dog(val name:String) extends Animal with Friend {
  // optional override method.
  override def listen = println(name + "'s listening quietly.")
}

val john = new Man2("John")
val sara = new Woman2("Sara")
val comet = new Dog("Comet")

john.listen
sara.listen
comet.listen

val mansBestFriend: Friend = comet

// use interface
def helpAsFriend(friend: Friend) = friend listen

helpAsFriend(sara)
helpAsFriend(comet)


class Cat(val name:String) extends Animal

def useFriend(friend: Friend) = friend listen

val alf = new Cat("Alf")
// raise
// useFriend(alf)

// instance trait
val snowy = new Cat("Snowy") with Friend
val friend: Friend = snowy
friend.listen

useFriend(snowy)
