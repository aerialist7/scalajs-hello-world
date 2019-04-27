enablePlugins(ScalaJSPlugin)

name := "scalajs-hello-world"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

scalaJSUseMainModuleInitializer := true