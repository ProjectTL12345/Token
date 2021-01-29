package org.projecttl.plugin.token.command

import org.bukkit.ChatColor
import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player
import org.projecttl.plugin.token.util.{CreateToken, GetTokenList}

class GetToken extends CommandExecutor {

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (!sender.isInstanceOf[Player]) {
      sender.sendMessage("<Token> You must player.")
      return false
    }

    else {
      val player = sender.asInstanceOf[Player]
      val getTokenList = new GetTokenList

      if (player.hasPermission("token.op")) {
        if (command.getName.equalsIgnoreCase("token")) {
          if (args.isEmpty) {
            player.sendMessage(s"<Token> ${ChatColor.DARK_RED}Please type more arguments.")
            return false
          }

          else if (args.length == 3) {
            if (args(0).equalsIgnoreCase("add")) {
              if (args(1).equalsIgnoreCase("cow")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.cow(player, getAmount)

                return true
              }

              else if (args(1).equalsIgnoreCase("chicken")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.chicken(player, getAmount)

                return true
              }

              else if (args(1).equalsIgnoreCase("pig")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.pig(player, getAmount)

                return true
              }

              else if (args(1).equalsIgnoreCase("bee")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.bee(player, getAmount)

                return true
              }

              else if (args(1).equalsIgnoreCase("horse")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.horse(player, getAmount)

                return true
              }

              else if (args(1).equalsIgnoreCase("sheep")) {
                val getAmount: Int = Integer.valueOf(args(2))
                getTokenList.sheep(player, getAmount)

                return true
              }
            }
          }
        }
      }
    }

    false
  }
}
