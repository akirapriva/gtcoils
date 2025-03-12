import gregtech.api.block.IHeatingCoilBlockStats
import gregtech.api.unification.material.Material
import net.minecraft.util.IStringSerializable

enum CoilType2 implements IStringSerializable, IHeatingCoilBlockStats {

    iron("iron", 12000, 10, 10, material('iron')),

    private final String name
    private final int coilTemperature
    private final int level
    private final int energyDiscount
    public Material material

    CoilType2(String name, int coilTemperature, int level, int energyDiscount, Material material) {
        this.name = name
        this.coilTemperature = coilTemperature
        this.level = level
        this.energyDiscount = energyDiscount
        this.material = material
    }

    @Override
    String getName() {
        return this.name
    }

    // this is to fix an issue with obf remapping
    String func_176610_l() {
        return this.name
    }

    @Override
    int getCoilTemperature() {
        return coilTemperature
    }

    @Override
    int getLevel() {
        return level
    }

    @Override
    int getEnergyDiscount() {
        return energyDiscount
    }

    @Override
    int getTier() {
        return this.ordinal()
    }

    @Override
    Material getMaterial() {
        return material
    }

    @Override
    String toString() {
        return getName()
    }
}
