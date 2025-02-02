package com.visual.face.search.core.base;

import com.visual.face.search.core.domain.ImageMat;
import com.visual.face.search.core.domain.QualityInfo;

import java.util.Map;

/**
 * 人脸关键点检测
 */
public interface FaceMaskPoint {

    /**
     * 人脸关键点检测
     * @param imageMat  图像数据
     * @param params    参数信息
     * @return
     */
    QualityInfo.MaskPoints inference(ImageMat imageMat, Map<String, Object> params);

}
