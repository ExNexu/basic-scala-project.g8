name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

