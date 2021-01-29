package org.projecttl.plugin.token.listeners

import org.bukkit.{ChatColor, Location, Material, World}
import org.bukkit.entity.{EntityType, Player}
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.{EventHandler, Listener}
import org.bukkit.inventory.ItemStack
import org.projecttl.plugin.token.util.GetTokenList

class InteractionAnimalToken extends Listener {

  @EventHandler
  def onPlayerInteractionListener(event: PlayerInteractEvent): Unit = {
    val player: Player = event.getPlayer
    val action: Action = event.getAction

    val getTokenList = new GetTokenList

    val getWorld: World = player.getWorld
    val getX: Double = player.getLocation.getX
    val getY: Double = player.getLocation.getY
    val getZ: Double = player.getLocation.getZ

    val summonLocation = new Location(getWorld, getX, getY, getZ)

    if (player.getInventory.getItemInMainHand == null) {
      return
    } else {
      if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
        if (player.getInventory.getItemInMainHand.getType == Material.EMERALD) {
          player.getInventory.getItemInMainHand.getItemMeta.getDisplayName match {
            case getTokenList.cowTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.cowTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.COW)
              player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a cow using token.")

              player.getInventory.removeItem(token)

            case getTokenList.chickenTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.chickenTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.CHICKEN)
              player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a chicken using token.")

              player.getInventory.removeItem(token)

            case getTokenList.pigTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.pigTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.PIG)
              player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a pig using token.")

              player.getInventory.removeItem(token)

            case getTokenList.beeTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.beeTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.BEE)
              player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a bee using token.")

              player.getInventory.removeItem(token)

            case getTokenList.horseTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.beeTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.HORSE)
              player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a horse using token.")

              player.getInventory.removeItem(token)

            case getTokenList.sheepTokenName =>
              val token = new ItemStack(Material.EMERALD)
              val meta = token.getItemMeta
              meta.setDisplayName(getTokenList.sheepTokenName)
              token.setItemMeta(meta)

              getWorld.spawnEntity(summonLocation, EntityType.SHEEP)
              player.sendMessage(s"<Token> ${
                ChatColor.GREEN
              }Summoned a sheep using token.")

              player.getInventory.removeItem(token)
          }
        }
      }
    }
  }
}
