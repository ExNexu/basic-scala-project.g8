name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

