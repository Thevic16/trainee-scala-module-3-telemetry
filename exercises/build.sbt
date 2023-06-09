
name := "customers"

organization := "reactivebbq"

version := "0.1-SNAPSHOT"

scalaVersion := "2.13.4"

lazy val akkaHttpVersion = "10.2.2"
lazy val akkaVersion    = "2.6.10"
lazy val akkaManagementVersion =  "1.0.9"
lazy val leveldbVersion = "1.8"
lazy val logbackVersion = "1.2.3"
lazy val scalaTestVersion = "3.2.2"

fork := true
parallelExecution in ThisBuild := false

scalacOptions ++= Seq("-deprecation", "-Xfatal-warnings")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster"         % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools"   % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding"% akkaVersion,
  "com.typesafe.akka" %% "akka-persistence"     % akkaVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime"   % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % leveldbVersion,
  "com.lightbend.akka.management" %% "akka-management" % akkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % akkaManagementVersion,
  "com.typesafe.akka" %% "akka-slf4j"           % akkaVersion,
  "ch.qos.logback"    % "logback-classic"       % logbackVersion,
  "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
  "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"            % scalaTestVersion% Test,
  Cinnamon.library.cinnamonCHMetrics,
  Cinnamon.library.cinnamonAkka,
  Cinnamon.library.cinnamonAkkaHttp,
  Cinnamon.library.cinnamonJvmMetricsProducer,
  Cinnamon.library.cinnamonPrometheus,
  Cinnamon.library.cinnamonPrometheusHttpServer
)

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

enablePlugins(JavaAppPackaging)

enablePlugins(Cinnamon)

cinnamon in run := true
cinnamon in test := true

