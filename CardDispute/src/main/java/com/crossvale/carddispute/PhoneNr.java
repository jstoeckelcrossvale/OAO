package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("PhoneNr")
public class PhoneNr implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "phoneType")
   private java.lang.String phoneType;
   @org.kie.api.definition.type.Label(value = "number")
   private java.lang.String number;

   public PhoneNr()
   {
   }

   public java.lang.String getPhoneType()
   {
      return this.phoneType;
   }

   public void setPhoneType(java.lang.String phoneType)
   {
      this.phoneType = phoneType;
   }

   public java.lang.String getNumber()
   {
      return this.number;
   }

   public void setNumber(java.lang.String number)
   {
      this.number = number;
   }

   public PhoneNr(java.lang.String phoneType, java.lang.String number)
   {
      this.phoneType = phoneType;
      this.number = number;
   }

}