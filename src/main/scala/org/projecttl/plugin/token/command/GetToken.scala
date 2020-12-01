package org.projecttl.plugin.token.command

import org.bukkit.ChatColor
import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player
import org.projecttl.plugin.token.util.CreateToken

class GetToken extends CommandExecutor {

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (!sender.isInstanceOf[Player]) {
      sender.sendMessage("<Token> You must player.")
      return false
    }

    else {
      val create = new CreateToken
      val player = sender.asInstanceOf[Player]

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
                create.createToken(
                  player,
                  s"${ChatColor.DARK_GRAY}Cow Token",
                  "You can buy some cow in shop.",
                  1,
                  getAmount
                )

                create.amountToken(player, getAmount, s"${ChatColor.DARK_GRAY}Cow Token")
                return true
              }

              else if (args(1).equalsIgnoreCase("chicken")) {
                val getAmount: Int = Integer.valueOf(args(2))
                create.createToken(
                  player,
                  s"${ChatColor.DARK_RED}Chicken Token",
                  "You can buy some chicken in shop.",
                  2,
                  getAmount
                )

                create.amountToken(player, getAmount, s"${ChatColor.DARK_RED}Chicken Token")
                return true
              }

              else if (args(1).equalsIgnoreCase("pig")) {
                val getAmount: Int = Integer.valueOf(args(2))
                create.createToken(
                  player,
                  s"${ChatColor.LIGHT_PURPLE}Pig Token",
                  s"${ChatColor.YELLOW}You can buy some pig in shop.",
                  3,
                  getAmount
                )

                create.amountToken(player, getAmount, s"${ChatColor.LIGHT_PURPLE}Pig Token")
                return true
              }

              else if (args(1).equalsIgnoreCase("bee")) {
                val getAmount: Int = Integer.valueOf(args(2))
                create.createToken(
                  player,
                  s"${ChatColor.YELLOW}Bee Token",
                  "You can buy some bee in shop.",
                  4,
                  getAmount
                )

                create.amountToken(player, getAmount, s"${ChatColor.YELLOW}Bee Token")
                return true
              }

              else if (args(1).equalsIgnoreCase("Fox")) {
                val getAmount: Int = Integer.valueOf(args(2))
                create.createToken(
                  player,
                  s"${ChatColor.GOLD}Fox Token",
                  "You can buy some fox in shop.",
                  5,
                  getAmount
                )

                create.amountToken(player, getAmount, s"${ChatColor.GOLD}Fox Token")
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
