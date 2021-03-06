organization := "com.example"
name := "Heroku Example"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.4"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
  "org.scalatra"                %% "scalatra"            % ScalatraVersion,
  "org.scalatra"                %% "scalatra-scalate"    % ScalatraVersion,
  "org.scalatra"                %% "scalatra-scalatest"  % ScalatraVersion    % Test,
  "org.eclipse.jetty"           %  "jetty-webapp"        % "9.4.6.v20170531"  % Compile,
  "javax.servlet"               %  "javax.servlet-api"   % "3.1.0"            % Compile
)

enablePlugins(JettyPlugin, JavaAppPackaging)
