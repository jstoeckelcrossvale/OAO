package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Identification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "ssn")
   private java.lang.String ssn;
   @org.kie.api.definition.type.Label(value = "citizenFlag")
   private java.lang.String citizenFlag;
   @org.kie.api.definition.type.Label(value = "idType")
   private java.lang.String idType;
   @org.kie.api.definition.type.Label(value = "idNumber")
   private java.lang.String idNumber;
   @org.kie.api.definition.type.Label(value = "issuedLocation")
   private java.lang.String issuedLocation;
   @org.kie.api.definition.type.Label(value = "issuedDate")
   private java.lang.String issuedDate;
   @org.kie.api.definition.type.Label(value = "expDate")
   private java.lang.String expDate;

   public Identification()
   {
   }

   public java.lang.String getSsn()
   {
      return this.ssn;
   }

   public void setSsn(java.lang.String ssn)
   {
      this.ssn = ssn;
   }

   public java.lang.String getCitizenFlag()
   {
      return this.citizenFlag;
   }

   public void setCitizenFlag(java.lang.String citizenFlag)
   {
      this.citizenFlag = citizenFlag;
   }

   public java.lang.String getIdType()
   {
      return this.idType;
   }

   public void setIdType(java.lang.String idType)
   {
      this.idType = idType;
   }

   public java.lang.String getIdNumber()
   {
      return this.idNumber;
   }

   public void setIdNumber(java.lang.String idNumber)
   {
      this.idNumber = idNumber;
   }

   public java.lang.String getIssuedLocation()
   {
      return this.issuedLocation;
   }

   public void setIssuedLocation(java.lang.String issuedLocation)
   {
      this.issuedLocation = issuedLocation;
   }

   public java.lang.String getIssuedDate()
   {
      return this.issuedDate;
   }

   public void setIssuedDate(java.lang.String issuedDate)
   {
      this.issuedDate = issuedDate;
   }

   public java.lang.String getExpDate()
   {
      return this.expDate;
   }

   public void setExpDate(java.lang.String expDate)
   {
      this.expDate = expDate;
   }

   public Identification(java.lang.String ssn, java.lang.String citizenFlag,
         java.lang.String idType, java.lang.String idNumber,
         java.lang.String issuedLocation, java.lang.String issuedDate,
         java.lang.String expDate)
   {
      this.ssn = ssn;
      this.citizenFlag = citizenFlag;
      this.idType = idType;
      this.idNumber = idNumber;
      this.issuedLocation = issuedLocation;
      this.issuedDate = issuedDate;
      this.expDate = expDate;
   }

}