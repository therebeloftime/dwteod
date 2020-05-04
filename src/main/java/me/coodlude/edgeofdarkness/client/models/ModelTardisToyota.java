package me.coodlude.edgeofdarkness.client.models;// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

import me.coodlude.edgeofdarkness.EdgeOfDarkness;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelTardisToyota extends ModelTardisBase {
    private final ModelRenderer All;
    private final ModelRenderer a1;
    private final ModelRenderer a2;
    private final ModelRenderer HigerBottom;
    private final ModelRenderer a3;
    private final ModelRenderer a9;
    private final ModelRenderer a4;
    private final ModelRenderer a6;
    private final ModelRenderer a5;
    private final ModelRenderer a7;
    private final ModelRenderer a10;
    private final ModelRenderer a8;
    private final ModelRenderer a11;
    private final ModelRenderer a12;
    private final ModelRenderer a13;
    private final ModelRenderer a14;
    private final ModelRenderer a15;
    private final ModelRenderer a16;
    private final ModelRenderer Bottom17;
    private final ModelRenderer a18;
    private final ModelRenderer a19;
    private final ModelRenderer a20;
    private final ModelRenderer a21;
    private final ModelRenderer a22;
    private final ModelRenderer a23;
    private final ModelRenderer a24;
    private final ModelRenderer a25;
    private final ModelRenderer a26;
    private final ModelRenderer a27;
    private final ModelRenderer a28;
    private final ModelRenderer a29;
    private final ModelRenderer a30;
    private final ModelRenderer a31;
    private final ModelRenderer a32;
    private final ModelRenderer a33;
    private final ModelRenderer a34;
    private final ModelRenderer a35;
    private final ModelRenderer a36;
    private final ModelRenderer a37;
    private final ModelRenderer a38;
    private final ModelRenderer a39;
    private final ModelRenderer a40;
    private final ModelRenderer a41;
    private final ModelRenderer a42;
    private final ModelRenderer a43;
    private final ModelRenderer a44;
    private final ModelRenderer a45;
    private final ModelRenderer a46;
    private final ModelRenderer a47;
    private final ModelRenderer a48;
    private final ModelRenderer a49;
    private final ModelRenderer a50;
    private final ModelRenderer a51;
    private final ModelRenderer a52;
    private final ModelRenderer a53;
    private final ModelRenderer a54;
    private final ModelRenderer a55;
    private final ModelRenderer a56;
    private final ModelRenderer a57;
    private final ModelRenderer a58;
    private final ModelRenderer a59;
    private final ModelRenderer a60;
    private final ModelRenderer a61;
    private final ModelRenderer a62;
    private final ModelRenderer a63;
    private final ModelRenderer a620;
    private final ModelRenderer a630;
    private final ModelRenderer a64;
    private final ModelRenderer a65;
    private final ModelRenderer a66;
    private final ModelRenderer a68;
    private final ModelRenderer a69;
    private final ModelRenderer a70;
    private final ModelRenderer a71;
    private final ModelRenderer a72;
    private final ModelRenderer a73;
    private final ModelRenderer a74;
    private final ModelRenderer a75;
    private final ModelRenderer a76;
    private final ModelRenderer a77;
    private final ModelRenderer a78;
    private final ModelRenderer a79;
    private final ModelRenderer a80;
    private final ModelRenderer a81;
    private final ModelRenderer a82;
    private final ModelRenderer a83;
    private final ModelRenderer a84;
    private final ModelRenderer a85;
    private final ModelRenderer a86;
    private final ModelRenderer a1780;
    private final ModelRenderer a860;
    private final ModelRenderer a87;
    private final ModelRenderer a88;
    private final ModelRenderer a89;
    private final ModelRenderer a90;
    private final ModelRenderer a91;
    private final ModelRenderer a92;
    private final ModelRenderer a93;
    private final ModelRenderer a94;
    private final ModelRenderer a95;
    private final ModelRenderer a96;
    private final ModelRenderer a97;
    private final ModelRenderer a98;
    private final ModelRenderer a99;
    private final ModelRenderer a100;
    private final ModelRenderer a101;
    private final ModelRenderer a102;
    private final ModelRenderer a103;
    private final ModelRenderer a104;
    private final ModelRenderer a105;
    private final ModelRenderer a106;
    private final ModelRenderer a107;
    private final ModelRenderer a108;
    private final ModelRenderer a109;
    private final ModelRenderer a110;
    private final ModelRenderer a111;
    private final ModelRenderer a112;
    private final ModelRenderer a113;
    private final ModelRenderer a114;
    private final ModelRenderer a115;
    private final ModelRenderer a116;
    private final ModelRenderer a117;
    private final ModelRenderer a118;
    private final ModelRenderer a119;
    private final ModelRenderer a120;
    private final ModelRenderer a121;
    private final ModelRenderer a122;
    private final ModelRenderer a123;
    private final ModelRenderer a124;
    private final ModelRenderer a125;
    private final ModelRenderer a126;
    private final ModelRenderer a127;
    private final ModelRenderer a128;
    private final ModelRenderer a129;
    private final ModelRenderer a130;
    private final ModelRenderer a131;
    private final ModelRenderer a132;
    private final ModelRenderer a133;
    private final ModelRenderer a134;
    private final ModelRenderer a135;
    private final ModelRenderer a136;
    private final ModelRenderer a137;
    private final ModelRenderer a138;
    private final ModelRenderer a139;
    private final ModelRenderer a140;
    private final ModelRenderer a141;
    private final ModelRenderer a142;
    private final ModelRenderer a143;
    private final ModelRenderer a144;
    private final ModelRenderer a145;
    private final ModelRenderer a146;
    private final ModelRenderer a147;
    private final ModelRenderer a148;
    private final ModelRenderer a149;
    private final ModelRenderer a150;
    private final ModelRenderer a151;
    private final ModelRenderer a152;
    private final ModelRenderer a153;
    private final ModelRenderer a154;
    private final ModelRenderer a155;
    private final ModelRenderer a156;
    private final ModelRenderer a157;
    private final ModelRenderer a158;
    private final ModelRenderer a159;
    private final ModelRenderer doorright;
    private final ModelRenderer a174;
    private final ModelRenderer a165;
    private final ModelRenderer a178;
    private final ModelRenderer a171;
    private final ModelRenderer a172;
    private final ModelRenderer a175;
    private final ModelRenderer a179;
    private final ModelRenderer a177;
    private final ModelRenderer a180;
    private final ModelRenderer a162;
    private final ModelRenderer a170;
    private final ModelRenderer a173;
    private final ModelRenderer a168;
    private final ModelRenderer a167;
    private final ModelRenderer a181;
    private final ModelRenderer a166;
    private final ModelRenderer a160;
    private final ModelRenderer a163;
    private final ModelRenderer a169;
    private final ModelRenderer a176;
    private final ModelRenderer a161;
    private final ModelRenderer a164;
    private final ModelRenderer a67;
    private final ModelRenderer a17;
    public ResourceLocation location = new ResourceLocation(EdgeOfDarkness.MODID, "textures/blocks/toyota.png");

    public ModelTardisToyota() {
        textureWidth = 256;
        textureHeight = 256;

        All = new ModelRenderer(this);
        All.setRotationPoint(-10.0F, -15.0F, 12.3F);

        a1 = new ModelRenderer(this);
        a1.setRotationPoint(0.0F, 0.0F, 0.0F);
        All.addChild(a1);
        a1.cubeList.add(new ModelBox(a1, 0, 0, 0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, false));

        a2 = new ModelRenderer(this);
        a2.setRotationPoint(1.0F, 11.0F, -22.1F);
        All.addChild(a2);
        a2.cubeList.add(new ModelBox(a2, 0, 109, 0.0F, 0.0F, 0.0F, 8, 8, 1, 0.0F, false));

        HigerBottom = new ModelRenderer(this);
        HigerBottom.setRotationPoint(-2.5F, 37.8F, -24.8F);
        All.addChild(HigerBottom);
        HigerBottom.cubeList.add(new ModelBox(HigerBottom, 0, 0, 0.0F, 0.0F, 0.0F, 26, 1, 27, 0.0F, false));

        a3 = new ModelRenderer(this);
        a3.setRotationPoint(-0.3F, 11.0F, -22.1F);
        All.addChild(a3);
        a3.cubeList.add(new ModelBox(a3, 0, 0, 0.0F, 0.0F, 0.0F, 11, 28, 0, 0.0F, false));

        a9 = new ModelRenderer(this);
        a9.setRotationPoint(9.0F, 18.3F, -23.0F);
        setRotationAngle(a9, 0.0F, 0.0F, 1.5708F);
        All.addChild(a9);
        a9.cubeList.add(new ModelBox(a9, 0, 0, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a4 = new ModelRenderer(this);
        a4.setRotationPoint(21.0F, -4.5F, -25.4F);
        All.addChild(a4);
        a4.cubeList.add(new ModelBox(a4, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a6 = new ModelRenderer(this);
        a6.setRotationPoint(-1.3F, -5.5F, 1.0F);
        All.addChild(a6);
        a6.cubeList.add(new ModelBox(a6, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a5 = new ModelRenderer(this);
        a5.setRotationPoint(0.0F, -3.5F, -25.2F);
        All.addChild(a5);
        a5.cubeList.add(new ModelBox(a5, 0, 163, 0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, false));

        a7 = new ModelRenderer(this);
        a7.setRotationPoint(-2.0F, -5.5F, -24.2F);
        All.addChild(a7);
        a7.cubeList.add(new ModelBox(a7, 0, 0, 0.0F, 0.0F, 0.0F, 25, 6, 26, 0.0F, false));

        a10 = new ModelRenderer(this);
        a10.setRotationPoint(3.2F, 2.0F, -22.8F);
        All.addChild(a10);
        a10.cubeList.add(new ModelBox(a10, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a8 = new ModelRenderer(this);
        a8.setRotationPoint(8.3667F, 11.0F, -23.0F);
        All.addChild(a8);
        a8.cubeList.add(new ModelBox(a8, 0, 0, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a11 = new ModelRenderer(this);
        a11.setRotationPoint(6.0F, 2.0F, -22.8F);
        All.addChild(a11);
        a11.cubeList.add(new ModelBox(a11, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a12 = new ModelRenderer(this);
        a12.setRotationPoint(0.7F, 11.0F, -23.0F);
        All.addChild(a12);
        a12.cubeList.add(new ModelBox(a12, 0, 0, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a13 = new ModelRenderer(this);
        a13.setRotationPoint(10.0F, 38.0F, -23.9F);
        setRotationAngle(a13, 0.0F, 0.0F, -1.5708F);
        All.addChild(a13);
        a13.cubeList.add(new ModelBox(a13, 0, 0, 0.0F, 0.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a14 = new ModelRenderer(this);
        a14.setRotationPoint(1.0F, 11.0F, -22.3F);
        All.addChild(a14);
        a14.cubeList.add(new ModelBox(a14, 12, 87, 0.0F, 0.0F, 0.0F, 8, 8, 0, 0.0F, false));

        a15 = new ModelRenderer(this);
        a15.setRotationPoint(9.0F, 10.7F, -23.0F);
        setRotationAngle(a15, 0.0F, 0.0F, 1.5708F);
        All.addChild(a15);
        a15.cubeList.add(new ModelBox(a15, 0, 0, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a16 = new ModelRenderer(this);
        a16.setRotationPoint(-12.3F, -20.5F, -12.3F);
        a16.cubeList.add(new ModelBox(a16, 0, 0, 0.0F, 0.0F, 0.0F, 2, 44, 1, 0.0F, false));

        Bottom17 = new ModelRenderer(this);
        Bottom17.setRotationPoint(-13.0F, 23.0F, -13.0F);
        Bottom17.cubeList.add(new ModelBox(Bottom17, 0, 0, 0.0F, 0.0F, 0.0F, 27, 1, 28, 0.0F, false));

        a18 = new ModelRenderer(this);
        a18.setRotationPoint(-10.3F, 4.0F, -11.3F);
        a18.cubeList.add(new ModelBox(a18, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a19 = new ModelRenderer(this);
        a19.setRotationPoint(12.3F, -20.5F, 12.3F);
        a19.cubeList.add(new ModelBox(a19, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 2, 0.0F, false));

        a20 = new ModelRenderer(this);
        a20.setRotationPoint(-11.3F, 23.5F, -11.3F);
        setRotationAngle(a20, 0.0F, 0.0F, -1.5708F);
        a20.cubeList.add(new ModelBox(a20, 0, 0, 0.0F, 0.0F, 0.0F, 43, 2, 1, 0.0F, false));

        a21 = new ModelRenderer(this);
        a21.setRotationPoint(11.3F, -20.5F, -12.3F);
        a21.cubeList.add(new ModelBox(a21, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a22 = new ModelRenderer(this);
        a22.setRotationPoint(-10.3F, 5.0F, -10.3F);
        a22.cubeList.add(new ModelBox(a22, 0, 0, 0.0F, 0.0F, 0.0F, 10, 18, 0, 0.0F, false));

        a23 = new ModelRenderer(this);
        a23.setRotationPoint(12.3F, -20.5F, -12.3F);
        a23.cubeList.add(new ModelBox(a23, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 2, 0.0F, false));

        a24 = new ModelRenderer(this);
        a24.setRotationPoint(-10.3F, 22.0F, -11.3F);
        a24.cubeList.add(new ModelBox(a24, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a25 = new ModelRenderer(this);
        a25.setRotationPoint(-1.0F, 23.0F, -11.3F);
        setRotationAngle(a25, 0.0F, 0.0F, -1.5708F);
        a25.cubeList.add(new ModelBox(a25, 0, 0, 0.0F, 0.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a26 = new ModelRenderer(this);
        a26.setRotationPoint(-10.3F, 13.0F, -11.3F);
        a26.cubeList.add(new ModelBox(a26, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a27 = new ModelRenderer(this);
        a27.setRotationPoint(11.3F, -20.5F, 13.3F);
        a27.cubeList.add(new ModelBox(a27, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a28 = new ModelRenderer(this);
        a28.setRotationPoint(-12.3F, -20.5F, -11.3F);
        a28.cubeList.add(new ModelBox(a28, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a29 = new ModelRenderer(this);
        a29.setRotationPoint(-12.3F, -20.5F, 12.3F);
        a29.cubeList.add(new ModelBox(a29, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 2, 0.0F, false));

        a30 = new ModelRenderer(this);
        a30.setRotationPoint(-10.3F, -5.0F, -11.3F);
        a30.cubeList.add(new ModelBox(a30, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a31 = new ModelRenderer(this);
        a31.setRotationPoint(-9.3F, -14.0F, -11.3F);
        a31.cubeList.add(new ModelBox(a31, 0, 0, 0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, false));

        a32 = new ModelRenderer(this);
        a32.setRotationPoint(-9.3F, -13.0F, -10.5F);
        a32.cubeList.add(new ModelBox(a32, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a33 = new ModelRenderer(this);
        a33.setRotationPoint(-1.0F, -1.5F, -9.9F);
        setRotationAngle(a33, 3.1416F, 0.9076F, 3.1416F);
        a33.cubeList.add(new ModelBox(a33, 0, 69, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        a34 = new ModelRenderer(this);
        a34.setRotationPoint(-1.5F, -13.0F, -10.5F);
        a34.cubeList.add(new ModelBox(a34, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a35 = new ModelRenderer(this);
        a35.setRotationPoint(0.0F, -5.4F, -10.5F);
        setRotationAngle(a35, 0.0F, 0.0F, 1.5708F);
        a35.cubeList.add(new ModelBox(a35, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a36 = new ModelRenderer(this);
        a36.setRotationPoint(-10.3F, -15.0F, -11.3F);
        a36.cubeList.add(new ModelBox(a36, 0, 0, 0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a37 = new ModelRenderer(this);
        a37.setRotationPoint(0.0F, -9.5F, -10.5F);
        setRotationAngle(a37, 0.0F, 0.0F, 1.5708F);
        a37.cubeList.add(new ModelBox(a37, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a38 = new ModelRenderer(this);
        a38.setRotationPoint(0.0F, -13.4F, -10.5F);
        setRotationAngle(a38, 0.0F, 0.0F, 1.5708F);
        a38.cubeList.add(new ModelBox(a38, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a39 = new ModelRenderer(this);
        a39.setRotationPoint(-9.3F, -13.8F, -10.3F);
        a39.cubeList.add(new ModelBox(a39, 0, 52, 0.0F, 0.0F, 0.0F, 9, 5, 0, 0.0F, false));

        a40 = new ModelRenderer(this);
        a40.setRotationPoint(-9.3F, -8.8F, -10.3F);
        a40.cubeList.add(new ModelBox(a40, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a41 = new ModelRenderer(this);
        a41.setRotationPoint(11.0F, -16.5F, -13.1F);
        setRotationAngle(a41, 0.0F, 0.0F, 1.5708F);
        a41.cubeList.add(new ModelBox(a41, 0, 0, 0.0F, 0.0F, 0.0F, 1, 22, 1, 0.0F, false));

        a42 = new ModelRenderer(this);
        a42.setRotationPoint(12.0F, -19.5F, -13.1F);
        setRotationAngle(a42, 0.0F, 0.0F, 1.5708F);
        a42.cubeList.add(new ModelBox(a42, 0, 0, 0.0F, 0.0F, 0.0F, 1, 23, 1, 0.0F, false));

        a43 = new ModelRenderer(this);
        a43.setRotationPoint(-11.0F, -18.5F, -13.1F);
        a43.cubeList.add(new ModelBox(a43, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        a44 = new ModelRenderer(this);
        a44.setRotationPoint(11.3F, -20.5F, -11.3F);
        a44.cubeList.add(new ModelBox(a44, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 2, 0.0F, false));

        a45 = new ModelRenderer(this);
        a45.setRotationPoint(-9.8F, -3.2F, -11.0F);
        a45.cubeList.add(new ModelBox(a45, 0, 140, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        a46 = new ModelRenderer(this);
        a46.setRotationPoint(11.3F, -20.5F, 11.0F);
        a46.cubeList.add(new ModelBox(a46, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 2, 0.0F, false));

        a47 = new ModelRenderer(this);
        a47.setRotationPoint(11.3F, 4.0F, -9.3F);
        a47.cubeList.add(new ModelBox(a47, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, true));

        a48 = new ModelRenderer(this);
        a48.setRotationPoint(11.3F, -5.0F, -9.5F);
        a48.cubeList.add(new ModelBox(a48, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a49 = new ModelRenderer(this);
        a49.setRotationPoint(11.3F, 13.0F, -9.3F);
        a49.cubeList.add(new ModelBox(a49, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a50 = new ModelRenderer(this);
        a50.setRotationPoint(11.3F, 22.0F, -9.3F);
        a50.cubeList.add(new ModelBox(a50, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

        a51 = new ModelRenderer(this);
        a51.setRotationPoint(11.6F, 23.0F, 0.5F);
        setRotationAngle(a51, 0.0F, 0.0F, -1.5708F);
        a51.cubeList.add(new ModelBox(a51, 0, 0, 0.0F, 0.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a52 = new ModelRenderer(this);
        a52.setRotationPoint(-9.8F, 2.2F, -11.0F);
        a52.cubeList.add(new ModelBox(a52, 0, 140, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        a53 = new ModelRenderer(this);
        a53.setRotationPoint(11.3F, -4.0F, 11.0F);
        setRotationAngle(a53, 3.1416F, 1.5708F, 3.1416F);
        a53.cubeList.add(new ModelBox(a53, 0, 0, 0.0F, 0.0F, 0.0F, 11, 27, 0, 0.0F, false));

        a54 = new ModelRenderer(this);
        a54.setRotationPoint(11.3F, -4.0F, 1.0F);
        setRotationAngle(a54, 3.1416F, 1.5708F, 3.1416F);
        a54.cubeList.add(new ModelBox(a54, 0, 0, 0.0F, 0.0F, 0.0F, 11, 27, 0, 0.0F, false));

        a55 = new ModelRenderer(this);
        a55.setRotationPoint(11.3F, 22.0F, 0.3F);
        a55.cubeList.add(new ModelBox(a55, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

        a56 = new ModelRenderer(this);
        a56.setRotationPoint(11.3F, -9.0F, -0.3F);
        setRotationAngle(a56, 3.1416F, 1.5708F, 3.1416F);
        a56.cubeList.add(new ModelBox(a56, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a57 = new ModelRenderer(this);
        a57.setRotationPoint(11.3F, -9.0F, 11.3F);
        setRotationAngle(a57, 3.1416F, 1.5708F, 3.1416F);
        a57.cubeList.add(new ModelBox(a57, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a58 = new ModelRenderer(this);
        a58.setRotationPoint(11.3F, -14.0F, 0.3F);
        setRotationAngle(a58, 3.1416F, 1.5708F, 3.1416F);
        a58.cubeList.add(new ModelBox(a58, 0, 52, 0.0F, 0.0F, 0.0F, 10, 5, 0, 0.0F, false));

        a59 = new ModelRenderer(this);
        a59.setRotationPoint(11.3F, -15.0F, -9.7F);
        a59.cubeList.add(new ModelBox(a59, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

        a60 = new ModelRenderer(this);
        a60.setRotationPoint(11.3F, -15.0F, 11.3F);
        setRotationAngle(a60, 3.1416F, 1.5708F, 3.1416F);
        a60.cubeList.add(new ModelBox(a60, 0, 0, 0.0F, 0.0F, 0.0F, 10, 2, 1, 0.0F, false));

        a61 = new ModelRenderer(this);
        a61.setRotationPoint(11.3F, -14.0F, 11.3F);
        setRotationAngle(a61, 3.1416F, 1.5708F, 3.1416F);
        a61.cubeList.add(new ModelBox(a61, 0, 52, 0.0F, 0.0F, 0.0F, 9, 5, 0, 0.0F, false));

        a62 = new ModelRenderer(this);
        a62.setRotationPoint(10.5F, -9.5F, 2.0F);
        a62.cubeList.add(new ModelBox(a62, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a63 = new ModelRenderer(this);
        a63.setRotationPoint(10.5F, -13.0F, 5.7F);
        setRotationAngle(a63, 3.1416F, 1.5708F, 3.1416F);
        a63.cubeList.add(new ModelBox(a63, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a620 = new ModelRenderer(this);
        a620.setRotationPoint(10.5F, -13.0F, 8.7F);
        setRotationAngle(a620, 3.1416F, 1.5708F, 3.1416F);
        a620.cubeList.add(new ModelBox(a620, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a630 = new ModelRenderer(this);
        a630.setRotationPoint(10.5F, -13.0F, 3.3F);
        setRotationAngle(a630, 3.1416F, 1.5708F, 3.1416F);
        a630.cubeList.add(new ModelBox(a630, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a64 = new ModelRenderer(this);
        a64.setRotationPoint(10.5F, -13.0F, 11.3F);
        setRotationAngle(a64, 3.1416F, 1.5708F, 3.1416F);
        a64.cubeList.add(new ModelBox(a64, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a65 = new ModelRenderer(this);
        a65.setRotationPoint(10.5F, -5.4F, 2.0F);
        a65.cubeList.add(new ModelBox(a65, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a66 = new ModelRenderer(this);
        a66.setRotationPoint(10.5F, -13.4F, 2.0F);
        a66.cubeList.add(new ModelBox(a66, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a68 = new ModelRenderer(this);
        a68.setRotationPoint(10.5F, -13.4F, -10.0F);
        a68.cubeList.add(new ModelBox(a68, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a69 = new ModelRenderer(this);
        a69.setRotationPoint(10.5F, -13.0F, -7.7F);
        a69.cubeList.add(new ModelBox(a69, 0, 89, 0.0F, 0.0F, 0.8F, 1, 8, 1, 0.0F, false));

        a70 = new ModelRenderer(this);
        a70.setRotationPoint(10.5F, -13.0F, -4.0F);
        a70.cubeList.add(new ModelBox(a70, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a71 = new ModelRenderer(this);
        a71.setRotationPoint(10.5F, -9.5F, -10.0F);
        a71.cubeList.add(new ModelBox(a71, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a72 = new ModelRenderer(this);
        a72.setRotationPoint(10.5F, -13.0F, -1.3F);
        a72.cubeList.add(new ModelBox(a72, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a73 = new ModelRenderer(this);
        a73.setRotationPoint(10.5F, -13.0F, -9.7F);
        a73.cubeList.add(new ModelBox(a73, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a74 = new ModelRenderer(this);
        a74.setRotationPoint(11.3F, 23.0F, -1.0F);
        setRotationAngle(a74, 0.0F, 0.0F, -1.5708F);
        a74.cubeList.add(new ModelBox(a74, 0, 0, 0.0F, 0.0F, 0.0F, 43, 1, 4, 0.0F, false));

        a75 = new ModelRenderer(this);
        a75.setRotationPoint(10.3F, 23.0F, 1.0F);
        setRotationAngle(a75, 0.0F, 0.0F, -1.5708F);
        a75.cubeList.add(new ModelBox(a75, 0, 0, 0.0F, 0.0F, 0.0F, 43, 2, 1, 0.0F, false));

        a76 = new ModelRenderer(this);
        a76.setRotationPoint(12.5F, -18.5F, 12.0F);
        setRotationAngle(a76, 3.1416F, 1.5708F, 3.1416F);
        a76.cubeList.add(new ModelBox(a76, 0, 163, 0.0F, 0.0F, 0.0F, 22, 2, 1, 0.0F, false));

        a77 = new ModelRenderer(this);
        a77.setRotationPoint(12.7F, -19.5F, 12.0F);
        a77.cubeList.add(new ModelBox(a77, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a78 = new ModelRenderer(this);
        a78.setRotationPoint(13.7F, -19.5F, -10.0F);
        setRotationAngle(a78, 0.0F, 0.0F, 1.5708F);
        a78.cubeList.add(new ModelBox(a78, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, false));

        a79 = new ModelRenderer(this);
        a79.setRotationPoint(13.7F, -16.5F, -10.0F);
        setRotationAngle(a79, 0.0F, 0.0F, 1.5708F);
        a79.cubeList.add(new ModelBox(a79, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, false));

        a80 = new ModelRenderer(this);
        a80.setRotationPoint(12.7F, -19.5F, -10.5F);
        a80.cubeList.add(new ModelBox(a80, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a81 = new ModelRenderer(this);
        a81.setRotationPoint(11.0F, -15.0F, -11.0F);
        a81.cubeList.add(new ModelBox(a81, 0, 0, 0.0F, 0.0F, 0.0F, 1, 38, 1, 0.0F, false));

        a82 = new ModelRenderer(this);
        a82.setRotationPoint(-10.3F, -5.0F, 12.3F);
        a82.cubeList.add(new ModelBox(a82, 0, 0, 0.0F, 0.0F, 0.0F, 22, 28, 0, 0.0F, false));

        a83 = new ModelRenderer(this);
        a83.setRotationPoint(-9.7F, -5.0F, 12.3F);
        a83.cubeList.add(new ModelBox(a83, 0, 0, 0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F, false));

        a84 = new ModelRenderer(this);
        a84.setRotationPoint(10.3F, -20.0F, 12.3F);
        a84.cubeList.add(new ModelBox(a84, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a85 = new ModelRenderer(this);
        a85.setRotationPoint(-10.3F, -20.0F, 12.3F);
        a85.cubeList.add(new ModelBox(a85, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a86 = new ModelRenderer(this);
        a86.setRotationPoint(-9.7F, 4.0F, 12.3F);
        a86.cubeList.add(new ModelBox(a86, 0, 0, 0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F, false));

        a1780 = new ModelRenderer(this);
        a1780.setRotationPoint(-9.7F, 13.0F, 12.3F);
        a1780.cubeList.add(new ModelBox(a1780, 0, 0, 0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F, false));

        a860 = new ModelRenderer(this);
        a860.setRotationPoint(-9.7F, 22.0F, 12.3F);
        a860.cubeList.add(new ModelBox(a860, 0, 0, 0.0F, 0.0F, 0.0F, 20, 1, 1, 0.0F, false));

        a87 = new ModelRenderer(this);
        a87.setRotationPoint(-1.0F, -15.0F, 12.3F);
        a87.cubeList.add(new ModelBox(a87, 0, 0, 0.0F, 0.0F, 0.0F, 3, 38, 1, 0.0F, false));

        a88 = new ModelRenderer(this);
        a88.setRotationPoint(0.0F, 23.0F, 12.6F);
        setRotationAngle(a88, 0.0F, 0.0F, -1.5708F);
        a88.cubeList.add(new ModelBox(a88, 0, 0, 0.0F, 0.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a89 = new ModelRenderer(this);
        a89.setRotationPoint(-11.3F, -20.0F, -10.3F);
        a89.cubeList.add(new ModelBox(a89, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a90 = new ModelRenderer(this);
        a90.setRotationPoint(-11.3F, -20.0F, 11.3F);
        a90.cubeList.add(new ModelBox(a90, 0, 0, 0.0F, 0.0F, 0.0F, 1, 44, 1, 0.0F, false));

        a91 = new ModelRenderer(this);
        a91.setRotationPoint(-10.5F, -4.0F, 12.0F);
        setRotationAngle(a91, 3.1416F, 1.5708F, 3.1416F);
        a91.cubeList.add(new ModelBox(a91, 0, 0, 0.0F, 0.0F, 0.0F, 22, 27, 0, 0.0F, false));

        a92 = new ModelRenderer(this);
        a92.setRotationPoint(-11.3F, 4.0F, -9.3F);
        a92.cubeList.add(new ModelBox(a92, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a93 = new ModelRenderer(this);
        a93.setRotationPoint(-11.3F, -5.0F, -9.3F);
        a93.cubeList.add(new ModelBox(a93, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a94 = new ModelRenderer(this);
        a94.setRotationPoint(-11.7F, 23.0F, -0.7F);
        setRotationAngle(a94, 0.0F, 0.0F, -1.5708F);
        a94.cubeList.add(new ModelBox(a94, 0, 0, 0.0F, 0.0F, 0.0F, 43, 1, 4, 0.0F, false));

        a95 = new ModelRenderer(this);
        a95.setRotationPoint(-12.0F, 23.0F, 0.8F);
        setRotationAngle(a95, 0.0F, 0.0F, -1.5708F);
        a95.cubeList.add(new ModelBox(a95, 0, 0, 0.0F, 0.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a96 = new ModelRenderer(this);
        a96.setRotationPoint(-10.3F, -9.0F, -0.3F);
        setRotationAngle(a96, 3.1416F, 1.5708F, 3.1416F);
        a96.cubeList.add(new ModelBox(a96, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a97 = new ModelRenderer(this);
        a97.setRotationPoint(-10.3F, -9.0F, 11.7F);
        setRotationAngle(a97, 3.1416F, 1.5708F, 3.1416F);
        a97.cubeList.add(new ModelBox(a97, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a98 = new ModelRenderer(this);
        a98.setRotationPoint(-10.3F, -14.0F, 11.7F);
        setRotationAngle(a98, 3.1416F, 1.5708F, 3.1416F);
        a98.cubeList.add(new ModelBox(a98, 0, 52, 0.0F, 0.0F, 0.0F, 10, 5, 0, 0.0F, false));

        a99 = new ModelRenderer(this);
        a99.setRotationPoint(-10.3F, -14.0F, 0.7F);
        setRotationAngle(a99, 3.1416F, 1.5708F, 3.1416F);
        a99.cubeList.add(new ModelBox(a99, 0, 52, 0.0F, 0.0F, 0.0F, 10, 5, 0, 0.0F, false));

        a100 = new ModelRenderer(this);
        a100.setRotationPoint(-10.5F, -13.0F, -3.7F);
        a100.cubeList.add(new ModelBox(a100, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a101 = new ModelRenderer(this);
        a101.setRotationPoint(-10.5F, -13.0F, -6.7F);
        a101.cubeList.add(new ModelBox(a101, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a102 = new ModelRenderer(this);
        a102.setRotationPoint(-10.5F, -13.0F, -1.0F);
        a102.cubeList.add(new ModelBox(a102, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a103 = new ModelRenderer(this);
        a103.setRotationPoint(-10.5F, -13.0F, -9.7F);
        a103.cubeList.add(new ModelBox(a103, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a104 = new ModelRenderer(this);
        a104.setRotationPoint(-11.3F, -15.0F, -9.7F);
        a104.cubeList.add(new ModelBox(a104, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 21, 0.0F, false));

        a105 = new ModelRenderer(this);
        a105.setRotationPoint(-10.5F, -9.5F, -10.7F);
        a105.cubeList.add(new ModelBox(a105, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a106 = new ModelRenderer(this);
        a106.setRotationPoint(-10.5F, -5.5F, -10.7F);
        a106.cubeList.add(new ModelBox(a106, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a107 = new ModelRenderer(this);
        a107.setRotationPoint(-10.5F, -13.5F, -10.7F);
        a107.cubeList.add(new ModelBox(a107, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a108 = new ModelRenderer(this);
        a108.setRotationPoint(-10.5F, -5.5F, 2.3F);
        a108.cubeList.add(new ModelBox(a108, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a109 = new ModelRenderer(this);
        a109.setRotationPoint(-10.5F, -9.5F, 2.3F);
        a109.cubeList.add(new ModelBox(a109, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a110 = new ModelRenderer(this);
        a110.setRotationPoint(-10.5F, -13.5F, 2.3F);
        a110.cubeList.add(new ModelBox(a110, 0, 89, 0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, false));

        a111 = new ModelRenderer(this);
        a111.setRotationPoint(-10.5F, -13.0F, 11.0F);
        a111.cubeList.add(new ModelBox(a111, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a112 = new ModelRenderer(this);
        a112.setRotationPoint(-10.5F, -13.0F, 5.3F);
        a112.cubeList.add(new ModelBox(a112, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a113 = new ModelRenderer(this);
        a113.setRotationPoint(-10.5F, -13.0F, 8.3F);
        a113.cubeList.add(new ModelBox(a113, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a114 = new ModelRenderer(this);
        a114.setRotationPoint(-10.5F, -13.0F, 2.7F);
        a114.cubeList.add(new ModelBox(a114, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a115 = new ModelRenderer(this);
        a115.setRotationPoint(1.5F, -9.0F, 12.3F);
        a115.cubeList.add(new ModelBox(a115, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a116 = new ModelRenderer(this);
        a116.setRotationPoint(1.3F, -14.0F, 12.3F);
        a116.cubeList.add(new ModelBox(a116, 0, 52, 0.0F, 0.0F, 0.0F, 9, 5, 0, 0.0F, false));

        a117 = new ModelRenderer(this);
        a117.setRotationPoint(-9.7F, -14.0F, 12.3F);
        a117.cubeList.add(new ModelBox(a117, 0, 52, 0.0F, 0.0F, 0.0F, 9, 5, 0, 0.0F, false));

        a118 = new ModelRenderer(this);
        a118.setRotationPoint(-9.5F, -9.0F, 12.3F);
        a118.cubeList.add(new ModelBox(a118, 0, 60, 0.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a119 = new ModelRenderer(this);
        a119.setRotationPoint(-1.0F, -13.4F, 11.5F);
        setRotationAngle(a119, 0.0F, 0.0F, 1.5708F);
        a119.cubeList.add(new ModelBox(a119, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a120 = new ModelRenderer(this);
        a120.setRotationPoint(-1.0F, -5.5F, 11.5F);
        setRotationAngle(a120, 0.0F, 0.0F, 1.5708F);
        a120.cubeList.add(new ModelBox(a120, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a121 = new ModelRenderer(this);
        a121.setRotationPoint(-4.0F, -13.0F, 11.5F);
        a121.cubeList.add(new ModelBox(a121, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a122 = new ModelRenderer(this);
        a122.setRotationPoint(-7.0F, -13.0F, 11.5F);
        a122.cubeList.add(new ModelBox(a122, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a123 = new ModelRenderer(this);
        a123.setRotationPoint(-9.8F, -13.0F, 11.5F);
        a123.cubeList.add(new ModelBox(a123, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a124 = new ModelRenderer(this);
        a124.setRotationPoint(-1.4F, -13.0F, 11.5F);
        a124.cubeList.add(new ModelBox(a124, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a125 = new ModelRenderer(this);
        a125.setRotationPoint(0.0F, -9.5F, 11.5F);
        setRotationAngle(a125, 0.0F, 0.0F, 1.5708F);
        a125.cubeList.add(new ModelBox(a125, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a126 = new ModelRenderer(this);
        a126.setRotationPoint(10.3F, -9.5F, 11.5F);
        setRotationAngle(a126, 0.0F, 0.0F, 1.5708F);
        a126.cubeList.add(new ModelBox(a126, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a127 = new ModelRenderer(this);
        a127.setRotationPoint(10.3F, -5.5F, 11.5F);
        setRotationAngle(a127, 0.0F, 0.0F, 1.5708F);
        a127.cubeList.add(new ModelBox(a127, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a128 = new ModelRenderer(this);
        a128.setRotationPoint(10.3F, -13.4F, 11.5F);
        setRotationAngle(a128, 0.0F, 0.0F, 1.5708F);
        a128.cubeList.add(new ModelBox(a128, 0, 89, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a129 = new ModelRenderer(this);
        a129.setRotationPoint(1.5F, -13.0F, 11.5F);
        a129.cubeList.add(new ModelBox(a129, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a130 = new ModelRenderer(this);
        a130.setRotationPoint(4.0F, -13.0F, 11.5F);
        a130.cubeList.add(new ModelBox(a130, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a131 = new ModelRenderer(this);
        a131.setRotationPoint(7.0F, -13.0F, 11.5F);
        a131.cubeList.add(new ModelBox(a131, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a132 = new ModelRenderer(this);
        a132.setRotationPoint(9.8F, -13.0F, 11.5F);
        a132.cubeList.add(new ModelBox(a132, 0, 89, 0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a133 = new ModelRenderer(this);
        a133.setRotationPoint(-11.7F, -19.5F, -11.3F);
        setRotationAngle(a133, 0.0F, 0.0F, 1.5708F);
        a133.cubeList.add(new ModelBox(a133, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

        a134 = new ModelRenderer(this);
        a134.setRotationPoint(-11.7F, -16.5F, -11.3F);
        setRotationAngle(a134, 0.0F, 0.0F, 1.5708F);
        a134.cubeList.add(new ModelBox(a134, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

        a135 = new ModelRenderer(this);
        a135.setRotationPoint(-12.7F, -19.5F, -11.3F);
        a135.cubeList.add(new ModelBox(a135, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a136 = new ModelRenderer(this);
        a136.setRotationPoint(-12.7F, -19.5F, 11.7F);
        a136.cubeList.add(new ModelBox(a136, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a137 = new ModelRenderer(this);
        a137.setRotationPoint(-8.5F, -18.5F, 11.7F);
        setRotationAngle(a137, 3.1416F, 1.5708F, 3.1416F);
        a137.cubeList.add(new ModelBox(a137, 0, 163, 0.0F, 0.0F, -4.0F, 22, 2, 1, 0.0F, false));

        a138 = new ModelRenderer(this);
        a138.setRotationPoint(12.0F, -16.6F, 13.8F);
        setRotationAngle(a138, 0.0F, 0.0F, 1.5708F);
        a138.cubeList.add(new ModelBox(a138, 0, 0, 0.0F, 0.0F, 0.0F, 1, 23, 1, 0.0F, false));

        a139 = new ModelRenderer(this);
        a139.setRotationPoint(-11.3F, 13.0F, -9.3F);
        a139.cubeList.add(new ModelBox(a139, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a140 = new ModelRenderer(this);
        a140.setRotationPoint(-7.5F, 1.5F, -10.2F);
        a140.cubeList.add(new ModelBox(a140, 3, 168, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

        a141 = new ModelRenderer(this);
        a141.setRotationPoint(12.0F, -19.5F, 13.8F);
        setRotationAngle(a141, 0.0F, 0.0F, 1.5708F);
        a141.cubeList.add(new ModelBox(a141, 0, 0, 0.0F, 0.0F, 0.0F, 1, 23, 1, 0.0F, false));

        a142 = new ModelRenderer(this);
        a142.setRotationPoint(11.0F, -19.5F, 13.8F);
        a142.cubeList.add(new ModelBox(a142, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a143 = new ModelRenderer(this);
        a143.setRotationPoint(-11.0F, -18.5F, 13.8F);
        a143.cubeList.add(new ModelBox(a143, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        a144 = new ModelRenderer(this);
        a144.setRotationPoint(-10.0F, -18.5F, 13.6F);
        a144.cubeList.add(new ModelBox(a144, 0, 163, 0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, false));

        a145 = new ModelRenderer(this);
        a145.setRotationPoint(-11.3F, 22.0F, -9.3F);
        a145.cubeList.add(new ModelBox(a145, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 21, 0.0F, false));

        a146 = new ModelRenderer(this);
        a146.setRotationPoint(-6.5F, -0.5F, -10.2F);
        a146.cubeList.add(new ModelBox(a146, 3, 168, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        a147 = new ModelRenderer(this);
        a147.setRotationPoint(-0.5F, -27.3F, 0.0F);
        a147.cubeList.add(new ModelBox(a147, 2, 180, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        a148 = new ModelRenderer(this);
        a148.setRotationPoint(-1.0F, -24.3F, -0.5F);
        a148.cubeList.add(new ModelBox(a148, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        a149 = new ModelRenderer(this);
        a149.setRotationPoint(-1.5F, -24.0F, -1.0F);
        a149.cubeList.add(new ModelBox(a149, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        a150 = new ModelRenderer(this);
        a150.setRotationPoint(-7.5F, -2.5F, -10.2F);
        a150.cubeList.add(new ModelBox(a150, 3, 168, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, false));

        a151 = new ModelRenderer(this);
        a151.setRotationPoint(0.9F, -28.0F, 1.4F);
        a151.cubeList.add(new ModelBox(a151, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a152 = new ModelRenderer(this);
        a152.setRotationPoint(-1.0F, -29.0F, -0.5F);
        a152.cubeList.add(new ModelBox(a152, 0, 0, 0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        a153 = new ModelRenderer(this);
        a153.setRotationPoint(-0.9F, -28.0F, 1.4F);
        a153.cubeList.add(new ModelBox(a153, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a154 = new ModelRenderer(this);
        a154.setRotationPoint(-0.5F, -29.3F, 0.0F);
        a154.cubeList.add(new ModelBox(a154, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        a155 = new ModelRenderer(this);
        a155.setRotationPoint(-0.9F, -28.0F, -0.4F);
        a155.cubeList.add(new ModelBox(a155, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a156 = new ModelRenderer(this);
        a156.setRotationPoint(0.9F, -28.0F, -0.4F);
        a156.cubeList.add(new ModelBox(a156, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

        a157 = new ModelRenderer(this);
        a157.setRotationPoint(-11.0F, -21.0F, -10.5F);
        a157.cubeList.add(new ModelBox(a157, 0, 0, 0.0F, 0.0F, 0.0F, 23, 1, 23, 0.0F, false));

        a158 = new ModelRenderer(this);
        a158.setRotationPoint(-10.0F, -22.0F, -9.5F);
        a158.cubeList.add(new ModelBox(a158, 0, 0, 0.0F, 0.0F, 0.0F, 21, 1, 21, 0.0F, false));

        a159 = new ModelRenderer(this);
        a159.setRotationPoint(-9.0F, -23.0F, -8.5F);
        a159.cubeList.add(new ModelBox(a159, 0, 0, 0.0F, 0.0F, 0.0F, 19, 1, 19, 0.0F, false));

        doorright = new ModelRenderer(this);
        doorright.setRotationPoint(11.0F, 13.0F, -10.0F);

        a174 = new ModelRenderer(this);
        a174.setRotationPoint(-24.0F, -8.0F, -0.3F);
        doorright.addChild(a174);
        a174.cubeList.add(new ModelBox(a174, 0, 0, 15.0F, 0.0F, 0.0F, 9, 18, 0, 0.0F, false));

        a165 = new ModelRenderer(this);
        a165.setRotationPoint(-13.0F, -22.5F, -0.5F);
        setRotationAngle(a165, 0.0F, 0.0F, 1.5708F);
        doorright.addChild(a165);
        a165.cubeList.add(new ModelBox(a165, 0, 89, 0.0F, -13.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a178 = new ModelRenderer(this);
        a178.setRotationPoint(-19.3F, -26.0F, -0.5F);
        doorright.addChild(a178);
        a178.cubeList.add(new ModelBox(a178, 0, 89, 13.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a171 = new ModelRenderer(this);
        a171.setRotationPoint(-22.6F, -16.0F, -1.5F);
        doorright.addChild(a171);
        a171.cubeList.add(new ModelBox(a171, 1, 148, 13.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

        a172 = new ModelRenderer(this);
        a172.setRotationPoint(-23.7F, 9.0F, -1.3F);
        doorright.addChild(a172);
        a172.cubeList.add(new ModelBox(a172, 0, 0, 13.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, false));

        a175 = new ModelRenderer(this);
        a175.setRotationPoint(-22.7F, -9.0F, -1.3F);
        doorright.addChild(a175);
        a175.cubeList.add(new ModelBox(a175, 0, 0, 13.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a179 = new ModelRenderer(this);
        a179.setRotationPoint(-13.0F, -26.4F, -0.5F);
        setRotationAngle(a179, 0.0F, 0.0F, 1.5708F);
        doorright.addChild(a179);
        a179.cubeList.add(new ModelBox(a179, 0, 89, 0.0F, -13.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a177 = new ModelRenderer(this);
        a177.setRotationPoint(-16.7F, -26.0F, -0.5F);
        doorright.addChild(a177);
        a177.cubeList.add(new ModelBox(a177, 0, 89, 13.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a180 = new ModelRenderer(this);
        a180.setRotationPoint(-34.0F, -17.0F, -0.3F);
        doorright.addChild(a180);
        a180.cubeList.add(new ModelBox(a180, 6, 125, 25.0F, 0.0F, 0.0F, 9, 9, 0, 0.0F, false));

        a162 = new ModelRenderer(this);
        a162.setRotationPoint(-34.0F, -17.0F, 0.2F);
        doorright.addChild(a162);
        a162.cubeList.add(new ModelBox(a162, 0, 0, 25.0F, 0.0F, 0.0F, 8, 27, 0, 0.0F, false));

        a170 = new ModelRenderer(this);
        a170.setRotationPoint(-35.7F, 11.0F, -1.3F);
        setRotationAngle(a170, 0.0F, 0.0F, -1.5708F);
        doorright.addChild(a170);
        a170.cubeList.add(new ModelBox(a170, 0, 0, 0.7F, 25.0F, 0.0F, 38, 2, 1, 0.0F, false));

        a173 = new ModelRenderer(this);
        a173.setRotationPoint(-25.7F, 11.0F, -1.3F);
        setRotationAngle(a173, 0.0F, 0.0F, -1.5708F);
        doorright.addChild(a173);
        a173.cubeList.add(new ModelBox(a173, 0, 0, 0.7F, 25.0F, 0.0F, 38, 1, 1, 0.0F, false));

        a168 = new ModelRenderer(this);
        a168.setRotationPoint(-34.7F, -28.0F, -1.3F);
        doorright.addChild(a168);
        a168.cubeList.add(new ModelBox(a168, 0, 0, 25.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a167 = new ModelRenderer(this);
        a167.setRotationPoint(-26.2F, -26.0F, -0.5F);
        doorright.addChild(a167);
        a167.cubeList.add(new ModelBox(a167, 0, 89, 25.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a181 = new ModelRenderer(this);
        a181.setRotationPoint(-34.6F, -9.0F, -1.4F);
        doorright.addChild(a181);
        a181.cubeList.add(new ModelBox(a181, 1, 148, 25.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        a166 = new ModelRenderer(this);
        a166.setRotationPoint(-33.7F, -27.0F, -1.3F);
        doorright.addChild(a166);
        a166.cubeList.add(new ModelBox(a166, 0, 0, 25.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, false));

        a160 = new ModelRenderer(this);
        a160.setRotationPoint(-48.0F, -27.0F, -0.3F);
        doorright.addChild(a160);
        a160.cubeList.add(new ModelBox(a160, 0, 52, 38.0F, 0.0F, 0.0F, 9, 5, 0, 0.0F, false));

        a163 = new ModelRenderer(this);
        a163.setRotationPoint(-47.7F, -22.0F, -0.3F);
        doorright.addChild(a163);
        a163.cubeList.add(new ModelBox(a163, 0, 60, 39.0F, 0.0F, 0.0F, 9, 4, 0, 0.0F, false));

        a169 = new ModelRenderer(this);
        a169.setRotationPoint(-48.7F, 0.0F, -1.3F);
        doorright.addChild(a169);
        a169.cubeList.add(new ModelBox(a169, 0, 0, 39.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a176 = new ModelRenderer(this);
        a176.setRotationPoint(-48.7F, -18.0F, -1.3F);
        doorright.addChild(a176);
        a176.cubeList.add(new ModelBox(a176, 0, 0, 39.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, false));

        a161 = new ModelRenderer(this);
        a161.setRotationPoint(-39.0F, -18.4F, -0.5F);
        setRotationAngle(a161, 0.0F, 0.0F, 1.5708F);
        doorright.addChild(a161);
        a161.cubeList.add(new ModelBox(a161, 0, 89, 0.0F, -39.0F, 0.0F, 1, 9, 1, 0.0F, false));

        a164 = new ModelRenderer(this);
        a164.setRotationPoint(-47.8F, -26.0F, -0.5F);
        doorright.addChild(a164);
        a164.cubeList.add(new ModelBox(a164, 0, 89, 39.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));

        a67 = new ModelRenderer(this);
        a67.setRotationPoint(9.5F, -8.4F, -10.0F);
        setRotationAngle(a67, 1.5708F, 0.0F, 0.0F);
        a67.cubeList.add(new ModelBox(a67, 0, 89, 1.0F, 0.0F, 0.0F, 1, 21, 1, 0.0F, false));

        a17 = new ModelRenderer(this);
        a17.setRotationPoint(-21.0F, 0.0F, 0.0F);
        a67.addChild(a17);
        a17.cubeList.add(new ModelBox(a17, 0, 89, 1.0F, 0.0F, 0.0F, 1, 21, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
        All.render(f5);
        a16.render(f5);
        Bottom17.render(f5);
        a18.render(f5);
        a19.render(f5);
        a20.render(f5);
        a21.render(f5);
        a22.render(f5);
        a23.render(f5);
        a24.render(f5);
        a25.render(f5);
        a26.render(f5);
        a27.render(f5);
        a28.render(f5);
        a29.render(f5);
        a30.render(f5);
        a31.render(f5);
        a32.render(f5);
        a33.render(f5);
        a34.render(f5);
        a35.render(f5);
        a36.render(f5);
        a37.render(f5);
        a38.render(f5);
        a39.render(f5);
        a40.render(f5);
        a41.render(f5);
        a42.render(f5);
        a43.render(f5);
        a44.render(f5);
        a45.render(f5);
        a46.render(f5);
        a47.render(f5);
        a48.render(f5);
        a49.render(f5);
        a50.render(f5);
        a51.render(f5);
        a52.render(f5);
        a53.render(f5);
        a54.render(f5);
        a55.render(f5);
        a56.render(f5);
        a57.render(f5);
        a58.render(f5);
        a59.render(f5);
        a60.render(f5);
        a61.render(f5);
        a62.render(f5);
        a63.render(f5);
        a620.render(f5);
        a630.render(f5);
        a64.render(f5);
        a65.render(f5);
        a66.render(f5);
        a68.render(f5);
        a69.render(f5);
        a70.render(f5);
        a71.render(f5);
        a72.render(f5);
        a73.render(f5);
        a74.render(f5);
        a75.render(f5);
        a76.render(f5);
        a77.render(f5);
        a78.render(f5);
        a79.render(f5);
        a80.render(f5);
        a81.render(f5);
        a82.render(f5);
        a83.render(f5);
        a84.render(f5);
        a85.render(f5);
        a86.render(f5);
        a1780.render(f5);
        a860.render(f5);
        a87.render(f5);
        a88.render(f5);
        a89.render(f5);
        a90.render(f5);
        a91.render(f5);
        a92.render(f5);
        a93.render(f5);
        a94.render(f5);
        a95.render(f5);
        a96.render(f5);
        a97.render(f5);
        a98.render(f5);
        a99.render(f5);
        a100.render(f5);
        a101.render(f5);
        a102.render(f5);
        a103.render(f5);
        a104.render(f5);
        a105.render(f5);
        a106.render(f5);
        a107.render(f5);
        a108.render(f5);
        a109.render(f5);
        a110.render(f5);
        a111.render(f5);
        a112.render(f5);
        a113.render(f5);
        a114.render(f5);
        a115.render(f5);
        a116.render(f5);
        a117.render(f5);
        a118.render(f5);
        a119.render(f5);
        a120.render(f5);
        a121.render(f5);
        a122.render(f5);
        a123.render(f5);
        a124.render(f5);
        a125.render(f5);
        a126.render(f5);
        a127.render(f5);
        a128.render(f5);
        a129.render(f5);
        a130.render(f5);
        a131.render(f5);
        a132.render(f5);
        a133.render(f5);
        a134.render(f5);
        a135.render(f5);
        a136.render(f5);
        a137.render(f5);
        a138.render(f5);
        a139.render(f5);
        a140.render(f5);
        a141.render(f5);
        a142.render(f5);
        a143.render(f5);
        a144.render(f5);
        a145.render(f5);
        a146.render(f5);
        a147.render(f5);
        a148.render(f5);
        a149.render(f5);
        a150.render(f5);
        a151.render(f5);
        a152.render(f5);
        a153.render(f5);
        a154.render(f5);
        a155.render(f5);
        a156.render(f5);
        a157.render(f5);
        a158.render(f5);
        a159.render(f5);
        doorright.render(f5);
        a67.render(f5);
    }

    public void render(float rotation) {
        this.doorright.rotateAngleY = rotation;
        GlStateManager.scale(0.8, 0.8, 0.8);
        GlStateManager.rotate(180, 1, 0, 0);
        GlStateManager.translate(0, -1.5, 0);
        this.render(null, 0, 0, 0, 0, 0, 0.0625f);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}