package org.projecttl.plugin.token.command.arguments

import java.util

import org.bukkit.command.{Command, CommandSender, TabCompleter}
import org.bukkit.entity.Player

class ArgumentForGetToken extends TabCompleter {

  override def onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array[String]): util.ArrayList[String] = {
    if (sender.isInstanceOf[Player]) {
      if (args.length == 1) {
        val firstArrayList = new util.ArrayList[String]()
        firstArrayList.add("add")

        return firstArrayList
      }

      else if (args.length == 2) {
        val tokenList = new util.ArrayList[String]()
        tokenList.add("bee")
        tokenList.add("cow")
        tokenList.add("chicken")
        tokenList.add("pig")

        return tokenList
      }

      else if (args.length == 3) {
        return null
      }
    }

    onTabComplete(sender, command, alias, args)
  }
}
