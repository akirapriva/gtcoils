import classes.CustomHeatingCoil
import classes.CoilType2
import gregtech.api.block.VariantItemBlock
import gregtech.api.GregTechAPI
// must be in preinit
mods.gregtech.lateMaterialEvent {
    println 'registering coils!'
    def block = new CustomHeatingCoil()
    def item = new VariantItemBlock(block)
    content.registerBlock('custom_coil', block, item)

    for (final def type in CoilType2.values()) {
        GregTechAPI.HEATING_COILS.put(block.getState(type), type)
    }

    println 'coil registered!'
}