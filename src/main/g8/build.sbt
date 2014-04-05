name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

