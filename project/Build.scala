import play.PlayScala
import sbt._

object Root extends Build {
  lazy val tokenManager = Project(id = "token-manager", base = file("token-manager"))
  lazy val sessionManager = Project(id = "session-manager", base = file("session-manager"))
  lazy val identityManager = Project(id = "identity-manager", base = file("identity-manager"))
  lazy val authPassword = Project(id = "auth-password", base = file("auth-password"))
  lazy val authFb = Project(id = "auth-fb", base = file("auth-fb"))
  lazy val authCodeCard = Project(id = "auth-codecard", base = file("auth-codecard"))
  lazy val btcCommon = Project(id = "btc-common", base = file("btc-common"))
  lazy val btcWs = Project(id = "btc-ws", base = file("btc-ws")).enablePlugins(PlayScala).dependsOn(btcCommon)
  lazy val btcUsers = Project(id = "btc-users", base = file("btc-users")).dependsOn(btcCommon)
}
