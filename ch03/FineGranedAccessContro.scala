package society {
  package professional {
    class Executive {
      private[professional] var workDetail = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another: Executive){
        println(another.workDetail)
        // raise Error
        //println(another.secrets)
      }
    }
  }

  package social {
    class Acquaintance {
      def socialize(person: professional.Executive){
        println(person.friends) // OK
        // Error
        //println(person.workDetails)
      }
    }
  }
}
