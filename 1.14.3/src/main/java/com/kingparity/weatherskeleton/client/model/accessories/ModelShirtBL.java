package com.kingparity.weatherskeleton.client.model.accessories;
//Made with Blockbench
//Paste this code into your mod.


import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ModelShirtBL<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public ModelShirtBL()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, -1.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 125, 72, -1.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 81, 1.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 73, -1.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 117, 76, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 125, 71, -1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 110, 74, 1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 110, 75, 0.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 69, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 116, 75, -1.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 110, 75, -1.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 110, 75, 1.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        
        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -1.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 121, 67, -1.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 112, 70, -1.0F, -1.0F, -2.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 122, 80, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -2.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 111, 62, -1.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 127, 77, -2.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 120, 73, -1.0F, 0.0F, -2.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 123, 70, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 122, 73, -1.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -2.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -1.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -1.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, false));
        
        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 170, 70, -2.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -1.0F, 6, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, 1.0F, 1, 1, 0, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, -1.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 70, 3.0F, -13.0F, -1.0F, 1, 2, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 70, -4.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -23.0F, 0.0F, 2, 10, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -17.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -17.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -18.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -18.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 2.0F, -22.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, -1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, -1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -21.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -21.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -21.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -23.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -23.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, -3.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, 1.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 72, -1.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, -3.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, 1.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, -4.0F, -22.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 1.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -4.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, 2.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -1.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -2.0F, -22.0F, -1.0F, 4, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 77, 2.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 78, -3.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 80, -2.0F, -15.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 71, 1.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 73, -2.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 67, -4.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 78, -4.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 84, -4.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 73, -4.0F, -20.0F, -1.0F, 1, 2, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 73, -4.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 74, -4.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 69, -4.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 73, -2.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 75, -3.0F, -20.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 80, -4.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 76, -3.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 73, -2.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 80, -2.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 72, -3.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 57, -3.0F, -20.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 78, -1.0F, -14.0F, 1.0F, 2, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 69, -1.0F, -20.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 60, 2.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 75, 1.0F, -20.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 71, 3.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 80, 1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 108, 80, 1.0F, -23.0F, 1.0F, 3, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 77, 3.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 64, 3.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 69, 2.0F, -19.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 67, 3.0F, -18.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 61, 2.0F, -14.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 64, 3.0F, -16.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 75, 3.0F, -15.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 70, 3.0F, -14.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 82, 3.0F, -16.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 79, 3.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 107, 80, 3.0F, -20.0F, -1.0F, 1, 4, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 71, 2.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 80, -3.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 84, -3.0F, -19.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 73, -2.0F, -22.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 111, 67, 1.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 67, 2.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 63, 3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 67, 2.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 76, 1.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 61, 1.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 73, 3.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 69, 2.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 71, -3.0F, -13.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 70, -3.0F, -14.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 80, -4.0F, -22.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 66, -3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 72, -4.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 80, -3.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 107, 71, -2.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 70, -4.0F, -18.0F, -1.0F, 1, 5, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 78, -4.0F, -15.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 81, -3.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 86, -3.0F, -16.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 64, 1.0F, -15.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 65, 3.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 105, 74, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 67, 3.0F, -14.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 70, 3.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 70, 1.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 81, 1.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 79, 2.0F, -22.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 72, 3.0F, -19.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 80, 2.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 82, 3.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 73, -4.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 72, -1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 61, 0.0F, -20.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 134, 73, -2.0F, -17.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 75, 1.0F, -17.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 77, 2.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 66, 1.0F, -14.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 130, 64, -1.0F, -15.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 70, 2.0F, -16.0F, 1.0F, 1, 5, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 82, 1.0F, -12.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 75, 1.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 75, 0.0F, -17.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 74, -1.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 70, -4.0F, -20.0F, 1.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 69, -3.0F, -19.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 85, -2.0F, -19.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 106, 80, 0.0F, -23.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 111, 80, -1.0F, -23.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 79, -2.0F, -23.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 80, -3.0F, -23.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 78, -4.0F, -23.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 67, 3.0F, -17.0F, 1.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 67, -3.0F, -12.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 73, -3.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}