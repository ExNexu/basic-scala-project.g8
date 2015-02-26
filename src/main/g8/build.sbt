name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

