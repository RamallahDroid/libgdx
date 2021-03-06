/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleInfo extends BulletBase {
	private long swigCPtr;
	
	protected btTriangleInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btTriangleInfo(long cPtr, boolean cMemoryOwn) {
		this("btTriangleInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btTriangleInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btTriangleInfo() {
    this(gdxBulletJNI.new_btTriangleInfo(), true);
  }

  public void setFlags(int value) {
    gdxBulletJNI.btTriangleInfo_flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return gdxBulletJNI.btTriangleInfo_flags_get(swigCPtr, this);
  }

  public void setEdgeV0V1Angle(float value) {
    gdxBulletJNI.btTriangleInfo_edgeV0V1Angle_set(swigCPtr, this, value);
  }

  public float getEdgeV0V1Angle() {
    return gdxBulletJNI.btTriangleInfo_edgeV0V1Angle_get(swigCPtr, this);
  }

  public void setEdgeV1V2Angle(float value) {
    gdxBulletJNI.btTriangleInfo_edgeV1V2Angle_set(swigCPtr, this, value);
  }

  public float getEdgeV1V2Angle() {
    return gdxBulletJNI.btTriangleInfo_edgeV1V2Angle_get(swigCPtr, this);
  }

  public void setEdgeV2V0Angle(float value) {
    gdxBulletJNI.btTriangleInfo_edgeV2V0Angle_set(swigCPtr, this, value);
  }

  public float getEdgeV2V0Angle() {
    return gdxBulletJNI.btTriangleInfo_edgeV2V0Angle_get(swigCPtr, this);
  }

}
