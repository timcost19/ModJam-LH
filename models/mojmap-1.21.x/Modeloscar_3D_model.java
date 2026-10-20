// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeloscar_3D_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "oscar_3d_model"), "main");
	private final ModelPart all;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart tail_end;
	private final ModelPart wings;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart legs;
	private final ModelPart back_legs;
	private final ModelPart back_left_leg;
	private final ModelPart back_right_leg;
	private final ModelPart front_legs;
	private final ModelPart bb_main;

	public Modeloscar_3D_model(ModelPart root) {
		this.all = root.getChild("all");
		this.head = this.all.getChild("head");
		this.tail = this.all.getChild("tail");
		this.tail_end = this.tail.getChild("tail_end");
		this.wings = this.all.getChild("wings");
		this.left_wing = this.wings.getChild("left_wing");
		this.right_wing = this.wings.getChild("right_wing");
		this.legs = this.all.getChild("legs");
		this.back_legs = this.legs.getChild("back_legs");
		this.back_left_leg = this.back_legs.getChild("back_left_leg");
		this.back_right_leg = this.back_legs.getChild("back_right_leg");
		this.front_legs = this.legs.getChild("front_legs");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create().texOffs(0, 0).addBox(
				-2.0F, -3.0F, -4.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = all.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 11)
						.addBox(-1.5F, -4.0F, -7.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-1.5F, -3.0F, -7.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = all.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(6, 15)
						.addBox(-0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 16)
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-0.5F, -2.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.5F, 0.0F));

		PartDefinition tail_end = tail.addOrReplaceChild("tail_end",
				CubeListBuilder.create().texOffs(18, 7)
						.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 6.0F));

		PartDefinition wings = all.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition left_wing = wings.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(22, 3)
						.addBox(0.05F, -4.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 20)
						.addBox(0.05F, -3.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
						.addBox(0.05F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, -2.0F, 2.0F));

		PartDefinition right_wing = wings.addOrReplaceChild("right_wing",
				CubeListBuilder.create().texOffs(4, 21)
						.addBox(0.0F, -4.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 18)
						.addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.05F, -2.0F, 2.0F));

		PartDefinition legs = all.addOrReplaceChild("legs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition back_legs = legs.addOrReplaceChild("back_legs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition back_left_leg = back_legs.addOrReplaceChild("back_left_leg", CubeListBuilder.create(),
				PartPose.offset(1.5F, 0.0F, 0.0F));

		PartDefinition back_left_leg_up_r1 = back_left_leg.addOrReplaceChild("back_left_leg_up_r1",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8F, 3.0F, -2.4871F, 0.0F, 3.1416F));

		PartDefinition back_left_leg_down_r1 = back_left_leg.addOrReplaceChild("back_left_leg_down_r1",
				CubeListBuilder.create().texOffs(12, 13).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition back_right_leg = back_legs.addOrReplaceChild("back_right_leg", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 0.0F, 0.0F));

		PartDefinition back_right_leg_up_r1 = back_right_leg.addOrReplaceChild("back_right_leg_up_r1",
				CubeListBuilder.create().texOffs(12, 7).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8F, 3.0F, -2.4871F, 0.0F, 3.1416F));

		PartDefinition back_right_leg_down_r1 = back_right_leg.addOrReplaceChild("back_right_leg_down_r1",
				CubeListBuilder.create().texOffs(12, 10).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 2.8362F, 0.0F, -3.1416F));

		PartDefinition front_legs = legs.addOrReplaceChild("front_legs",
				CubeListBuilder.create().texOffs(10, 19)
						.addBox(-2.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 17)
						.addBox(1.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 13).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.4F, -4.5F, 0.2291F, -0.4085F, -0.3241F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 9).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -3.4F, -4.5F, 0.2291F, 0.4085F, 0.3241F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}