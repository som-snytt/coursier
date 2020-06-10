
plugins_(
  "com.geirsson"       % "sbt-ci-release"           % "1.5.3",
  "pl.project13.scala" % "sbt-jmh"                  % "0.3.7",
  "org.scalameta"      % "sbt-mdoc"                 % "2.2.1",
  "org.xerial.sbt"     % "sbt-pack"                 % "0.12",
  "com.lightbend.sbt"  % "sbt-proguard"             % "0.3.0",
  "org.scala-js"       % "sbt-scalajs"              % "1.0.1",
  "ch.epfl.scala"      % "sbt-scalajs-bundler"      % "0.17.0",
  "org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0",
)

addSbtPlugin("com.github.alexarchambault.tmp" % "sbt-mima-plugin" % "0.7.1-SNAPSHOT")
addSbtPlugin("io.get-coursier" % "sbt-shading" % "2.0.0")

def plugins_(modules: ModuleID*) = modules.map(addSbtPlugin)

resolvers += Resolver.sonatypeRepo("snapshots")
