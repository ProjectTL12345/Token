package org.projecttl.plugin.token.util

import java.util.Arrays.asList

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class CreateToken {

  def createToken(targetPlayer: Player, tokenName: String, tokenLore: String, tokenCode: Int, setAmount: Int): Unit = {
    val token = new ItemStack(Material.EMERALD)
    val meta = token.getItemMeta

    meta.setDisplayName(tokenName)
    meta.setLore(asList(tokenLore))

    token.setItemMeta(meta)
    token.addUnsafeEnchantment(Enchantment.DURABILITY, tokenCode)
    token.setAmount(setAmount)

    targetPlayer.getInventory.addItem(token)
  }

  def amountToken(player: Player, getAmount: Int, itemName: String): Unit = {
    if (getAmount == 1 || getAmount == null)
      player.sendMessage(s"<Token> $getAmount ${itemName} has been paid.")
    else
      player.sendMessage(s"<Token> $getAmount ${itemName}s has been paid.")
  }
}
