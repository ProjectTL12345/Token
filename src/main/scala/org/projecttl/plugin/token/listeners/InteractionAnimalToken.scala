package org.projecttl.plugin.token.listeners

import org.bukkit.{Bukkit, ChatColor, Location, Material, World}
import org.bukkit.entity.{EntityType, Player}
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.{EventHandler, Listener}
import org.projecttl.plugin.token.util.GetTokenList

class InteractionAnimalToken extends Listener {

  @EventHandler
  def onPlayerInteractionListener(event: PlayerInteractEvent): Unit = {
    val player: Player = event.getPlayer
    val action: Action = event.getAction

    val getWorld: World = player.getWorld
    val getX: Double = player.getLocation.getX
    val getY: Double = player.getLocation.getY
    val getZ: Double = player.getLocation.getZ

    val summonLocation = new Location(getWorld, getX, getY, getZ)

    if (player.getInventory.getItemInMainHand == null) {
      return
    } else {
      if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
        player.sendMessage("Debug")
        if (player.getInventory.getItemInMainHand.getType == Material.EMERALD) {
          player.sendMessage("Debug")
          if (player.getInventory.getItemInMainHand.getItemMeta.getDisplayName.equalsIgnoreCase(new GetTokenList(player).cowTokenName)) {
            getWorld.spawnEntity(summonLocation, EntityType.COW)
            player.sendMessage(s"<Token> ${ChatColor.GREEN}Summoned a cow using token.")
          }
        }
      }
    }
  }
}
