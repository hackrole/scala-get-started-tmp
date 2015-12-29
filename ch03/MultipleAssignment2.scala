def getPersonInfo(primaryKey: Int) = {
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
}

// this would raise compile error
val (firstName, lastName) = getPersonInfo(1)
