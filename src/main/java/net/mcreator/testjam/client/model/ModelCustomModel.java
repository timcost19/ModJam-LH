package net.mcreator.testjam.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("test_jam", "model_custom_model"), "main");
	public final ModelPart head;
	public final ModelPart nose;
	public final ModelPart LeftCorne;
	public final ModelPart LeftCorne3;
	public final ModelPart LeftCorne2;
	public final ModelPart body;
	public final ModelPart arms;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelCustomModel(ModelPart root) {
		this.head = root.getChild("head");
		this.nose = this.head.getChild("nose");
		this.LeftCorne = this.head.getChild("LeftCorne");
		this.LeftCorne3 = this.head.getChild("LeftCorne3");
		this.LeftCorne2 = this.head.getChild("LeftCorne2");
		this.body = root.getChild("body");
		this.arms = root.getChild("arms");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition LeftCorne = head.addOrReplaceChild("LeftCorne", CubeListBuilder.create(), PartPose.offset(4.5035F, -9.8269F, -2.2567F));
		PartDefinition cube_r1 = LeftCorne.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 30).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0017F, -1.0722F, 1.8604F));
		PartDefinition cube_r2 = LeftCorne.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 5).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.1F, -0.4F, 5.9F, -1.8547F, -1.2551F, 2.7749F));
		PartDefinition cube_r3 = LeftCorne.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 10).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.6F, 4.1F, -1.7652F, -0.847F, 2.5734F));
		PartDefinition cube_r4 = LeftCorne.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(16, 15).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.3021F, -0.242F, 2.3064F));
		PartDefinition cube_r5 = LeftCorne.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 10).addBox(-1.2833F, -1.4538F, -1.2516F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.3076F, 0.1373F, 2.4091F));
		PartDefinition cube_r6 = LeftCorne.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 10).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.7003F, 0.1373F, 2.4091F));
		PartDefinition cube_r7 = LeftCorne.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 30).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-2.7035F, -6.2731F, 2.3567F, 2.7551F, -0.0673F, 2.9021F));
		PartDefinition cube_r8 = LeftCorne.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-2.1035F, -5.5731F, 2.6567F, 2.7808F, -0.1569F, 2.6732F));
		PartDefinition cube_r9 = LeftCorne.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.6035F, -4.6731F, 3.0567F, 2.9386F, -0.3377F, 2.051F));
		PartDefinition cube_r10 = LeftCorne.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.9965F, -4.4731F, 2.5567F, -2.7233F, -0.3315F, 1.3938F));
		PartDefinition cube_r11 = LeftCorne.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.6965F, -4.3731F, 1.0567F, -1.8184F, -0.167F, 1.0553F));
		PartDefinition cube_r12 = LeftCorne.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(1.2965F, -3.5731F, 0.4567F, -0.5947F, 0.0829F, 0.777F));
		PartDefinition cube_r13 = LeftCorne.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.2035F, -2.1731F, -0.2433F, -0.202F, 0.0829F, 0.777F));
		PartDefinition cube_r14 = LeftCorne.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2035F, -0.1731F, -0.7433F, -0.2182F, 0.0F, 0.3927F));
		PartDefinition LeftCorne3 = head.addOrReplaceChild("LeftCorne3", CubeListBuilder.create(), PartPose.offset(-2.4965F, -9.8269F, -2.2567F));
		PartDefinition cube_r15 = LeftCorne3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 30).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0017F, -1.0722F, 1.8604F));
		PartDefinition cube_r16 = LeftCorne3.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 30).addBox(0.0075F, -3.2123F, -1.1107F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(0, 0).addBox(0.0075F, -2.2123F, -1.1107F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.6268F, -5.9986F, 3.1332F, 0.5584F, -0.6242F, 0.3226F));
		PartDefinition cube_r17 = LeftCorne3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(8, 0).addBox(-0.0779F, -0.9846F, -1.0941F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.8268F, -5.8986F, 3.1332F, 0.0379F, -0.802F, 1.0423F));
		PartDefinition cube_r18 = LeftCorne3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 25).addBox(-0.5516F, 1.2223F, -2.6181F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3291F, -2.1844F, 1.5458F, -1.825F, 0.2594F, 2.6653F));
		PartDefinition cube_r19 = LeftCorne3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(24, 25).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8419F, 0.0607F, 1.5838F, -1.4243F, 0.2964F, 2.6176F));
		PartDefinition cube_r20 = LeftCorne3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(8, 20).addBox(-1.1826F, -0.3873F, -2.0132F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.5711F, -0.1263F, 5.2873F, -1.4228F, -0.0901F, 2.5315F));
		PartDefinition cube_r21 = LeftCorne3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 25).addBox(-1.2397F, -2.9618F, -1.3223F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-3.4711F, -0.0263F, 5.2873F, -2.3813F, 0.1274F, 2.3534F));
		PartDefinition cube_r22 = LeftCorne3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 25).addBox(-1.105F, -1.1674F, -1.3739F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-3.5711F, -0.1263F, 5.2873F, -2.3728F, -0.0057F, 2.4921F));
		PartDefinition cube_r23 = LeftCorne3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 15).addBox(0.6508F, 0.057F, -1.3569F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.9268F, -6.1986F, 3.4332F, -0.6597F, -0.5367F, 1.8748F));
		PartDefinition cube_r24 = LeftCorne3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-3.6035F, -3.9731F, 1.1567F, -1.7712F, 0.3295F, -0.9932F));
		PartDefinition cube_r25 = LeftCorne3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-3.2035F, -3.2731F, 0.3567F, -0.6281F, -0.0651F, -0.781F));
		PartDefinition cube_r26 = LeftCorne3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(8, 15).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.0035F, -2.0731F, -0.2433F, -0.2016F, -0.0539F, -0.749F));
		PartDefinition cube_r27 = LeftCorne3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0035F, -0.0731F, -0.7433F, -0.2182F, 0.0F, -0.3927F));
		PartDefinition LeftCorne2 = head.addOrReplaceChild("LeftCorne2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6965F, -9.8269F, -4.7567F, 0.0F, 3.0631F, 0.0F));
		PartDefinition cube_r28 = LeftCorne2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0017F, -1.0722F, 1.8604F));
		PartDefinition cube_r29 = LeftCorne2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.1F, -0.4F, 5.9F, -1.8547F, -1.2551F, 2.7749F));
		PartDefinition cube_r30 = LeftCorne2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.5F, 0.6F, 4.1F, -1.7652F, -0.847F, 2.5734F));
		PartDefinition cube_r31 = LeftCorne2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.3021F, -0.242F, 2.3064F));
		PartDefinition cube_r32 = LeftCorne2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2833F, -1.4538F, -1.2516F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.3076F, 0.1373F, 2.4091F));
		PartDefinition cube_r33 = LeftCorne2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.8F, -0.1F, 1.7F, -1.7003F, 0.1373F, 2.4091F));
		PartDefinition cube_r34 = LeftCorne2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-2.7035F, -6.2731F, 2.3567F, 2.7551F, -0.0673F, 2.9021F));
		PartDefinition cube_r35 = LeftCorne2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-2.1035F, -5.5731F, 2.6567F, 2.7808F, -0.1569F, 2.6732F));
		PartDefinition cube_r36 = LeftCorne2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.6035F, -4.6731F, 3.0567F, 2.9386F, -0.3377F, 2.051F));
		PartDefinition cube_r37 = LeftCorne2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.9965F, -4.4731F, 2.5567F, -2.7233F, -0.3315F, 1.3938F));
		PartDefinition cube_r38 = LeftCorne2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.6965F, -4.3731F, 1.0567F, -1.8184F, -0.167F, 1.0553F));
		PartDefinition cube_r39 = LeftCorne2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(1.2965F, -3.5731F, 0.4567F, -0.5947F, 0.0829F, 0.777F));
		PartDefinition cube_r40 = LeftCorne2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.2035F, -2.1731F, -0.2433F, -0.202F, 0.0829F, 0.777F));
		PartDefinition cube_r41 = LeftCorne2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2035F, -0.1731F, -0.7433F, -0.2182F, 0.0F, 0.3927F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}