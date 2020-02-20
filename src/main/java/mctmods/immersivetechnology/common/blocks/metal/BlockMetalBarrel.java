package mctmods.immersivetechnology.common.blocks.metal;

import mctmods.immersivetechnology.common.blocks.BlockITTileProvider;
import mctmods.immersivetechnology.common.blocks.ItemBlockITBase;
import mctmods.immersivetechnology.common.blocks.metal.tileentities.TileEntityBarrel;
import mctmods.immersivetechnology.common.blocks.metal.tileentities.TileEntityBarrelOpen;
import mctmods.immersivetechnology.common.blocks.metal.types.BlockType_MetalBarrel;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMetalBarrel extends BlockITTileProvider<BlockType_MetalBarrel> {
	public BlockMetalBarrel() {
		super("metal_barrel", Material.IRON, PropertyEnum.create("type", BlockType_MetalBarrel.class), ItemBlockITBase.class);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		lightOpacity = 0;
		this.setAllNotNormalBlock();
	}

	@Override
	public IBlockState getExtendedState(IBlockState state, IBlockAccess world, BlockPos pos) {
		state = super.getExtendedState(state, world, pos);
		return state;
	}

	@Override
	public boolean allowHammerHarvest(IBlockState state) {
		return true;
	}

	@Override
	public TileEntity createBasicTE(World worldIn, BlockType_MetalBarrel type) {
		switch(type) {
		case BARREL:
			return new TileEntityBarrel();
		case BARREL_OPEN:
			return new TileEntityBarrelOpen();
		default:
			break;
		}
		return null;
	}

}