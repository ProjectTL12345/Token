package org.projecttl.plugin.token.util

import org.bukkit.ChatColor
import org.bukkit.entity.Player

class GetTokenList(var player: Player) extends CreateToken {

  val cowTokenName = s"${ChatColor.DARK_GRAY}Cow Token"
  val chickenTokenName = s"${ChatColor.DARK_RED}Chicken Token"
  val pigTokenName = s"${ChatColor.LIGHT_PURPLE}Pig Token"

  val beeTokenName = s"${ChatColor.YELLOW}Bee Token"
  val horseTokenName = s"${ChatColor.GOLD}Horse Token"
  val sheepTokenName = s"${ChatColor.WHITE}Sheep Token"

  def cow(getAmount: Int): Unit = {
    createToken(
      player,
      cowTokenName,
      "You can buy some cow in shop.",
      1,
      getAmount
    )

    printAddTokenLog(player, getAmount, cowTokenName)
  }

  def chicken(getAmount: Int): Unit = {
    createToken(
      player,
      chickenTokenName,
      "You can buy some chicken in shop.",
      2,
      getAmount
    )

    printAddTokenLog(player, getAmount, chickenTokenName)
  }

  def pig(getAmount: Int): Unit = {
    createToken(
      player,
      pigTokenName,
      s"${ChatColor.YELLOW}You can buy some pig in shop.",
      3,
      getAmount
    )

    printAddTokenLog(player, getAmount, pigTokenName)
  }

  def bee(getAmount: Int): Unit = {
    createToken(
      player,
      beeTokenName,
      "You can buy some bee in shop.",
      4,
      getAmount
    )

    printAddTokenLog(player, getAmount, beeTokenName)
  }

  def horse(getAmount: Int): Unit = {
    createToken(
      player,
      horseTokenName,
      "You can buy some horse in shop.",
      5,
      getAmount
    )

    printAddTokenLog(player, getAmount, horseTokenName)
  }

  def sheep(getAmount: Int): Unit = {
    createToken(
      player,
      sheepTokenName,
      "You can buy some sheep in shop",
      6,
      getAmount
    )

    printAddTokenLog(player, getAmount, sheepTokenName)
  }
}
