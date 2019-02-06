/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FontStyleDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FontStyleDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FontStyleDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FontStyleDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFontFamily(String value) {
    AdaptiveCardObjectModelJNI.FontStyleDefinition_fontFamily_set(swigCPtr, this, value);
  }

  public String getFontFamily() {
    return AdaptiveCardObjectModelJNI.FontStyleDefinition_fontFamily_get(swigCPtr, this);
  }

  public void setFontSizes(FontSizesConfig value) {
    AdaptiveCardObjectModelJNI.FontStyleDefinition_fontSizes_set(swigCPtr, this, FontSizesConfig.getCPtr(value), value);
  }

  public FontSizesConfig getFontSizes() {
    long cPtr = AdaptiveCardObjectModelJNI.FontStyleDefinition_fontSizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontSizesConfig(cPtr, false);
  }

  public void setFontWeights(FontWeightsConfig value) {
    AdaptiveCardObjectModelJNI.FontStyleDefinition_fontWeights_set(swigCPtr, this, FontWeightsConfig.getCPtr(value), value);
  }

  public FontWeightsConfig getFontWeights() {
    long cPtr = AdaptiveCardObjectModelJNI.FontStyleDefinition_fontWeights_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontWeightsConfig(cPtr, false);
  }

  public static FontStyleDefinition Deserialize(JsonValue json, FontStyleDefinition defaultValue) {
    return new FontStyleDefinition(AdaptiveCardObjectModelJNI.FontStyleDefinition_Deserialize(JsonValue.getCPtr(json), json, FontStyleDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public FontStyleDefinition() {
    this(AdaptiveCardObjectModelJNI.new_FontStyleDefinition(), true);
  }

}
