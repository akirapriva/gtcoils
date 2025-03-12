import net.minecraftforge.event.entity.player.ItemTooltipEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraft.client.gui.Gui
import org.lwjgl.input.Keyboard

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtfinalfields:mmussi')) {
        event.getToolTip() << 'WARNING: This item is extremely unstable do not right click with it.'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtfinalfields:max_mainframe')) {
        event.getToolTip() << '§d§lMerged and Collapsed Spacetime with Eternity'
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack() in item('gtfinalfields:max_mainframe')) {
        event.getToolTip() << '    §eMAX Tier - Circuit'
    }
}


event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {

        } else {
            event.getToolTip().add(1, 'Hold SHIFT to show Coil Bonus Info')
        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add(1, '§8Multi Smelter:')
        } else {
            event.getToolTip().add(1, '§cBase Heat Capacity:§r 12,000 K')
        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('  §5Max Parallel:§f 320')
        } else {

        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('  §aEnergy Usage:§f 16 EU/t§8 per recipe')
        } else {

        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('§8Pyrolyse Oven:')
        } else {

        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('  §bProcessing Speed:§f 550%')
        } else {

        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('§8Cracking Unit:')
        } else {

        }
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (event.getItemStack().getItem().getRegistryName().toString().equals("gtfinalfields:custom_coil")) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            event.getToolTip().add('  §aEnergy Usage:§f 0%')
        } else {

        }
    }
}