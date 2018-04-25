package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Classification implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "accountNumber")
   private java.lang.String accountNumber;
   @org.kie.api.definition.type.Label(value = "product")
   private com.crossvale.carddispute.CodeValue product;
   @org.kie.api.definition.type.Label(value = "subProduct")
   private com.crossvale.carddispute.CodeValue subProduct;
   @org.kie.api.definition.type.Label(value = "accountStatus")
   private com.crossvale.carddispute.CodeValue accountStatus;
   @org.kie.api.definition.type.Label(value = "accountExtendedStatus")
   private com.crossvale.carddispute.CodeValue accountExtendedStatus;

   public Classification()
   {
   }

   public java.lang.String getAccountNumber()
   {
      return this.accountNumber;
   }

   public void setAccountNumber(java.lang.String accountNumber)
   {
      this.accountNumber = accountNumber;
   }

   public com.crossvale.carddispute.CodeValue getProduct()
   {
      return this.product;
   }

   public void setProduct(com.crossvale.carddispute.CodeValue product)
   {
      this.product = product;
   }

   public com.crossvale.carddispute.CodeValue getSubProduct()
   {
      return this.subProduct;
   }

   public void setSubProduct(com.crossvale.carddispute.CodeValue subProduct)
   {
      this.subProduct = subProduct;
   }

   public com.crossvale.carddispute.CodeValue getAccountStatus()
   {
      return this.accountStatus;
   }

   public void setAccountStatus(
         com.crossvale.carddispute.CodeValue accountStatus)
   {
      this.accountStatus = accountStatus;
   }

   public com.crossvale.carddispute.CodeValue getAccountExtendedStatus()
   {
      return this.accountExtendedStatus;
   }

   public void setAccountExtendedStatus(
         com.crossvale.carddispute.CodeValue accountExtendedStatus)
   {
      this.accountExtendedStatus = accountExtendedStatus;
   }

   public Classification(java.lang.String accountNumber,
         com.crossvale.carddispute.CodeValue product,
         com.crossvale.carddispute.CodeValue subProduct,
         com.crossvale.carddispute.CodeValue accountStatus,
         com.crossvale.carddispute.CodeValue accountExtendedStatus)
   {
      this.accountNumber = accountNumber;
      this.product = product;
      this.subProduct = subProduct;
      this.accountStatus = accountStatus;
      this.accountExtendedStatus = accountExtendedStatus;
   }

}