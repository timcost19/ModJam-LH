// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCorneDeProfané<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cornedeprofané"), "main");
	private final ModelPart Waist;
	private final ModelPart head;
	private final ModelPart LeftCorne;
	private final ModelPart RightCorne;

	public ModelCorneDeProfané(ModelPart root) {
		this.Waist = root.getChild("Waist");
		this.head = this.Waist.getChild("head");
		this.LeftCorne = this.head.getChild("LeftCorne");
		this.RightCorne = this.head.getChild("RightCorne");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Waist = partdefinition.addOrReplaceChild("Waist", CubeListBuilder.create(),
				PartPose.offset(0.0633F, -11.1194F, -0.243F));

		PartDefinition head = Waist.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftCorne = head.addOrReplaceChild("LeftCorne", CubeListBuilder.create(),
				PartPose.offset(4.6147F, -0.0959F, -0.0336F));

		PartDefinition cube_r1 = LeftCorne.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(16, 30).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1745F, 2.5884F, -1.9801F, -1.0017F, -1.0722F, 1.8604F));

		PartDefinition cube_r2 = LeftCorne.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 5).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-0.0745F, 2.1884F, 3.9199F, -1.8547F, -1.2551F, 2.7749F));

		PartDefinition cube_r3 = LeftCorne.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 10).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-0.6745F, 3.1884F, 2.1199F, -1.7652F, -0.847F, 2.5734F));

		PartDefinition cube_r4 = LeftCorne.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 15).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6255F, 2.4884F, -0.2801F, -1.3021F, -0.242F, 2.3064F));

		PartDefinition cube_r5 = LeftCorne.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(24, 10).addBox(-1.2833F, -1.4538F, -1.2516F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.6255F, 2.4884F, -0.2801F, -1.3076F, 0.1373F, 2.4091F));

		PartDefinition cube_r6 = LeftCorne.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(16, 10).addBox(-1.2536F, -3.6833F, -1.6262F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.6255F, 2.4884F, -0.2801F, -1.7003F, 0.1373F, 2.4091F));

		PartDefinition cube_r7 = LeftCorne.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 30).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.45F)),
				PartPose.offsetAndRotation(-2.878F, -3.6847F, 0.3766F, 2.7551F, -0.0673F, 2.9021F));

		PartDefinition cube_r8 = LeftCorne.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-2.278F, -2.9847F, 0.6766F, 2.7808F, -0.1569F, 2.6732F));

		PartDefinition cube_r9 = LeftCorne.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-0.778F, -2.0847F, 1.0766F, 2.9386F, -0.3377F, 2.051F));

		PartDefinition cube_r10 = LeftCorne.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.822F, -1.8847F, 0.5766F, -2.7233F, -0.3315F, 1.3938F));

		PartDefinition cube_r11 = LeftCorne.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.522F, -1.7847F, -0.9234F, -1.8184F, -0.167F, 1.0553F));

		PartDefinition cube_r12 = LeftCorne.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(16, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(1.122F, -0.9847F, -1.5234F, -0.5947F, 0.0829F, 0.777F));

		PartDefinition cube_r13 = LeftCorne.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(16, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.378F, 0.4153F, -2.2234F, -0.202F, 0.0829F, 0.777F));

		PartDefinition cube_r14 = LeftCorne.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.378F, 2.4153F, -2.7234F, -0.2182F, 0.0F, 0.3927F));

		PartDefinition RightCorne = head.addOrReplaceChild("RightCorne", CubeListBuilder.create(),
				PartPose.offset(-4.6147F, 0.0959F, 0.0336F));

		PartDefinition cube_r15 = RightCorne.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(8, 30).addBox(-1.6293F, 0.682F, -1.257F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0549F, 2.3966F, -2.0473F, -1.0017F, -1.0722F, 1.8604F));

		PartDefinition cube_r16 = RightCorne.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 30)
				.addBox(0.0075F, -3.2123F, -1.1107F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F)).texOffs(0, 0)
				.addBox(0.0075F, -2.2123F, -1.1107F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(1.4281F, -3.6021F, 1.0859F, 0.5584F, -0.6242F, 0.3226F));

		PartDefinition cube_r17 = RightCorne.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(8, 0).addBox(-0.0779F, -0.9846F, -1.0941F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(1.2281F, -3.5021F, 1.0859F, 0.0379F, -0.802F, 1.0423F));

		PartDefinition cube_r18 = RightCorne.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(16, 25).addBox(-0.5516F, 1.2223F, -2.6181F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2742F, 0.2122F, -0.5015F, -1.825F, 0.2594F, 2.6653F));

		PartDefinition cube_r19 = RightCorne.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(24, 25).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.787F, 2.4573F, -0.4635F, -1.4243F, 0.2964F, 2.6176F));

		PartDefinition cube_r20 = RightCorne.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(8, 20).addBox(-1.1826F, -0.3873F, -2.0132F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.5162F, 2.2703F, 3.24F, -1.4228F, -0.0901F, 2.5315F));

		PartDefinition cube_r21 = RightCorne.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(8, 25).addBox(-1.2397F, -2.9618F, -1.3223F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-1.4162F, 2.3703F, 3.24F, -2.3813F, 0.1274F, 2.3534F));

		PartDefinition cube_r22 = RightCorne.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 25).addBox(-1.105F, -1.1674F, -1.3739F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(-1.5162F, 2.2703F, 3.24F, -2.3728F, -0.0057F, 2.4921F));

		PartDefinition cube_r23 = RightCorne.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(24, 15).addBox(0.6508F, 0.057F, -1.3569F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(1.1281F, -3.8021F, 1.3859F, -0.6597F, -0.5367F, 1.8748F));

		PartDefinition cube_r24 = RightCorne.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-1.5486F, -1.5765F, -0.8905F, -1.7712F, 0.3295F, -0.9932F));

		PartDefinition cube_r25 = RightCorne.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-1.1486F, -0.8765F, -1.6905F, -0.6281F, -0.0651F, -0.781F));

		PartDefinition cube_r26 = RightCorne.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(8, 15).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0514F, 0.3235F, -2.2905F, -0.2016F, -0.0539F, -0.749F));

		PartDefinition cube_r27 = RightCorne.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0514F, 2.3235F, -2.7905F, -0.2182F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Waist.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Waist.xRot = headPitch / (180F / (float) Math.PI);
	}
}