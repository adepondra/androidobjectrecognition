/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.theveganrobot.OpenASURF.swig;

public class SURFjni {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SURFjni(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SURFjni obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @Override
protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        surfjnimoduleJNI.delete_SURFjni(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SURFjni(int[] pixels, int width, int height) {
    this(surfjnimoduleJNI.new_SURFjni(pixels, width, height), true);
  }

  public void surfDetDes(boolean upright, int octaves, int intervals, int init_sample, float thres) {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_0(swigCPtr, this, upright, octaves, intervals, init_sample, thres);
  }

  public void surfDetDes(boolean upright, int octaves, int intervals, int init_sample) {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_1(swigCPtr, this, upright, octaves, intervals, init_sample);
  }

  public void surfDetDes(boolean upright, int octaves, int intervals) {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_2(swigCPtr, this, upright, octaves, intervals);
  }

  public void surfDetDes(boolean upright, int octaves) {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_3(swigCPtr, this, upright, octaves);
  }

  public void surfDetDes(boolean upright) {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_4(swigCPtr, this, upright);
  }

  public void surfDetDes() {
    surfjnimoduleJNI.SURFjni_surfDetDes__SWIG_5(swigCPtr, this);
  }

  public void setIpts(IpointVector value) {
    surfjnimoduleJNI.SURFjni_ipts_set(swigCPtr, this, IpointVector.getCPtr(value), value);
  }

  public IpointVector getIpts() {
    long cPtr = surfjnimoduleJNI.SURFjni_ipts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IpointVector(cPtr, false);
  }

  public void setMImage(SWIGTYPE_p_IplImage value) {
    surfjnimoduleJNI.SURFjni_mImage_set(swigCPtr, this, SWIGTYPE_p_IplImage.getCPtr(value));
  }

  public SWIGTYPE_p_IplImage getMImage() {
    long cPtr = surfjnimoduleJNI.SURFjni_mImage_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_IplImage(cPtr, false);
  }

}
