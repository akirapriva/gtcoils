import net.minecraft.block.properties.PropertyEnum
import net.minecraft.block.properties.IProperty
import net.minecraftforge.common.property.IUnlistedProperty
import net.minecraft.block.state.BlockStateContainer
import net.minecraftforge.common.property.ExtendedBlockState
import gregtech.api.block.VariantActiveBlock
import gregtech.api.items.toolitem.ToolClasses
import net.minecraft.block.SoundType
import classes.CoilType2

class CustomHeatingCoil extends VariantActiveBlock<CoilType2> {
    CustomHeatingCoil() {
        super(net.minecraft.block.material.Material.IRON)
        setTranslationKey("wire_coil_2")
        setHardness(5.0f)
        setResistance(10.0f)
        setSoundType(SoundType.METAL)
        setHarvestLevel(ToolClasses.WRENCH, 2)
        setDefaultState(getState(CoilType2.iron))
    }

    protected BlockStateContainer createBlockState() {
        this.VARIANT = PropertyEnum.create("variant", CoilType2)
        this.VALUES = CoilType2.values()
        return new ExtendedBlockState(this,
                new IProperty[] { VARIANT, ACTIVE_DEPRECATED },
                new IUnlistedProperty[] { ACTIVE })
    }
}
