package org.projecttl.plugin.token

import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin
import org.projecttl.plugin.token.command.GetToken
import org.projecttl.plugin.token.command.arguments.ArgumentForGetToken

class TokenPlugin extends JavaPlugin {

  override def onEnable(): Unit = {
    getLogger.info(s"${ChatColor.YELLOW}The plugin has enable.")

    getCommand("token").setExecutor(new GetToken)
    getCommand("token").setTabCompleter(new ArgumentForGetToken)
  }

  override def onDisable(): Unit = {
    getLogger.info(s"${ChatColor.YELLOW}The plugin has disable.")
  }
}
