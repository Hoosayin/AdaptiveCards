/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ContainerStylesDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ContainerStylesDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContainerStylesDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ContainerStylesDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDefaultPalette(ContainerStyleDefinition value) {
    AdaptiveCardObjectModelJNI.ContainerStylesDefinition_defaultPalette_set(swigCPtr, this, ContainerStyleDefinition.getCPtr(value), value);
  }

  public ContainerStyleDefinition getDefaultPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerStylesDefinition_defaultPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerStyleDefinition(cPtr, false);
  }

  public void setEmphasisPalette(ContainerStyleDefinition value) {
    AdaptiveCardObjectModelJNI.ContainerStylesDefinition_emphasisPalette_set(swigCPtr, this, ContainerStyleDefinition.getCPtr(value), value);
  }

  public ContainerStyleDefinition getEmphasisPalette() {
    long cPtr = AdaptiveCardObjectModelJNI.ContainerStylesDefinition_emphasisPalette_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerStyleDefinition(cPtr, false);
  }

  public static ContainerStylesDefinition Deserialize(JsonValue json, ContainerStylesDefinition defaultValue) {
    return new ContainerStylesDefinition(AdaptiveCardObjectModelJNI.ContainerStylesDefinition_Deserialize(JsonValue.getCPtr(json), json, ContainerStylesDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public ContainerStylesDefinition() {
    this(AdaptiveCardObjectModelJNI.new_ContainerStylesDefinition(), true);
  }

}
