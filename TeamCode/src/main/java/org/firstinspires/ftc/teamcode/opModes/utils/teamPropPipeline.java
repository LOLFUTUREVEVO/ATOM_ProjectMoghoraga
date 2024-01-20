package org.firstinspires.ftc.teamcode.opModes.utils;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.HOGDescriptor;
import org.openftc.easyopencv.OpenCvPipeline;


// For getting the team prop or whatever something like that

public class teamPropPipeline extends OpenCvPipeline {

    Mat HSV = new Mat();
    Mat Cb = new Mat();

    void inputToHSV(Mat input)
    {
        Imgproc.cvtColor(input, HSV, Imgproc.COLOR_RGB2HSV);
        Core.extractChannel(HSV, Cb, 2);
    }

    @Override
    public Mat processFrame(Mat input) {


        Imgproc.cvtColor(input, HSV, Imgproc.COLOR_RGB2HSV);




        return HSV;
    }


}
